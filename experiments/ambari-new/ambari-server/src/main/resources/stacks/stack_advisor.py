#!/usr/bin/env ambari-python-wrap
"""
Licensed to the Apache Software Foundation (ASF) under one
or more contributor license agreements.  See the NOTICE file
distributed with this work for additional information
regarding copyright ownership.  The ASF licenses this file
to you under the Apache License, Version 2.0 (the
"License"); you may not use this file except in compliance
with the License.  You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
"""

# Python Imports
import imp
import os
import re
import socket
import traceback
from math import ceil, floor
from urlparse import urlparse

# Local imports
from resource_management.libraries.functions.data_structure_utils import get_from_dict
from resource_management.core.exceptions import Fail
from resource_management.core.logger import Logger


class StackAdvisor(object):
  """
  Abstract class implemented by all stack advisors. Stack advisors advise on stack specific questions. 

  Currently stack advisors provide following abilities:
  - Recommend where services should be installed in cluster
  - Recommend configurations based on host hardware
  - Validate user selection of where services are installed on cluster
  - Validate user configuration values 

  Each of the above methods is passed in parameters about services and hosts involved as described below.

    @type services: dictionary
    @param services: Dictionary containing all information about services selected by the user. 
      Example: {
      "services": [
        {
          "StackServices": {
            "service_name" : "HDFS",
            "service_version" : "2.6.0.2.2",
          },
          "components" : [ 
            {
              "StackServiceComponents" : {
                "cardinality" : "1+",
                "component_category" : "SLAVE",
                "component_name" : "DATANODE",
                "display_name" : "DataNode",
                "service_name" : "HDFS",
                "hostnames" : []
              },
              "dependencies" : []
            }, {
              "StackServiceComponents" : {
                "cardinality" : "1-2",
                "component_category" : "MASTER",
                "component_name" : "NAMENODE",
                "display_name" : "NameNode",
                "service_name" : "HDFS",
                "hostnames" : []
              },
              "dependencies" : []
            },
            ...
          ]
        },
        ...
      ]
    }
  @type hosts: dictionary
  @param hosts: Dictionary containing all information about hosts in this cluster
    Example: {
      "items": [
        {
          Hosts: {
            "host_name": "c6401.ambari.apache.org",
            "public_host_name" : "c6401.ambari.apache.org",
            "ip": "192.168.1.101",
            "cpu_count" : 1,
            "disk_info" : [
              {
              "available" : "4564632",
              "used" : "5230344",
              "percent" : "54%",
              "size" : "10319160",
              "type" : "ext4",
              "mountpoint" : "/"
              },
              {
              "available" : "1832436",
              "used" : "0",
              "percent" : "0%",
              "size" : "1832436",
              "type" : "tmpfs",
              "mountpoint" : "/dev/shm"
              }
            ],
            "host_state" : "HEALTHY",
            "os_arch" : "x86_64",
            "os_type" : "centos6",
            "total_mem" : 3664872
          }
        },
        ...
      ]
    }

    Each of the methods can either return recommendations or validations.

    Recommendations are made in a Ambari Blueprints friendly format. 
    Validations are an array of validation objects.
  """

  def recommendComponentLayout(self, services, hosts):
    """
    Returns recommendation of which hosts various service components should be installed on.

    This function takes as input all details about services being installed, and hosts
    they are being installed into, to generate hostname assignments to various components
    of each service.

    @type services: dictionary
    @param services: Dictionary containing all information about services selected by the user.
    @type hosts: dictionary
    @param hosts: Dictionary containing all information about hosts in this cluster
    @rtype: dictionary
    @return: Layout recommendation of service components on cluster hosts in Ambari Blueprints friendly format. 
        Example: {
          "resources" : [
            {
              "hosts" : [
                "c6402.ambari.apache.org",
                "c6401.ambari.apache.org"
              ],
              "services" : [
                "HDFS"
              ],
              "recommendations" : {
                "blueprint" : {
                  "host_groups" : [
                    {
                      "name" : "host-group-2",
                      "components" : [
                        { "name" : "JOURNALNODE" },
                        { "name" : "ZKFC" },
                        { "name" : "DATANODE" },
                        { "name" : "SECONDARY_NAMENODE" }
                      ]
                    },
                    {
                      "name" : "host-group-1",
                      "components" : [
                        { "name" : "HDFS_CLIENT" },
                        { "name" : "NAMENODE" },
                        { "name" : "JOURNALNODE" },
                        { "name" : "ZKFC" },
                        { "name" : "DATANODE" }
                      ]
                    }
                  ]
                },
                "blueprint_cluster_binding" : {
                  "host_groups" : [
                    {
                      "name" : "host-group-1",
                      "hosts" : [ { "fqdn" : "c6401.ambari.apache.org" } ]
                    },
                    {
                      "name" : "host-group-2",
                      "hosts" : [ { "fqdn" : "c6402.ambari.apache.org" } ]
                    }
                  ]
                }
              }
            }
          ]
        }
    """
    pass

  def validateComponentLayout(self, services, hosts):
    """
    Returns array of Validation issues with service component layout on hosts

    This function takes as input all details about services being installed along with
    hosts the components are being installed on (hostnames property is populated for 
    each component).  

    @type services: dictionary
    @param services: Dictionary containing information about services and host layout selected by the user.
    @type hosts: dictionary
    @param hosts: Dictionary containing all information about hosts in this cluster
    @rtype: dictionary
    @return: Dictionary containing array of validation items
        Example: {
          "items": [
            {
              "type" : "host-group",
              "level" : "ERROR",
              "message" : "NameNode and Secondary NameNode should not be hosted on the same machine",
              "component-name" : "NAMENODE",
              "host" : "c6401.ambari.apache.org" 
            },
            ...
          ]
        }  
    """
    pass

  def recommendConfigurations(self, services, hosts):
    """
    Returns recommendation of service configurations based on host-specific layout of components.

    This function takes as input all details about services being installed, and hosts
    they are being installed into, to recommend host-specific configurations.

    @type services: dictionary
    @param services: Dictionary containing all information about services and component layout selected by the user.
    @type hosts: dictionary
    @param hosts: Dictionary containing all information about hosts in this cluster
    @rtype: dictionary
    @return: Layout recommendation of service components on cluster hosts in Ambari Blueprints friendly format. 
        Example: {
         "services": [
          "HIVE", 
          "TEZ", 
          "YARN"
         ], 
         "recommendations": {
          "blueprint": {
           "host_groups": [], 
           "configurations": {
            "yarn-site": {
             "properties": {
              "yarn.scheduler.minimum-allocation-mb": "682", 
              "yarn.scheduler.maximum-allocation-mb": "2048", 
              "yarn.nodemanager.resource.memory-mb": "2048"
             }
            }, 
            "tez-site": {
             "properties": {
              "tez.am.java.opts": "-server -Xmx546m -Djava.net.preferIPv4Stack=true -XX:+UseNUMA -XX:+UseParallelGC", 
              "tez.am.resource.memory.mb": "682"
             }
            }, 
            "hive-site": {
             "properties": {
              "hive.tez.container.size": "682", 
              "hive.tez.java.opts": "-server -Xmx546m -Djava.net.preferIPv4Stack=true -XX:NewRatio=8 -XX:+UseNUMA -XX:+UseParallelGC", 
              "hive.auto.convert.join.noconditionaltask.size": "238026752"
             }
            }
           }
          }, 
          "blueprint_cluster_binding": {
           "host_groups": []
          }
         }, 
         "hosts": [
          "c6401.ambari.apache.org", 
          "c6402.ambari.apache.org", 
          "c6403.ambari.apache.org" 
         ] 
        }
    """
    pass

  def validateConfigurations(self, services, hosts):
    """"
    Returns array of Validation issues with configurations provided by user

    This function takes as input all details about services being installed along with
    configuration values entered by the user. These configurations can be validated against
    service requirements, or host hardware to generate validation issues. 

    @type services: dictionary
    @param services: Dictionary containing information about services and user configurations.
    @type hosts: dictionary
    @param hosts: Dictionary containing all information about hosts in this cluster
    @rtype: dictionary
    @return: Dictionary containing array of validation items
        Example: {
         "items": [
          {
           "config-type": "yarn-site", 
           "message": "Value is less than the recommended default of 682", 
           "type": "configuration", 
           "config-name": "yarn.scheduler.minimum-allocation-mb", 
           "level": "WARN"
          }
         ]
       }
    """
    pass


class DefaultStackAdvisor(StackAdvisor):

  CLUSTER_CREATE_OPERATION = "ClusterCreate"
  ADD_SERVICE_OPERATION = "AddService"
  EDIT_CONFIG_OPERATION = "EditConfig"
  RECOMMEND_ATTRIBUTE_OPERATION = "RecommendAttribute"
  OPERATION = "operation"
  OPERATION_DETAILS = "operation_details"

  ADVISOR_CONTEXT = "advisor_context"
  CALL_TYPE = "call_type"

  """
  Default stack advisor implementation.
  
  This implementation is used when a stack-version, or its hierarchy does not
  have an advisor. Stack-versions can extend this class to provide their own
  implement
  """

  def __init__(self):
    self.services = None
    
    Logger.initialize_logger()
    
    # Dictionary that maps serviceName or componentName to serviceAdvisor
    self.serviceAdvisorsDict = {}

    # Contains requested properties during 'recommend-configuration-dependencies' request.
    # It's empty during other requests.
    self.allRequestedProperties = None


    # Data structures that may be extended by Service Advisors with information specific to each Service 
    self.mastersWithMultipleInstances = set()
    self.notValuableComponents = set()
    self.notPreferableOnServerComponents = set()
    self.cardinalitiesDict = {}
    self.componentLayoutSchemes = {}
    self.loaded_service_advisors = False


  def getServiceComponentLayoutValidations(self, services, hosts):
    """
    Get a list of errors.

    :param services: Dictionary of the form:
    {
      'changed-configurations': [],
      'Versions": {
        'parent_stack_version': '9.0',
        'stack_name': 'HDP',
        'stack_version': '9.0',
        'stack_hierarchy': {
          'stack_name': 'HDP',
          'stack_versions': ['8.0', '7.0', ..., '1.0']
        }
      },
      'ambari-server-properties': {'key': 'value', ...},
      'services': [
        {'StackServices': {
          'advisor_path': '/var/lib/ambari-server/resources/common-services/MYSERVICE/1.2.3/service_advisor.py',
          'service_version': '1.2.3',
          'stack_name': 'HDP',
          'service_name': 'MYSERVICE',
          'stack_version': '9.0',
          'advisor_name': 'MYSERVICEServiceAdvisor'
        },
        'components': [
          {'StackServiceComponents': {
            'stack_version': '9.0',
            'decommission_allowed': True|False,
            'display_name': 'My Service Display Name',
            'stack_name': 'HDP',
            'custom_commands': [],
            'component_category': 'CLIENT|MASTER|SLAVE',
            'advertise_version': True|False,
            'is_client': True|False,
            'is_master': False|False,
            'bulk_commands_display_name': '',
            'bulk_commands_master_component_name': '',
            'service_name': 'MYSERVICE',
            'has_bulk_commands_definition': True|False,
            'reassign_allowed': True|False,
            'recovery_enabled': True|False,
            'cardinality': '0+|1|1+',
            'hostnames': ['c6401.ambari.apache.org'],
            'component_name': 'MY_COMPONENT_NAME'
          },
          'dependencies': []
          },
          ...
          }],
          'configurations': [
            {
              'StackConfigurations':
              {
                'stack_name': 'HDP',
                'service_name': 'MYSERVICE',
                'stack_version': '9.0',
                'property_depends_on': [],
                'type': 'myservice-config.xml',
                'property_name': 'foo'
              },
              'dependencies': []
            },
            {
              'StackConfigurations': {
                'stack_name': 'HDP',
                'service_name': 'ZOOKEEPER',
                'stack_version':
                '2.6',
                'property_depends_on': [],
                'type': 'zoo.cfg.xml',
                'property_name': 'autopurge.snapRetainCount'
              },
              'dependencies': []
            }
            ...
         ]
        }
      ],
      'configurations': {}
    }

    :param hosts: Dictionary where hosts["items"] contains list of hosts on the cluster.
    E.g. of the form,
    {
      'items': [
        {
          'Hosts':
          {
            'host_name': 'c6401.ambari.apache.org',
            'public_host_name': 'c6401.ambari.apache.org',
            'ip': '192.168.64.101',
            'rack_info': '/default-rack',
            'os_type': 'centos6',
            'os_arch': 'x86_64',
            'cpu_count': 1,
            'ph_cpu_count': 1
            'host_state': 'HEALTHY',
            'total_mem': 2926196,
            'host_status': 'HEALTHY',
            'last_registration_time': 1481833146522,
            'os_family': 'redhat6',
            'last_heartbeat_time': 1481835051067,
            'recovery_summary': 'DISABLED',
            'host_health_report': '',
            'desired_configs': None,
            'disk_info': [
              {
                'available': '483608892',
                'used': '3304964',
                'percent': '1%',
                'device': '/dev/mapper/VolGroup-lv_root',
                'mountpoint': '/',
                'type': 'ext4',
                'size': '512971376'
              },
              ...
            ],
            'recovery_report': {
              'component_reports': [],
              'summary': 'DISABLED'
            },
            'last_agent_env': {
              'transparentHugePage': 'always',
              'hostHealth': {
                'agentTimeStampAtReporting': 1481835031135,
                'activeJavaProcs': [],
                'serverTimeStampAtReporting': 1481835031180,
                'liveServices': [{
                  'status': 'Healthy',
                  'name': 'ntpd',
                  'desc': ''
                }]
              },
              'umask': 18,
              'reverseLookup': True,
              'alternatives': [],
              'existingUsers': [],
              'firewallName': 'iptables',
              'stackFoldersAndFiles': [],
              'existingRepos': [],
              'installedPackages': [],
              'firewallRunning': False
            }
          }
        }
      ]
    }

    :return: List of errors
    """
    # To be overriden by subclass or Service Advisor
    raise Fail("Must be overriden by subclass or Service Advisor")

  def getActiveHosts(self, hosts):
    """ Filters the list of specified hosts object and returns
        a list of hosts which are not in maintenance mode. """
    hostsList = []
    if hosts is not None:
      hostsList = [host['host_name'] for host in hosts
                   if host.get('maintenance_state') is None or host.get('maintenance_state') == "OFF"]
    return hostsList

  def getServiceAdvisor(self, key):
    """
    Get the class name for the Service Advisor with the given name if it exists, or None otherwise.
    :param key: Service Name
    :return: Class name if it exists, or None otherwise.
    """
    if not self.loaded_service_advisors:
      self.loadServiceAdvisors()

    return self.serviceAdvisorsDict[key] if key in self.serviceAdvisorsDict else None

  def loadServiceAdvisors(self):
    """
    If not loaded, for all of the services requested load the Service Advisor into the in-memory dictionary.
    """
    self.loaded_service_advisors = True
    if self.services is None or "services" not in self.services:
      return

    for service in self.services["services"]:
      serviceName = service["StackServices"]["service_name"]
      serviceAdvisor = self.instantiateServiceAdvisor(service)
      # This may store None for that service advisor.
      self.serviceAdvisorsDict[serviceName] = serviceAdvisor
      for component in service["components"]:
        componentName = self.getComponentName(component)
        self.serviceAdvisorsDict[componentName] = self.serviceAdvisorsDict[serviceName]

  def instantiateServiceAdvisor(self, service):
    """
    Load the Service Advisor for the given services by finding the best class in the given file.
    :param service: Service object that contains a path to the advisor being requested.
    :return: The class name for the Service Advisor requested, or None if one could not be found.
    """
    service_name = service["StackServices"]["service_name"]
    class_name = service["StackServices"]["advisor_name"] if "advisor_name" in service["StackServices"] else None
    path = service["StackServices"]["advisor_path"] if "advisor_path" in service["StackServices"] else None

    class_name_pattern = re.compile("%s.*?ServiceAdvisor" % service_name, re.IGNORECASE)

    if path is not None and os.path.exists(path) and class_name is not None:
      try:
        with open(path, 'rb') as fp:
          service_advisor = imp.load_module('service_advisor_impl', fp, path, ('.py', 'rb', imp.PY_SOURCE))

          # Find the class name by reading from all of the available attributes of the python file.
          attributes = dir(service_advisor)
          best_class_name = class_name
          for potential_class_name in attributes:
            if not potential_class_name.startswith("__"):
              m = class_name_pattern.match(potential_class_name)
              if m:
                best_class_name = potential_class_name
                break

          if hasattr(service_advisor, best_class_name):
            Logger.info("ServiceAdvisor implementation for service {0} was loaded".format(service_name))
            return getattr(service_advisor, best_class_name)()
          else:
            Logger.error("Failed to load or create ServiceAdvisor implementation for service {0}: " \
                  "Expecting class name {1} but it was not found.".format(service_name, best_class_name))
      except Exception as e:
        traceback.print_exc()
        Logger.error("Failed to load or create ServiceAdvisor implementation for service {0}".format(service_name))

    return None

  def recommendComponentLayout(self, services, hosts):
    """Returns Services object with hostnames array populated for components"""

    stackName = services["Versions"]["stack_name"]
    stackVersion = services["Versions"]["stack_version"]
    hostsList = self.getActiveHosts([host["Hosts"] for host in hosts["items"]])
    servicesList = self.getServiceNames(services)

    layoutRecommendations = self.createComponentLayoutRecommendations(services, hosts)

    recommendations = {
      "Versions": {"stack_name": stackName, "stack_version": stackVersion},
      "hosts": hostsList,
      "services": servicesList,
      "recommendations": layoutRecommendations
    }

    return recommendations

  def get_heap_size_properties(self, services):
    """
    Get dictionary of all of the components and a mapping to the heap-size configs, along with default values
    if the heap-size config could not be found. This is used in calculations for the total memory needed to run
    the cluster.
    :param services: Dictionary that contains all of the services being requested. This is used to find heap-size
    configs that have been delegated to Service Advisors to define.
    :return: Dictionary of mappings from component name to another dictionary of the heap-size configs.
    """
    default = {
      "NAMENODE":
        [{"config-name": "hadoop-env",
          "property": "namenode_heapsize",
          "default": "1024m"}],
      "SECONDARY_NAMENODE":
        [{"config-name": "hadoop-env",
          "property": "namenode_heapsize",
          "default": "1024m"}],
      "DATANODE":
        [{"config-name": "hadoop-env",
          "property": "dtnode_heapsize",
          "default": "1024m"}],
      "REGIONSERVER":
        [{"config-name": "hbase-env",
          "property": "hbase_regionserver_heapsize",
          "default": "1024m"}],
      "HBASE_MASTER":
        [{"config-name": "hbase-env",
          "property": "hbase_master_heapsize",
          "default": "1024m"}],
      "HIVE_CLIENT":
        [{"config-name": "hive-env",
          "property": "hive.client.heapsize",
          "default": "1024m"}],
      "HIVE_METASTORE":
        [{"config-name": "hive-env",
          "property": "hive.metastore.heapsize",
          "default": "1024m"}],
      "HIVE_SERVER":
        [{"config-name": "hive-env",
          "property": "hive.heapsize",
          "default": "1024m"}],
      "HISTORYSERVER":
        [{"config-name": "mapred-env",
          "property": "jobhistory_heapsize",
          "default": "1024m"}],
      "OOZIE_SERVER":
        [{"config-name": "oozie-env",
          "property": "oozie_heapsize",
          "default": "1024m"}],
      "RESOURCEMANAGER":
        [{"config-name": "yarn-env",
          "property": "resourcemanager_heapsize",
          "default": "1024m"}],
      "NODEMANAGER":
        [{"config-name": "yarn-env",
          "property": "nodemanager_heapsize",
          "default": "1024m"}],
      "APP_TIMELINE_SERVER":
        [{"config-name": "yarn-env",
          "property": "apptimelineserver_heapsize",
          "default": "1024m"}],
      "ZOOKEEPER_SERVER":
        [{"config-name": "zookeeper-env",
          "property": "zk_server_heapsize",
          "default": "1024m"}],
      "METRICS_COLLECTOR":
        [{"config-name": "ams-hbase-env",
          "property": "hbase_master_heapsize",
          "default": "1024m"},
         {"config-name": "ams-hbase-env",
          "property": "hbase_regionserver_heapsize",
          "default": "1024m"},
         {"config-name": "ams-env",
          "property": "metrics_collector_heapsize",
          "default": "512m"}],
      "ATLAS_SERVER":
        [{"config-name": "atlas-env",
          "property": "atlas_server_xmx",
          "default": "2048m"}],
      "LOGSEARCH_SERVER":
        [{"config-name": "logsearch-env",
          "property": "logsearch_app_max_memory",
          "default": "1024m"}],
      "LOGSEARCH_LOGFEEDER":
        [{"config-name": "logfeeder-env",
          "property": "logfeeder_max_mem",
          "default": "512m"}],
      "SPARK_JOBHISTORYSERVER":
        [{"config-name": "spark-env",
          "property": "spark_daemon_memory",
          "default": "1024m"}],
      "SPARK2_JOBHISTORYSERVER":
        [{"config-name": "spark2-env",
          "property": "spark_daemon_memory",
          "default": "1024m"}]
    }


    try:
      # Override any by reading from the Service Advisors

      for service in services["services"]:
        serviceName = service["StackServices"]["service_name"]
        serviceAdvisor = self.getServiceAdvisor(serviceName)

        # This seems confusing, but "self" may actually refer to the actual Service Advisor class that was loaded
        # as opposed to this class.
        advisor = serviceAdvisor if serviceAdvisor is not None else self

        # TODO, switch this to a function instead of a property.
        if hasattr(advisor, "heap_size_properties"):
          # Override the values in "default" with those from the service advisor
          default.update(advisor.heap_size_properties)
    except Exception, e:
      traceback.print_exc()
    return default

  def createComponentLayoutRecommendations(self, services, hosts):
    self.services = services

    recommendations = {
      "blueprint": {
        "host_groups": [ ]
      },
      "blueprint_cluster_binding": {
        "host_groups": [ ]
      }
    }

    hostsList = self.getActiveHosts([host["Hosts"] for host in hosts["items"]])

    # for fast lookup
    hostsSet = set(hostsList)

    hostsComponentsMap = {}
    for hostName in hostsList:
      if hostName not in hostsComponentsMap:
        hostsComponentsMap[hostName] = []

    #extend hostsComponentsMap' with MASTER components
    for service in services["services"]:
      masterComponents = [component for component in service["components"] if self.isMasterComponent(component)]
      serviceName = service["StackServices"]["service_name"]
      serviceAdvisor = self.getServiceAdvisor(serviceName)
      for component in masterComponents:
        componentName = component["StackServiceComponents"]["component_name"]
        advisor = serviceAdvisor if serviceAdvisor is not None else self
        hostsForComponent = advisor.getHostsForMasterComponent(services, hosts, component, hostsList)

        #extend 'hostsComponentsMap' with 'hostsForComponent'
        for hostName in hostsForComponent:
          if hostName in hostsSet:
            hostsComponentsMap[hostName].append( { "name":componentName } )

    #extend 'hostsComponentsMap' with Slave and Client Components
    componentsListList = [service["components"] for service in services["services"]]
    componentsList = [item for sublist in componentsListList for item in sublist]
    usedHostsListList = [component["StackServiceComponents"]["hostnames"] for component in componentsList if not self.isComponentNotValuable(component)]
    utilizedHosts = [item for sublist in usedHostsListList for item in sublist]
    freeHosts = [hostName for hostName in hostsList if hostName not in utilizedHosts]

    for service in services["services"]:
      slaveClientComponents = [component for component in service["components"]
                               if self.isSlaveComponent(component) or self.isClientComponent(component)]
      serviceName = service["StackServices"]["service_name"]
      serviceAdvisor = self.getServiceAdvisor(serviceName)
      for component in slaveClientComponents:
        componentName = component["StackServiceComponents"]["component_name"]
        advisor = serviceAdvisor if serviceAdvisor is not None else self
        hostsForComponent = advisor.getHostsForSlaveComponent(services, hosts, component, hostsList, freeHosts)

        #extend 'hostsComponentsMap' with 'hostsForComponent'
        for hostName in hostsForComponent:
          if hostName not in hostsComponentsMap and hostName in hostsSet:
            hostsComponentsMap[hostName] = []
          if hostName in hostsSet:
            hostsComponentsMap[hostName].append( { "name": componentName } )

    #colocate custom services
    for service in services["services"]:
      serviceName = service["StackServices"]["service_name"]
      serviceAdvisor = self.getServiceAdvisor(serviceName)
      if serviceAdvisor is not None:
        serviceComponents = [component for component in service["components"]]
        serviceAdvisor.colocateService(hostsComponentsMap, serviceComponents)

    #prepare 'host-group's from 'hostsComponentsMap'
    host_groups = recommendations["blueprint"]["host_groups"]
    bindings = recommendations["blueprint_cluster_binding"]["host_groups"]
    index = 0
    for key in hostsComponentsMap.keys():
      index += 1
      host_group_name = "host-group-{0}".format(index)
      host_groups.append( { "name": host_group_name, "components": hostsComponentsMap[key] } )
      bindings.append( { "name": host_group_name, "hosts": [{ "fqdn": key }] } )

    return recommendations

  def getHostsForMasterComponent(self, services, hosts, component, hostsList):
    if self.isComponentHostsPopulated(component):
      return component["StackServiceComponents"]["hostnames"]

    if len(hostsList) > 1 and self.isMasterComponentWithMultipleInstances(component):
      hostsCount = self.getMinComponentCount(component)
      if hostsCount > 1: # get first 'hostsCount' available hosts
        hostsForComponent = []
        hostIndex = 0
        while hostsCount > len(hostsForComponent) and hostIndex < len(hostsList):
          currentHost = hostsList[hostIndex]
          if self.isHostSuitableForComponent(currentHost, component):
            hostsForComponent.append(currentHost)
          hostIndex += 1
        return hostsForComponent

    return [self.getHostForComponent(component, hostsList)]

  def getHostsForSlaveComponent(self, services, hosts, component, hostsList, freeHosts):
    if component["StackServiceComponents"]["cardinality"] == "ALL":
      return hostsList

    if self.isComponentHostsPopulated(component):
      return component["StackServiceComponents"]["hostnames"]

    hostsForComponent = []
    componentName = component["StackServiceComponents"]["component_name"]
    if self.isSlaveComponent(component):
      cardinality = str(component["StackServiceComponents"]["cardinality"])
      hostsMin, hostsMax = self.parseCardinality(cardinality, len(hostsList))
      hostsMin, hostsMax = (0 if hostsMin is None else hostsMin, len(hostsList) if hostsMax is None else hostsMax)
      if self.isComponentUsingCardinalityForLayout(componentName) and cardinality:
        if hostsMin > len(hostsForComponent):
          hostsForComponent.extend(freeHosts[0:hostsMin-len(hostsForComponent)])

      else:
        hostsForComponent.extend(freeHosts)
        if not hostsForComponent:  # hostsForComponent is empty
          hostsForComponent = hostsList[-1:]
      hostsForComponent = list(set(hostsForComponent))  # removing duplicates
      if len(hostsForComponent) < hostsMin:
        hostsForComponent = list(set(hostsList))[0:hostsMin]
      elif len(hostsForComponent) > hostsMax:
        hostsForComponent = list(set(hostsList))[0:hostsMax]
    elif self.isClientComponent(component):
      hostsForComponent = freeHosts[0:1]
      if not hostsForComponent:  # hostsForComponent is empty
        hostsForComponent = hostsList[-1:]

    return hostsForComponent

  def isComponentUsingCardinalityForLayout(self, componentName):
    return False

  def createValidationResponse(self, services, validationItems):
    """Returns array of Validation objects about issues with hostnames components assigned to"""
    stackName = services["Versions"]["stack_name"]
    stackVersion = services["Versions"]["stack_version"]

    validations = {
      "Versions": {"stack_name": stackName, "stack_version": stackVersion},
      "items": validationItems
    }

    return validations

  def validateComponentLayout(self, services, hosts):
    """Returns array of Validation objects about issues with hostnames components assigned to"""
    validationItems = self.getComponentLayoutValidations(services, hosts)
    return self.createValidationResponse(services, validationItems)

  def validateConfigurations(self, services, hosts):
    """Returns array of Validation objects about issues with hostnames components assigned to"""
    self.services = services

    validationItems = self.getConfigurationsValidationItems(services, hosts)
    return self.createValidationResponse(services, validationItems)

  def getComponentLayoutValidations(self, services, hosts):
    self.services = services

    items = []
    if services is None:
      return items

    for service in services["services"]:
      serviceName = service["StackServices"]["service_name"]
      serviceAdvisor = self.getServiceAdvisor(serviceName)
      if serviceAdvisor is not None:
        items.extend(serviceAdvisor.getServiceComponentLayoutValidations(services, hosts))

    return items

  def getConfigurationClusterSummary(self, servicesList, hosts, components, services):
    """
    Copied from HDP 2.0.6 so that it could be used by Service Advisors.
    :return: Dictionary of memory and CPU attributes in the cluster
    """
    hBaseInstalled = False
    if 'HBASE' in servicesList:
      hBaseInstalled = True

    cluster = {
      "cpu": 0,
      "disk": 0,
      "ram": 0,
      "hBaseInstalled": hBaseInstalled,
      "components": components
    }

    if len(hosts["items"]) > 0:
      nodeManagerHosts = self.getHostsWithComponent("YARN", "NODEMANAGER", services, hosts)
      # NodeManager host with least memory is generally used in calculations as it will work in larger hosts.
      if nodeManagerHosts is not None and len(nodeManagerHosts) > 0:
        nodeManagerHost = nodeManagerHosts[0];
        for nmHost in nodeManagerHosts:
          if nmHost["Hosts"]["total_mem"] < nodeManagerHost["Hosts"]["total_mem"]:
            nodeManagerHost = nmHost
        host = nodeManagerHost["Hosts"]
        cluster["referenceNodeManagerHost"] = host
      else:
        host = hosts["items"][0]["Hosts"]
      cluster["referenceHost"] = host
      cluster["cpu"] = host["cpu_count"]
      cluster["disk"] = len(host["disk_info"])
      cluster["ram"] = int(host["total_mem"] / (1024 * 1024))

    ramRecommendations = [
      {"os":1, "hbase":1},
      {"os":2, "hbase":1},
      {"os":2, "hbase":2},
      {"os":4, "hbase":4},
      {"os":6, "hbase":8},
      {"os":8, "hbase":8},
      {"os":8, "hbase":8},
      {"os":12, "hbase":16},
      {"os":24, "hbase":24},
      {"os":32, "hbase":32},
      {"os":64, "hbase":32}
    ]
    index = {
      cluster["ram"] <= 4: 0,
      4 < cluster["ram"] <= 8: 1,
      8 < cluster["ram"] <= 16: 2,
      16 < cluster["ram"] <= 24: 3,
      24 < cluster["ram"] <= 48: 4,
      48 < cluster["ram"] <= 64: 5,
      64 < cluster["ram"] <= 72: 6,
      72 < cluster["ram"] <= 96: 7,
      96 < cluster["ram"] <= 128: 8,
      128 < cluster["ram"] <= 256: 9,
      256 < cluster["ram"]: 10
    }[1]


    cluster["reservedRam"] = ramRecommendations[index]["os"]
    cluster["hbaseRam"] = ramRecommendations[index]["hbase"]


    cluster["minContainerSize"] = {
      cluster["ram"] <= 4: 256,
      4 < cluster["ram"] <= 8: 512,
      8 < cluster["ram"] <= 24: 1024,
      24 < cluster["ram"]: 2048
    }[1]

    totalAvailableRam = cluster["ram"] - cluster["reservedRam"]
    if cluster["hBaseInstalled"]:
      totalAvailableRam -= cluster["hbaseRam"]
    cluster["totalAvailableRam"] = max(512, totalAvailableRam * 1024)
    '''containers = max(3, min (2*cores,min (1.8*DISKS,(Total available RAM) / MIN_CONTAINER_SIZE))))'''
    cluster["containers"] = round(max(3,
                                      min(2 * cluster["cpu"],
                                          min(ceil(1.8 * cluster["disk"]),
                                              cluster["totalAvailableRam"] / cluster["minContainerSize"]))))

    '''ramPerContainers = max(2GB, RAM - reservedRam - hBaseRam) / containers'''
    cluster["ramPerContainer"] = abs(cluster["totalAvailableRam"] / cluster["containers"])
    '''If greater than 1GB, value will be in multiples of 512.'''
    if cluster["ramPerContainer"] > 1024:
      cluster["ramPerContainer"] = int(cluster["ramPerContainer"] / 512) * 512

    cluster["mapMemory"] = int(cluster["ramPerContainer"])
    cluster["reduceMemory"] = cluster["ramPerContainer"]
    cluster["amMemory"] = max(cluster["mapMemory"], cluster["reduceMemory"])

    return cluster

  def validateClusterConfigurations(self, configurations, services, hosts):
    validationItems = []

    return self.toConfigurationValidationProblems(validationItems, "")

  def toConfigurationValidationProblems(self, validationProblems, siteName):
    """
    Encapsulate the validation item's fields of "level" and "message" for the given validation's config-name.
    :param validationProblems: List of validation problems
    :param siteName: Config type
    :return: List of configuration validation problems that include additional fields like the log level.
    """
    result = []
    for validationProblem in validationProblems:
      validationItem = validationProblem.get("item", None)
      if validationItem is not None:
        problem = {"type": 'configuration', "level": validationItem["level"], "message": validationItem["message"],
                   "config-type": siteName, "config-name": validationProblem["config-name"] }
        result.append(problem)
    return result

  def validateServiceConfigurations(self, serviceName):
    return self.getServiceConfigurationValidators().get(serviceName, None)

  def getServiceConfigurationValidators(self):
    return {}

  def validateMinMax(self, items, recommendedDefaults, configurations):

    # required for casting to the proper numeric type before comparison
    def convertToNumber(number):
      try:
        return int(number)
      except ValueError:
        return float(number)

    for configName in configurations:
      validationItems = []
      if configName in recommendedDefaults and "property_attributes" in recommendedDefaults[configName]:
        for propertyName in recommendedDefaults[configName]["property_attributes"]:
          if propertyName in configurations[configName]["properties"]:
            if "maximum" in recommendedDefaults[configName]["property_attributes"][propertyName] and \
                propertyName in recommendedDefaults[configName]["properties"]:
              userValue = convertToNumber(configurations[configName]["properties"][propertyName])
              maxValue = convertToNumber(recommendedDefaults[configName]["property_attributes"][propertyName]["maximum"])
              if userValue > maxValue:
                validationItems.extend([{"config-name": propertyName, "item": self.getWarnItem("Value is greater than the recommended maximum of {0} ".format(maxValue))}])
            if "minimum" in recommendedDefaults[configName]["property_attributes"][propertyName] and \
                    propertyName in recommendedDefaults[configName]["properties"]:
              userValue = convertToNumber(configurations[configName]["properties"][propertyName])
              minValue = convertToNumber(recommendedDefaults[configName]["property_attributes"][propertyName]["minimum"])
              if userValue < minValue:
                validationItems.extend([{"config-name": propertyName, "item": self.getWarnItem("Value is less than the recommended minimum of {0} ".format(minValue))}])
      items.extend(self.toConfigurationValidationProblems(validationItems, configName))
    pass


  def getConfigurationsValidationItems(self, services, hosts):
    """Returns array of Validation objects about issues with configuration values provided in services"""
    items = []

    recommendations = self.recommendConfigurations(services, hosts)
    recommendedDefaults = recommendations["recommendations"]["blueprint"]["configurations"]
    configurations = services["configurations"]

    for service in services["services"]:
      items.extend(self.getConfigurationsValidationItemsForService(configurations, recommendedDefaults, service, services, hosts))

    clusterWideItems = self.validateClusterConfigurations(configurations, services, hosts)
    items.extend(clusterWideItems)
    self.validateMinMax(items, recommendedDefaults, configurations)
    return items

  def validateListOfConfigUsingMethod(self, configurations, recommendedDefaults, services, hosts, validators):
    """
    Service Advisors can use this method to pass in a list of validators, each of which is a tuple of a
    a config type (string) and a function (pointer). Each validator is then executed.
    :param validators: List of tuples like [("hadoop-env", someFunctionPointer), ("hdfs-site", someFunctionPointer)]
    :return: List of validation errors
    """
    items = []
    for (configType, method) in validators:
      if configType in recommendedDefaults:
        siteProperties = self.getSiteProperties(configurations, configType)
        if siteProperties is not None:
          siteRecommendations = recommendedDefaults[configType]["properties"]
          print("SiteName: %s, method: %s" % (configType, method.__name__))
          print("Site properties: %s" % str(siteProperties))
          print("Recommendations: %s" % str(siteRecommendations))
          validationItems = method(siteProperties, siteRecommendations, configurations, services, hosts)
          items.extend(validationItems)
    return items

  def validateConfigurationsForSite(self, configurations, recommendedDefaults, services, hosts, siteName, method):
    """
    Deprecated, please use validateListOfConfigUsingMethod
    :return: List of validation errors by calling the corresponding method.
    """
    if siteName in recommendedDefaults:
      siteProperties = self.getSiteProperties(configurations, siteName)
      if siteProperties is not None:
        siteRecommendations = recommendedDefaults[siteName]["properties"]
        print("SiteName: %s, method: %s" % (siteName, method.__name__))
        print("Site properties: %s" % str(siteProperties))
        print("Recommendations: %s" % str(siteRecommendations))
        return method(siteProperties, siteRecommendations, configurations, services, hosts)
    return []

  def getConfigurationsValidationItemsForService(self, configurations, recommendedDefaults, service, services, hosts):
    items = []
    serviceName = service["StackServices"]["service_name"]
    validator = self.validateServiceConfigurations(serviceName)
    if validator is not None:
      for siteName, method in validator.items():
        resultItems = self.validateConfigurationsForSite(configurations, recommendedDefaults, services, hosts, siteName, method)
        items.extend(resultItems)

    serviceAdvisor = self.getServiceAdvisor(serviceName)
    if serviceAdvisor is not None:
      items.extend(serviceAdvisor.getServiceConfigurationsValidationItems(configurations, recommendedDefaults, services, hosts))

    return items

  def recommendConfigGroupsConfigurations(self, recommendations, services, components, hosts,
                            servicesList):
    recommendations["recommendations"]["config-groups"] = []
    for configGroup in services["config-groups"]:

      # Override configuration with the config group values
      cgServices = services.copy()
      for configName in configGroup["configurations"].keys():
        if configName in cgServices["configurations"]:
          cgServices["configurations"][configName]["properties"].update(
            configGroup["configurations"][configName]['properties'])
        else:
          cgServices["configurations"][configName] = \
          configGroup["configurations"][configName]

      # Override hosts with the config group hosts
      cgHosts = {"items": [host for host in hosts["items"] if
                           host["Hosts"]["host_name"] in configGroup["hosts"]]}

      # Override clusterSummary
      cgClusterSummary = self.getConfigurationClusterSummary(servicesList,
                                                             cgHosts,
                                                             components,
                                                             cgServices)

      configurations = {}

      # there can be dependencies between service recommendations which require special ordering
      # for now, make sure custom services (that have service advisors) run after standard ones
      serviceAdvisors = []
      for service in services["services"]:
        serviceName = service["StackServices"]["service_name"]
        # "calculation" is a function pointer
        calculation = self.getServiceConfigurationRecommender(serviceName)
        if calculation is not None:
          calculation(configurations, cgClusterSummary, cgServices, cgHosts)
        else:
          serviceAdvisor = self.getServiceAdvisor(serviceName)
          if serviceAdvisor is not None:
            serviceAdvisors.append(serviceAdvisor)
      for serviceAdvisor in serviceAdvisors:
        serviceAdvisor.getServiceConfigurationRecommendations(configurations, cgClusterSummary, cgServices, cgHosts)

      cgRecommendation = {
        "configurations": {},
        "dependent_configurations": {},
        "hosts": configGroup["hosts"]
      }

      recommendations["recommendations"]["config-groups"].append(
        cgRecommendation)

      # Parse results.
      for config in configurations.keys():
        cgRecommendation["configurations"][config] = {}
        cgRecommendation["dependent_configurations"][config] = {}
        # property + property_attributes
        for configElement in configurations[config].keys():
          cgRecommendation["configurations"][config][configElement] = {}
          cgRecommendation["dependent_configurations"][config][
            configElement] = {}
          for property, value in configurations[config][configElement].items():
            if config in configGroup["configurations"]:
              cgRecommendation["configurations"][config][configElement][
                property] = value
            else:
              cgRecommendation["dependent_configurations"][config][
                configElement][property] = value

  def recommendConfigurations(self, services, hosts):
    self.services = services

    stackName = services["Versions"]["stack_name"]
    stackVersion = services["Versions"]["stack_version"]
    hostsList = [host["Hosts"]["host_name"] for host in hosts["items"]]
    servicesList = [service["StackServices"]["service_name"] for service in services["services"]]
    components = [component["StackServiceComponents"]["component_name"]
                  for service in services["services"]
                  for component in service["components"]]

    clusterSummary = self.getConfigurationClusterSummary(servicesList, hosts, components, services)

    recommendations = {
      "Versions": {"stack_name": stackName, "stack_version": stackVersion},
      "hosts": hostsList,
      "services": servicesList,
      "recommendations": {
        "blueprint": {
          "configurations": {},
          "host_groups": []
        },
        "blueprint_cluster_binding": {
          "host_groups": []
        }
      }
    }

    # If recommendation for config groups
    if "config-groups" in services:
      self.recommendConfigGroupsConfigurations(recommendations, services, components, hosts,
                                 servicesList)
    else:
      configurations = recommendations["recommendations"]["blueprint"]["configurations"]

      # there can be dependencies between service recommendations which require special ordering
      # for now, make sure custom services (that have service advisors) run after standard ones
      serviceAdvisors = []
      for service in services["services"]:
        serviceName = service["StackServices"]["service_name"]
        calculation = self.getServiceConfigurationRecommender(serviceName)
        if calculation is not None:
          calculation(configurations, clusterSummary, services, hosts)
        else:
          serviceAdvisor = self.getServiceAdvisor(serviceName)
          if serviceAdvisor is not None:
            serviceAdvisors.append(serviceAdvisor)
      for serviceAdvisor in serviceAdvisors:
        serviceAdvisor.getServiceConfigurationRecommendations(configurations, clusterSummary, services, hosts)

    return recommendations

  def getServiceConfigurationRecommender(self, service):
    return self.getServiceConfigurationRecommenderDict().get(service, None)

  def getServiceConfigurationRecommenderDict(self):
    return {}

  # Recommendation helper methods
  def isComponentHostsPopulated(self, component):
    hostnames = self.getComponentAttribute(component, "hostnames")
    if hostnames is not None:
      return len(hostnames) > 0
    return False

  def isClientComponent(self, component):
    return self.getComponentAttribute(component, "component_category") == 'CLIENT'

  def isSlaveComponent(self, component):
    return self.getComponentAttribute(component, "component_category") == 'SLAVE'

  def isMasterComponent(self, component):
    return self.getComponentAttribute(component, "is_master")

  def getComponentAttribute(self, component, attribute):
    serviceComponent = component.get("StackServiceComponents", None)
    if serviceComponent is None:
      return None
    return serviceComponent.get(attribute, None)

  def isLocalHost(self, hostName):
    return socket.getfqdn(hostName) == socket.getfqdn()

  def isMasterComponentWithMultipleInstances(self, component):
    componentName = self.getComponentName(component)
    masters = self.getMastersWithMultipleInstances()
    return componentName in masters

  def isComponentNotValuable(self, component):
    componentName = self.getComponentName(component)
    service = self.getNotValuableComponents()
    return componentName in service

  def getMinComponentCount(self, component):
    componentName = self.getComponentName(component)
    return self.getComponentCardinality(componentName)["min"]

  # Helper dictionaries
  def getComponentCardinality(self, componentName):
    dict = self.getCardinalitiesDict()
    if componentName in dict:
      return dict[componentName]
    else:
      return {"min": 1, "max": 1}

  def getHostForComponent(self, component, hostsList):
    if len(hostsList) == 0:
      return None

    componentName = self.getComponentName(component)

    if len(hostsList) != 1:
      scheme = self.getComponentLayoutSchemes().get(componentName, None)
      if scheme is not None:
        hostIndex = next((index for key, index in scheme.iteritems() if isinstance(key, (int, long)) and len(hostsList) < key), scheme['else'])
      else:
        hostIndex = 0
      for host in hostsList[hostIndex:]:
        if self.isHostSuitableForComponent(host, component):
          return host
    return hostsList[0]

  def getComponentName(self, component):
    return self.getComponentAttribute(component, "component_name")

  def isHostSuitableForComponent(self, host, component):
    return not (self.getComponentName(component) in self.getNotPreferableOnServerComponents() and self.isLocalHost(host))

  def getMastersWithMultipleInstances(self):
    return self.mastersWithMultipleInstances

  def getNotValuableComponents(self):
    return self.notValuableComponents

  def getNotPreferableOnServerComponents(self):
    return self.notPreferableOnServerComponents

  def getCardinalitiesDict(self):
    return self.cardinalitiesDict

  def getComponentLayoutSchemes(self):
    """
    Provides layout scheme dictionaries for components.

    The scheme dictionary basically maps the number of hosts to
    host index where component should exist.
    """
    return self.componentLayoutSchemes

  def getWarnItem(self, message):
    """
    Utility method used for validation warnings.
    """
    return {"level": "WARN", "message": message}

  def getErrorItem(self, message):
    """
    Utility method used for validation errors.
    """
    return {"level": "ERROR", "message": message}

  def getComponentHostNames(self, servicesDict, serviceName, componentName):
    for service in servicesDict["services"]:
      if service["StackServices"]["service_name"] == serviceName:
        for component in service['components']:
          if component["StackServiceComponents"]["component_name"] == componentName:
            return component["StackServiceComponents"]["hostnames"]

  def recommendConfigurationDependencies(self, services, hosts):
    self.allRequestedProperties = self.getAllRequestedProperties(services)
    result = self.recommendConfigurations(services, hosts)
    return self.filterResult(result, services)

  # returns recommendations only for changed and depended properties
  def filterResult(self, result, services):
    allRequestedProperties = self.getAllRequestedProperties(services)
    self.filterConfigs(result['recommendations']['blueprint']['configurations'], allRequestedProperties)
    if "config-groups" in services:
      for configGroup in result['recommendations']["config-groups"]:
        self.filterConfigs(configGroup["configurations"], allRequestedProperties)
        self.filterConfigs(configGroup["dependent_configurations"], allRequestedProperties)
    return result

  def filterConfigs(self, configs, requestedProperties):

    filteredConfigs = {}
    for type, names in configs.items():
      if 'properties' in names.keys():
        for name in names['properties']:
          if type in requestedProperties.keys() and \
                  name in requestedProperties[type]:
            if type not in filteredConfigs.keys():
              filteredConfigs[type] = {'properties': {}}
            filteredConfigs[type]['properties'][name] = \
              configs[type]['properties'][name]
      if 'property_attributes' in names.keys():
        for name in names['property_attributes']:
          if type in requestedProperties.keys() and \
                  name in requestedProperties[type]:
            if type not in filteredConfigs.keys():
              filteredConfigs[type] = {'property_attributes': {}}
            elif 'property_attributes' not in filteredConfigs[type].keys():
              filteredConfigs[type]['property_attributes'] = {}
            filteredConfigs[type]['property_attributes'][name] = \
              configs[type]['property_attributes'][name]
    configs.clear()
    configs.update(filteredConfigs)

  def getAllRequestedProperties(self, services):
    affectedConfigs = self.getAffectedConfigs(services)
    allRequestedProperties = {}
    for config in affectedConfigs:
      if config['type'] in allRequestedProperties:
        allRequestedProperties[config['type']].append(config['name'])
      else:
        allRequestedProperties[config['type']] = [config['name']]
    return allRequestedProperties

  def getAffectedConfigs(self, services):
    """returns properties dict including changed-configurations and depended-by configs"""
    changedConfigs = services['changed-configurations']
    changedConfigs = [{"type": entry["type"], "name": entry["name"]} for entry in changedConfigs]
    allDependencies = []

    for item in services['services']:
      allDependencies.extend(item['configurations'])

    dependencies = []

    size = -1
    while size != len(dependencies):
      size = len(dependencies)
      for config in allDependencies:
        property = {
          "type": re.sub('\.xml$', '', config['StackConfigurations']['type']),
          "name": config['StackConfigurations']['property_name']
        }
        if property in dependencies or property in changedConfigs:
          for dependedConfig in config['dependencies']:
            dependency = {
              "name": dependedConfig["StackConfigurationDependency"]["dependency_name"],
              "type": dependedConfig["StackConfigurationDependency"]["dependency_type"]
            }
            if dependency not in dependencies:
              dependencies.append(dependency)

    if "forced-configurations" in services and services["forced-configurations"] is not None:
      dependencies.extend(services["forced-configurations"])
    return  dependencies

  def versionCompare(self, version1, version2):
    def normalize(v):
      return [int(x) for x in re.sub(r'(\.0+)*$','', v).split(".")]
    return cmp(normalize(version1), normalize(version2))
  pass

  def getSiteProperties(self, configurations, siteName):
    siteConfig = configurations.get(siteName)
    if siteConfig is None:
      return None
    return siteConfig.get("properties")

  def getServicesSiteProperties(self, services, siteName):
    if not services:
      return None

    configurations = services.get("configurations")
    if not configurations:
      return None
    siteConfig = configurations.get(siteName)
    if siteConfig is None:
      return None
    return siteConfig.get("properties")

  def putProperty(self, config, configType, services=None):
    userConfigs = {}
    changedConfigs = []
    # if services parameter, prefer values, set by user
    if services:
      if 'configurations' in services.keys():
        userConfigs = services['configurations']
      if 'changed-configurations' in services.keys():
        changedConfigs = services["changed-configurations"]

    if configType not in config:
      config[configType] = {}
    if"properties" not in config[configType]:
      config[configType]["properties"] = {}
    def appendProperty(key, value):
      # If property exists in changedConfigs, do not override, use user defined property
      if not self.isPropertyRequested(configType, key, changedConfigs) \
          and configType in userConfigs and key in userConfigs[configType]['properties']:
        config[configType]["properties"][key] = userConfigs[configType]['properties'][key]
      else:
        config[configType]["properties"][key] = str(value)
    return appendProperty

  def __isPropertyInChangedConfigs(self, configType, propertyName, changedConfigs):
    for changedConfig in changedConfigs:
      if changedConfig['type']==configType and changedConfig['name']==propertyName:
        return True
    return False

  def isPropertyRequested(self, configType, propertyName, changedConfigs):
    # When the property depends on more than one property, we need to recalculate it based on the actual values
    # of all related properties. But "changed-configurations" usually contains only one on the dependent on properties.
    # So allRequestedProperties is used to avoid recommendations of other properties that are not requested.
    # Calculations should use user provided values for all properties that we depend on, not only the one that
    # came in the "changed-configurations".
    if self.allRequestedProperties:
      return configType in self.allRequestedProperties and propertyName in self.allRequestedProperties[configType]
    else:
      return not self.__isPropertyInChangedConfigs(configType, propertyName, changedConfigs)

  def updateProperty(self, config, configType, services=None):
    userConfigs = {}
    changedConfigs = []
    # if services parameter, prefer values, set by user
    if services:
      if 'configurations' in services.keys():
        userConfigs = services['configurations']
      if 'changed-configurations' in services.keys():
        changedConfigs = services["changed-configurations"]

    if configType not in config:
      config[configType] = {}
    if "properties" not in config[configType]:
      config[configType]["properties"] = {}

    def updatePropertyWithCallback(key, value, callback):
      # If property exists in changedConfigs, do not override, use user defined property
      if self.__isPropertyInChangedConfigs(configType, key, changedConfigs):
        config[configType]["properties"][key] = userConfigs[configType]['properties'][key]
      else:
        # Give the callback an empty string if the mapping doesn't exist
        current_value = ""
        if key in config[configType]["properties"]:
          current_value = config[configType]["properties"][key]

        config[configType]["properties"][key] = callback(current_value, value)

    return updatePropertyWithCallback

  def putPropertyAttribute(self, config, configType):
    if configType not in config:
      config[configType] = {}
    def appendPropertyAttribute(key, attribute, attributeValue):
      if "property_attributes" not in config[configType]:
        config[configType]["property_attributes"] = {}
      if key not in config[configType]["property_attributes"]:
        config[configType]["property_attributes"][key] = {}
      config[configType]["property_attributes"][key][attribute] = attributeValue if isinstance(attributeValue, list) else str(attributeValue)
    return appendPropertyAttribute

  def getHosts(self, componentsList, componentName):
    """
    Returns the hosts which are running the given component.
    """
    hostNamesList = [component["hostnames"] for component in componentsList if component["component_name"] == componentName]
    return hostNamesList[0] if len(hostNamesList) > 0 else []

  def getServiceComponents(self, services, serviceName):
    """
    Return list of components for serviceName service

    :type services dict
    :type serviceName str
    :rtype list
    """
    components = []

    if not services or not serviceName:
      return components

    for service in services["services"]:
      if service["StackServices"]["service_name"] == serviceName:
        components.extend(service["components"])
        break

    return components

  def getHostsForComponent(self, services, serviceName, componentName):
    """
    Returns the host(s) on which a requested service's component is hosted.

    :argument services Configuration information for the cluster
    :argument serviceName Passed-in service in consideration
    :argument componentName Passed-in component in consideration

    :type services dict
    :type serviceName str
    :type componentName str
    :rtype list
    """
    hosts_for_component = []
    components = self.getServiceComponents(services, serviceName)

    for component in components:
      if component["StackServiceComponents"]["component_name"] == componentName:
        hosts_for_component.extend(component["StackServiceComponents"]["hostnames"])
        break

    return hosts_for_component

  def getMountPoints(self, hosts):
    """
    Return list of mounts available on the hosts

    :type hosts dict
    """
    mount_points = []

    for item in hosts["items"]:
      if "disk_info" in item["Hosts"]:
        mount_points.append(item["Hosts"]["disk_info"])

    return mount_points

  def isSecurityEnabled(self, services):
    """
    Determines if security is enabled by testing the value of cluster-env/security enabled.

    If the property exists and is equal to "true", then is it enabled; otherwise is it assumed to be
    disabled.

    :param services: the services structure containing the current configurations
    :return: true if security is enabled; otherwise false
    """
    return "cluster-env" in services["configurations"] \
           and "security_enabled" in services["configurations"]["cluster-env"]["properties"] \
           and services["configurations"]["cluster-env"]["properties"]["security_enabled"].lower() == "true"

  def parseCardinality(self, cardinality, hostsCount):
    """
    Cardinality types: 1+, 1-2, 1, ALL
    @return: a tuple: (minHosts, maxHosts) or (None, None) if cardinality string is invalid
    """
    if not cardinality:
      return (None, None)

    if "+" in cardinality:
      return (int(cardinality[:-1]), int(hostsCount))
    elif "-" in cardinality:
      nums = cardinality.split("-")
      return (int(nums[0]), int(nums[1]))
    elif "ALL" == cardinality:
      return (int(hostsCount), int(hostsCount))
    elif cardinality.isdigit():
      return (int(cardinality),int(cardinality))

    return (None, None)

  def getServiceNames(self, services):
    return [service["StackServices"]["service_name"] for service in services["services"]]

  def filterHostMounts(self, hosts, services):
    """
    Filter mounts on the host using agent_mounts_ignore_list, by excluding and record with mount-point
     mentioned in agent_mounts_ignore_list.

    This function updates hosts dictionary

    Example:

      agent_mounts_ignore_list : "/run/secrets"

      Hosts record :

       "disk_info" : [
          {
              ...
            "mountpoint" : "/"
          },
          {
              ...
            "mountpoint" : "/run/secrets"
          }
        ]

      Result would be :

        "disk_info" : [
          {
              ...
            "mountpoint" : "/"
          }
        ]

    :type hosts dict
    :type services dict
    """
    if not services or "items" not in hosts:
      return hosts

    banned_filesystems = ["devtmpfs", "tmpfs", "vboxsf", "cdfs"]
    banned_mount_points = ["/etc/resolv.conf", "/etc/hostname", "/boot", "/mnt", "/tmp", "/run/secrets"]

    cluster_env = self.getServicesSiteProperties(services, "cluster-env")
    ignore_list = []

    if cluster_env and "agent_mounts_ignore_list" in cluster_env and cluster_env["agent_mounts_ignore_list"].strip():
      ignore_list = [x.strip() for x in cluster_env["agent_mounts_ignore_list"].strip().split(",")]

    ignore_list.extend(banned_mount_points)

    for host in hosts["items"]:
      if "Hosts" not in host and "disk_info" not in host["Hosts"]:
        continue

      host = host["Hosts"]
      disk_info = []

      for disk in host["disk_info"]:
        if disk["mountpoint"] not in ignore_list\
          and disk["type"].lower() not in banned_filesystems:
          disk_info.append(disk)

      host["disk_info"] = disk_info

    return hosts

  def __getSameHostMounts(self, hosts):
    """
    Return list of the mounts which are same and present on all hosts

    :type hosts dict
    :rtype list
    """
    if not hosts:
      return None

    hostMounts = self.getMountPoints(hosts)
    mounts = []
    for m in hostMounts:
      host_mounts = set([item["mountpoint"] for item in m])
      mounts = host_mounts if not mounts else mounts & host_mounts

    return sorted(mounts)

  def getMountPathVariations(self, initial_value, component_name, services, hosts):
    """
    Recommends best fitted mount by prefixing path with it.

    :return return list of paths with properly selected paths. If no recommendation possible,
     would be returned empty list

    :type initial_value str
    :type component_name str
    :type services dict
    :type hosts dict
    :rtype list
    """
    available_mounts = []

    if not initial_value:
      return available_mounts

    mounts = self.__getSameHostMounts(hosts)
    sep = "/"

    if not mounts:
      return available_mounts

    for mount in mounts:
      new_mount = initial_value if mount == "/" else os.path.join(mount + sep, initial_value.lstrip(sep))
      if new_mount not in available_mounts:
        available_mounts.append(new_mount)

    # no list transformations after filling the list, because this will cause item order change
    return available_mounts

  def getMountPathVariation(self, initial_value, component_name, services, hosts):
    """
    Recommends best fitted mount by prefixing path with it.

    :return return list of paths with properly selected paths. If no recommendation possible,
     would be returned empty list

    :type initial_value str
        :type component_name str
    :type services dict
    :type hosts dict
    :rtype str
    """
    try:
      return [self.getMountPathVariations(initial_value, component_name, services, hosts)[0]]
    except IndexError:
      return []

  def updateMountProperties(self, siteConfig, propertyDefinitions, configurations,  services, hosts):
    """
    Update properties according to recommendations for available mount-points

    propertyDefinitions is an array of set : property name, component name, initial value, recommendation type

     Where,

       property name - name of the property
       component name, name of the component to which belongs this property
       initial value - initial path
       recommendation type - could be "multi" or "single". This describes recommendation strategy, to use only one disk
        or use all available space on the host

    :type propertyDefinitions list
    :type siteConfig str
    :type configurations dict
    :type services dict
    :type hosts dict
    """

    props = self.getServicesSiteProperties(services, siteConfig)
    put_f = self.putProperty(configurations, siteConfig, services)

    for prop_item in propertyDefinitions:
      name, component, default_value, rc_type = prop_item
      recommendation = None

      if props is None or name not in props:
        if rc_type == "multi":
          recommendation = self.getMountPathVariations(default_value, component, services, hosts)
        else:
          recommendation = self.getMountPathVariation(default_value, component, services, hosts)
      elif props and name in props and props[name] == default_value:
        if rc_type == "multi":
          recommendation = self.getMountPathVariations(default_value, component, services, hosts)
        else:
          recommendation = self.getMountPathVariation(default_value, component, services, hosts)

      if recommendation:
        put_f(name, ",".join(recommendation))

  def getHostNamesWithComponent(self, serviceName, componentName, services):
    """
    Returns the list of hostnames on which service component is installed
    """
    if services is not None and serviceName in [service["StackServices"]["service_name"] for service in services["services"]]:
      service = [serviceEntry for serviceEntry in services["services"] if serviceEntry["StackServices"]["service_name"] == serviceName][0]
      components = [componentEntry for componentEntry in service["components"] if componentEntry["StackServiceComponents"]["component_name"] == componentName]
      if (len(components) > 0 and len(components[0]["StackServiceComponents"]["hostnames"]) > 0):
        componentHostnames = components[0]["StackServiceComponents"]["hostnames"]
        return componentHostnames
    return []

  def getHostsWithComponent(self, serviceName, componentName, services, hosts):
    if services is not None and hosts is not None and serviceName in [service["StackServices"]["service_name"] for service in services["services"]]:
      service = [serviceEntry for serviceEntry in services["services"] if serviceEntry["StackServices"]["service_name"] == serviceName][0]
      components = [componentEntry for componentEntry in service["components"] if componentEntry["StackServiceComponents"]["component_name"] == componentName]
      if (len(components) > 0 and len(components[0]["StackServiceComponents"]["hostnames"]) > 0):
        componentHostnames = components[0]["StackServiceComponents"]["hostnames"]
        componentHosts = [host for host in hosts["items"] if host["Hosts"]["host_name"] in componentHostnames]
        return componentHosts
    return []

  def getHostWithComponent(self, serviceName, componentName, services, hosts):
    componentHosts = self.getHostsWithComponent(serviceName, componentName, services, hosts)
    if (len(componentHosts) > 0):
      return componentHosts[0]
    return None

  def getHostComponentsByCategories(self, hostname, categories, services, hosts):
    components = []
    if services is not None and hosts is not None:
      for service in services["services"]:
        components.extend([componentEntry for componentEntry in service["components"]
                           if componentEntry["StackServiceComponents"]["component_category"] in categories
                           and hostname in componentEntry["StackServiceComponents"]["hostnames"]])
    return components

  def get_services_list(self, services):
    """
    Returns available services as list

    :type services dict
    :rtype list
    """
    if not services:
      return []

    return [service["StackServices"]["service_name"] for service in services["services"]]

  def getHadoopProxyUsersValidationItems(self, properties, services, hosts, configurations):
    validationItems = []
    users = self.getHadoopProxyUsers(services, hosts, configurations)
    for user_name, user_properties in users.iteritems():
      props = ["hadoop.proxyuser.{0}.hosts".format(user_name)]
      if "propertyGroups" in user_properties:
        props.append("hadoop.proxyuser.{0}.groups".format(user_name))

      for prop in props:
        validationItems.append({"config-name": prop, "item": self.validatorNotEmpty(properties, prop)})

    return validationItems

  def getHadoopProxyUsers(self, services, hosts, configurations):
    """
    Gets Hadoop Proxy User recommendations based on the configuration that is provided by
    getServiceHadoopProxyUsersConfigurationDict.

    See getServiceHadoopProxyUsersConfigurationDict
    """
    servicesList = self.get_services_list(services)
    users = {}

    for serviceName, serviceUserComponents in self.getServiceHadoopProxyUsersConfigurationDict().iteritems():
      users.update(self._getHadoopProxyUsersForService(serviceName, serviceUserComponents, services, hosts, configurations))

    return users

  def getServiceHadoopProxyUsersConfigurationDict(self):
    """
    Returns a map that is used by 'getHadoopProxyUsers' to determine service
    user properties and related components and get proxyuser recommendations.
    This method can be overridden in stackadvisors for the further stacks to
    add additional services or change the previous logic.

    Example of the map format:
    {
      "serviceName": [
        ("configTypeName1", "userPropertyName1", {"propertyHosts": "*", "propertyGroups": "exact string value"})
        ("configTypeName2", "userPropertyName2", {"propertyHosts": ["COMPONENT1", "COMPONENT2", "COMPONENT3"], "propertyGroups": "*"}),
        ("configTypeName3", "userPropertyName3", {"propertyHosts": ["COMPONENT1", "COMPONENT2", "COMPONENT3"]}, filterFunction)
      ],
      "serviceName2": [
        ...
    }

    If the third element of a tuple is map that maps proxy property to it's value.
    The key could be either 'propertyHosts' or 'propertyGroups'. (Both are optional)
    If the map value is a string, then this string will be used for the proxyuser
    value (e.g. 'hadoop.proxyuser.{user}.hosts' = '*').
    Otherwise map value should be alist or a tuple with component names.
    All hosts with the provided components will be added
    to the property (e.g. 'hadoop.proxyuser.{user}.hosts' = 'host1,host2,host3')

    The forth element of the tuple is optional and if it's provided,
    it should be a function that takes two arguments: services and hosts.
    If it returns False, proxyusers for the tuple will not be added.
    """
    ALL_WILDCARD = "*"
    HOSTS_PROPERTY = "propertyHosts"
    GROUPS_PROPERTY = "propertyGroups"

    return {
      "HDFS":   [("hadoop-env", "hdfs_user", {HOSTS_PROPERTY: ALL_WILDCARD, GROUPS_PROPERTY: ALL_WILDCARD})],
      "OOZIE":  [("oozie-env", "oozie_user", {HOSTS_PROPERTY: ["OOZIE_SERVER"], GROUPS_PROPERTY: ALL_WILDCARD})],
      "HIVE":   [("hive-env", "hive_user", {HOSTS_PROPERTY: ["HIVE_SERVER", "HIVE_SERVER_INTERACTIVE"], GROUPS_PROPERTY: ALL_WILDCARD}),
                 ("hive-env", "webhcat_user", {HOSTS_PROPERTY: ["WEBHCAT_SERVER"], GROUPS_PROPERTY: ALL_WILDCARD})],
      "YARN":   [("yarn-env", "yarn_user", {HOSTS_PROPERTY: ["RESOURCEMANAGER"]}, lambda services, hosts: len(self.getHostsWithComponent("YARN", "RESOURCEMANAGER", services, hosts)) > 1)],
      "FALCON": [("falcon-env", "falcon_user", {HOSTS_PROPERTY: ALL_WILDCARD, GROUPS_PROPERTY: ALL_WILDCARD})],
      "SPARK":  [("livy-env", "livy_user", {HOSTS_PROPERTY: ALL_WILDCARD, GROUPS_PROPERTY: ALL_WILDCARD})]
    }

  def _getHadoopProxyUsersForService(self, serviceName, serviceUserComponents, services, hosts, configurations):
    Logger.info("Calculating Hadoop Proxy User recommendations for {0} service.".format(serviceName))
    servicesList = self.get_services_list(services)
    resultUsers = {}

    if serviceName in servicesList:
      usersComponents = {}
      for values in serviceUserComponents:

        # Filter, if 4th argument is present in the tuple
        filterFunction = values[3:]
        if filterFunction and not filterFunction[0](services, hosts):
          continue

        userNameConfig, userNameProperty, hostSelectorMap = values[:3]
        user = get_from_dict(services, ("configurations", userNameConfig, "properties", userNameProperty), None)
        if user:
          usersComponents[user] = (userNameConfig, userNameProperty, hostSelectorMap)

      for user, (userNameConfig, userNameProperty, hostSelectorMap) in usersComponents.iteritems():
        proxyUsers = {"config": userNameConfig, "propertyName": userNameProperty}
        for proxyPropertyName, hostSelector in hostSelectorMap.iteritems():
          componentHostNamesString = hostSelector if isinstance(hostSelector, basestring) else '*'
          if isinstance(hostSelector, (list, tuple)):
            _, componentHostNames = self.get_data_for_proxyuser(user, services, configurations) # preserve old values
            for component in hostSelector:
              componentHosts = self.getHostsWithComponent(serviceName, component, services, hosts)
              if componentHosts is not None:
                for componentHost in componentHosts:
                  componentHostName =  componentHost["Hosts"]["host_name"]
                  componentHostNames.add(componentHostName)

            componentHostNamesString = ",".join(sorted(componentHostNames))
            Logger.info("Host List for [service='{0}'; user='{1}'; components='{2}']: {3}".format(serviceName, user, ','.join(hostSelector), componentHostNamesString))

          if not proxyPropertyName in proxyUsers:
            proxyUsers[proxyPropertyName] = componentHostNamesString

        if not user in resultUsers:
          resultUsers[user] = proxyUsers

    return resultUsers

  def recommendHadoopProxyUsers(self, configurations, services, hosts):
    servicesList = self.get_services_list(services)

    if 'forced-configurations' not in services:
      services["forced-configurations"] = []

    putCoreSiteProperty = self.putProperty(configurations, "core-site", services)
    putCoreSitePropertyAttribute = self.putPropertyAttribute(configurations, "core-site")

    users = self.getHadoopProxyUsers(services, hosts, configurations)

    # Force dependencies for HIVE
    if "HIVE" in servicesList:
      hive_user = get_from_dict(services, ("configurations", "hive-env", "properties", "hive_user"), default_value=None)
      if hive_user and get_from_dict(users, (hive_user, "propertyHosts"), default_value=None):
        services["forced-configurations"].append({"type" : "core-site", "name" : "hadoop.proxyuser.{0}.hosts".format(hive_user)})

    for user_name, user_properties in users.iteritems():

      # Add properties "hadoop.proxyuser.*.hosts", "hadoop.proxyuser.*.groups" to core-site for all users
      self.put_proxyuser_value(user_name, user_properties["propertyHosts"], services=services, configurations=configurations, put_function=putCoreSiteProperty)
      Logger.info("Updated hadoop.proxyuser.{0}.hosts as : {1}".format(user_name, user_properties["propertyHosts"]))
      if "propertyGroups" in user_properties:
        self.put_proxyuser_value(user_name, user_properties["propertyGroups"], is_groups=True, services=services, configurations=configurations, put_function=putCoreSiteProperty)

      # Remove old properties if user was renamed
      userOldValue = self.getOldValue(services, user_properties["config"], user_properties["propertyName"])
      if userOldValue is not None and userOldValue != user_name:
        putCoreSitePropertyAttribute("hadoop.proxyuser.{0}.hosts".format(userOldValue), 'delete', 'true')
        services["forced-configurations"].append({"type" : "core-site", "name" : "hadoop.proxyuser.{0}.hosts".format(userOldValue)})
        services["forced-configurations"].append({"type" : "core-site", "name" : "hadoop.proxyuser.{0}.hosts".format(user_name)})

        if "propertyGroups" in user_properties:
          putCoreSitePropertyAttribute("hadoop.proxyuser.{0}.groups".format(userOldValue), 'delete', 'true')
          services["forced-configurations"].append({"type" : "core-site", "name" : "hadoop.proxyuser.{0}.groups".format(userOldValue)})
          services["forced-configurations"].append({"type" : "core-site", "name" : "hadoop.proxyuser.{0}.groups".format(user_name)})

    self.recommendAmbariProxyUsersForHDFS(services, configurations, servicesList, putCoreSiteProperty, putCoreSitePropertyAttribute)

  def recommendAmbariProxyUsersForHDFS(self, services, configurations, servicesList, putCoreSiteProperty, putCoreSitePropertyAttribute):
    if "HDFS" in servicesList:
      ambari_user = self.getAmbariUser(services)
      ambariHostName = socket.getfqdn()
      self.put_proxyuser_value(ambari_user, ambariHostName, services=services, configurations=configurations, put_function=putCoreSiteProperty)
      self.put_proxyuser_value(ambari_user, "*", is_groups=True, services=services, configurations=configurations, put_function=putCoreSiteProperty)
      old_ambari_user = self.getOldAmbariUser(services)
      if old_ambari_user is not None:
        putCoreSitePropertyAttribute("hadoop.proxyuser.{0}.hosts".format(old_ambari_user), 'delete', 'true')
        putCoreSitePropertyAttribute("hadoop.proxyuser.{0}.groups".format(old_ambari_user), 'delete', 'true')

  def getAmbariUser(self, services):
    ambari_user = services['ambari-server-properties']['ambari-server.user']
    if "cluster-env" in services["configurations"] \
        and "ambari_principal_name" in services["configurations"]["cluster-env"]["properties"] \
        and "security_enabled" in services["configurations"]["cluster-env"]["properties"] \
        and services["configurations"]["cluster-env"]["properties"]["security_enabled"].lower() == "true":
      ambari_user = services["configurations"]["cluster-env"]["properties"]["ambari_principal_name"]
      ambari_user = ambari_user.split('@')[0]
    return ambari_user

  def getOldAmbariUser(self, services):
    ambari_user = None
    if "cluster-env" in services["configurations"]:
      if "security_enabled" in services["configurations"]["cluster-env"]["properties"] \
          and services["configurations"]["cluster-env"]["properties"]["security_enabled"].lower() == "true":
        ambari_user = services['ambari-server-properties']['ambari-server.user']
      elif "ambari_principal_name" in services["configurations"]["cluster-env"]["properties"]:
        ambari_user = services["configurations"]["cluster-env"]["properties"]["ambari_principal_name"]
        ambari_user = ambari_user.split('@')[0]
    return ambari_user

  def put_proxyuser_value(self, user_name, value, is_groups=False, services=None, configurations=None, put_function=None):
    is_wildcard_value, current_value = self.get_data_for_proxyuser(user_name, services, configurations, is_groups)
    result_value = "*"
    result_values_set = self.merge_proxyusers_values(current_value, value)
    if len(result_values_set) > 0:
      result_value = ",".join(sorted([val for val in result_values_set if val]))

    if is_groups:
      property_name = "hadoop.proxyuser.{0}.groups".format(user_name)
    else:
      property_name = "hadoop.proxyuser.{0}.hosts".format(user_name)

    put_function(property_name, result_value)

  def get_data_for_proxyuser(self, user_name, services, configurations, groups=False):
    """
    Returns values of proxyuser properties for given user. Properties can be
    hadoop.proxyuser.username.groups or hadoop.proxyuser.username.hosts
    :param user_name:
    :param services:
    :param groups: if true, will return values for group property, not hosts
    :return: tuple (wildcard_value, set[values]), where wildcard_value indicates if property value was *
    """
    if "core-site" in services["configurations"]:
      coreSite = services["configurations"]["core-site"]['properties']
    else:
      coreSite = {}
    if groups:
      property_name = "hadoop.proxyuser.{0}.groups".format(user_name)
    else:
      property_name = "hadoop.proxyuser.{0}.hosts".format(user_name)
    if property_name in coreSite:
      property_value = coreSite[property_name]
      if property_value == "*":
        return True, set()
      else:
        result_values = set()
        if "core-site" in configurations:
          if property_name in configurations["core-site"]['properties']:
            result_values = result_values.union(configurations["core-site"]['properties'][property_name].split(","))
        result_values = result_values.union(property_value.split(","))
        return False, result_values
    return False, set()

  def merge_proxyusers_values(self, first, second):
    result = set()
    def append(data):
      if isinstance(data, str) or isinstance(data, unicode):
        if data != "*":
          result.update(data.split(","))
      else:
        result.update(data)
    append(first)
    append(second)
    return result

  def getOldValue(self, services, configType, propertyName):
    if services:
      if 'changed-configurations' in services.keys():
        changedConfigs = services["changed-configurations"]
        for changedConfig in changedConfigs:
          if changedConfig["type"] == configType and changedConfig["name"]== propertyName and "old_value" in changedConfig:
            return changedConfig["old_value"]
    return None

  @classmethod
  def isSecurePort(cls, port):
    """
    Returns True if port is root-owned at *nix systems
    """
    if port is not None:
      return port < 1024
    else:
      return False

  @classmethod
  def getPort(cls, address):
    """
    Extracts port from the address like 0.0.0.0:1019
    """
    if address is None:
      return None
    m = re.search(r'(?:http(?:s)?://)?([\w\d.]*):(\d{1,5})', address)
    if m is not None:
      return int(m.group(2))
    else:
      return None

  def validatorLessThenDefaultValue(self, properties, recommendedDefaults, propertyName):
    if propertyName not in recommendedDefaults:
      # If a property name exists in say hbase-env and hbase-site (which is allowed), then it will exist in the
      # "properties" dictionary, but not necessarily in the "recommendedDefaults" dictionary". In this case, ignore it.
      return None

    if not propertyName in properties:
      return self.getErrorItem("Value should be set")
    value = self.to_number(properties[propertyName])
    if value is None:
      return self.getErrorItem("Value should be integer")
    defaultValue = self.to_number(recommendedDefaults[propertyName])
    if defaultValue is None:
      return None
    if value < defaultValue:
      return self.getWarnItem("Value is less than the recommended default of {0}".format(defaultValue))
    return None

  def validatorEqualsPropertyItem(self, properties1, propertyName1,
                                  properties2, propertyName2,
                                  emptyAllowed=False):
    if not propertyName1 in properties1:
      return self.getErrorItem("Value should be set for %s" % propertyName1)
    if not propertyName2 in properties2:
      return self.getErrorItem("Value should be set for %s" % propertyName2)
    value1 = properties1.get(propertyName1)
    if value1 is None and not emptyAllowed:
      return self.getErrorItem("Empty value for %s" % propertyName1)
    value2 = properties2.get(propertyName2)
    if value2 is None and not emptyAllowed:
      return self.getErrorItem("Empty value for %s" % propertyName2)
    if value1 != value2:
      return self.getWarnItem("It is recommended to set equal values "
                              "for properties {0} and {1}".format(propertyName1, propertyName2))

    return None

  def validatorEqualsToRecommendedItem(self, properties, recommendedDefaults,
                                       propertyName):
    if not propertyName in properties:
      return self.getErrorItem("Value should be set for %s" % propertyName)
    value = properties.get(propertyName)
    if not propertyName in recommendedDefaults:
      return self.getErrorItem("Value should be recommended for %s" % propertyName)
    recommendedValue = recommendedDefaults.get(propertyName)
    if value != recommendedValue:
      return self.getWarnItem("It is recommended to set value {0} "
                              "for property {1}".format(recommendedValue, propertyName))
    return None

  def validatorNotEmpty(self, properties, propertyName):
    if not propertyName in properties:
      return self.getErrorItem("Value should be set for {0}".format(propertyName))
    value = properties.get(propertyName)
    if not value:
      return self.getWarnItem("Empty value for {0}".format(propertyName))
    return None

  def validatorNotRootFs(self, properties, recommendedDefaults, propertyName, hostInfo):
    if not propertyName in properties:
      return self.getErrorItem("Value should be set")
    dir = properties[propertyName]
    if not dir.startswith("file://") or dir == recommendedDefaults.get(propertyName):
      return None

    dir = re.sub("^file://", "", dir, count=1)
    mountPoints = []
    for mountPoint in hostInfo["disk_info"]:
      mountPoints.append(mountPoint["mountpoint"])
    mountPoint = DefaultStackAdvisor.getMountPointForDir(dir, mountPoints)

    if "/" == mountPoint and self.getPreferredMountPoints(hostInfo)[0] != mountPoint:
      return self.getWarnItem("It is not recommended to use root partition for {0}".format(propertyName))

    return None

  def validatorEnoughDiskSpace(self, properties, propertyName, hostInfo, reqiuredDiskSpace):
    if not propertyName in properties:
      return self.getErrorItem("Value should be set")
    dir = properties[propertyName]
    if not dir.startswith("file://"):
      return None

    dir = re.sub("^file://", "", dir, count=1)
    mountPoints = {}
    for mountPoint in hostInfo["disk_info"]:
      mountPoints[mountPoint["mountpoint"]] = self.to_number(mountPoint["available"])
    mountPoint = DefaultStackAdvisor.getMountPointForDir(dir, mountPoints.keys())

    if not mountPoints:
      return self.getErrorItem("No disk info found on host %s" % hostInfo["host_name"])

    if mountPoints[mountPoint] < reqiuredDiskSpace:
      msg = "Ambari Metrics disk space requirements not met. \n" \
            "Recommended disk space for partition {0} is {1}G"
      return self.getWarnItem(msg.format(mountPoint, reqiuredDiskSpace/1048576)) # in Gb
    return None

  @classmethod
  def is_valid_host_port_authority(cls, target):
    has_scheme = "://" in target
    if not has_scheme:
      target = "dummyscheme://"+target
    try:
      result = urlparse(target)
      if result.hostname is not None and result.port is not None:
        return True
    except ValueError:
      pass
    return False

  @classmethod
  def getMountPointForDir(cls, dir, mountPoints):
    """
    :param dir: Directory to check, even if it doesn't exist.
    :return: Returns the closest mount point as a string for the directory.
    if the "dir" variable is None, will return None.
    If the directory does not exist, will return "/".
    """
    bestMountFound = None
    if dir:
      dir = re.sub("^file://", "", dir, count=1).strip().lower()

      # If the path is "/hadoop/hdfs/data", then possible matches for mounts could be
      # "/", "/hadoop/hdfs", and "/hadoop/hdfs/data".
      # So take the one with the greatest number of segments.
      for mountPoint in mountPoints:
        # Ensure that the mount path and the dir path ends with "/"
        # The mount point "/hadoop" should not match with the path "/hadoop1"
        if os.path.join(dir, "").startswith(os.path.join(mountPoint, "")):
          if bestMountFound is None:
            bestMountFound = mountPoint
          elif os.path.join(bestMountFound, "").count(os.path.sep) < os.path.join(mountPoint, "").count(os.path.sep):
            bestMountFound = mountPoint

    return bestMountFound

  def validateMinMemorySetting(self, properties, defaultValue, propertyName):
    if not propertyName in properties:
      return self.getErrorItem("Value should be set")
    if defaultValue is None:
      return self.getErrorItem("Config's default value can't be null or undefined")

    value = properties[propertyName]
    if value is None:
      return self.getErrorItem("Value can't be null or undefined")
    try:
      valueInt = self.to_number(value)
      # TODO: generify for other use cases
      defaultValueInt = int(str(defaultValue).strip())
      if valueInt < defaultValueInt:
        return self.getWarnItem("Value is less than the minimum recommended default of -Xmx" + str(defaultValue))
    except:
      return None

    return None

  @classmethod
  def checkXmxValueFormat(cls, value):
    p = re.compile('-Xmx(\d+)(b|k|m|g|p|t|B|K|M|G|P|T)?')
    matches = p.findall(value)
    return len(matches) == 1

  @classmethod
  def getXmxSize(cls, value):
    p = re.compile("-Xmx(\d+)(.?)")
    result = p.findall(value)[0]
    if len(result) > 1:
      # result[1] - is a space or size formatter (b|k|m|g etc)
      return result[0] + result[1].lower()
    return result[0]

  @classmethod
  def formatXmxSizeToBytes(cls, value):
    value = value.lower()
    if len(value) == 0:
      return 0
    modifier = value[-1]

    if modifier == ' ' or modifier in "0123456789":
      modifier = 'b'
    m = {
      modifier == 'b': 1,
      modifier == 'k': 1024,
      modifier == 'm': 1024 * 1024,
      modifier == 'g': 1024 * 1024 * 1024,
      modifier == 't': 1024 * 1024 * 1024 * 1024,
      modifier == 'p': 1024 * 1024 * 1024 * 1024 * 1024
    }[1]
    return cls.to_number(value) * m

  @classmethod
  def to_number(cls, s):
    try:
      return int(re.sub("\D", "", s))
    except ValueError:
      return None