import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.lang.ClassLoader classLoader1 = null;
        try {
            java.lang.Class<?> cls2 = org.apache.activemq.camel.component.ActiveMQConfiguration.loadClass("", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.apache.activemq.ActiveMQConnection.DEFAULT_THREAD_POOL_SIZE = 1;
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.apache.activemq.camel.converter.ActiveMQConverter activeMQConverter0 = new org.apache.activemq.camel.converter.ActiveMQConverter();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        int i0 = org.apache.activemq.ActiveMQConnectionFactory.DEFAULT_PRODUCER_WINDOW_SIZE;
        org.junit.Assert.assertTrue(i0 == 0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.apache.activemq.camel.component.broker.BrokerEndpoint brokerEndpoint0 = null;
        org.apache.activemq.camel.component.broker.BrokerProducer brokerProducer1 = new org.apache.activemq.camel.component.broker.BrokerProducer(brokerEndpoint0);
        org.apache.camel.ExchangePattern exchangePattern2 = null;
        try {
            org.apache.camel.Exchange exchange3 = brokerProducer1.createExchange(exchangePattern2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.apache.activemq.camel.component.broker.BrokerComponent brokerComponent0 = new org.apache.activemq.camel.component.broker.BrokerComponent();
        try {
            brokerComponent0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.lang.String str0 = org.apache.activemq.ActiveMQConnectionFactory.DEFAULT_USER;
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        javax.jms.Destination destination0 = null;
        javax.jms.ConnectionFactory connectionFactory1 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent2 = org.apache.camel.component.jms.JmsComponent.jmsComponentClientAcknowledge(connectionFactory1);
        try {
            org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance(destination0, jmsComponent2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(jmsComponent2);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.apache.activemq.camel.component.broker.BrokerEndpoint brokerEndpoint0 = null;
        org.apache.activemq.camel.component.broker.BrokerProducer brokerProducer1 = new org.apache.activemq.camel.component.broker.BrokerProducer(brokerEndpoint0);
        try {
            boolean b2 = brokerProducer1.isSingleton();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.lang.String str0 = org.apache.activemq.ActiveMQConnectionFactory.DEFAULT_BROKER_URL;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "failover://tcp://localhost:61616" + "'", str0.equals("failover://tcp://localhost:61616"));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.lang.String str0 = org.apache.activemq.ActiveMQConnectionFactory.DEFAULT_PASSWORD;
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.apache.activemq.camel.component.broker.BrokerEndpoint brokerEndpoint0 = null;
        org.apache.activemq.camel.component.broker.BrokerProducer brokerProducer1 = new org.apache.activemq.camel.component.broker.BrokerProducer(brokerEndpoint0);
        try {
            java.lang.String str2 = brokerProducer1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.apache.activemq.camel.camelplugin.CamelRoutesBrokerPlugin camelRoutesBrokerPlugin0 = new org.apache.activemq.camel.camelplugin.CamelRoutesBrokerPlugin();
        camelRoutesBrokerPlugin0.setCheckPeriod((int) (byte) 0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        try {
            long long2 = camelRoutesBroker1.getBrokerSequenceId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.activemq.camel.component.broker.BrokerEndpoint brokerEndpoint0 = null;
        org.apache.activemq.camel.component.broker.BrokerProducer brokerProducer1 = new org.apache.activemq.camel.component.broker.BrokerProducer(brokerEndpoint0);
        org.apache.camel.Exchange exchange2 = null;
        try {
            org.apache.camel.Exchange exchange3 = brokerProducer1.createExchange(exchange2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        org.apache.activemq.command.ActiveMQDestination activeMQDestination2 = null;
        try {
            java.util.Set<org.apache.activemq.broker.region.Destination> set_destination3 = camelRoutesBroker1.getDestinations(activeMQDestination2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.lang.String str0 = org.apache.activemq.ActiveMQConnectionFactory.DEFAULT_BROKER_BIND_URL;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "tcp://localhost:61616" + "'", str0.equals("tcp://localhost:61616"));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        org.apache.activemq.broker.ConnectionContext connectionContext2 = null;
        org.apache.activemq.broker.region.MessageReference messageReference3 = null;
        org.apache.activemq.broker.region.Subscription subscription4 = null;
        java.lang.Throwable throwable5 = null;
        try {
            boolean b6 = camelRoutesBroker1.sendToDeadLetterQueue(connectionContext2, messageReference3, subscription4, throwable5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.lang.ClassLoader classLoader1 = null;
        try {
            java.lang.Class<?> cls2 = org.apache.activemq.camel.component.ActiveMQConfiguration.loadClass("tcp://localhost:61616", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        try {
            java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = camelRoutesBroker1.getExecutor();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        try {
            org.apache.activemq.command.ActiveMQDestination[] activeMQDestination_array2 = camelRoutesBroker1.getDestinations();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        jmsComponent1.setAcknowledgementModeName("hi!");
        jmsComponent1.setLazyCreateTransactionManager(false);
        jmsComponent1.setAcknowledgementModeName("");
        org.junit.Assert.assertNotNull(jmsComponent1);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        jmsComponent1.setAcknowledgementModeName("hi!");
        boolean b4 = jmsComponent1.isStarting();
        jmsComponent1.setReplyToConcurrentConsumers((int) (short) 0);
        org.junit.Assert.assertNotNull(jmsComponent1);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        try {
            java.net.URI uRI2 = camelRoutesBroker1.getVmConnectorURI();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        jmsComponent1.setTransactionTimeout((int) (short) -1);
        org.apache.camel.CamelContext camelContext4 = jmsComponent1.getCamelContext();
        org.junit.Assert.assertNotNull(jmsComponent1);
        org.junit.Assert.assertNull(camelContext4);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        org.apache.activemq.command.MessageDispatch messageDispatch2 = null;
        try {
            camelRoutesBroker1.preProcessDispatch(messageDispatch2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.lang.String str0 = org.apache.camel.component.jms.JmsConfiguration.QUEUE_PREFIX;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "queue:" + "'", str0.equals("queue:"));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        org.apache.activemq.broker.ConnectionContext connectionContext2 = null;
        org.apache.activemq.command.ConnectionInfo connectionInfo3 = null;
        try {
            camelRoutesBroker1.addConnection(connectionContext2, connectionInfo3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        try {
            boolean b2 = camelRoutesBroker1.isFaultTolerantConfiguration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentClientAcknowledge(connectionFactory0);
        jmsComponent1.setReplyToConcurrentConsumers((int) (byte) -1);
        org.apache.camel.component.jms.DefaultTaskExecutorType defaultTaskExecutorType4 = null;
        jmsComponent1.setDefaultTaskExecutorType(defaultTaskExecutorType4);
        org.junit.Assert.assertNotNull(jmsComponent1);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        org.apache.activemq.broker.ConnectionContext connectionContext2 = null;
        org.apache.activemq.command.ProducerInfo producerInfo3 = null;
        try {
            camelRoutesBroker1.addProducer(connectionContext2, producerInfo3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.activemq.camel.component.broker.BrokerConfiguration brokerConfiguration0 = new org.apache.activemq.camel.component.broker.BrokerConfiguration();
        java.lang.String str1 = brokerConfiguration0.getBrokerName();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        try {
            java.util.Set<org.apache.activemq.command.ActiveMQDestination> set_activeMQDestination2 = camelRoutesBroker1.getDurableDestinations();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        org.apache.activemq.broker.ConnectionContext connectionContext2 = null;
        org.apache.activemq.broker.region.MessageReference messageReference3 = null;
        org.apache.activemq.broker.region.Subscription subscription4 = null;
        try {
            camelRoutesBroker1.messageExpired(connectionContext2, messageReference3, subscription4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentClientAcknowledge(connectionFactory0);
        jmsComponent1.setReplyToConcurrentConsumers((int) (byte) -1);
        java.lang.String str4 = jmsComponent1.getVersion();
        jmsComponent1.setForceSendOriginalMessage(true);
        org.junit.Assert.assertNotNull(jmsComponent1);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "2.16.1" + "'", str4.equals("2.16.1"));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        org.apache.activemq.broker.ConnectionContext connectionContext2 = null;
        org.apache.activemq.command.DestinationInfo destinationInfo3 = null;
        try {
            camelRoutesBroker1.removeDestinationInfo(connectionContext2, destinationInfo3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.activemq.camel.component.broker.BrokerComponent brokerComponent0 = new org.apache.activemq.camel.component.broker.BrokerComponent();
        brokerComponent0.suspend();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        try {
            org.apache.activemq.command.BrokerId brokerId2 = camelRoutesBroker1.getBrokerId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        org.apache.activemq.broker.ConnectionContext connectionContext2 = null;
        org.apache.activemq.command.ConsumerInfo consumerInfo3 = null;
        try {
            camelRoutesBroker1.removeConsumer(connectionContext2, consumerInfo3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        try {
            camelRoutesBroker1.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        jmsComponent1.setAcknowledgementModeName("hi!");
        jmsComponent1.setLazyCreateTransactionManager(false);
        jmsComponent1.setAsyncStopListener(true);
        jmsComponent1.setAsyncStartListener(false);
        jmsComponent1.setIdleConsumerLimit((int) '4');
        org.junit.Assert.assertNotNull(jmsComponent1);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        try {
            org.apache.activemq.command.BrokerInfo[] brokerInfo_array2 = camelRoutesBroker1.getPeerBrokerInfos();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.lang.String str0 = org.apache.camel.component.jms.JmsConfiguration.TEMP_TOPIC_PREFIX;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "temp:topic:" + "'", str0.equals("temp:topic:"));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        try {
            org.apache.activemq.ActiveMQConnection activeMQConnection3 = org.apache.activemq.ActiveMQConnection.makeConnection("hi!", "2.16.1", "2.16.1");
            org.junit.Assert.fail("Expected exception of type javax.jms.JMSException");
        } catch (javax.jms.JMSException e) {
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        org.apache.activemq.broker.ConnectionContext connectionContext2 = null;
        org.apache.activemq.command.TransactionId transactionId3 = null;
        try {
            camelRoutesBroker1.beginTransaction(connectionContext2, transactionId3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        org.apache.activemq.broker.ConnectionContext connectionContext2 = null;
        org.apache.activemq.command.TransactionId transactionId3 = null;
        try {
            camelRoutesBroker1.commitTransaction(connectionContext2, transactionId3, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        org.apache.activemq.broker.ConnectionContext connectionContext2 = null;
        org.apache.activemq.command.ConsumerInfo consumerInfo3 = null;
        try {
            org.apache.activemq.broker.region.Subscription subscription4 = camelRoutesBroker1.addConsumer(connectionContext2, consumerInfo3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponent(connectionFactory0);
        org.junit.Assert.assertNotNull(jmsComponent1);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentClientAcknowledge(connectionFactory0);
        jmsComponent1.setAcceptMessagesWhileStopping(false);
        jmsComponent1.setPreserveMessageQos(true);
        try {
            org.apache.camel.Endpoint endpoint7 = jmsComponent1.createEndpoint("2.16.1");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(jmsComponent1);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        activeMQConfiguration0.setCacheLevelName("tcp://localhost:61616");
        java.lang.String str5 = activeMQConfiguration0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        try {
            org.apache.activemq.broker.ConnectionContext connectionContext2 = camelRoutesBroker1.getAdminConnectionContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        jmsComponent1.setAcknowledgementModeName("hi!");
        boolean b4 = jmsComponent1.isStarting();
        jmsComponent1.setReplyToConcurrentConsumers((int) (short) 10);
        boolean b7 = jmsComponent1.useRawUri();
        jmsComponent1.setAcknowledgementMode(100);
        org.junit.Assert.assertNotNull(jmsComponent1);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        try {
            camelRoutesBroker1.brokerServiceStarted();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        try {
            camelRoutesBroker1.nowMasterBroker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.activemq.camel.component.broker.BrokerEndpoint brokerEndpoint0 = null;
        org.apache.activemq.camel.component.broker.BrokerProducer brokerProducer1 = new org.apache.activemq.camel.component.broker.BrokerProducer(brokerEndpoint0);
        org.apache.camel.Exchange exchange2 = null;
        try {
            brokerProducer1.process(exchange2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        activeMQConfiguration0.setTransferException(false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        jmsComponent1.setAcknowledgementModeName("hi!");
        jmsComponent1.suspend();
        org.junit.Assert.assertNotNull(jmsComponent1);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentClientAcknowledge(connectionFactory0);
        jmsComponent1.setAcceptMessagesWhileStopping(false);
        jmsComponent1.setPreserveMessageQos(true);
        jmsComponent1.setMapJmsMessage(false);
        boolean b8 = jmsComponent1.isStopped();
        org.springframework.core.task.TaskExecutor taskExecutor9 = null;
        jmsComponent1.setTaskExecutor(taskExecutor9);
        org.junit.Assert.assertNotNull(jmsComponent1);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentClientAcknowledge(connectionFactory0);
        jmsComponent1.setAcceptMessagesWhileStopping(false);
        jmsComponent1.setIdleConsumerLimit((int) (byte) 100);
        javax.jms.ExceptionListener exceptionListener6 = null;
        jmsComponent1.setExceptionListener(exceptionListener6);
        org.junit.Assert.assertNotNull(jmsComponent1);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        boolean b3 = activeMQConfiguration0.isLazyCreateTransactionManager();
        activeMQConfiguration0.setTransferException(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        jmsComponent1.setAcknowledgementModeName("hi!");
        jmsComponent1.setLazyCreateTransactionManager(false);
        jmsComponent1.setAsyncStopListener(true);
        jmsComponent1.setAsyncStartListener(false);
        try {
            jmsComponent1.setJmsKeyFormatStrategy("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(jmsComponent1);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        jmsEndpoint3.setReplyToDestinationSelectorName("2.16.1");
        org.apache.activemq.camel.component.broker.BrokerEndpoint brokerEndpoint6 = null;
        org.apache.activemq.camel.component.broker.BrokerProducer brokerProducer7 = new org.apache.activemq.camel.component.broker.BrokerProducer(brokerEndpoint6);
        org.springframework.jms.listener.AbstractMessageListenerContainer abstractMessageListenerContainer8 = null;
        try {
            org.apache.camel.component.jms.JmsConsumer jmsConsumer9 = jmsEndpoint3.createConsumer((org.apache.camel.Processor) brokerProducer7, abstractMessageListenerContainer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentClientAcknowledge(connectionFactory0);
        jmsComponent1.setAcceptMessagesWhileStopping(false);
        jmsComponent1.setPreserveMessageQos(true);
        jmsComponent1.setMapJmsMessage(false);
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration8 = jmsComponent1.getConfiguration();
        jmsConfiguration8.setIdleTaskExecutionLimit((int) (short) 10);
        org.junit.Assert.assertNotNull(jmsComponent1);
        org.junit.Assert.assertNotNull(jmsConfiguration8);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        org.apache.activemq.broker.Connection connection2 = null;
        org.apache.activemq.command.BrokerInfo brokerInfo3 = null;
        try {
            camelRoutesBroker1.addBroker(connection2, brokerInfo3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentClientAcknowledge(connectionFactory0);
        jmsComponent1.setAcceptMessagesWhileStopping(false);
        jmsComponent1.setTransactionTimeout((int) (short) 1);
        boolean b6 = jmsComponent1.isStarting();
        org.junit.Assert.assertNotNull(jmsComponent1);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentClientAcknowledge(connectionFactory0);
        jmsComponent1.setAcceptMessagesWhileStopping(false);
        boolean b4 = jmsComponent1.isStarting();
        jmsComponent1.setTestConnectionOnStartup(false);
        org.junit.Assert.assertNotNull(jmsComponent1);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        org.apache.activemq.command.ActiveMQDestination activeMQDestination2 = null;
        try {
            java.util.Map<org.apache.activemq.command.ActiveMQDestination, org.apache.activemq.broker.region.Destination> map_activeMQDestination_destination3 = camelRoutesBroker1.getDestinationMap(activeMQDestination2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        org.apache.activemq.command.BrokerInfo brokerInfo2 = null;
        try {
            camelRoutesBroker1.networkBridgeStopped(brokerInfo2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDisableReplyTo(true);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj11 = null;
        try {
            jmsEndpoint3.configureProperties(map_str_obj11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        try {
            org.apache.activemq.broker.Connection[] connection_array2 = camelRoutesBroker1.getClients();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        jmsComponent1.setAcknowledgementModeName("hi!");
        jmsComponent1.setAlwaysCopyMessage(true);
        jmsComponent1.setAllowNullBody(true);
        jmsComponent1.setAcceptMessagesWhileStopping(true);
        org.junit.Assert.assertNotNull(jmsComponent1);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory0.setDisableTimeStampsByDefault(true);
        java.util.Properties properties3 = camelConnectionFactory0.getProperties();
        camelConnectionFactory0.setCloseTimeout(0);
        org.junit.Assert.assertNotNull(properties3);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        org.apache.activemq.camel.CamelQueue camelQueue10 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding11 = camelQueue10.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint12 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue10);
        org.apache.activemq.camel.CamelQueue camelQueue14 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding15 = camelQueue14.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint16 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue14);
        jmsEndpoint12.setDestination((javax.jms.Destination) camelQueue14);
        org.apache.activemq.ActiveMQSession activeMQSession18 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer21 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelQueue5, (org.apache.camel.Endpoint) jmsEndpoint12, activeMQSession18, "failover://tcp://localhost:61616", false);
        boolean b22 = jmsEndpoint12.isStarting();
        try {
            javax.jms.ConnectionFactory connectionFactory23 = jmsEndpoint12.getListenerConnectionFactory();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNotNull(jmsBinding11);
        org.junit.Assert.assertNotNull(jmsEndpoint12);
        org.junit.Assert.assertNotNull(jmsBinding15);
        org.junit.Assert.assertNotNull(jmsEndpoint16);
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.ActiveMQSession activeMQSession4 = null;
        try {
            javax.jms.QueueReceiver queueReceiver6 = camelQueue1.createReceiver(activeMQSession4, "2.16.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        org.apache.activemq.broker.ConnectionContext connectionContext2 = null;
        org.apache.activemq.command.TransactionId transactionId3 = null;
        try {
            camelRoutesBroker1.forgetTransaction(connectionContext2, transactionId3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        org.apache.activemq.camel.CamelQueue camelQueue10 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding11 = camelQueue10.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint12 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue10);
        org.apache.activemq.camel.CamelQueue camelQueue14 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding15 = camelQueue14.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint16 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue14);
        jmsEndpoint12.setDestination((javax.jms.Destination) camelQueue14);
        org.apache.activemq.ActiveMQSession activeMQSession18 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer21 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelQueue5, (org.apache.camel.Endpoint) jmsEndpoint12, activeMQSession18, "failover://tcp://localhost:61616", false);
        try {
            javax.jms.Message message23 = camelMessageConsumer21.receive((-1L));
            org.junit.Assert.fail("Expected exception of type javax.jms.JMSException");
        } catch (javax.jms.JMSException e) {
        }
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNotNull(jmsBinding11);
        org.junit.Assert.assertNotNull(jmsEndpoint12);
        org.junit.Assert.assertNotNull(jmsBinding15);
        org.junit.Assert.assertNotNull(jmsEndpoint16);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        org.apache.activemq.command.BrokerInfo brokerInfo2 = null;
        try {
            camelRoutesBroker1.networkBridgeStarted(brokerInfo2, false, "2.16.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        int i0 = org.apache.activemq.ActiveMQConnection.DEFAULT_THREAD_POOL_SIZE;
        org.junit.Assert.assertTrue(i0 == 1);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        org.apache.activemq.broker.ConnectionContext connectionContext2 = null;
        try {
            org.apache.activemq.command.TransactionId[] transactionId_array3 = camelRoutesBroker1.getPreparedTransactions(connectionContext2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentClientAcknowledge(connectionFactory0);
        jmsComponent1.setAcceptMessagesWhileStopping(false);
        jmsComponent1.setPreserveMessageQos(true);
        org.apache.camel.spi.HeaderFilterStrategy headerFilterStrategy6 = jmsComponent1.getHeaderFilterStrategy();
        boolean b7 = jmsComponent1.isSuspendingOrSuspended();
        jmsComponent1.setIncludeAllJMSXProperties(true);
        org.junit.Assert.assertNotNull(jmsComponent1);
        org.junit.Assert.assertNull(headerFilterStrategy6);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.lang.ClassLoader classLoader1 = null;
        try {
            java.lang.Class<?> cls2 = org.apache.activemq.camel.component.ActiveMQConfiguration.loadClass("2.16.1", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        try {
            org.apache.activemq.thread.Scheduler scheduler2 = camelRoutesBroker1.getScheduler();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentClientAcknowledge(connectionFactory0);
        jmsComponent1.setAcceptMessagesWhileStopping(false);
        jmsComponent1.setPreserveMessageQos(true);
        jmsComponent1.setRequestTimeoutCheckerInterval(10L);
        org.junit.Assert.assertNotNull(jmsComponent1);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        activeMQConfiguration0.setCacheLevelName("tcp://localhost:61616");
        boolean b5 = activeMQConfiguration0.isAcceptMessagesWhileStopping();
        activeMQConfiguration0.setUseSingleConnection(false);
        activeMQConfiguration0.setDisableTimeToLive(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        org.apache.activemq.ActiveMQSession activeMQSession9 = null;
        try {
            javax.jms.TopicSubscriber topicSubscriber12 = camelQueue5.createSubscriber(activeMQSession9, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.lang.String str0 = org.apache.activemq.ActiveMQConnection.DEFAULT_BROKER_URL;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "failover://tcp://localhost:61616" + "'", str0.equals("failover://tcp://localhost:61616"));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        long long1 = camelConnectionFactory0.getWarnAboutUnstartedConnectionTimeout();
        int i2 = camelConnectionFactory0.getAuditDepth();
        org.junit.Assert.assertTrue(long1 == 500L);
        org.junit.Assert.assertTrue(i2 == 2048);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        jmsComponent1.start();
        jmsComponent1.setTransferException(true);
        jmsComponent1.setTransferExchange(false);
        org.junit.Assert.assertNotNull(jmsComponent1);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        org.apache.activemq.broker.ConnectionContext connectionContext2 = null;
        org.apache.activemq.command.TransactionId transactionId3 = null;
        try {
            int i4 = camelRoutesBroker1.prepareTransaction(connectionContext2, transactionId3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory0.setDisableTimeStampsByDefault(true);
        java.util.Properties properties3 = camelConnectionFactory0.getProperties();
        org.apache.activemq.broker.region.policy.RedeliveryPolicyMap redeliveryPolicyMap4 = camelConnectionFactory0.getRedeliveryPolicyMap();
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNotNull(redeliveryPolicyMap4);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        jmsComponent1.setTransactionTimeout((int) (short) -1);
        org.springframework.jms.support.destination.DestinationResolver destinationResolver4 = null;
        jmsComponent1.setDestinationResolver(destinationResolver4);
        org.junit.Assert.assertNotNull(jmsComponent1);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setAlwaysCopyMessage(false);
        boolean b11 = jmsEndpoint3.isPubSubDomain();
        org.springframework.jms.listener.AbstractMessageListenerContainer abstractMessageListenerContainer12 = null;
        org.apache.camel.component.jms.JmsConsumer jmsConsumer13 = null;
        try {
            jmsEndpoint3.configureListenerContainer(abstractMessageListenerContainer12, jmsConsumer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        try {
            camelRoutesBroker1.gc();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setAlwaysCopyMessage(false);
        try {
            org.apache.camel.PollingConsumer pollingConsumer11 = jmsEndpoint3.createPollingConsumer();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        jmsComponent1.setTransactionTimeout((int) (short) -1);
        jmsComponent1.setAsyncConsumer(true);
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration6 = jmsComponent1.getConfiguration();
        boolean b7 = jmsConfiguration6.isPreserveMessageQos();
        org.junit.Assert.assertNotNull(jmsComponent1);
        org.junit.Assert.assertNotNull(jmsConfiguration6);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory0.setDisableTimeStampsByDefault(true);
        java.util.Properties properties3 = camelConnectionFactory0.getProperties();
        long long4 = camelConnectionFactory0.getConsumerFailoverRedeliveryWaitPeriod();
        camelConnectionFactory0.setOptimizeAcknowledgeTimeOut((long) '#');
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertTrue(long4 == 0L);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        try {
            jmsEndpoint3.setReplyToType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory0.setDisableTimeStampsByDefault(true);
        java.util.Properties properties3 = camelConnectionFactory0.getProperties();
        org.apache.camel.CamelContext camelContext4 = camelConnectionFactory0.getCamelContext();
        int i5 = camelConnectionFactory0.getCloseTimeout();
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNull(camelContext4);
        org.junit.Assert.assertTrue(i5 == 15000);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        jmsEndpoint3.setReplyToDestinationSelectorName("2.16.1");
        org.apache.camel.EndpointConfiguration endpointConfiguration6 = null;
        jmsEndpoint3.setEndpointConfiguration(endpointConfiguration6);
        boolean b8 = jmsEndpoint3.isMessageTimestampEnabled();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentClientAcknowledge(connectionFactory0);
        jmsComponent1.setAcceptMessagesWhileStopping(false);
        boolean b4 = jmsComponent1.isStarting();
        jmsComponent1.setReplyToConcurrentConsumers((int) (short) 10);
        org.junit.Assert.assertNotNull(jmsComponent1);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        org.springframework.util.ErrorHandler errorHandler3 = activeMQConfiguration0.getErrorHandler();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNull(errorHandler3);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        activeMQConfiguration0.setCacheLevelName("tcp://localhost:61616");
        long long5 = activeMQConfiguration0.getTimeToLive();
        boolean b6 = activeMQConfiguration0.isForceSendOriginalMessage();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(long5 == (-1L));
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory1 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory1.setDisableTimeStampsByDefault(true);
        java.util.Properties properties4 = camelConnectionFactory1.getProperties();
        camelConnectionFactory0.populateProperties(properties4);
        javax.jms.TopicConnection topicConnection8 = camelConnectionFactory0.createTopicConnection("queue:", "tcp://localhost:61616");
        boolean b9 = camelConnectionFactory0.isStatsEnabled();
        java.util.Properties properties10 = camelConnectionFactory0.getProperties();
        int i11 = camelConnectionFactory0.getMaxThreadPoolSize();
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNotNull(topicConnection8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue(i11 == 1);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentClientAcknowledge(connectionFactory0);
        jmsComponent1.setAcceptMessagesWhileStopping(false);
        jmsComponent1.setPreserveMessageQos(true);
        jmsComponent1.setMapJmsMessage(false);
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration8 = jmsComponent1.getConfiguration();
        boolean b9 = jmsConfiguration8.isReplyToDeliveryPersistent();
        jmsConfiguration8.setCacheLevelName("2.16.1");
        org.apache.activemq.camel.CamelQueue camelQueue13 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding14 = camelQueue13.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint15 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue13);
        org.apache.activemq.camel.CamelQueue camelQueue17 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding18 = camelQueue17.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint19 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue17);
        jmsEndpoint15.setDestination((javax.jms.Destination) camelQueue17);
        org.apache.activemq.camel.CamelQueue camelQueue22 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding23 = camelQueue22.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint24 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue22);
        org.apache.activemq.camel.CamelQueue camelQueue26 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding27 = camelQueue26.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint28 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue26);
        jmsEndpoint24.setDestination((javax.jms.Destination) camelQueue26);
        org.apache.activemq.ActiveMQSession activeMQSession30 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer33 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelQueue17, (org.apache.camel.Endpoint) jmsEndpoint24, activeMQSession30, "failover://tcp://localhost:61616", false);
        boolean b34 = jmsEndpoint24.isStarting();
        try {
            org.springframework.jms.listener.AbstractMessageListenerContainer abstractMessageListenerContainer35 = jmsConfiguration8.createMessageListenerContainer(jmsEndpoint24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(jmsComponent1);
        org.junit.Assert.assertNotNull(jmsConfiguration8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(jmsBinding14);
        org.junit.Assert.assertNotNull(jmsEndpoint15);
        org.junit.Assert.assertNotNull(jmsBinding18);
        org.junit.Assert.assertNotNull(jmsEndpoint19);
        org.junit.Assert.assertNotNull(jmsBinding23);
        org.junit.Assert.assertNotNull(jmsEndpoint24);
        org.junit.Assert.assertNotNull(jmsBinding27);
        org.junit.Assert.assertNotNull(jmsEndpoint28);
        org.junit.Assert.assertTrue(b34 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory0.setDisableTimeStampsByDefault(true);
        java.lang.String str3 = camelConnectionFactory0.getPassword();
        boolean b4 = camelConnectionFactory0.isSendAcksAsync();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setAlwaysCopyMessage(false);
        jmsEndpoint3.setReplyToConcurrentConsumers(100);
        jmsEndpoint3.setPubSubNoLocal(false);
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        org.apache.activemq.camel.CamelQueue camelQueue10 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding11 = camelQueue10.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint12 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue10);
        org.apache.activemq.camel.CamelQueue camelQueue14 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding15 = camelQueue14.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint16 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue14);
        jmsEndpoint12.setDestination((javax.jms.Destination) camelQueue14);
        org.apache.activemq.ActiveMQSession activeMQSession18 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer21 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelQueue5, (org.apache.camel.Endpoint) jmsEndpoint12, activeMQSession18, "failover://tcp://localhost:61616", false);
        boolean b22 = jmsEndpoint12.isAlwaysCopyMessage();
        boolean b23 = jmsEndpoint12.isSynchronous();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNotNull(jmsBinding11);
        org.junit.Assert.assertNotNull(jmsEndpoint12);
        org.junit.Assert.assertNotNull(jmsBinding15);
        org.junit.Assert.assertNotNull(jmsEndpoint16);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        activeMQConfiguration0.setCacheLevelName("tcp://localhost:61616");
        boolean b5 = activeMQConfiguration0.isAcceptMessagesWhileStopping();
        activeMQConfiguration0.setUseSingleConnection(false);
        java.lang.String str8 = activeMQConfiguration0.getBrokerURL();
        java.lang.String str9 = activeMQConfiguration0.getBrokerURL();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "failover://tcp://localhost:61616" + "'", str8.equals("failover://tcp://localhost:61616"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "failover://tcp://localhost:61616" + "'", str9.equals("failover://tcp://localhost:61616"));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        jmsComponent1.setAcknowledgementModeName("hi!");
        jmsComponent1.setLazyCreateTransactionManager(false);
        jmsComponent1.setClientId("hi!");
        org.apache.camel.component.jms.ReplyToType replyToType8 = null;
        jmsComponent1.setReplyToType(replyToType8);
        org.junit.Assert.assertNotNull(jmsComponent1);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.camel.CamelContext camelContext0 = null;
        org.apache.activemq.advisory.DestinationSource destinationSource1 = null;
        org.apache.activemq.camel.component.CamelEndpointLoader camelEndpointLoader2 = new org.apache.activemq.camel.component.CamelEndpointLoader(camelContext0, destinationSource1);
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent4 = org.apache.activemq.camel.component.ActiveMQComponent.activeMQComponent("queue:");
        activeMQComponent4.setExposeAllQueues(false);
        camelEndpointLoader2.setComponent(activeMQComponent4);
        org.junit.Assert.assertNotNull(activeMQComponent4);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        boolean b4 = jmsEndpoint3.isPubSubNoLocal();
        jmsEndpoint3.setTimeToLive((long) (byte) 1);
        boolean b7 = jmsEndpoint3.isDeliveryPersistent();
        boolean b8 = jmsEndpoint3.isSuspending();
        jmsEndpoint3.setReplyToDestinationSelectorName("queue:");
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        boolean b3 = activeMQConfiguration0.isErrorHandlerLogStackTrace();
        boolean b4 = activeMQConfiguration0.isMessageTimestampEnabled();
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy5 = activeMQConfiguration0.getMessageCreatedStrategy();
        int i6 = activeMQConfiguration0.getReplyToMaxConcurrentConsumers();
        activeMQConfiguration0.setTransacted(false);
        activeMQConfiguration0.setAutoStartup(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(messageCreatedStrategy5);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        org.apache.activemq.camel.CamelQueue camelQueue10 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding11 = camelQueue10.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint12 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue10);
        org.apache.activemq.camel.CamelQueue camelQueue14 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding15 = camelQueue14.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint16 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue14);
        jmsEndpoint12.setDestination((javax.jms.Destination) camelQueue14);
        org.apache.activemq.ActiveMQSession activeMQSession18 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer21 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelQueue5, (org.apache.camel.Endpoint) jmsEndpoint12, activeMQSession18, "failover://tcp://localhost:61616", false);
        boolean b22 = jmsEndpoint12.isStarting();
        org.springframework.jms.core.JmsOperations jmsOperations23 = null;
        jmsEndpoint12.setMetadataJmsOperations(jmsOperations23);
        javax.jms.Destination destination25 = jmsEndpoint12.getDestination();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNotNull(jmsBinding11);
        org.junit.Assert.assertNotNull(jmsEndpoint12);
        org.junit.Assert.assertNotNull(jmsBinding15);
        org.junit.Assert.assertNotNull(jmsEndpoint16);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(destination25);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory0.setObjectMessageSerializationDefered(true);
        camelConnectionFactory0.setCheckForDuplicates(true);
        org.apache.camel.CamelContext camelContext5 = null;
        camelConnectionFactory0.setCamelContext(camelContext5);
        org.apache.activemq.thread.TaskRunnerFactory taskRunnerFactory7 = null;
        camelConnectionFactory0.setSessionTaskRunner(taskRunnerFactory7);
        org.apache.activemq.transport.TransportListener transportListener9 = null;
        camelConnectionFactory0.setTransportListener(transportListener9);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        activeMQConfiguration0.setPriority((int) (short) 100);
        activeMQConfiguration0.setTransferException(false);
        boolean b6 = activeMQConfiguration0.isTransactedInOut();
        boolean b7 = activeMQConfiguration0.isExplicitQosEnabled();
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration8 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str9 = activeMQConfiguration8.getReplyTo();
        boolean b10 = activeMQConfiguration8.isPubSubNoLocal();
        activeMQConfiguration8.setCacheLevelName("tcp://localhost:61616");
        org.apache.camel.component.jms.ConsumerType consumerType13 = activeMQConfiguration8.getConsumerType();
        activeMQConfiguration0.setConsumerType(consumerType13);
        activeMQConfiguration0.setAlwaysCopyMessage(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + consumerType13 + "' != '" + org.apache.camel.component.jms.ConsumerType.Default + "'", consumerType13.equals(org.apache.camel.component.jms.ConsumerType.Default));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        java.lang.String str2 = camelRoutesBroker1.getRoutesFile();
        int i3 = camelRoutesBroker1.getCheckPeriod();
        org.apache.activemq.broker.ConnectionContext connectionContext4 = null;
        org.apache.activemq.broker.region.MessageReference messageReference5 = null;
        try {
            camelRoutesBroker1.messageConsumed(connectionContext4, messageReference5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 1000);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        java.lang.String str2 = camelRoutesBroker1.getRoutesFile();
        int i3 = camelRoutesBroker1.getCheckPeriod();
        try {
            org.apache.activemq.broker.Connection[] connection_array4 = camelRoutesBroker1.getClients();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 1000);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDeliveryMode((java.lang.Integer) 1000);
        org.apache.activemq.camel.component.broker.BrokerEndpoint brokerEndpoint11 = null;
        org.apache.activemq.camel.component.broker.BrokerProducer brokerProducer12 = new org.apache.activemq.camel.component.broker.BrokerProducer(brokerEndpoint11);
        try {
            org.apache.camel.component.jms.JmsConsumer jmsConsumer13 = jmsEndpoint3.createConsumer((org.apache.camel.Processor) brokerProducer12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        boolean b9 = jmsEndpoint3.isIncludeAllJMSXProperties();
        try {
            javax.jms.ConnectionFactory connectionFactory10 = jmsEndpoint3.getListenerConnectionFactory();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        org.apache.activemq.camel.CamelQueue camelQueue10 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding11 = camelQueue10.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint12 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue10);
        org.apache.activemq.camel.CamelQueue camelQueue14 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding15 = camelQueue14.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint16 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue14);
        jmsEndpoint12.setDestination((javax.jms.Destination) camelQueue14);
        org.apache.activemq.ActiveMQSession activeMQSession18 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer21 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelQueue5, (org.apache.camel.Endpoint) jmsEndpoint12, activeMQSession18, "failover://tcp://localhost:61616", false);
        boolean b22 = jmsEndpoint12.isStarting();
        jmsEndpoint12.setPriority((int) (short) 100);
        org.springframework.jms.listener.AbstractMessageListenerContainer abstractMessageListenerContainer25 = null;
        jmsEndpoint12.onListenerContainerStarting(abstractMessageListenerContainer25);
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNotNull(jmsBinding11);
        org.junit.Assert.assertNotNull(jmsEndpoint12);
        org.junit.Assert.assertNotNull(jmsBinding15);
        org.junit.Assert.assertNotNull(jmsEndpoint16);
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        activeMQConfiguration0.setExplicitQosEnabled(true);
        org.apache.camel.component.jms.DefaultTaskExecutorType defaultTaskExecutorType3 = null;
        activeMQConfiguration0.setDefaultTaskExecutorType(defaultTaskExecutorType3);
        activeMQConfiguration0.setUseMessageIDAsCorrelationID(true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.CamelContext camelContext3 = null;
        camelQueue1.setCamelContext(camelContext3);
        org.apache.activemq.camel.CamelQueue camelQueue6 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding7 = camelQueue6.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint8 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue6);
        org.apache.activemq.camel.CamelQueue camelQueue10 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding11 = camelQueue10.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint12 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue10);
        jmsEndpoint8.setDestination((javax.jms.Destination) camelQueue10);
        org.apache.activemq.camel.CamelQueue camelQueue15 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding16 = camelQueue15.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint17 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue15);
        org.apache.activemq.camel.CamelQueue camelQueue19 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding20 = camelQueue19.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint21 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue19);
        jmsEndpoint17.setDestination((javax.jms.Destination) camelQueue19);
        org.apache.activemq.ActiveMQSession activeMQSession23 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer26 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelQueue10, (org.apache.camel.Endpoint) jmsEndpoint17, activeMQSession23, "failover://tcp://localhost:61616", false);
        org.apache.activemq.ActiveMQSession activeMQSession27 = null;
        org.apache.activemq.camel.CamelQueueReceiver camelQueueReceiver29 = new org.apache.activemq.camel.CamelQueueReceiver(camelQueue1, (org.apache.camel.Endpoint) jmsEndpoint17, activeMQSession27, "queue:");
        org.apache.camel.CamelContext camelContext30 = jmsEndpoint17.getCamelContext();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsBinding7);
        org.junit.Assert.assertNotNull(jmsEndpoint8);
        org.junit.Assert.assertNotNull(jmsBinding11);
        org.junit.Assert.assertNotNull(jmsEndpoint12);
        org.junit.Assert.assertNotNull(jmsBinding16);
        org.junit.Assert.assertNotNull(jmsEndpoint17);
        org.junit.Assert.assertNotNull(jmsBinding20);
        org.junit.Assert.assertNotNull(jmsEndpoint21);
        org.junit.Assert.assertNull(camelContext30);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setAlwaysCopyMessage(false);
        jmsEndpoint3.setReplyToConcurrentConsumers(100);
        boolean b13 = jmsEndpoint3.isAsyncStopListener();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        java.lang.String str2 = camelRoutesBroker1.getRoutesFile();
        org.apache.activemq.broker.ConnectionContext connectionContext3 = null;
        org.apache.activemq.broker.region.virtual.VirtualDestination virtualDestination4 = null;
        try {
            camelRoutesBroker1.virtualDestinationAdded(connectionContext3, virtualDestination4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        long long1 = camelConnectionFactory0.getWarnAboutUnstartedConnectionTimeout();
        boolean b2 = camelConnectionFactory0.isMessagePrioritySupported();
        boolean b3 = camelConnectionFactory0.isCheckForDuplicates();
        java.lang.String str4 = camelConnectionFactory0.getPassword();
        org.junit.Assert.assertTrue(long1 == 500L);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        java.lang.String str2 = camelRoutesBroker1.getRoutesFile();
        org.apache.activemq.broker.ConnectionContext connectionContext3 = null;
        try {
            org.apache.activemq.command.TransactionId[] transactionId_array4 = camelRoutesBroker1.getPreparedTransactions(connectionContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        long long1 = camelConnectionFactory0.getWarnAboutUnstartedConnectionTimeout();
        boolean b2 = camelConnectionFactory0.isMessagePrioritySupported();
        boolean b3 = camelConnectionFactory0.isAlwaysSyncSend();
        org.apache.camel.component.jms.JmsComponent jmsComponent4 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted((javax.jms.ConnectionFactory) camelConnectionFactory0);
        javax.jms.TopicConnection topicConnection7 = camelConnectionFactory0.createTopicConnection("failover://tcp://localhost:61616", "2.16.1");
        org.junit.Assert.assertTrue(long1 == 500L);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(jmsComponent4);
        org.junit.Assert.assertNotNull(topicConnection7);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory0.setExclusiveConsumer(false);
        boolean b3 = camelConnectionFactory0.isDisableTimeStampsByDefault();
        camelConnectionFactory0.setRmIdFromConnectionId(false);
        org.apache.activemq.MessageTransformer messageTransformer6 = null;
        camelConnectionFactory0.setTransformer(messageTransformer6);
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        java.lang.String str2 = camelRoutesBroker1.getRoutesFile();
        org.apache.activemq.broker.ConsumerBrokerExchange consumerBrokerExchange3 = null;
        org.apache.activemq.command.ConsumerControl consumerControl4 = null;
        try {
            camelRoutesBroker1.processConsumerControl(consumerBrokerExchange3, consumerControl4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        activeMQConfiguration0.setPriority((int) (short) 100);
        activeMQConfiguration0.setTransferException(false);
        boolean b6 = activeMQConfiguration0.isTransactedInOut();
        boolean b7 = activeMQConfiguration0.isExplicitQosEnabled();
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration8 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str9 = activeMQConfiguration8.getReplyTo();
        boolean b10 = activeMQConfiguration8.isPubSubNoLocal();
        activeMQConfiguration8.setCacheLevelName("tcp://localhost:61616");
        org.apache.camel.component.jms.ConsumerType consumerType13 = activeMQConfiguration8.getConsumerType();
        activeMQConfiguration0.setConsumerType(consumerType13);
        boolean b15 = activeMQConfiguration0.isReplyToSameDestinationAllowed();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + consumerType13 + "' != '" + org.apache.camel.component.jms.ConsumerType.Default + "'", consumerType13.equals(org.apache.camel.component.jms.ConsumerType.Default));
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        java.lang.String str1 = camelConnectionFactory0.getBrokerURL();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "failover://tcp://localhost:61616" + "'", str1.equals("failover://tcp://localhost:61616"));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentClientAcknowledge(connectionFactory0);
        jmsComponent1.setTransactionName("tcp://localhost:61616");
        jmsComponent1.setLazyCreateTransactionManager(true);
        jmsComponent1.setCacheLevelName("");
        org.junit.Assert.assertNotNull(jmsComponent1);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.apache.activemq.camel.component.broker.BrokerComponent brokerComponent0 = new org.apache.activemq.camel.component.broker.BrokerComponent();
        org.apache.camel.ComponentConfiguration componentConfiguration1 = null;
        try {
            java.util.List<java.lang.String> list_str3 = brokerComponent0.completeEndpointPath(componentConfiguration1, "2.16.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentClientAcknowledge(connectionFactory0);
        jmsComponent1.setAcceptMessagesWhileStopping(false);
        boolean b4 = jmsComponent1.isStarting();
        org.apache.camel.CamelContext camelContext5 = null;
        jmsComponent1.setCamelContext(camelContext5);
        jmsComponent1.setAsyncConsumer(false);
        boolean b9 = jmsComponent1.isStoppingOrStopped();
        org.junit.Assert.assertNotNull(jmsComponent1);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory0.setObjectMessageSerializationDefered(true);
        camelConnectionFactory0.setCheckForDuplicates(true);
        org.apache.camel.CamelContext camelContext5 = null;
        camelConnectionFactory0.setCamelContext(camelContext5);
        org.apache.activemq.thread.TaskRunnerFactory taskRunnerFactory7 = null;
        camelConnectionFactory0.setSessionTaskRunner(taskRunnerFactory7);
        javax.jms.QueueConnection queueConnection9 = camelConnectionFactory0.createQueueConnection();
        org.junit.Assert.assertNotNull(queueConnection9);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        camelQueue1.setUri("");
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        jmsComponent1.setTransactionTimeout((int) (short) -1);
        jmsComponent1.setAsyncConsumer(true);
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration6 = jmsComponent1.getConfiguration();
        org.springframework.jms.core.JmsOperations jmsOperations7 = null;
        jmsConfiguration6.setJmsOperations(jmsOperations7);
        jmsConfiguration6.setMapJmsMessage(false);
        org.junit.Assert.assertNotNull(jmsComponent1);
        org.junit.Assert.assertNotNull(jmsConfiguration6);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        org.apache.activemq.broker.ConnectionContext connectionContext2 = null;
        org.apache.activemq.command.ConnectionInfo connectionInfo3 = null;
        java.lang.Throwable throwable4 = null;
        try {
            camelRoutesBroker1.removeConnection(connectionContext2, connectionInfo3, throwable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        org.apache.camel.component.jms.ConsumerType consumerType2 = null;
        activeMQConfiguration0.setConsumerType(consumerType2);
        activeMQConfiguration0.setRequestTimeoutCheckerInterval((long) 'a');
        int i6 = activeMQConfiguration0.getTransactionTimeout();
        boolean b7 = activeMQConfiguration0.isPubSubNoLocal();
        org.apache.activemq.camel.CamelQueue camelQueue9 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding10 = camelQueue9.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint11 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue9);
        int i12 = jmsEndpoint11.getMaxMessagesPerTask();
        try {
            org.springframework.jms.listener.AbstractMessageListenerContainer abstractMessageListenerContainer13 = activeMQConfiguration0.createMessageListenerContainer(jmsEndpoint11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(i6 == (-1));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(jmsBinding10);
        org.junit.Assert.assertNotNull(jmsEndpoint11);
        org.junit.Assert.assertTrue(i12 == (-1));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        int i4 = jmsEndpoint3.getMaxMessagesPerTask();
        java.lang.String str5 = jmsEndpoint3.getTransactionName();
        org.apache.camel.Processor processor6 = null;
        org.apache.activemq.camel.component.broker.BrokerConsumer brokerConsumer7 = new org.apache.activemq.camel.component.broker.BrokerConsumer((org.apache.camel.Endpoint) jmsEndpoint3, processor6);
        org.apache.camel.Exchange exchange8 = null;
        try {
            org.apache.camel.spi.UnitOfWork unitOfWork9 = brokerConsumer7.createUoW(exchange8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        boolean b3 = activeMQConfiguration0.isErrorHandlerLogStackTrace();
        boolean b4 = activeMQConfiguration0.isMessageTimestampEnabled();
        activeMQConfiguration0.setClientId("queue:");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        activeMQConfiguration0.setCacheLevelName("tcp://localhost:61616");
        boolean b5 = activeMQConfiguration0.isExplicitQosEnabled();
        javax.jms.ExceptionListener exceptionListener6 = activeMQConfiguration0.getExceptionListener();
        int i7 = activeMQConfiguration0.getIdleConsumerLimit();
        boolean b8 = activeMQConfiguration0.isUsePooledConnection();
        java.lang.String str9 = activeMQConfiguration0.getReplyToDestinationSelectorName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(exceptionListener6);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        java.lang.String str2 = camelRoutesBroker1.getRoutesFile();
        org.apache.activemq.broker.ConnectionContext connectionContext3 = null;
        org.apache.activemq.broker.region.MessageReference messageReference4 = null;
        try {
            camelRoutesBroker1.messageDelivered(connectionContext3, messageReference4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        org.apache.activemq.camel.CamelQueue camelQueue10 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding11 = camelQueue10.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint12 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue10);
        org.apache.activemq.camel.CamelQueue camelQueue14 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding15 = camelQueue14.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint16 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue14);
        jmsEndpoint12.setDestination((javax.jms.Destination) camelQueue14);
        org.apache.activemq.ActiveMQSession activeMQSession18 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer21 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelQueue5, (org.apache.camel.Endpoint) jmsEndpoint12, activeMQSession18, "failover://tcp://localhost:61616", false);
        boolean b22 = jmsEndpoint12.isStarting();
        jmsEndpoint12.setPriority((int) (short) 100);
        try {
            java.lang.Class<? extends javax.jms.TemporaryQueue> cls25 = jmsEndpoint12.getTemporaryQueueType();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNotNull(jmsBinding11);
        org.junit.Assert.assertNotNull(jmsEndpoint12);
        org.junit.Assert.assertNotNull(jmsBinding15);
        org.junit.Assert.assertNotNull(jmsEndpoint16);
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        activeMQConfiguration0.setCacheLevelName("tcp://localhost:61616");
        org.apache.camel.component.jms.ConsumerType consumerType5 = activeMQConfiguration0.getConsumerType();
        boolean b6 = activeMQConfiguration0.isErrorHandlerLogStackTrace();
        int i7 = activeMQConfiguration0.getCacheLevel();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + consumerType5 + "' != '" + org.apache.camel.component.jms.ConsumerType.Default + "'", consumerType5.equals(org.apache.camel.component.jms.ConsumerType.Default));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i7 == (-1));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentClientAcknowledge(connectionFactory0);
        jmsComponent1.setTransactionName("tcp://localhost:61616");
        jmsComponent1.setLazyCreateTransactionManager(true);
        java.util.SortedMap<java.lang.String, org.apache.camel.impl.ParameterConfiguration> sortedmap_str_parameterConfiguration6 = jmsComponent1.getParameterConfigurationMap();
        org.junit.Assert.assertNotNull(jmsComponent1);
        org.junit.Assert.assertNotNull(sortedmap_str_parameterConfiguration6);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        java.lang.String str1 = camelConnectionFactory0.getClientIDPrefix();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        java.lang.String str2 = camelRoutesBroker1.getRoutesFile();
        int i3 = camelRoutesBroker1.getCheckPeriod();
        try {
            org.apache.activemq.thread.Scheduler scheduler4 = camelRoutesBroker1.getScheduler();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 1000);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory0.setObjectMessageSerializationDefered(true);
        camelConnectionFactory0.setCheckForDuplicates(true);
        org.apache.camel.CamelContext camelContext5 = null;
        camelConnectionFactory0.setCamelContext(camelContext5);
        java.io.ObjectInput objectInput7 = null;
        try {
            camelConnectionFactory0.readExternal(objectInput7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        jmsComponent1.setTransactionTimeout((int) (short) -1);
        jmsComponent1.setConcurrentConsumers((int) (byte) 0);
        org.junit.Assert.assertNotNull(jmsComponent1);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.apache.activemq.camel.component.broker.BrokerEndpoint brokerEndpoint0 = null;
        org.apache.activemq.camel.component.broker.BrokerProducer brokerProducer1 = new org.apache.activemq.camel.component.broker.BrokerProducer(brokerEndpoint0);
        try {
            org.apache.camel.Exchange exchange2 = brokerProducer1.createExchange();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        activeMQConfiguration0.setCacheLevelName("tcp://localhost:61616");
        long long5 = activeMQConfiguration0.getTimeToLive();
        boolean b6 = activeMQConfiguration0.isTransferExchange();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(long5 == (-1L));
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        java.lang.String str2 = camelRoutesBroker1.getRoutesFile();
        try {
            camelRoutesBroker1.nowMasterBroker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        jmsComponent1.setAcknowledgementModeName("hi!");
        boolean b4 = jmsComponent1.isStarting();
        jmsComponent1.setReplyToConcurrentConsumers((int) (short) 10);
        boolean b7 = jmsComponent1.useRawUri();
        jmsComponent1.setEagerLoadingOfProperties(false);
        org.junit.Assert.assertNotNull(jmsComponent1);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.CamelContext camelContext3 = null;
        camelQueue1.setCamelContext(camelContext3);
        org.apache.activemq.camel.CamelQueue camelQueue6 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding7 = camelQueue6.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint8 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue6);
        jmsEndpoint8.setReplyToDestinationSelectorName("2.16.1");
        org.apache.activemq.ActiveMQSession activeMQSession11 = null;
        try {
            org.apache.activemq.camel.CamelQueueSender camelQueueSender12 = new org.apache.activemq.camel.CamelQueueSender(camelQueue1, (org.apache.camel.Endpoint) jmsEndpoint8, activeMQSession11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsBinding7);
        org.junit.Assert.assertNotNull(jmsEndpoint8);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentClientAcknowledge(connectionFactory0);
        jmsComponent1.setAcceptMessagesWhileStopping(false);
        boolean b4 = jmsComponent1.isStarting();
        org.apache.camel.CamelContext camelContext5 = null;
        jmsComponent1.setCamelContext(camelContext5);
        jmsComponent1.setAsyncConsumer(false);
        jmsComponent1.setEagerLoadingOfProperties(false);
        org.junit.Assert.assertNotNull(jmsComponent1);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        activeMQConfiguration0.setPriority((int) (short) 100);
        activeMQConfiguration0.setTransferException(false);
        boolean b6 = activeMQConfiguration0.isReplyToSameDestinationAllowed();
        activeMQConfiguration0.setPassword("hi!");
        activeMQConfiguration0.setAsyncStartListener(false);
        activeMQConfiguration0.setRequestTimeoutCheckerInterval(0L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        activeMQConfiguration0.setLazyCreateTransactionManager(false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        jmsComponent1.setAcknowledgementModeName("hi!");
        jmsComponent1.setAlwaysCopyMessage(true);
        boolean b6 = jmsComponent1.isSuspendingOrSuspended();
        jmsComponent1.setMaxMessagesPerTask((int) (short) -1);
        try {
            org.apache.camel.Endpoint endpoint10 = jmsComponent1.createEndpoint("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(jmsComponent1);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        activeMQConfiguration0.setExplicitQosEnabled(true);
        org.apache.camel.component.jms.DefaultTaskExecutorType defaultTaskExecutorType3 = null;
        activeMQConfiguration0.setDefaultTaskExecutorType(defaultTaskExecutorType3);
        activeMQConfiguration0.setTransactionName("temp:topic:");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory0.setDisableTimeStampsByDefault(true);
        java.util.Properties properties3 = camelConnectionFactory0.getProperties();
        org.apache.camel.CamelContext camelContext4 = camelConnectionFactory0.getCamelContext();
        camelConnectionFactory0.setBeanName("hi!");
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNull(camelContext4);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        java.lang.String str2 = camelRoutesBroker1.getRoutesFile();
        int i3 = camelRoutesBroker1.getCheckPeriod();
        org.apache.activemq.broker.ConnectionContext connectionContext4 = null;
        org.apache.activemq.command.TransactionId transactionId5 = null;
        try {
            camelRoutesBroker1.forgetTransaction(connectionContext4, transactionId5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 1000);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        jmsComponent1.setAcknowledgementModeName("hi!");
        boolean b4 = jmsComponent1.isStarting();
        jmsComponent1.setReplyToConcurrentConsumers((int) (short) 10);
        jmsComponent1.setLazyCreateTransactionManager(true);
        org.junit.Assert.assertNotNull(jmsComponent1);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        org.apache.activemq.camel.CamelQueue camelQueue10 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding11 = camelQueue10.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint12 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue10);
        org.apache.activemq.camel.CamelQueue camelQueue14 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding15 = camelQueue14.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint16 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue14);
        jmsEndpoint12.setDestination((javax.jms.Destination) camelQueue14);
        org.apache.activemq.ActiveMQSession activeMQSession18 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer21 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelQueue5, (org.apache.camel.Endpoint) jmsEndpoint12, activeMQSession18, "failover://tcp://localhost:61616", false);
        boolean b22 = jmsEndpoint12.isStarting();
        org.springframework.jms.core.JmsOperations jmsOperations23 = null;
        jmsEndpoint12.setMetadataJmsOperations(jmsOperations23);
        org.apache.camel.component.jms.JmsKeyFormatStrategy jmsKeyFormatStrategy25 = null;
        jmsEndpoint12.setJmsKeyFormatStrategy(jmsKeyFormatStrategy25);
        org.springframework.transaction.PlatformTransactionManager platformTransactionManager27 = null;
        jmsEndpoint12.setTransactionManager(platformTransactionManager27);
        javax.jms.ConnectionFactory connectionFactory29 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent30 = org.apache.camel.component.jms.JmsComponent.jmsComponentClientAcknowledge(connectionFactory29);
        jmsComponent30.setAcceptMessagesWhileStopping(false);
        jmsComponent30.setPreserveMessageQos(true);
        jmsComponent30.setMapJmsMessage(false);
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration37 = jmsComponent30.getConfiguration();
        org.apache.camel.component.jms.JmsProviderMetadata jmsProviderMetadata38 = jmsConfiguration37.getProviderMetadata();
        jmsEndpoint12.setProviderMetadata(jmsProviderMetadata38);
        jmsEndpoint12.setIncludeSentJMSMessageID(true);
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNotNull(jmsBinding11);
        org.junit.Assert.assertNotNull(jmsEndpoint12);
        org.junit.Assert.assertNotNull(jmsBinding15);
        org.junit.Assert.assertNotNull(jmsEndpoint16);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(jmsComponent30);
        org.junit.Assert.assertNotNull(jmsConfiguration37);
        org.junit.Assert.assertNotNull(jmsProviderMetadata38);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        java.lang.String str2 = camelRoutesBroker1.getRoutesFile();
        org.apache.activemq.broker.ConnectionContext connectionContext3 = null;
        org.apache.activemq.command.DestinationInfo destinationInfo4 = null;
        try {
            camelRoutesBroker1.addDestinationInfo(connectionContext3, destinationInfo4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentClientAcknowledge(connectionFactory0);
        jmsComponent1.setReplyToConcurrentConsumers((int) (byte) -1);
        jmsComponent1.setForceSendOriginalMessage(true);
        org.junit.Assert.assertNotNull(jmsComponent1);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        jmsEndpoint3.setReplyToDestinationSelectorName("2.16.1");
        org.apache.camel.EndpointConfiguration endpointConfiguration6 = null;
        jmsEndpoint3.setEndpointConfiguration(endpointConfiguration6);
        org.apache.camel.ExchangePattern exchangePattern8 = jmsEndpoint3.getExchangePattern();
        jmsEndpoint3.setMessageTimestampEnabled(false);
        int i11 = jmsEndpoint3.getCacheLevel();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertTrue("'" + exchangePattern8 + "' != '" + org.apache.camel.ExchangePattern.InOnly + "'", exchangePattern8.equals(org.apache.camel.ExchangePattern.InOnly));
        org.junit.Assert.assertTrue(i11 == (-1));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory0.setDisableTimeStampsByDefault(true);
        java.util.Properties properties3 = camelConnectionFactory0.getProperties();
        org.apache.camel.CamelContext camelContext4 = camelConnectionFactory0.getCamelContext();
        camelConnectionFactory0.setWarnAboutUnstartedConnectionTimeout(100L);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNull(camelContext4);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        int i1 = activeMQConfiguration0.getConcurrentConsumers();
        long long2 = activeMQConfiguration0.getRecoveryInterval();
        org.junit.Assert.assertTrue(i1 == 1);
        org.junit.Assert.assertTrue(long2 == 5000L);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        java.lang.String str2 = camelRoutesBroker1.getRoutesFile();
        int i3 = camelRoutesBroker1.getCheckPeriod();
        org.apache.activemq.command.BrokerInfo brokerInfo4 = null;
        try {
            camelRoutesBroker1.networkBridgeStarted(brokerInfo4, false, "tcp://localhost:61616");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 1000);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.CamelContext camelContext3 = null;
        camelQueue1.setCamelContext(camelContext3);
        org.apache.activemq.camel.CamelQueue camelQueue6 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding7 = camelQueue6.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint8 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue6);
        org.apache.activemq.camel.CamelQueue camelQueue10 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding11 = camelQueue10.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint12 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue10);
        jmsEndpoint8.setDestination((javax.jms.Destination) camelQueue10);
        org.apache.activemq.camel.CamelQueue camelQueue15 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding16 = camelQueue15.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint17 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue15);
        org.apache.activemq.camel.CamelQueue camelQueue19 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding20 = camelQueue19.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint21 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue19);
        jmsEndpoint17.setDestination((javax.jms.Destination) camelQueue19);
        org.apache.activemq.ActiveMQSession activeMQSession23 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer26 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelQueue10, (org.apache.camel.Endpoint) jmsEndpoint17, activeMQSession23, "failover://tcp://localhost:61616", false);
        org.apache.activemq.ActiveMQSession activeMQSession27 = null;
        org.apache.activemq.camel.CamelQueueReceiver camelQueueReceiver29 = new org.apache.activemq.camel.CamelQueueReceiver(camelQueue1, (org.apache.camel.Endpoint) jmsEndpoint17, activeMQSession27, "queue:");
        try {
            org.springframework.jms.core.JmsOperations jmsOperations30 = jmsEndpoint17.createInOutTemplate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsBinding7);
        org.junit.Assert.assertNotNull(jmsEndpoint8);
        org.junit.Assert.assertNotNull(jmsBinding11);
        org.junit.Assert.assertNotNull(jmsEndpoint12);
        org.junit.Assert.assertNotNull(jmsBinding16);
        org.junit.Assert.assertNotNull(jmsEndpoint17);
        org.junit.Assert.assertNotNull(jmsBinding20);
        org.junit.Assert.assertNotNull(jmsEndpoint21);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        long long1 = camelConnectionFactory0.getWarnAboutUnstartedConnectionTimeout();
        org.apache.activemq.RedeliveryPolicy redeliveryPolicy2 = null;
        camelConnectionFactory0.setRedeliveryPolicy(redeliveryPolicy2);
        boolean b4 = camelConnectionFactory0.isAlwaysSessionAsync();
        javax.jms.TopicConnection topicConnection5 = camelConnectionFactory0.createTopicConnection();
        org.apache.activemq.transport.TransportListener transportListener6 = null;
        camelConnectionFactory0.setTransportListener(transportListener6);
        org.junit.Assert.assertTrue(long1 == 500L);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(topicConnection5);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        boolean b9 = jmsEndpoint3.isIncludeAllJMSXProperties();
        long long10 = jmsEndpoint3.getTimeToLive();
        org.apache.camel.component.jms.MessageListenerContainerFactory messageListenerContainerFactory11 = null;
        jmsEndpoint3.setMessageListenerContainerFactory(messageListenerContainerFactory11);
        jmsEndpoint3.setReplyToDeliveryPersistent(false);
        java.lang.String str15 = jmsEndpoint3.getReplyToCacheLevelName();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(long10 == (-1L));
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setAlwaysCopyMessage(false);
        jmsEndpoint3.setReplyToConcurrentConsumers(100);
        jmsEndpoint3.stop();
        boolean b14 = jmsEndpoint3.isLazyCreateTransactionManager();
        int i15 = jmsEndpoint3.getIdleTaskExecutionLimit();
        org.apache.activemq.camel.CamelQueue camelQueue17 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding18 = camelQueue17.getBinding();
        org.apache.camel.CamelContext camelContext19 = null;
        camelQueue17.setCamelContext(camelContext19);
        org.apache.activemq.camel.CamelQueue camelQueue22 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding23 = camelQueue22.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint24 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue22);
        org.apache.activemq.camel.CamelQueue camelQueue26 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding27 = camelQueue26.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint28 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue26);
        jmsEndpoint24.setDestination((javax.jms.Destination) camelQueue26);
        org.apache.activemq.camel.CamelQueue camelQueue31 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding32 = camelQueue31.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint33 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue31);
        org.apache.activemq.camel.CamelQueue camelQueue35 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding36 = camelQueue35.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint37 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue35);
        jmsEndpoint33.setDestination((javax.jms.Destination) camelQueue35);
        org.apache.activemq.ActiveMQSession activeMQSession39 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer42 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelQueue26, (org.apache.camel.Endpoint) jmsEndpoint33, activeMQSession39, "failover://tcp://localhost:61616", false);
        org.apache.activemq.ActiveMQSession activeMQSession43 = null;
        org.apache.activemq.camel.CamelQueueReceiver camelQueueReceiver45 = new org.apache.activemq.camel.CamelQueueReceiver(camelQueue17, (org.apache.camel.Endpoint) jmsEndpoint33, activeMQSession43, "queue:");
        boolean b46 = jmsEndpoint33.isErrorHandlerLogStackTrace();
        jmsEndpoint33.setTimeToLive((long) (short) -1);
        org.springframework.transaction.PlatformTransactionManager platformTransactionManager49 = null;
        jmsEndpoint33.setTransactionManager(platformTransactionManager49);
        try {
            org.springframework.jms.core.JmsOperations jmsOperations51 = jmsEndpoint3.getMetadataJmsOperations(jmsEndpoint33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertNotNull(jmsBinding18);
        org.junit.Assert.assertNotNull(jmsBinding23);
        org.junit.Assert.assertNotNull(jmsEndpoint24);
        org.junit.Assert.assertNotNull(jmsBinding27);
        org.junit.Assert.assertNotNull(jmsEndpoint28);
        org.junit.Assert.assertNotNull(jmsBinding32);
        org.junit.Assert.assertNotNull(jmsEndpoint33);
        org.junit.Assert.assertNotNull(jmsBinding36);
        org.junit.Assert.assertNotNull(jmsEndpoint37);
        org.junit.Assert.assertTrue(b46 == true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        activeMQConfiguration0.setCacheLevelName("tcp://localhost:61616");
        long long5 = activeMQConfiguration0.getTimeToLive();
        boolean b6 = activeMQConfiguration0.isExposeListenerSession();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(long5 == (-1L));
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        int i4 = jmsEndpoint3.getMaxMessagesPerTask();
        java.lang.String str5 = jmsEndpoint3.getTransactionName();
        org.apache.camel.Processor processor6 = null;
        org.apache.activemq.camel.component.broker.BrokerConsumer brokerConsumer7 = new org.apache.activemq.camel.component.broker.BrokerConsumer((org.apache.camel.Endpoint) jmsEndpoint3, processor6);
        org.apache.camel.Route route8 = null;
        brokerConsumer7.setRoute(route8);
        org.apache.camel.Exchange exchange10 = null;
        try {
            org.apache.camel.spi.UnitOfWork unitOfWork11 = brokerConsumer7.createUoW(exchange10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentClientAcknowledge(connectionFactory0);
        jmsComponent1.setAcceptMessagesWhileStopping(false);
        jmsComponent1.setPreserveMessageQos(true);
        jmsComponent1.setMapJmsMessage(false);
        jmsComponent1.setTransferException(false);
        java.util.SortedMap<java.lang.String, org.apache.camel.impl.ParameterConfiguration> sortedmap_str_parameterConfiguration10 = jmsComponent1.getParameterConfigurationMap();
        org.junit.Assert.assertNotNull(jmsComponent1);
        org.junit.Assert.assertNotNull(sortedmap_str_parameterConfiguration10);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setMaxMessagesPerTask((int) (byte) 10);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDisableReplyTo(true);
        boolean b11 = jmsEndpoint3.isSubscriptionDurable();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.lang.String str0 = org.apache.activemq.ActiveMQConnection.DEFAULT_PASSWORD;
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent1 = org.apache.activemq.camel.component.ActiveMQComponent.activeMQComponent("hi!");
        activeMQComponent1.setExposeAllQueues(true);
        activeMQComponent1.setMessageTimestampEnabled(false);
        org.junit.Assert.assertNotNull(activeMQComponent1);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        java.lang.String str2 = camelRoutesBroker1.getRoutesFile();
        int i3 = camelRoutesBroker1.getCheckPeriod();
        org.apache.activemq.broker.ConnectionContext connectionContext4 = null;
        org.apache.activemq.command.MessagePull messagePull5 = null;
        try {
            org.apache.activemq.command.Response response6 = camelRoutesBroker1.messagePull(connectionContext4, messagePull5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 1000);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.apache.activemq.camel.component.broker.BrokerEndpoint brokerEndpoint0 = null;
        org.apache.activemq.camel.component.broker.BrokerProducer brokerProducer1 = new org.apache.activemq.camel.component.broker.BrokerProducer(brokerEndpoint0);
        org.apache.activemq.camel.CamelQueue camelQueue3 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding4 = camelQueue3.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint5 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue3);
        jmsEndpoint5.setReplyToDestinationSelectorName("2.16.1");
        org.apache.camel.EndpointConfiguration endpointConfiguration8 = null;
        jmsEndpoint5.setEndpointConfiguration(endpointConfiguration8);
        org.apache.camel.ExchangePattern exchangePattern10 = jmsEndpoint5.getExchangePattern();
        try {
            org.apache.camel.Exchange exchange11 = brokerProducer1.createExchange(exchangePattern10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(jmsBinding4);
        org.junit.Assert.assertNotNull(jmsEndpoint5);
        org.junit.Assert.assertTrue("'" + exchangePattern10 + "' != '" + org.apache.camel.ExchangePattern.InOnly + "'", exchangePattern10.equals(org.apache.camel.ExchangePattern.InOnly));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        org.apache.activemq.broker.Connection connection2 = null;
        org.apache.activemq.command.BrokerInfo brokerInfo3 = null;
        try {
            camelRoutesBroker1.removeBroker(connection2, brokerInfo3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        activeMQConfiguration0.setCacheLevelName("tcp://localhost:61616");
        boolean b5 = activeMQConfiguration0.isExplicitQosEnabled();
        javax.jms.ExceptionListener exceptionListener6 = activeMQConfiguration0.getExceptionListener();
        int i7 = activeMQConfiguration0.getIdleConsumerLimit();
        activeMQConfiguration0.setTransactionTimeout((int) (byte) -1);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(exceptionListener6);
        org.junit.Assert.assertTrue(i7 == 1);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        java.lang.String str4 = camelQueue1.getUri();
        org.apache.activemq.ActiveMQSession activeMQSession5 = null;
        try {
            javax.jms.MessageProducer messageProducer6 = camelQueue1.createProducer(activeMQSession5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "queue:" + "'", str4.equals("queue:"));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        javax.jms.ConnectionFactory connectionFactory3 = activeMQConfiguration0.getListenerConnectionFactory();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(connectionFactory3);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory1 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory1.setDisableTimeStampsByDefault(true);
        java.util.Properties properties4 = camelConnectionFactory1.getProperties();
        camelConnectionFactory0.populateProperties(properties4);
        javax.jms.TopicConnection topicConnection8 = camelConnectionFactory0.createTopicConnection("queue:", "tcp://localhost:61616");
        boolean b9 = camelConnectionFactory0.isUseRetroactiveConsumer();
        int i10 = camelConnectionFactory0.getAuditMaximumProducerNumber();
        camelConnectionFactory0.setAlwaysSyncSend(false);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNotNull(topicConnection8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 64);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        org.apache.activemq.camel.CamelQueue camelQueue10 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding11 = camelQueue10.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint12 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue10);
        org.apache.activemq.camel.CamelQueue camelQueue14 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding15 = camelQueue14.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint16 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue14);
        jmsEndpoint12.setDestination((javax.jms.Destination) camelQueue14);
        org.apache.activemq.ActiveMQSession activeMQSession18 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer21 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelQueue5, (org.apache.camel.Endpoint) jmsEndpoint12, activeMQSession18, "failover://tcp://localhost:61616", false);
        jmsEndpoint12.setAcknowledgementModeName("hi!");
        jmsEndpoint12.setLazyCreateTransactionManager(false);
        jmsEndpoint12.setCacheLevelName("tcp://localhost:61616");
        java.lang.String str28 = jmsEndpoint12.getEndpointConfiguredDestinationName();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNotNull(jmsBinding11);
        org.junit.Assert.assertNotNull(jmsEndpoint12);
        org.junit.Assert.assertNotNull(jmsBinding15);
        org.junit.Assert.assertNotNull(jmsEndpoint16);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        boolean b9 = jmsEndpoint3.isIncludeAllJMSXProperties();
        long long10 = jmsEndpoint3.getTimeToLive();
        jmsEndpoint3.setReplyToMaxConcurrentConsumers(100);
        jmsEndpoint3.shutdown();
        jmsEndpoint3.setCacheLevelName("2.16.1");
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(long10 == (-1L));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        boolean b9 = jmsEndpoint3.isIncludeAllJMSXProperties();
        long long10 = jmsEndpoint3.getTimeToLive();
        jmsEndpoint3.setReplyToMaxConcurrentConsumers(100);
        jmsEndpoint3.shutdown();
        boolean b14 = jmsEndpoint3.isMessageIdEnabled();
        jmsEndpoint3.setRecoveryInterval((long) 100);
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(long10 == (-1L));
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        boolean b9 = jmsEndpoint3.isIncludeAllJMSXProperties();
        long long10 = jmsEndpoint3.getTimeToLive();
        jmsEndpoint3.setReplyToMaxConcurrentConsumers(100);
        jmsEndpoint3.setTransactedInOut(false);
        org.springframework.transaction.PlatformTransactionManager platformTransactionManager15 = jmsEndpoint3.getTransactionManager();
        org.apache.camel.component.jms.JmsBinding jmsBinding16 = jmsEndpoint3.getBinding();
        jmsEndpoint3.setReplyToSameDestinationAllowed(false);
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(long10 == (-1L));
        org.junit.Assert.assertNull(platformTransactionManager15);
        org.junit.Assert.assertNotNull(jmsBinding16);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        long long1 = camelConnectionFactory0.getWarnAboutUnstartedConnectionTimeout();
        org.apache.activemq.RedeliveryPolicy redeliveryPolicy2 = null;
        camelConnectionFactory0.setRedeliveryPolicy(redeliveryPolicy2);
        boolean b4 = camelConnectionFactory0.isAlwaysSessionAsync();
        javax.jms.TopicConnection topicConnection5 = camelConnectionFactory0.createTopicConnection();
        camelConnectionFactory0.setCheckForDuplicates(true);
        org.junit.Assert.assertTrue(long1 == 500L);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(topicConnection5);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        java.lang.String str2 = camelRoutesBroker1.getRoutesFile();
        org.apache.activemq.broker.ConnectionContext connectionContext3 = null;
        org.apache.activemq.command.MessagePull messagePull4 = null;
        try {
            org.apache.activemq.command.Response response5 = camelRoutesBroker1.messagePull(connectionContext3, messagePull4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        java.lang.String str2 = camelRoutesBroker1.getRoutesFile();
        int i3 = camelRoutesBroker1.getCheckPeriod();
        org.apache.activemq.broker.ConnectionContext connectionContext4 = null;
        org.apache.activemq.broker.region.virtual.VirtualDestination virtualDestination5 = null;
        try {
            camelRoutesBroker1.virtualDestinationRemoved(connectionContext4, virtualDestination5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 1000);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.apache.activemq.ActiveMQConnection.DEFAULT_THREAD_POOL_SIZE = 4;
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        java.lang.String str2 = camelRoutesBroker1.getRoutesFile();
        org.apache.activemq.broker.ConnectionContext connectionContext3 = null;
        org.apache.activemq.broker.region.MessageReference messageReference4 = null;
        org.apache.activemq.broker.region.Subscription subscription5 = null;
        java.lang.Throwable throwable6 = null;
        try {
            boolean b7 = camelRoutesBroker1.sendToDeadLetterQueue(connectionContext3, messageReference4, subscription5, throwable6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        activeMQConfiguration0.setCacheLevelName("tcp://localhost:61616");
        boolean b5 = activeMQConfiguration0.isExplicitQosEnabled();
        activeMQConfiguration0.setDisableReplyTo(true);
        org.apache.camel.component.jms.MessageListenerContainerFactory messageListenerContainerFactory8 = null;
        activeMQConfiguration0.setMessageListenerContainerFactory(messageListenerContainerFactory8);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.apache.activemq.camel.component.broker.BrokerEndpoint brokerEndpoint0 = null;
        org.apache.activemq.camel.component.broker.BrokerProducer brokerProducer1 = new org.apache.activemq.camel.component.broker.BrokerProducer(brokerEndpoint0);
        org.apache.camel.Exchange exchange2 = null;
        org.apache.camel.AsyncCallback asyncCallback3 = null;
        try {
            boolean b4 = brokerProducer1.process(exchange2, asyncCallback3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        jmsComponent1.setTransactionTimeout((int) (short) -1);
        jmsComponent1.setConcurrentConsumers((int) (byte) 1);
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration6 = jmsComponent1.getConfiguration();
        org.junit.Assert.assertNotNull(jmsComponent1);
        org.junit.Assert.assertNotNull(jmsConfiguration6);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory1 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory1.setDisableTimeStampsByDefault(true);
        java.util.Properties properties4 = camelConnectionFactory1.getProperties();
        camelConnectionFactory0.populateProperties(properties4);
        javax.jms.TopicConnection topicConnection8 = camelConnectionFactory0.createTopicConnection("queue:", "tcp://localhost:61616");
        boolean b9 = camelConnectionFactory0.isUseRetroactiveConsumer();
        int i10 = camelConnectionFactory0.getAuditMaximumProducerNumber();
        camelConnectionFactory0.setAuditDepth((int) (short) 0);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNotNull(topicConnection8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 64);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        boolean b9 = jmsEndpoint3.isIncludeAllJMSXProperties();
        long long10 = jmsEndpoint3.getTimeToLive();
        javax.jms.ConnectionFactory connectionFactory11 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent12 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory11);
        jmsComponent12.setTransactionTimeout((int) (short) -1);
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration15 = jmsComponent12.getConfiguration();
        org.apache.camel.component.jms.JmsKeyFormatStrategy jmsKeyFormatStrategy16 = jmsConfiguration15.getJmsKeyFormatStrategy();
        jmsEndpoint3.setJmsKeyFormatStrategy(jmsKeyFormatStrategy16);
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(long10 == (-1L));
        org.junit.Assert.assertNotNull(jmsComponent12);
        org.junit.Assert.assertNotNull(jmsConfiguration15);
        org.junit.Assert.assertNotNull(jmsKeyFormatStrategy16);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        activeMQConfiguration0.setCacheLevelName("tcp://localhost:61616");
        org.apache.camel.component.jms.ConsumerType consumerType5 = activeMQConfiguration0.getConsumerType();
        long long6 = activeMQConfiguration0.getRequestTimeout();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + consumerType5 + "' != '" + org.apache.camel.component.jms.ConsumerType.Default + "'", consumerType5.equals(org.apache.camel.component.jms.ConsumerType.Default));
        org.junit.Assert.assertTrue(long6 == 20000L);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory0.setDisableTimeStampsByDefault(true);
        java.util.Properties properties3 = camelConnectionFactory0.getProperties();
        org.apache.camel.CamelContext camelContext4 = camelConnectionFactory0.getCamelContext();
        camelConnectionFactory0.setAlwaysSyncSend(true);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNull(camelContext4);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory0.setDisableTimeStampsByDefault(true);
        java.util.Properties properties3 = camelConnectionFactory0.getProperties();
        long long4 = camelConnectionFactory0.getConsumerFailoverRedeliveryWaitPeriod();
        int i5 = camelConnectionFactory0.getCloseTimeout();
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertTrue(long4 == 0L);
        org.junit.Assert.assertTrue(i5 == 15000);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        java.lang.String str3 = activeMQConfiguration0.getDurableSubscriptionName();
        org.springframework.core.task.TaskExecutor taskExecutor4 = activeMQConfiguration0.getTaskExecutor();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(taskExecutor4);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        java.lang.String str2 = camelRoutesBroker1.getRoutesFile();
        int i3 = camelRoutesBroker1.getCheckPeriod();
        org.apache.activemq.broker.ConnectionContext connectionContext4 = null;
        org.apache.activemq.command.ConnectionInfo connectionInfo5 = null;
        try {
            camelRoutesBroker1.addConnection(connectionContext4, connectionInfo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 1000);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory0.setObjectMessageSerializationDefered(true);
        camelConnectionFactory0.setCheckForDuplicates(true);
        org.apache.camel.CamelContext camelContext5 = null;
        camelConnectionFactory0.setCamelContext(camelContext5);
        org.apache.activemq.thread.TaskRunnerFactory taskRunnerFactory7 = null;
        camelConnectionFactory0.setSessionTaskRunner(taskRunnerFactory7);
        boolean b9 = camelConnectionFactory0.isCheckForDuplicates();
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory1 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory1.setDisableTimeStampsByDefault(true);
        java.util.Properties properties4 = camelConnectionFactory1.getProperties();
        camelConnectionFactory0.populateProperties(properties4);
        camelConnectionFactory0.setWarnAboutUnstartedConnectionTimeout((long) (short) -1);
        camelConnectionFactory0.setConnectionIDPrefix("2.16.1");
        org.junit.Assert.assertNotNull(properties4);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        java.lang.String str2 = camelRoutesBroker1.getRoutesFile();
        int i3 = camelRoutesBroker1.getCheckPeriod();
        try {
            org.apache.activemq.command.ActiveMQDestination[] activeMQDestination_array4 = camelRoutesBroker1.getDestinations();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 1000);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        java.lang.String str2 = camelRoutesBroker1.getRoutesFile();
        int i3 = camelRoutesBroker1.getCheckPeriod();
        org.apache.activemq.broker.ConnectionContext connectionContext4 = null;
        org.apache.activemq.command.DestinationInfo destinationInfo5 = null;
        try {
            camelRoutesBroker1.addDestinationInfo(connectionContext4, destinationInfo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 1000);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        java.lang.String str2 = camelRoutesBroker1.getRoutesFile();
        org.apache.activemq.camel.component.broker.BrokerComponent brokerComponent3 = new org.apache.activemq.camel.component.broker.BrokerComponent();
        org.apache.camel.CamelContext camelContext4 = brokerComponent3.getCamelContext();
        boolean b5 = brokerComponent3.isSuspended();
        java.lang.Class<? extends org.apache.camel.Endpoint> cls6 = brokerComponent3.getEndpointClass();
        try {
            org.apache.activemq.broker.Broker broker7 = camelRoutesBroker1.getAdaptor((java.lang.Class) cls6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertNull(camelContext4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(cls6);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        java.lang.String str2 = camelRoutesBroker1.getRoutesFile();
        int i3 = camelRoutesBroker1.getCheckPeriod();
        org.apache.activemq.broker.ConnectionContext connectionContext4 = null;
        org.apache.activemq.command.SessionInfo sessionInfo5 = null;
        try {
            camelRoutesBroker1.removeSession(connectionContext4, sessionInfo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 1000);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        org.apache.camel.component.jms.ConsumerType consumerType2 = null;
        activeMQConfiguration0.setConsumerType(consumerType2);
        activeMQConfiguration0.setRequestTimeoutCheckerInterval((long) 'a');
        int i6 = activeMQConfiguration0.getTransactionTimeout();
        boolean b7 = activeMQConfiguration0.isPubSubNoLocal();
        activeMQConfiguration0.setMessageIdEnabled(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(i6 == (-1));
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        boolean b4 = jmsEndpoint3.isPubSubNoLocal();
        jmsEndpoint3.setTimeToLive((long) (byte) 1);
        int i7 = jmsEndpoint3.getCacheLevel();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i7 == (-1));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        boolean b3 = activeMQConfiguration0.isErrorHandlerLogStackTrace();
        activeMQConfiguration0.setTransactedInOut(false);
        org.apache.camel.component.jms.JmsComponent jmsComponent6 = org.apache.camel.component.jms.JmsComponent.jmsComponent((org.apache.camel.component.jms.JmsConfiguration) activeMQConfiguration0);
        jmsComponent6.setDeliveryMode((java.lang.Integer) 0);
        jmsComponent6.setPreserveMessageQos(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(jmsComponent6);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        int i4 = jmsEndpoint3.getMaxMessagesPerTask();
        java.lang.String str5 = jmsEndpoint3.getTransactionName();
        boolean b6 = jmsEndpoint3.isPubSubNoLocal();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.apache.activemq.camel.converter.ActiveMQMessageConverter activeMQMessageConverter0 = new org.apache.activemq.camel.converter.ActiveMQMessageConverter();
        org.apache.camel.component.jms.JmsBinding jmsBinding1 = null;
        activeMQMessageConverter0.setBinding(jmsBinding1);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentClientAcknowledge(connectionFactory0);
        jmsComponent1.setAcceptMessagesWhileStopping(false);
        jmsComponent1.setPreserveMessageQos(true);
        jmsComponent1.setMapJmsMessage(false);
        jmsComponent1.setTransferException(false);
        jmsComponent1.setUseMessageIDAsCorrelationID(false);
        org.junit.Assert.assertNotNull(jmsComponent1);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        boolean b3 = activeMQConfiguration0.isErrorHandlerLogStackTrace();
        activeMQConfiguration0.setTransactedInOut(false);
        org.apache.camel.component.jms.JmsComponent jmsComponent6 = org.apache.camel.component.jms.JmsComponent.jmsComponent((org.apache.camel.component.jms.JmsConfiguration) activeMQConfiguration0);
        jmsComponent6.setAcknowledgementModeName("tcp://localhost:61616");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(jmsComponent6);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        org.apache.activemq.camel.CamelQueue camelQueue10 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding11 = camelQueue10.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint12 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue10);
        org.apache.activemq.camel.CamelQueue camelQueue14 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding15 = camelQueue14.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint16 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue14);
        jmsEndpoint12.setDestination((javax.jms.Destination) camelQueue14);
        org.apache.activemq.ActiveMQSession activeMQSession18 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer21 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelQueue5, (org.apache.camel.Endpoint) jmsEndpoint12, activeMQSession18, "failover://tcp://localhost:61616", false);
        boolean b22 = jmsEndpoint12.isStarting();
        org.apache.camel.CamelContext camelContext23 = jmsEndpoint12.getCamelContext();
        jmsEndpoint12.shutdown();
        org.springframework.jms.support.destination.DestinationResolver destinationResolver25 = jmsEndpoint12.getDestinationResolver();
        org.apache.activemq.camel.CamelQueue camelQueue27 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding28 = camelQueue27.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint29 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue27);
        org.apache.activemq.camel.CamelQueue camelQueue31 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding32 = camelQueue31.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint33 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue31);
        jmsEndpoint29.setDestination((javax.jms.Destination) camelQueue31);
        org.apache.activemq.camel.CamelQueue camelQueue36 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding37 = camelQueue36.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint38 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue36);
        org.apache.activemq.camel.CamelQueue camelQueue40 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding41 = camelQueue40.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint42 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue40);
        jmsEndpoint38.setDestination((javax.jms.Destination) camelQueue40);
        org.apache.activemq.ActiveMQSession activeMQSession44 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer47 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelQueue31, (org.apache.camel.Endpoint) jmsEndpoint38, activeMQSession44, "failover://tcp://localhost:61616", false);
        boolean b48 = jmsEndpoint38.isAlwaysCopyMessage();
        boolean b49 = jmsEndpoint38.isMultipleConsumersSupported();
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj50 = jmsEndpoint38.getConsumerProperties();
        jmsEndpoint12.configureProperties(map_str_obj50);
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNotNull(jmsBinding11);
        org.junit.Assert.assertNotNull(jmsEndpoint12);
        org.junit.Assert.assertNotNull(jmsBinding15);
        org.junit.Assert.assertNotNull(jmsEndpoint16);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(camelContext23);
        org.junit.Assert.assertNull(destinationResolver25);
        org.junit.Assert.assertNotNull(jmsBinding28);
        org.junit.Assert.assertNotNull(jmsEndpoint29);
        org.junit.Assert.assertNotNull(jmsBinding32);
        org.junit.Assert.assertNotNull(jmsEndpoint33);
        org.junit.Assert.assertNotNull(jmsBinding37);
        org.junit.Assert.assertNotNull(jmsEndpoint38);
        org.junit.Assert.assertNotNull(jmsBinding41);
        org.junit.Assert.assertNotNull(jmsEndpoint42);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertNotNull(map_str_obj50);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        long long1 = camelConnectionFactory0.getWarnAboutUnstartedConnectionTimeout();
        camelConnectionFactory0.setAuditMaximumProducerNumber((int) (byte) 1);
        org.apache.activemq.transport.TransportListener transportListener4 = null;
        camelConnectionFactory0.setTransportListener(transportListener4);
        org.junit.Assert.assertTrue(long1 == 500L);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentClientAcknowledge(connectionFactory0);
        jmsComponent1.setSubscriptionDurable(true);
        jmsComponent1.setMaxConcurrentConsumers((-1));
        org.junit.Assert.assertNotNull(jmsComponent1);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        boolean b3 = activeMQConfiguration0.isLazyCreateTransactionManager();
        activeMQConfiguration0.setAcknowledgementMode((int) (byte) 10);
        activeMQConfiguration0.setSubscriptionDurable(false);
        java.lang.String str8 = activeMQConfiguration0.getTransactionName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        jmsComponent1.setAcknowledgementModeName("hi!");
        boolean b4 = jmsComponent1.isStarting();
        boolean b5 = jmsComponent1.isSuspending();
        org.junit.Assert.assertNotNull(jmsComponent1);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        org.apache.activemq.camel.CamelQueue camelQueue10 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding11 = camelQueue10.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint12 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue10);
        org.apache.activemq.camel.CamelQueue camelQueue14 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding15 = camelQueue14.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint16 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue14);
        jmsEndpoint12.setDestination((javax.jms.Destination) camelQueue14);
        org.apache.activemq.ActiveMQSession activeMQSession18 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer21 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelQueue5, (org.apache.camel.Endpoint) jmsEndpoint12, activeMQSession18, "failover://tcp://localhost:61616", false);
        boolean b22 = jmsEndpoint12.isStarting();
        jmsEndpoint12.setPriority((int) (short) 100);
        jmsEndpoint12.setErrorHandlerLogStackTrace(false);
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNotNull(jmsBinding11);
        org.junit.Assert.assertNotNull(jmsEndpoint12);
        org.junit.Assert.assertNotNull(jmsBinding15);
        org.junit.Assert.assertNotNull(jmsEndpoint16);
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.apache.activemq.camel.component.broker.BrokerEndpoint brokerEndpoint0 = null;
        org.apache.activemq.camel.component.broker.BrokerProducer brokerProducer1 = new org.apache.activemq.camel.component.broker.BrokerProducer(brokerEndpoint0);
        org.apache.camel.Endpoint endpoint2 = brokerProducer1.getEndpoint();
        org.apache.activemq.camel.CamelQueue camelQueue4 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding5 = camelQueue4.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint6 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue4);
        jmsEndpoint6.setReplyToDestinationSelectorName("2.16.1");
        org.apache.camel.EndpointConfiguration endpointConfiguration9 = null;
        jmsEndpoint6.setEndpointConfiguration(endpointConfiguration9);
        org.apache.camel.ExchangePattern exchangePattern11 = jmsEndpoint6.getExchangePattern();
        try {
            org.apache.camel.Exchange exchange12 = brokerProducer1.createExchange(exchangePattern11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(endpoint2);
        org.junit.Assert.assertNotNull(jmsBinding5);
        org.junit.Assert.assertNotNull(jmsEndpoint6);
        org.junit.Assert.assertTrue("'" + exchangePattern11 + "' != '" + org.apache.camel.ExchangePattern.InOnly + "'", exchangePattern11.equals(org.apache.camel.ExchangePattern.InOnly));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        org.apache.activemq.camel.CamelQueue camelQueue10 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding11 = camelQueue10.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint12 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue10);
        org.apache.activemq.camel.CamelQueue camelQueue14 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding15 = camelQueue14.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint16 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue14);
        jmsEndpoint12.setDestination((javax.jms.Destination) camelQueue14);
        org.apache.activemq.ActiveMQSession activeMQSession18 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer21 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelQueue5, (org.apache.camel.Endpoint) jmsEndpoint12, activeMQSession18, "failover://tcp://localhost:61616", false);
        org.springframework.jms.core.JmsOperations jmsOperations22 = jmsEndpoint12.getJmsOperations();
        jmsEndpoint12.setTimeToLive((long) 0);
        long long25 = jmsEndpoint12.getTimeToLive();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNotNull(jmsBinding11);
        org.junit.Assert.assertNotNull(jmsEndpoint12);
        org.junit.Assert.assertNotNull(jmsBinding15);
        org.junit.Assert.assertNotNull(jmsEndpoint16);
        org.junit.Assert.assertNull(jmsOperations22);
        org.junit.Assert.assertTrue(long25 == 0L);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        jmsComponent1.setReceiveTimeout((long) (byte) 0);
        org.junit.Assert.assertNotNull(jmsComponent1);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        java.lang.String str2 = camelRoutesBroker1.getRoutesFile();
        org.apache.activemq.broker.ConnectionContext connectionContext3 = null;
        org.apache.activemq.broker.region.Destination destination4 = null;
        org.apache.activemq.usage.Usage usage5 = null;
        try {
            camelRoutesBroker1.isFull(connectionContext3, destination4, usage5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentClientAcknowledge(connectionFactory0);
        jmsComponent1.setReplyToConcurrentConsumers((int) (byte) -1);
        jmsComponent1.setDurableSubscriptionName("");
        org.apache.camel.CamelContext camelContext6 = jmsComponent1.getCamelContext();
        org.junit.Assert.assertNotNull(jmsComponent1);
        org.junit.Assert.assertNull(camelContext6);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.apache.activemq.camel.component.broker.BrokerEndpoint brokerEndpoint0 = null;
        org.apache.activemq.camel.component.broker.BrokerProducer brokerProducer1 = new org.apache.activemq.camel.component.broker.BrokerProducer(brokerEndpoint0);
        org.apache.camel.Endpoint endpoint2 = brokerProducer1.getEndpoint();
        org.apache.camel.Exchange exchange3 = null;
        try {
            org.apache.camel.Exchange exchange4 = brokerProducer1.createExchange(exchange3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(endpoint2);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        boolean b3 = activeMQConfiguration0.isErrorHandlerLogStackTrace();
        boolean b4 = activeMQConfiguration0.isMessageTimestampEnabled();
        org.apache.activemq.camel.CamelQueue camelQueue6 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding7 = camelQueue6.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint8 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue6);
        org.apache.activemq.camel.CamelQueue camelQueue10 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding11 = camelQueue10.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint12 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue10);
        jmsEndpoint8.setDestination((javax.jms.Destination) camelQueue10);
        org.apache.activemq.camel.CamelQueue camelQueue15 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding16 = camelQueue15.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint17 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue15);
        org.apache.activemq.camel.CamelQueue camelQueue19 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding20 = camelQueue19.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint21 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue19);
        jmsEndpoint17.setDestination((javax.jms.Destination) camelQueue19);
        org.apache.activemq.ActiveMQSession activeMQSession23 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer26 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelQueue10, (org.apache.camel.Endpoint) jmsEndpoint17, activeMQSession23, "failover://tcp://localhost:61616", false);
        boolean b27 = jmsEndpoint17.isStarting();
        org.springframework.jms.core.JmsOperations jmsOperations28 = null;
        jmsEndpoint17.setMetadataJmsOperations(jmsOperations28);
        org.apache.camel.component.jms.JmsKeyFormatStrategy jmsKeyFormatStrategy30 = null;
        jmsEndpoint17.setJmsKeyFormatStrategy(jmsKeyFormatStrategy30);
        int i32 = jmsEndpoint17.getPollingConsumerQueueSize();
        org.springframework.jms.core.JmsOperations jmsOperations35 = activeMQConfiguration0.createInOnlyTemplate(jmsEndpoint17, false, "failover://tcp://localhost:61616");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(jmsBinding7);
        org.junit.Assert.assertNotNull(jmsEndpoint8);
        org.junit.Assert.assertNotNull(jmsBinding11);
        org.junit.Assert.assertNotNull(jmsEndpoint12);
        org.junit.Assert.assertNotNull(jmsBinding16);
        org.junit.Assert.assertNotNull(jmsEndpoint17);
        org.junit.Assert.assertNotNull(jmsBinding20);
        org.junit.Assert.assertNotNull(jmsEndpoint21);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(i32 == 1000);
        org.junit.Assert.assertNotNull(jmsOperations35);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent1 = org.apache.activemq.camel.component.ActiveMQComponent.activeMQComponent("queue:");
        activeMQComponent1.setExposeAllQueues(false);
        boolean b4 = activeMQComponent1.isExposeAllQueues();
        activeMQComponent1.setPassword("failover://tcp://localhost:61616");
        org.junit.Assert.assertNotNull(activeMQComponent1);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.CamelContext camelContext3 = null;
        camelQueue1.setCamelContext(camelContext3);
        org.apache.activemq.camel.CamelQueue camelQueue6 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding7 = camelQueue6.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint8 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue6);
        org.apache.activemq.camel.CamelQueue camelQueue10 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding11 = camelQueue10.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint12 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue10);
        jmsEndpoint8.setDestination((javax.jms.Destination) camelQueue10);
        org.apache.activemq.camel.CamelQueue camelQueue15 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding16 = camelQueue15.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint17 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue15);
        org.apache.activemq.camel.CamelQueue camelQueue19 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding20 = camelQueue19.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint21 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue19);
        jmsEndpoint17.setDestination((javax.jms.Destination) camelQueue19);
        org.apache.activemq.ActiveMQSession activeMQSession23 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer26 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelQueue10, (org.apache.camel.Endpoint) jmsEndpoint17, activeMQSession23, "failover://tcp://localhost:61616", false);
        org.apache.activemq.ActiveMQSession activeMQSession27 = null;
        org.apache.activemq.camel.CamelQueueReceiver camelQueueReceiver29 = new org.apache.activemq.camel.CamelQueueReceiver(camelQueue1, (org.apache.camel.Endpoint) jmsEndpoint17, activeMQSession27, "queue:");
        org.apache.activemq.ActiveMQSession activeMQSession30 = null;
        try {
            javax.jms.TopicSubscriber topicSubscriber34 = camelQueue1.createDurableSubscriber(activeMQSession30, "hi!", "2.16.1", false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsBinding7);
        org.junit.Assert.assertNotNull(jmsEndpoint8);
        org.junit.Assert.assertNotNull(jmsBinding11);
        org.junit.Assert.assertNotNull(jmsEndpoint12);
        org.junit.Assert.assertNotNull(jmsBinding16);
        org.junit.Assert.assertNotNull(jmsEndpoint17);
        org.junit.Assert.assertNotNull(jmsBinding20);
        org.junit.Assert.assertNotNull(jmsEndpoint21);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        java.lang.String str2 = camelRoutesBroker1.getRoutesFile();
        try {
            org.apache.activemq.command.ActiveMQDestination[] activeMQDestination_array3 = camelRoutesBroker1.getDestinations();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        org.apache.camel.component.jms.ConsumerType consumerType2 = null;
        activeMQConfiguration0.setConsumerType(consumerType2);
        activeMQConfiguration0.setConcurrentConsumers((int) (short) 1);
        activeMQConfiguration0.setExplicitQosEnabled(false);
        org.apache.camel.component.jms.JmsKeyFormatStrategy jmsKeyFormatStrategy8 = activeMQConfiguration0.getJmsKeyFormatStrategy();
        boolean b9 = activeMQConfiguration0.isForceSendOriginalMessage();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(jmsKeyFormatStrategy8);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        jmsComponent1.setAcknowledgementModeName("hi!");
        boolean b4 = jmsComponent1.isStarting();
        jmsComponent1.setReplyToConcurrentConsumers((int) (short) 10);
        boolean b7 = jmsComponent1.useRawUri();
        try {
            org.apache.camel.Endpoint endpoint9 = jmsComponent1.createEndpoint("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(jmsComponent1);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        boolean b3 = activeMQConfiguration0.isLazyCreateTransactionManager();
        activeMQConfiguration0.setAcknowledgementMode((int) (byte) 10);
        activeMQConfiguration0.setMaxMessagesPerTask((int) (short) 10);
        org.springframework.core.task.TaskExecutor taskExecutor8 = null;
        activeMQConfiguration0.setTaskExecutor(taskExecutor8);
        org.apache.activemq.camel.CamelQueue camelQueue11 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding12 = camelQueue11.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint13 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue11);
        org.apache.activemq.camel.CamelQueue camelQueue15 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding16 = camelQueue15.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint17 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue15);
        jmsEndpoint13.setDestination((javax.jms.Destination) camelQueue15);
        boolean b19 = jmsEndpoint13.isIncludeAllJMSXProperties();
        long long20 = jmsEndpoint13.getTimeToLive();
        org.apache.camel.component.jms.MessageListenerContainerFactory messageListenerContainerFactory21 = null;
        jmsEndpoint13.setMessageListenerContainerFactory(messageListenerContainerFactory21);
        org.apache.camel.component.jms.DefaultTaskExecutorType defaultTaskExecutorType23 = null;
        jmsEndpoint13.setDefaultTaskExecutorType(defaultTaskExecutorType23);
        org.springframework.jms.core.JmsOperations jmsOperations27 = activeMQConfiguration0.createInOnlyTemplate(jmsEndpoint13, true, "2.16.1");
        boolean b28 = activeMQConfiguration0.isPubSubNoLocal();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(jmsBinding12);
        org.junit.Assert.assertNotNull(jmsEndpoint13);
        org.junit.Assert.assertNotNull(jmsBinding16);
        org.junit.Assert.assertNotNull(jmsEndpoint17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(long20 == (-1L));
        org.junit.Assert.assertNotNull(jmsOperations27);
        org.junit.Assert.assertTrue(b28 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentClientAcknowledge(connectionFactory0);
        jmsComponent1.setAcceptMessagesWhileStopping(false);
        jmsComponent1.setPreserveMessageQos(true);
        jmsComponent1.setExplicitQosEnabled(true);
        jmsComponent1.setPreserveMessageQos(true);
        jmsComponent1.setCacheLevel((int) (byte) 0);
        org.junit.Assert.assertNotNull(jmsComponent1);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        activeMQConfiguration0.setCacheLevelName("tcp://localhost:61616");
        org.apache.camel.component.jms.ConsumerType consumerType5 = activeMQConfiguration0.getConsumerType();
        activeMQConfiguration0.setAcknowledgementModeName("");
        int i8 = activeMQConfiguration0.getIdleTaskExecutionLimit();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + consumerType5 + "' != '" + org.apache.camel.component.jms.ConsumerType.Default + "'", consumerType5.equals(org.apache.camel.component.jms.ConsumerType.Default));
        org.junit.Assert.assertTrue(i8 == 1);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.CamelContext camelContext3 = null;
        camelQueue1.setCamelContext(camelContext3);
        org.apache.activemq.camel.CamelQueue camelQueue6 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding7 = camelQueue6.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint8 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue6);
        org.apache.activemq.camel.CamelQueue camelQueue10 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding11 = camelQueue10.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint12 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue10);
        jmsEndpoint8.setDestination((javax.jms.Destination) camelQueue10);
        org.apache.activemq.camel.CamelQueue camelQueue15 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding16 = camelQueue15.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint17 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue15);
        org.apache.activemq.camel.CamelQueue camelQueue19 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding20 = camelQueue19.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint21 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue19);
        jmsEndpoint17.setDestination((javax.jms.Destination) camelQueue19);
        org.apache.activemq.ActiveMQSession activeMQSession23 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer26 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelQueue10, (org.apache.camel.Endpoint) jmsEndpoint17, activeMQSession23, "failover://tcp://localhost:61616", false);
        org.apache.activemq.ActiveMQSession activeMQSession27 = null;
        org.apache.activemq.camel.CamelQueueReceiver camelQueueReceiver29 = new org.apache.activemq.camel.CamelQueueReceiver(camelQueue1, (org.apache.camel.Endpoint) jmsEndpoint17, activeMQSession27, "queue:");
        camelQueue1.setUri("");
        org.apache.activemq.ActiveMQSession activeMQSession32 = null;
        try {
            javax.jms.QueueReceiver queueReceiver34 = camelQueue1.createReceiver(activeMQSession32, "queue:");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsBinding7);
        org.junit.Assert.assertNotNull(jmsEndpoint8);
        org.junit.Assert.assertNotNull(jmsBinding11);
        org.junit.Assert.assertNotNull(jmsEndpoint12);
        org.junit.Assert.assertNotNull(jmsBinding16);
        org.junit.Assert.assertNotNull(jmsEndpoint17);
        org.junit.Assert.assertNotNull(jmsBinding20);
        org.junit.Assert.assertNotNull(jmsEndpoint21);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        long long1 = camelConnectionFactory0.getWarnAboutUnstartedConnectionTimeout();
        camelConnectionFactory0.setAuditMaximumProducerNumber((int) (byte) 1);
        org.apache.activemq.RedeliveryPolicy redeliveryPolicy4 = null;
        camelConnectionFactory0.setRedeliveryPolicy(redeliveryPolicy4);
        org.junit.Assert.assertTrue(long1 == 500L);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        boolean b3 = activeMQConfiguration0.isErrorHandlerLogStackTrace();
        boolean b4 = activeMQConfiguration0.isPreserveMessageQos();
        int i5 = activeMQConfiguration0.getTransactionTimeout();
        int i6 = activeMQConfiguration0.getReplyToConcurrentConsumers();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(i6 == 1);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        jmsComponent1.start();
        jmsComponent1.setAcknowledgementModeName("temp:topic:");
        jmsComponent1.setIncludeAllJMSXProperties(true);
        org.junit.Assert.assertNotNull(jmsComponent1);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        boolean b9 = jmsEndpoint3.isIncludeAllJMSXProperties();
        long long10 = jmsEndpoint3.getTimeToLive();
        org.apache.camel.component.jms.MessageListenerContainerFactory messageListenerContainerFactory11 = null;
        jmsEndpoint3.setMessageListenerContainerFactory(messageListenerContainerFactory11);
        boolean b13 = jmsEndpoint3.isExplicitQosEnabled();
        boolean b14 = jmsEndpoint3.isSingleton();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(long10 == (-1L));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent1 = org.apache.activemq.camel.component.ActiveMQComponent.activeMQComponent("queue:");
        activeMQComponent1.setExposeAllQueues(false);
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy4 = activeMQComponent1.getMessageCreatedStrategy();
        org.junit.Assert.assertNotNull(activeMQComponent1);
        org.junit.Assert.assertNull(messageCreatedStrategy4);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        java.lang.String str2 = camelRoutesBroker1.getRoutesFile();
        try {
            org.apache.activemq.broker.BrokerService brokerService3 = camelRoutesBroker1.getBrokerService();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setAlwaysCopyMessage(false);
        jmsEndpoint3.setReplyToConcurrentConsumers(100);
        jmsEndpoint3.stop();
        boolean b14 = jmsEndpoint3.isLazyCreateTransactionManager();
        int i15 = jmsEndpoint3.getIdleTaskExecutionLimit();
        jmsEndpoint3.setAcknowledgementMode((int) (byte) 1);
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(i15 == 1);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        jmsEndpoint3.setReplyToDestinationSelectorName("2.16.1");
        org.apache.camel.EndpointConfiguration endpointConfiguration6 = null;
        jmsEndpoint3.setEndpointConfiguration(endpointConfiguration6);
        org.apache.camel.ExchangePattern exchangePattern8 = jmsEndpoint3.getExchangePattern();
        boolean b9 = jmsEndpoint3.isErrorHandlerLogStackTrace();
        jmsEndpoint3.setTransacted(false);
        org.apache.camel.component.jms.DefaultTaskExecutorType defaultTaskExecutorType12 = jmsEndpoint3.getDefaultTaskExecutorType();
        boolean b13 = jmsEndpoint3.isPubSubNoLocal();
        jmsEndpoint3.setPreserveMessageQos(false);
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertTrue("'" + exchangePattern8 + "' != '" + org.apache.camel.ExchangePattern.InOnly + "'", exchangePattern8.equals(org.apache.camel.ExchangePattern.InOnly));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(defaultTaskExecutorType12);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.apache.camel.CamelContext camelContext0 = null;
        org.apache.activemq.advisory.DestinationSource destinationSource1 = null;
        org.apache.activemq.camel.component.CamelEndpointLoader camelEndpointLoader2 = new org.apache.activemq.camel.component.CamelEndpointLoader(camelContext0, destinationSource1);
        org.apache.camel.CamelContext camelContext3 = camelEndpointLoader2.getCamelContext();
        try {
            org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent4 = camelEndpointLoader2.getComponent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(camelContext3);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory1 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory1.setDisableTimeStampsByDefault(true);
        java.util.Properties properties4 = camelConnectionFactory1.getProperties();
        camelConnectionFactory0.populateProperties(properties4);
        camelConnectionFactory0.setWarnAboutUnstartedConnectionTimeout((long) (short) -1);
        boolean b8 = camelConnectionFactory0.isAlwaysSyncSend();
        org.apache.activemq.ActiveMQConnectionFactory activeMQConnectionFactory9 = camelConnectionFactory0.copy();
        activeMQConnectionFactory9.setObjectMessageSerializationDefered(false);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(activeMQConnectionFactory9);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        java.lang.String str2 = camelRoutesBroker1.getRoutesFile();
        org.apache.activemq.command.BrokerInfo brokerInfo3 = null;
        try {
            camelRoutesBroker1.networkBridgeStopped(brokerInfo3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.CamelContext camelContext3 = null;
        camelQueue1.setCamelContext(camelContext3);
        org.apache.activemq.camel.CamelQueue camelQueue6 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding7 = camelQueue6.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint8 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue6);
        org.apache.activemq.camel.CamelQueue camelQueue10 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding11 = camelQueue10.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint12 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue10);
        jmsEndpoint8.setDestination((javax.jms.Destination) camelQueue10);
        org.apache.activemq.camel.CamelQueue camelQueue15 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding16 = camelQueue15.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint17 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue15);
        org.apache.activemq.camel.CamelQueue camelQueue19 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding20 = camelQueue19.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint21 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue19);
        jmsEndpoint17.setDestination((javax.jms.Destination) camelQueue19);
        org.apache.activemq.ActiveMQSession activeMQSession23 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer26 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelQueue10, (org.apache.camel.Endpoint) jmsEndpoint17, activeMQSession23, "failover://tcp://localhost:61616", false);
        org.apache.activemq.ActiveMQSession activeMQSession27 = null;
        org.apache.activemq.camel.CamelQueueReceiver camelQueueReceiver29 = new org.apache.activemq.camel.CamelQueueReceiver(camelQueue1, (org.apache.camel.Endpoint) jmsEndpoint17, activeMQSession27, "queue:");
        javax.jms.MessageListener messageListener30 = camelQueueReceiver29.getMessageListener();
        javax.jms.Queue queue31 = camelQueueReceiver29.getQueue();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsBinding7);
        org.junit.Assert.assertNotNull(jmsEndpoint8);
        org.junit.Assert.assertNotNull(jmsBinding11);
        org.junit.Assert.assertNotNull(jmsEndpoint12);
        org.junit.Assert.assertNotNull(jmsBinding16);
        org.junit.Assert.assertNotNull(jmsEndpoint17);
        org.junit.Assert.assertNotNull(jmsBinding20);
        org.junit.Assert.assertNotNull(jmsEndpoint21);
        org.junit.Assert.assertNull(messageListener30);
        org.junit.Assert.assertNotNull(queue31);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        org.apache.camel.component.jms.ConsumerType consumerType2 = null;
        activeMQConfiguration0.setConsumerType(consumerType2);
        activeMQConfiguration0.setErrorHandlerLogStackTrace(true);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        org.apache.activemq.camel.CamelQueue camelQueue10 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding11 = camelQueue10.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint12 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue10);
        org.apache.activemq.camel.CamelQueue camelQueue14 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding15 = camelQueue14.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint16 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue14);
        jmsEndpoint12.setDestination((javax.jms.Destination) camelQueue14);
        org.apache.activemq.ActiveMQSession activeMQSession18 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer21 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelQueue5, (org.apache.camel.Endpoint) jmsEndpoint12, activeMQSession18, "failover://tcp://localhost:61616", false);
        jmsEndpoint12.setAcknowledgementModeName("hi!");
        jmsEndpoint12.setLazyCreateTransactionManager(false);
        jmsEndpoint12.setDisableTimeToLive(false);
        org.apache.camel.component.jms.DefaultTaskExecutorType defaultTaskExecutorType28 = null;
        jmsEndpoint12.setDefaultTaskExecutorType(defaultTaskExecutorType28);
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNotNull(jmsBinding11);
        org.junit.Assert.assertNotNull(jmsEndpoint12);
        org.junit.Assert.assertNotNull(jmsBinding15);
        org.junit.Assert.assertNotNull(jmsEndpoint16);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setAlwaysCopyMessage(false);
        org.springframework.jms.support.converter.MessageConverter messageConverter11 = jmsEndpoint3.getMessageConverter();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNull(messageConverter11);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.CamelContext camelContext3 = null;
        camelQueue1.setCamelContext(camelContext3);
        org.apache.activemq.camel.CamelQueue camelQueue6 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding7 = camelQueue6.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint8 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue6);
        org.apache.activemq.camel.CamelQueue camelQueue10 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding11 = camelQueue10.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint12 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue10);
        jmsEndpoint8.setDestination((javax.jms.Destination) camelQueue10);
        org.apache.activemq.camel.CamelQueue camelQueue15 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding16 = camelQueue15.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint17 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue15);
        org.apache.activemq.camel.CamelQueue camelQueue19 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding20 = camelQueue19.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint21 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue19);
        jmsEndpoint17.setDestination((javax.jms.Destination) camelQueue19);
        org.apache.activemq.ActiveMQSession activeMQSession23 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer26 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelQueue10, (org.apache.camel.Endpoint) jmsEndpoint17, activeMQSession23, "failover://tcp://localhost:61616", false);
        org.apache.activemq.ActiveMQSession activeMQSession27 = null;
        org.apache.activemq.camel.CamelQueueReceiver camelQueueReceiver29 = new org.apache.activemq.camel.CamelQueueReceiver(camelQueue1, (org.apache.camel.Endpoint) jmsEndpoint17, activeMQSession27, "queue:");
        camelQueue1.setUri("");
        org.apache.activemq.ActiveMQSession activeMQSession32 = null;
        try {
            javax.jms.MessageProducer messageProducer33 = camelQueue1.createProducer(activeMQSession32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsBinding7);
        org.junit.Assert.assertNotNull(jmsEndpoint8);
        org.junit.Assert.assertNotNull(jmsBinding11);
        org.junit.Assert.assertNotNull(jmsEndpoint12);
        org.junit.Assert.assertNotNull(jmsBinding16);
        org.junit.Assert.assertNotNull(jmsEndpoint17);
        org.junit.Assert.assertNotNull(jmsBinding20);
        org.junit.Assert.assertNotNull(jmsEndpoint21);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        java.lang.String str2 = camelRoutesBroker1.getRoutesFile();
        int i3 = camelRoutesBroker1.getCheckPeriod();
        try {
            java.util.Set<org.apache.activemq.command.ActiveMQDestination> set_activeMQDestination4 = camelRoutesBroker1.getDurableDestinations();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 1000);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        org.apache.activemq.camel.CamelQueue camelQueue10 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding11 = camelQueue10.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint12 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue10);
        org.apache.activemq.camel.CamelQueue camelQueue14 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding15 = camelQueue14.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint16 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue14);
        jmsEndpoint12.setDestination((javax.jms.Destination) camelQueue14);
        org.apache.activemq.ActiveMQSession activeMQSession18 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer21 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelQueue5, (org.apache.camel.Endpoint) jmsEndpoint12, activeMQSession18, "failover://tcp://localhost:61616", false);
        org.springframework.jms.core.JmsOperations jmsOperations22 = jmsEndpoint12.getJmsOperations();
        jmsEndpoint12.setTimeToLive((long) 0);
        jmsEndpoint12.setPreserveMessageQos(false);
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNotNull(jmsBinding11);
        org.junit.Assert.assertNotNull(jmsEndpoint12);
        org.junit.Assert.assertNotNull(jmsBinding15);
        org.junit.Assert.assertNotNull(jmsEndpoint16);
        org.junit.Assert.assertNull(jmsOperations22);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        activeMQConfiguration0.setCacheLevelName("tcp://localhost:61616");
        boolean b5 = activeMQConfiguration0.isExplicitQosEnabled();
        activeMQConfiguration0.setCacheLevel((int) (byte) 1);
        java.lang.String str8 = activeMQConfiguration0.getBrokerURL();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "failover://tcp://localhost:61616" + "'", str8.equals("failover://tcp://localhost:61616"));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        boolean b3 = activeMQConfiguration0.isErrorHandlerLogStackTrace();
        boolean b4 = activeMQConfiguration0.isMessageTimestampEnabled();
        javax.jms.ConnectionFactory connectionFactory5 = activeMQConfiguration0.getTemplateConnectionFactory();
        boolean b6 = activeMQConfiguration0.isLazyCreateTransactionManager();
        org.apache.camel.component.jms.ConsumerType consumerType7 = activeMQConfiguration0.getConsumerType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(connectionFactory5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + consumerType7 + "' != '" + org.apache.camel.component.jms.ConsumerType.Default + "'", consumerType7.equals(org.apache.camel.component.jms.ConsumerType.Default));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentClientAcknowledge(connectionFactory0);
        jmsComponent1.setReplyToConcurrentConsumers((int) (byte) -1);
        jmsComponent1.setDurableSubscriptionName("");
        org.apache.camel.spi.HeaderFilterStrategy headerFilterStrategy6 = jmsComponent1.getHeaderFilterStrategy();
        jmsComponent1.setIdleTaskExecutionLimit((int) (short) 100);
        org.junit.Assert.assertNotNull(jmsComponent1);
        org.junit.Assert.assertNull(headerFilterStrategy6);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.apache.activemq.camel.component.broker.BrokerComponent brokerComponent0 = new org.apache.activemq.camel.component.broker.BrokerComponent();
        org.apache.camel.ComponentConfiguration componentConfiguration1 = null;
        try {
            java.util.List<java.lang.String> list_str3 = brokerComponent0.completeEndpointPath(componentConfiguration1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        org.apache.camel.component.jms.ConsumerType consumerType2 = null;
        activeMQConfiguration0.setConsumerType(consumerType2);
        activeMQConfiguration0.setConcurrentConsumers((int) (short) 1);
        activeMQConfiguration0.setLazyCreateTransactionManager(false);
        long long8 = activeMQConfiguration0.getRequestTimeout();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(long8 == 20000L);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        org.apache.activemq.camel.CamelQueue camelQueue10 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding11 = camelQueue10.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint12 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue10);
        org.apache.activemq.camel.CamelQueue camelQueue14 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding15 = camelQueue14.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint16 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue14);
        jmsEndpoint12.setDestination((javax.jms.Destination) camelQueue14);
        org.apache.activemq.ActiveMQSession activeMQSession18 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer21 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelQueue5, (org.apache.camel.Endpoint) jmsEndpoint12, activeMQSession18, "failover://tcp://localhost:61616", false);
        boolean b22 = jmsEndpoint12.isStarting();
        org.springframework.jms.core.JmsOperations jmsOperations23 = null;
        jmsEndpoint12.setMetadataJmsOperations(jmsOperations23);
        org.apache.camel.component.jms.JmsKeyFormatStrategy jmsKeyFormatStrategy25 = null;
        jmsEndpoint12.setJmsKeyFormatStrategy(jmsKeyFormatStrategy25);
        org.springframework.transaction.PlatformTransactionManager platformTransactionManager27 = null;
        jmsEndpoint12.setTransactionManager(platformTransactionManager27);
        jmsEndpoint12.setTransactedInOut(true);
        jmsEndpoint12.setMaxMessagesPerTask(64);
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNotNull(jmsBinding11);
        org.junit.Assert.assertNotNull(jmsEndpoint12);
        org.junit.Assert.assertNotNull(jmsBinding15);
        org.junit.Assert.assertNotNull(jmsEndpoint16);
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setAlwaysCopyMessage(false);
        jmsEndpoint3.setReplyToConcurrentConsumers(100);
        jmsEndpoint3.stop();
        try {
            org.springframework.jms.core.JmsOperations jmsOperations14 = jmsEndpoint3.createInOutTemplate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.apache.activemq.camel.component.broker.BrokerConfiguration brokerConfiguration0 = new org.apache.activemq.camel.component.broker.BrokerConfiguration();
        brokerConfiguration0.setBrokerName("2.16.1");
        java.lang.String str3 = brokerConfiguration0.getBrokerName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "2.16.1" + "'", str3.equals("2.16.1"));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        org.apache.activemq.camel.CamelQueue camelQueue10 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding11 = camelQueue10.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint12 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue10);
        org.apache.activemq.camel.CamelQueue camelQueue14 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding15 = camelQueue14.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint16 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue14);
        jmsEndpoint12.setDestination((javax.jms.Destination) camelQueue14);
        org.apache.activemq.ActiveMQSession activeMQSession18 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer21 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelQueue5, (org.apache.camel.Endpoint) jmsEndpoint12, activeMQSession18, "failover://tcp://localhost:61616", false);
        boolean b22 = jmsEndpoint12.isAlwaysCopyMessage();
        java.lang.String str23 = jmsEndpoint12.getTransactionName();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNotNull(jmsBinding11);
        org.junit.Assert.assertNotNull(jmsEndpoint12);
        org.junit.Assert.assertNotNull(jmsBinding15);
        org.junit.Assert.assertNotNull(jmsEndpoint16);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        org.apache.activemq.camel.CamelQueue camelQueue10 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding11 = camelQueue10.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint12 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue10);
        org.apache.activemq.camel.CamelQueue camelQueue14 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding15 = camelQueue14.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint16 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue14);
        jmsEndpoint12.setDestination((javax.jms.Destination) camelQueue14);
        org.apache.activemq.ActiveMQSession activeMQSession18 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer21 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelQueue5, (org.apache.camel.Endpoint) jmsEndpoint12, activeMQSession18, "failover://tcp://localhost:61616", false);
        org.springframework.jms.core.JmsOperations jmsOperations22 = jmsEndpoint12.getJmsOperations();
        org.springframework.jms.support.destination.DestinationResolver destinationResolver23 = null;
        jmsEndpoint12.setDestinationResolver(destinationResolver23);
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNotNull(jmsBinding11);
        org.junit.Assert.assertNotNull(jmsEndpoint12);
        org.junit.Assert.assertNotNull(jmsBinding15);
        org.junit.Assert.assertNotNull(jmsEndpoint16);
        org.junit.Assert.assertNull(jmsOperations22);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        jmsComponent1.setMaxMessagesPerTask((int) (short) 100);
        jmsComponent1.setDeliveryMode((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(jmsComponent1);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        long long1 = camelConnectionFactory0.getWarnAboutUnstartedConnectionTimeout();
        boolean b2 = camelConnectionFactory0.isMessagePrioritySupported();
        boolean b3 = camelConnectionFactory0.isCheckForDuplicates();
        java.lang.String str4 = camelConnectionFactory0.getClientIDPrefix();
        boolean b5 = camelConnectionFactory0.isNonBlockingRedelivery();
        org.junit.Assert.assertTrue(long1 == 500L);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        org.apache.activemq.camel.CamelQueue camelQueue10 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding11 = camelQueue10.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint12 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue10);
        org.apache.activemq.camel.CamelQueue camelQueue14 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding15 = camelQueue14.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint16 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue14);
        jmsEndpoint12.setDestination((javax.jms.Destination) camelQueue14);
        org.apache.activemq.ActiveMQSession activeMQSession18 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer21 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelQueue5, (org.apache.camel.Endpoint) jmsEndpoint12, activeMQSession18, "failover://tcp://localhost:61616", false);
        jmsEndpoint12.setAcknowledgementModeName("hi!");
        jmsEndpoint12.setLazyCreateTransactionManager(false);
        jmsEndpoint12.setDisableTimeToLive(false);
        jmsEndpoint12.setDurableSubscriptionName("queue:");
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNotNull(jmsBinding11);
        org.junit.Assert.assertNotNull(jmsEndpoint12);
        org.junit.Assert.assertNotNull(jmsBinding15);
        org.junit.Assert.assertNotNull(jmsEndpoint16);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        java.lang.String str2 = camelRoutesBroker1.getRoutesFile();
        int i3 = camelRoutesBroker1.getCheckPeriod();
        org.apache.activemq.broker.ConnectionContext connectionContext4 = null;
        try {
            org.apache.activemq.command.TransactionId[] transactionId_array5 = camelRoutesBroker1.getPreparedTransactions(connectionContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 1000);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.apache.camel.component.jms.JmsComponent jmsComponent0 = org.apache.camel.component.jms.JmsComponent.jmsComponent();
        try {
            jmsComponent0.setJmsKeyFormatStrategy("queue:");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(jmsComponent0);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        boolean b3 = activeMQConfiguration0.isErrorHandlerLogStackTrace();
        boolean b4 = activeMQConfiguration0.isPreserveMessageQos();
        int i5 = activeMQConfiguration0.getTransactionTimeout();
        activeMQConfiguration0.setMessageIdEnabled(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i5 == (-1));
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        jmsComponent1.setTransactionTimeout((int) (short) -1);
        jmsComponent1.setAsyncConsumer(true);
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration6 = jmsComponent1.getConfiguration();
        int i7 = jmsConfiguration6.getConcurrentConsumers();
        org.apache.camel.component.jms.ReplyToType replyToType8 = jmsConfiguration6.getReplyToType();
        org.junit.Assert.assertNotNull(jmsComponent1);
        org.junit.Assert.assertNotNull(jmsConfiguration6);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNull(replyToType8);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory1 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory1.setDisableTimeStampsByDefault(true);
        java.util.Properties properties4 = camelConnectionFactory1.getProperties();
        camelConnectionFactory0.populateProperties(properties4);
        org.apache.activemq.MessageTransformer messageTransformer6 = camelConnectionFactory0.getTransformer();
        boolean b7 = camelConnectionFactory0.isNestedMapAndListEnabled();
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(messageTransformer6);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.apache.activemq.ActiveMQConnection.DEFAULT_THREAD_POOL_SIZE = (byte) 1;
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setAlwaysCopyMessage(false);
        jmsEndpoint3.setReplyToConcurrentConsumers(100);
        boolean b13 = jmsEndpoint3.isDeliveryPersistent();
        jmsEndpoint3.setDisableReplyTo(false);
        boolean b16 = jmsEndpoint3.isPreserveMessageQos();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        boolean b9 = jmsEndpoint3.isIncludeAllJMSXProperties();
        java.lang.String str10 = jmsEndpoint3.getSelector();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        activeMQConfiguration0.setPriority((int) (short) 100);
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy4 = activeMQConfiguration0.getMessageCreatedStrategy();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(messageCreatedStrategy4);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentClientAcknowledge(connectionFactory0);
        jmsComponent1.setAcceptMessagesWhileStopping(false);
        jmsComponent1.setPreserveMessageQos(true);
        jmsComponent1.setMapJmsMessage(false);
        boolean b8 = jmsComponent1.isStarted();
        org.junit.Assert.assertNotNull(jmsComponent1);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setIncludeSentJMSMessageID(false);
        org.springframework.util.ErrorHandler errorHandler3 = null;
        activeMQComponent0.setErrorHandler(errorHandler3);
        activeMQComponent0.setPubSubNoLocal(false);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDisableReplyTo(true);
        org.apache.camel.spi.HeaderFilterStrategy headerFilterStrategy11 = null;
        jmsEndpoint3.setHeaderFilterStrategy(headerFilterStrategy11);
        boolean b13 = jmsEndpoint3.isPollingConsumerBlockWhenFull();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        boolean b3 = activeMQConfiguration0.isLazyCreateTransactionManager();
        activeMQConfiguration0.setAcknowledgementMode((int) (byte) 10);
        activeMQConfiguration0.setMaxMessagesPerTask((int) (short) 10);
        org.springframework.jms.support.destination.DestinationResolver destinationResolver8 = null;
        activeMQConfiguration0.setDestinationResolver(destinationResolver8);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        boolean b3 = activeMQConfiguration0.isMessageIdEnabled();
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        org.apache.activemq.camel.CamelQueue camelQueue9 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding10 = camelQueue9.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint11 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue9);
        jmsEndpoint7.setDestination((javax.jms.Destination) camelQueue9);
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration13 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str14 = activeMQConfiguration13.getReplyTo();
        boolean b15 = activeMQConfiguration13.isPubSubNoLocal();
        boolean b16 = activeMQConfiguration13.isLazyCreateTransactionManager();
        activeMQConfiguration13.setAcknowledgementMode((int) (byte) 10);
        activeMQConfiguration13.setMaxMessagesPerTask((int) (short) 10);
        org.springframework.core.task.TaskExecutor taskExecutor21 = null;
        activeMQConfiguration13.setTaskExecutor(taskExecutor21);
        org.apache.activemq.camel.CamelQueue camelQueue24 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding25 = camelQueue24.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint26 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue24);
        org.apache.activemq.camel.CamelQueue camelQueue28 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding29 = camelQueue28.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint30 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue28);
        jmsEndpoint26.setDestination((javax.jms.Destination) camelQueue28);
        boolean b32 = jmsEndpoint26.isIncludeAllJMSXProperties();
        long long33 = jmsEndpoint26.getTimeToLive();
        org.apache.camel.component.jms.MessageListenerContainerFactory messageListenerContainerFactory34 = null;
        jmsEndpoint26.setMessageListenerContainerFactory(messageListenerContainerFactory34);
        org.apache.camel.component.jms.DefaultTaskExecutorType defaultTaskExecutorType36 = null;
        jmsEndpoint26.setDefaultTaskExecutorType(defaultTaskExecutorType36);
        org.springframework.jms.core.JmsOperations jmsOperations40 = activeMQConfiguration13.createInOnlyTemplate(jmsEndpoint26, true, "2.16.1");
        jmsEndpoint7.setJmsOperations(jmsOperations40);
        activeMQConfiguration0.setJmsOperations(jmsOperations40);
        org.apache.camel.component.jms.EndpointMessageListener endpointMessageListener43 = null;
        try {
            activeMQConfiguration0.configureMessageListener(endpointMessageListener43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNotNull(jmsBinding10);
        org.junit.Assert.assertNotNull(jmsEndpoint11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(jmsBinding25);
        org.junit.Assert.assertNotNull(jmsEndpoint26);
        org.junit.Assert.assertNotNull(jmsBinding29);
        org.junit.Assert.assertNotNull(jmsEndpoint30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(long33 == (-1L));
        org.junit.Assert.assertNotNull(jmsOperations40);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        long long3 = activeMQConfiguration0.getRequestTimeout();
        boolean b4 = activeMQConfiguration0.isReplyToSameDestinationAllowed();
        java.lang.String str5 = activeMQConfiguration0.getClientId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(long3 == 20000L);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent1 = org.apache.activemq.camel.component.ActiveMQComponent.activeMQComponent("2.16.1");
        activeMQComponent1.setAutoStartup(false);
        activeMQComponent1.setDurableSubscriptionName("temp:topic:");
        org.junit.Assert.assertNotNull(activeMQComponent1);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        activeMQConfiguration0.setCacheLevelName("tcp://localhost:61616");
        boolean b5 = activeMQConfiguration0.isAcceptMessagesWhileStopping();
        activeMQConfiguration0.setUseSingleConnection(false);
        java.lang.String str8 = activeMQConfiguration0.getBrokerURL();
        boolean b9 = activeMQConfiguration0.isEagerLoadingOfProperties();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "failover://tcp://localhost:61616" + "'", str8.equals("failover://tcp://localhost:61616"));
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        boolean b9 = jmsEndpoint3.isIncludeAllJMSXProperties();
        long long10 = jmsEndpoint3.getTimeToLive();
        org.apache.camel.component.jms.MessageListenerContainerFactory messageListenerContainerFactory11 = null;
        jmsEndpoint3.setMessageListenerContainerFactory(messageListenerContainerFactory11);
        boolean b13 = jmsEndpoint3.isExplicitQosEnabled();
        jmsEndpoint3.setIncludeSentJMSMessageID(true);
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(long10 == (-1L));
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory0.setExclusiveConsumer(false);
        java.util.concurrent.RejectedExecutionHandler rejectedExecutionHandler3 = camelConnectionFactory0.getRejectedTaskHandler();
        org.apache.activemq.ClientInternalExceptionListener clientInternalExceptionListener4 = camelConnectionFactory0.getClientInternalExceptionListener();
        org.junit.Assert.assertNull(rejectedExecutionHandler3);
        org.junit.Assert.assertNull(clientInternalExceptionListener4);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        jmsComponent1.setAcknowledgementModeName("hi!");
        jmsComponent1.setAlwaysCopyMessage(true);
        jmsComponent1.setAllowNullBody(true);
        jmsComponent1.setIdleTaskExecutionLimit((int) '#');
        org.junit.Assert.assertNotNull(jmsComponent1);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentClientAcknowledge(connectionFactory0);
        jmsComponent1.setAcceptMessagesWhileStopping(false);
        jmsComponent1.setPreserveMessageQos(true);
        jmsComponent1.setExplicitQosEnabled(true);
        boolean b8 = jmsComponent1.isStarting();
        jmsComponent1.setAcknowledgementMode((int) (short) 100);
        jmsComponent1.setPreserveMessageQos(true);
        org.springframework.transaction.PlatformTransactionManager platformTransactionManager13 = null;
        jmsComponent1.setTransactionManager(platformTransactionManager13);
        org.junit.Assert.assertNotNull(jmsComponent1);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.CamelContext camelContext3 = null;
        camelQueue1.setCamelContext(camelContext3);
        org.apache.activemq.ActiveMQSession activeMQSession5 = null;
        try {
            javax.jms.QueueSender queueSender6 = camelQueue1.createSender(activeMQSession5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(jmsBinding2);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        java.lang.String str0 = org.apache.camel.component.jms.JmsConfiguration.TOPIC_PREFIX;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "topic:" + "'", str0.equals("topic:"));
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        activeMQConfiguration0.setCacheLevelName("tcp://localhost:61616");
        activeMQConfiguration0.setAcknowledgementMode((int) (byte) 0);
        org.apache.camel.component.jms.ReplyToType replyToType7 = null;
        activeMQConfiguration0.setReplyToType(replyToType7);
        activeMQConfiguration0.setDisableReplyTo(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        try {
            org.apache.activemq.ActiveMQConnection activeMQConnection1 = org.apache.activemq.ActiveMQConnection.makeConnection("queue:");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setAlwaysCopyMessage(false);
        boolean b11 = jmsEndpoint3.isPubSubDomain();
        jmsEndpoint3.setDestinationType("queue:");
        org.apache.camel.component.jms.JmsComponent jmsComponent14 = jmsEndpoint3.getComponent();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(jmsComponent14);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        boolean b9 = jmsEndpoint3.isIncludeAllJMSXProperties();
        org.apache.camel.component.jms.JmsMessageType jmsMessageType10 = jmsEndpoint3.getJmsMessageType();
        jmsEndpoint3.stop();
        org.apache.activemq.camel.CamelQueue camelQueue13 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding14 = camelQueue13.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint15 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue13);
        org.apache.activemq.camel.CamelQueue camelQueue17 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding18 = camelQueue17.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint19 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue17);
        jmsEndpoint15.setDestination((javax.jms.Destination) camelQueue17);
        jmsEndpoint15.setDisableReplyTo(true);
        org.apache.camel.spi.HeaderFilterStrategy headerFilterStrategy23 = null;
        jmsEndpoint15.setHeaderFilterStrategy(headerFilterStrategy23);
        jmsEndpoint15.setTransactionTimeout((int) ' ');
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration27 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str28 = activeMQConfiguration27.getReplyTo();
        activeMQConfiguration27.setPriority((int) (short) 100);
        activeMQConfiguration27.setTransferException(false);
        boolean b33 = activeMQConfiguration27.isReplyToSameDestinationAllowed();
        activeMQConfiguration27.setPassword("hi!");
        activeMQConfiguration27.setAsyncStartListener(false);
        org.apache.activemq.camel.CamelQueue camelQueue39 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding40 = camelQueue39.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint41 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue39);
        org.apache.activemq.camel.CamelQueue camelQueue43 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding44 = camelQueue43.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint45 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue43);
        jmsEndpoint41.setDestination((javax.jms.Destination) camelQueue43);
        org.apache.activemq.camel.CamelQueue camelQueue48 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding49 = camelQueue48.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint50 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue48);
        org.apache.activemq.camel.CamelQueue camelQueue52 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding53 = camelQueue52.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint54 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue52);
        jmsEndpoint50.setDestination((javax.jms.Destination) camelQueue52);
        org.apache.activemq.ActiveMQSession activeMQSession56 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer59 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelQueue43, (org.apache.camel.Endpoint) jmsEndpoint50, activeMQSession56, "failover://tcp://localhost:61616", false);
        boolean b60 = jmsEndpoint50.isStarting();
        org.springframework.jms.core.JmsOperations jmsOperations61 = null;
        jmsEndpoint50.setMetadataJmsOperations(jmsOperations61);
        org.apache.camel.component.jms.JmsKeyFormatStrategy jmsKeyFormatStrategy63 = null;
        jmsEndpoint50.setJmsKeyFormatStrategy(jmsKeyFormatStrategy63);
        int i65 = jmsEndpoint50.getPollingConsumerQueueSize();
        org.springframework.jms.listener.AbstractMessageListenerContainer abstractMessageListenerContainer66 = activeMQConfiguration27.createMessageListenerContainer(jmsEndpoint50);
        jmsEndpoint15.onListenerContainerStopped(abstractMessageListenerContainer66);
        org.apache.camel.component.jms.JmsConsumer jmsConsumer68 = null;
        try {
            jmsEndpoint3.configureListenerContainer(abstractMessageListenerContainer66, jmsConsumer68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(jmsMessageType10);
        org.junit.Assert.assertNotNull(jmsBinding14);
        org.junit.Assert.assertNotNull(jmsEndpoint15);
        org.junit.Assert.assertNotNull(jmsBinding18);
        org.junit.Assert.assertNotNull(jmsEndpoint19);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(jmsBinding40);
        org.junit.Assert.assertNotNull(jmsEndpoint41);
        org.junit.Assert.assertNotNull(jmsBinding44);
        org.junit.Assert.assertNotNull(jmsEndpoint45);
        org.junit.Assert.assertNotNull(jmsBinding49);
        org.junit.Assert.assertNotNull(jmsEndpoint50);
        org.junit.Assert.assertNotNull(jmsBinding53);
        org.junit.Assert.assertNotNull(jmsEndpoint54);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue(i65 == 1000);
        org.junit.Assert.assertNotNull(abstractMessageListenerContainer66);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        java.lang.String str2 = camelRoutesBroker1.getRoutesFile();
        org.apache.activemq.broker.Connection connection3 = null;
        org.apache.activemq.command.BrokerInfo brokerInfo4 = null;
        try {
            camelRoutesBroker1.removeBroker(connection3, brokerInfo4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        jmsComponent1.setTransactionTimeout((int) (short) -1);
        org.springframework.jms.core.JmsOperations jmsOperations4 = null;
        jmsComponent1.setJmsOperations(jmsOperations4);
        jmsComponent1.setMapJmsMessage(false);
        org.apache.camel.spi.HeaderFilterStrategy headerFilterStrategy8 = jmsComponent1.getHeaderFilterStrategy();
        org.junit.Assert.assertNotNull(jmsComponent1);
        org.junit.Assert.assertNull(headerFilterStrategy8);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        java.lang.String str2 = camelRoutesBroker1.getRoutesFile();
        int i3 = camelRoutesBroker1.getCheckPeriod();
        camelRoutesBroker1.setRoutesFile("hi!");
        try {
            long long6 = camelRoutesBroker1.getBrokerSequenceId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 1000);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentClientAcknowledge(connectionFactory0);
        jmsComponent1.setAcceptMessagesWhileStopping(false);
        jmsComponent1.setIdleConsumerLimit((int) (byte) 100);
        jmsComponent1.setExplicitQosEnabled(true);
        org.junit.Assert.assertNotNull(jmsComponent1);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentClientAcknowledge(connectionFactory0);
        jmsComponent1.setReplyToConcurrentConsumers((int) (byte) -1);
        jmsComponent1.setLazyCreateTransactionManager(false);
        java.lang.Class<? extends org.apache.camel.Endpoint> cls6 = jmsComponent1.getEndpointClass();
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy7 = jmsComponent1.getMessageCreatedStrategy();
        org.junit.Assert.assertNotNull(jmsComponent1);
        org.junit.Assert.assertNotNull(cls6);
        org.junit.Assert.assertNull(messageCreatedStrategy7);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        boolean b3 = activeMQConfiguration0.isErrorHandlerLogStackTrace();
        boolean b4 = activeMQConfiguration0.isMessageTimestampEnabled();
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy5 = activeMQConfiguration0.getMessageCreatedStrategy();
        activeMQConfiguration0.setReplyToCacheLevelName("");
        activeMQConfiguration0.setTransferException(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(messageCreatedStrategy5);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        java.lang.String str2 = camelRoutesBroker1.getRoutesFile();
        try {
            org.apache.activemq.store.PListStore pListStore3 = camelRoutesBroker1.getTempDataStore();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        java.lang.String str2 = camelRoutesBroker1.getRoutesFile();
        int i3 = camelRoutesBroker1.getCheckPeriod();
        org.apache.activemq.broker.ConnectionContext connectionContext4 = null;
        org.apache.activemq.command.ProducerInfo producerInfo5 = null;
        try {
            camelRoutesBroker1.removeProducer(connectionContext4, producerInfo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 1000);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        boolean b4 = jmsEndpoint3.isPubSubNoLocal();
        jmsEndpoint3.setTimeToLive((long) (byte) 1);
        boolean b7 = jmsEndpoint3.isDeliveryPersistent();
        javax.jms.ConnectionFactory connectionFactory8 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent9 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory8);
        jmsComponent9.setTransactionTimeout((int) (short) -1);
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration12 = jmsComponent9.getConfiguration();
        org.apache.camel.component.jms.JmsKeyFormatStrategy jmsKeyFormatStrategy13 = jmsConfiguration12.getJmsKeyFormatStrategy();
        jmsEndpoint3.setJmsKeyFormatStrategy(jmsKeyFormatStrategy13);
        java.lang.String str15 = jmsEndpoint3.getId();
        boolean b16 = jmsEndpoint3.isDisableTimeToLive();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(jmsComponent9);
        org.junit.Assert.assertNotNull(jmsConfiguration12);
        org.junit.Assert.assertNotNull(jmsKeyFormatStrategy13);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "endpoint1130" + "'", str15.equals("endpoint1130"));
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setAlwaysCopyMessage(false);
        jmsEndpoint3.setReplyToConcurrentConsumers(100);
        jmsEndpoint3.stop();
        jmsEndpoint3.stop();
        int i15 = jmsEndpoint3.getTransactionTimeout();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertTrue(i15 == (-1));
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        org.apache.activemq.camel.CamelQueue camelQueue10 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding11 = camelQueue10.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint12 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue10);
        org.apache.activemq.camel.CamelQueue camelQueue14 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding15 = camelQueue14.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint16 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue14);
        jmsEndpoint12.setDestination((javax.jms.Destination) camelQueue14);
        org.apache.activemq.ActiveMQSession activeMQSession18 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer21 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelQueue5, (org.apache.camel.Endpoint) jmsEndpoint12, activeMQSession18, "failover://tcp://localhost:61616", false);
        jmsEndpoint12.setIncludeAllJMSXProperties(true);
        java.lang.String str24 = jmsEndpoint12.getClientId();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNotNull(jmsBinding11);
        org.junit.Assert.assertNotNull(jmsEndpoint12);
        org.junit.Assert.assertNotNull(jmsBinding15);
        org.junit.Assert.assertNotNull(jmsEndpoint16);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        java.lang.String str2 = camelRoutesBroker1.getRoutesFile();
        int i3 = camelRoutesBroker1.getCheckPeriod();
        try {
            camelRoutesBroker1.reapplyInterceptor();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 1000);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        boolean b2 = jmsComponent1.useRawUri();
        jmsComponent1.setAcknowledgementModeName("failover://tcp://localhost:61616");
        jmsComponent1.setErrorHandlerLogStackTrace(false);
        org.junit.Assert.assertNotNull(jmsComponent1);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        org.apache.activemq.camel.CamelQueue camelQueue10 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding11 = camelQueue10.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint12 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue10);
        org.apache.activemq.camel.CamelQueue camelQueue14 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding15 = camelQueue14.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint16 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue14);
        jmsEndpoint12.setDestination((javax.jms.Destination) camelQueue14);
        org.apache.activemq.ActiveMQSession activeMQSession18 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer21 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelQueue5, (org.apache.camel.Endpoint) jmsEndpoint12, activeMQSession18, "failover://tcp://localhost:61616", false);
        boolean b22 = jmsEndpoint12.isStarting();
        org.springframework.jms.core.JmsOperations jmsOperations23 = null;
        jmsEndpoint12.setMetadataJmsOperations(jmsOperations23);
        org.apache.camel.component.jms.JmsKeyFormatStrategy jmsKeyFormatStrategy25 = null;
        jmsEndpoint12.setJmsKeyFormatStrategy(jmsKeyFormatStrategy25);
        jmsEndpoint12.setRecoveryInterval((long) 1000);
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNotNull(jmsBinding11);
        org.junit.Assert.assertNotNull(jmsEndpoint12);
        org.junit.Assert.assertNotNull(jmsBinding15);
        org.junit.Assert.assertNotNull(jmsEndpoint16);
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        org.apache.activemq.broker.ConnectionContext connectionContext2 = null;
        org.apache.activemq.command.DestinationInfo destinationInfo3 = null;
        try {
            camelRoutesBroker1.addDestinationInfo(connectionContext2, destinationInfo3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory0.setObjectMessageSerializationDefered(true);
        camelConnectionFactory0.setSendTimeout((int) 'a');
        camelConnectionFactory0.setDisableTimeStampsByDefault(false);
        org.apache.activemq.RedeliveryPolicy redeliveryPolicy7 = camelConnectionFactory0.getRedeliveryPolicy();
        camelConnectionFactory0.setStatsEnabled(false);
        org.junit.Assert.assertNotNull(redeliveryPolicy7);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        org.apache.activemq.camel.CamelQueue camelQueue10 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding11 = camelQueue10.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint12 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue10);
        org.apache.activemq.camel.CamelQueue camelQueue14 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding15 = camelQueue14.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint16 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue14);
        jmsEndpoint12.setDestination((javax.jms.Destination) camelQueue14);
        org.apache.activemq.ActiveMQSession activeMQSession18 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer21 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelQueue5, (org.apache.camel.Endpoint) jmsEndpoint12, activeMQSession18, "failover://tcp://localhost:61616", false);
        jmsEndpoint12.setAcknowledgementModeName("hi!");
        jmsEndpoint12.setLazyCreateTransactionManager(false);
        jmsEndpoint12.setDisableTimeToLive(false);
        java.lang.String str28 = jmsEndpoint12.getReplyTo();
        boolean b29 = jmsEndpoint12.isDisableReplyTo();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNotNull(jmsBinding11);
        org.junit.Assert.assertNotNull(jmsEndpoint12);
        org.junit.Assert.assertNotNull(jmsBinding15);
        org.junit.Assert.assertNotNull(jmsEndpoint16);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        java.lang.String str2 = camelRoutesBroker1.getRoutesFile();
        int i3 = camelRoutesBroker1.getCheckPeriod();
        camelRoutesBroker1.setRoutesFile("hi!");
        org.apache.activemq.command.ActiveMQDestination activeMQDestination7 = org.apache.activemq.camel.converter.ActiveMQConverter.toDestination("failover://tcp://localhost:61616");
        try {
            java.util.Map<org.apache.activemq.command.ActiveMQDestination, org.apache.activemq.broker.region.Destination> map_activeMQDestination_destination8 = camelRoutesBroker1.getDestinationMap(activeMQDestination7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 1000);
        org.junit.Assert.assertNotNull(activeMQDestination7);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = new org.apache.activemq.camel.component.ActiveMQComponent();
        activeMQComponent0.setRequestTimeout(100L);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        jmsEndpoint3.setReplyToDestinationSelectorName("2.16.1");
        jmsEndpoint3.setIncludeAllJMSXProperties(false);
        jmsEndpoint3.setDeliveryPersistent(false);
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        boolean b9 = jmsEndpoint3.isIncludeAllJMSXProperties();
        long long10 = jmsEndpoint3.getTimeToLive();
        org.apache.camel.component.jms.MessageListenerContainerFactory messageListenerContainerFactory11 = null;
        jmsEndpoint3.setMessageListenerContainerFactory(messageListenerContainerFactory11);
        boolean b13 = jmsEndpoint3.isExplicitQosEnabled();
        boolean b14 = jmsEndpoint3.isAllowNullBody();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(long10 == (-1L));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.activemq.ActiveMQSession activeMQSession2 = null;
        try {
            javax.jms.MessageConsumer messageConsumer5 = camelQueue1.createConsumer(activeMQSession2, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory1 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory1.setDisableTimeStampsByDefault(true);
        java.util.Properties properties4 = camelConnectionFactory1.getProperties();
        camelConnectionFactory0.populateProperties(properties4);
        javax.jms.TopicConnection topicConnection8 = camelConnectionFactory0.createTopicConnection("queue:", "tcp://localhost:61616");
        boolean b9 = camelConnectionFactory0.isUseRetroactiveConsumer();
        camelConnectionFactory0.setBeanName("2.16.1");
        boolean b12 = camelConnectionFactory0.isUseAsyncSend();
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNotNull(topicConnection8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        org.apache.activemq.camel.CamelQueue camelQueue10 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding11 = camelQueue10.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint12 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue10);
        org.apache.activemq.camel.CamelQueue camelQueue14 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding15 = camelQueue14.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint16 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue14);
        jmsEndpoint12.setDestination((javax.jms.Destination) camelQueue14);
        org.apache.activemq.ActiveMQSession activeMQSession18 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer21 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelQueue5, (org.apache.camel.Endpoint) jmsEndpoint12, activeMQSession18, "failover://tcp://localhost:61616", false);
        jmsEndpoint12.setAcknowledgementModeName("hi!");
        jmsEndpoint12.setLazyCreateTransactionManager(false);
        jmsEndpoint12.setCacheLevelName("tcp://localhost:61616");
        int i28 = jmsEndpoint12.getPollingConsumerQueueSize();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNotNull(jmsBinding11);
        org.junit.Assert.assertNotNull(jmsEndpoint12);
        org.junit.Assert.assertNotNull(jmsBinding15);
        org.junit.Assert.assertNotNull(jmsEndpoint16);
        org.junit.Assert.assertTrue(i28 == 1000);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        activeMQConfiguration0.setPriority((int) (short) 100);
        activeMQConfiguration0.setTransferException(false);
        boolean b6 = activeMQConfiguration0.isReplyToSameDestinationAllowed();
        activeMQConfiguration0.setAcknowledgementModeName("temp:topic:");
        long long9 = activeMQConfiguration0.getReceiveTimeout();
        activeMQConfiguration0.setAsyncStopListener(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(long9 == 1000L);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        boolean b3 = activeMQConfiguration0.isLazyCreateTransactionManager();
        activeMQConfiguration0.setAcknowledgementMode((int) (byte) 10);
        org.springframework.jms.support.converter.MessageConverter messageConverter6 = null;
        activeMQConfiguration0.setMessageConverter(messageConverter6);
        long long8 = activeMQConfiguration0.getRequestTimeout();
        activeMQConfiguration0.setConcurrentConsumers((int) (short) -1);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(long8 == 20000L);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        org.apache.activemq.camel.CamelQueue camelQueue10 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding11 = camelQueue10.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint12 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue10);
        org.apache.activemq.camel.CamelQueue camelQueue14 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding15 = camelQueue14.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint16 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue14);
        jmsEndpoint12.setDestination((javax.jms.Destination) camelQueue14);
        org.apache.activemq.ActiveMQSession activeMQSession18 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer21 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelQueue5, (org.apache.camel.Endpoint) jmsEndpoint12, activeMQSession18, "failover://tcp://localhost:61616", false);
        jmsEndpoint12.setAcknowledgementModeName("hi!");
        jmsEndpoint12.setLazyCreateTransactionManager(false);
        boolean b26 = jmsEndpoint12.isDeliveryPersistent();
        long long27 = jmsEndpoint12.getTimeToLive();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNotNull(jmsBinding11);
        org.junit.Assert.assertNotNull(jmsEndpoint12);
        org.junit.Assert.assertNotNull(jmsBinding15);
        org.junit.Assert.assertNotNull(jmsEndpoint16);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(long27 == (-1L));
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        java.lang.String str2 = camelRoutesBroker1.getRoutesFile();
        org.apache.activemq.command.ActiveMQDestination activeMQDestination4 = org.apache.activemq.camel.converter.ActiveMQConverter.toDestination("2.16.1");
        try {
            java.util.Map<org.apache.activemq.command.ActiveMQDestination, org.apache.activemq.broker.region.Destination> map_activeMQDestination_destination5 = camelRoutesBroker1.getDestinationMap(activeMQDestination4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertNotNull(activeMQDestination4);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        org.apache.activemq.camel.CamelDestination camelDestination0 = new org.apache.activemq.camel.CamelDestination();
        org.apache.activemq.ActiveMQSession activeMQSession1 = null;
        try {
            javax.jms.QueueReceiver queueReceiver3 = camelDestination0.createReceiver(activeMQSession1, "2.16.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        jmsComponent1.setTransactionTimeout((int) (short) -1);
        jmsComponent1.setAsyncConsumer(true);
        jmsComponent1.setForceSendOriginalMessage(true);
        org.junit.Assert.assertNotNull(jmsComponent1);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory0.setObjectMessageSerializationDefered(true);
        camelConnectionFactory0.setSendTimeout((int) 'a');
        camelConnectionFactory0.setClientIDPrefix("failover://tcp://localhost:61616");
        java.lang.String str7 = camelConnectionFactory0.getUserName();
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory0.setDisableTimeStampsByDefault(true);
        camelConnectionFactory0.setBeanName("");
        int i5 = camelConnectionFactory0.getProducerWindowSize();
        int i6 = camelConnectionFactory0.getAuditMaximumProducerNumber();
        boolean b7 = camelConnectionFactory0.isUseAsyncSend();
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 64);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.CamelContext camelContext3 = null;
        camelQueue1.setCamelContext(camelContext3);
        org.apache.activemq.ActiveMQSession activeMQSession5 = null;
        try {
            javax.jms.QueueSender queueSender6 = camelQueue1.createSender(activeMQSession5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(jmsBinding2);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isAlwaysSyncSend();
        boolean b2 = activeMQConnection0.isConsumerExpiryCheckEnabled();
        boolean b3 = activeMQConnection0.isAlwaysSessionAsync();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        activeMQConfiguration0.setCacheLevelName("tcp://localhost:61616");
        org.apache.camel.component.jms.ConsumerType consumerType5 = activeMQConfiguration0.getConsumerType();
        activeMQConfiguration0.setRecoveryInterval(0L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + consumerType5 + "' != '" + org.apache.camel.component.jms.ConsumerType.Default + "'", consumerType5.equals(org.apache.camel.component.jms.ConsumerType.Default));
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        java.lang.String str2 = camelRoutesBroker1.getRoutesFile();
        int i3 = camelRoutesBroker1.getCheckPeriod();
        org.apache.activemq.broker.ConsumerBrokerExchange consumerBrokerExchange4 = null;
        org.apache.activemq.command.ConsumerControl consumerControl5 = null;
        try {
            camelRoutesBroker1.processConsumerControl(consumerBrokerExchange4, consumerControl5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 1000);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory0.setExclusiveConsumer(false);
        java.util.concurrent.RejectedExecutionHandler rejectedExecutionHandler3 = camelConnectionFactory0.getRejectedTaskHandler();
        java.util.concurrent.RejectedExecutionHandler rejectedExecutionHandler4 = camelConnectionFactory0.getRejectedTaskHandler();
        boolean b5 = camelConnectionFactory0.isUseBeanNameAsClientIdPrefix();
        org.junit.Assert.assertNull(rejectedExecutionHandler3);
        org.junit.Assert.assertNull(rejectedExecutionHandler4);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        int i1 = activeMQConfiguration0.getConcurrentConsumers();
        int i2 = activeMQConfiguration0.getReplyToMaxConcurrentConsumers();
        org.springframework.core.task.TaskExecutor taskExecutor3 = activeMQConfiguration0.getTaskExecutor();
        org.junit.Assert.assertTrue(i1 == 1);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(taskExecutor3);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        boolean b3 = activeMQConfiguration0.isUsePooledConnection();
        activeMQConfiguration0.setMaxMessagesPerTask(4);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentClientAcknowledge(connectionFactory0);
        jmsComponent1.setAcceptMessagesWhileStopping(false);
        jmsComponent1.setPreserveMessageQos(true);
        jmsComponent1.setMapJmsMessage(false);
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration8 = jmsComponent1.getConfiguration();
        boolean b9 = jmsConfiguration8.isReplyToDeliveryPersistent();
        jmsConfiguration8.setCacheLevelName("2.16.1");
        boolean b12 = jmsConfiguration8.isExplicitQosEnabled();
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration13 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str14 = activeMQConfiguration13.getReplyTo();
        boolean b15 = activeMQConfiguration13.isPubSubNoLocal();
        boolean b16 = activeMQConfiguration13.isLazyCreateTransactionManager();
        activeMQConfiguration13.setAcknowledgementMode((int) (byte) 10);
        activeMQConfiguration13.setMaxMessagesPerTask((int) (short) 10);
        org.springframework.core.task.TaskExecutor taskExecutor21 = null;
        activeMQConfiguration13.setTaskExecutor(taskExecutor21);
        org.apache.activemq.camel.CamelQueue camelQueue24 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding25 = camelQueue24.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint26 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue24);
        org.apache.activemq.camel.CamelQueue camelQueue28 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding29 = camelQueue28.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint30 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue28);
        jmsEndpoint26.setDestination((javax.jms.Destination) camelQueue28);
        boolean b32 = jmsEndpoint26.isIncludeAllJMSXProperties();
        long long33 = jmsEndpoint26.getTimeToLive();
        org.apache.camel.component.jms.MessageListenerContainerFactory messageListenerContainerFactory34 = null;
        jmsEndpoint26.setMessageListenerContainerFactory(messageListenerContainerFactory34);
        org.apache.camel.component.jms.DefaultTaskExecutorType defaultTaskExecutorType36 = null;
        jmsEndpoint26.setDefaultTaskExecutorType(defaultTaskExecutorType36);
        org.springframework.jms.core.JmsOperations jmsOperations40 = activeMQConfiguration13.createInOnlyTemplate(jmsEndpoint26, true, "2.16.1");
        jmsConfiguration8.setMetadataJmsOperations(jmsOperations40);
        jmsConfiguration8.setPubSubNoLocal(false);
        org.junit.Assert.assertNotNull(jmsComponent1);
        org.junit.Assert.assertNotNull(jmsConfiguration8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(jmsBinding25);
        org.junit.Assert.assertNotNull(jmsEndpoint26);
        org.junit.Assert.assertNotNull(jmsBinding29);
        org.junit.Assert.assertNotNull(jmsEndpoint30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(long33 == (-1L));
        org.junit.Assert.assertNotNull(jmsOperations40);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        int i1 = activeMQConfiguration0.getConcurrentConsumers();
        int i2 = activeMQConfiguration0.getReplyToMaxConcurrentConsumers();
        boolean b3 = activeMQConfiguration0.isAcceptMessagesWhileStopping();
        boolean b4 = activeMQConfiguration0.isDisableTimeToLive();
        org.junit.Assert.assertTrue(i1 == 1);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory0.setObjectMessageSerializationDefered(true);
        camelConnectionFactory0.setSendTimeout((int) 'a');
        boolean b5 = camelConnectionFactory0.isUseAsyncSend();
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.CamelContext camelContext3 = null;
        camelQueue1.setCamelContext(camelContext3);
        org.apache.activemq.camel.CamelQueue camelQueue6 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding7 = camelQueue6.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint8 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue6);
        org.apache.activemq.camel.CamelQueue camelQueue10 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding11 = camelQueue10.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint12 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue10);
        jmsEndpoint8.setDestination((javax.jms.Destination) camelQueue10);
        org.apache.activemq.camel.CamelQueue camelQueue15 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding16 = camelQueue15.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint17 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue15);
        org.apache.activemq.camel.CamelQueue camelQueue19 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding20 = camelQueue19.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint21 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue19);
        jmsEndpoint17.setDestination((javax.jms.Destination) camelQueue19);
        org.apache.activemq.ActiveMQSession activeMQSession23 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer26 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelQueue10, (org.apache.camel.Endpoint) jmsEndpoint17, activeMQSession23, "failover://tcp://localhost:61616", false);
        org.apache.activemq.ActiveMQSession activeMQSession27 = null;
        org.apache.activemq.camel.CamelQueueReceiver camelQueueReceiver29 = new org.apache.activemq.camel.CamelQueueReceiver(camelQueue1, (org.apache.camel.Endpoint) jmsEndpoint17, activeMQSession27, "queue:");
        org.apache.activemq.ActiveMQSession activeMQSession30 = null;
        try {
            javax.jms.QueueReceiver queueReceiver32 = camelQueue1.createReceiver(activeMQSession30, "queue:");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsBinding7);
        org.junit.Assert.assertNotNull(jmsEndpoint8);
        org.junit.Assert.assertNotNull(jmsBinding11);
        org.junit.Assert.assertNotNull(jmsEndpoint12);
        org.junit.Assert.assertNotNull(jmsBinding16);
        org.junit.Assert.assertNotNull(jmsEndpoint17);
        org.junit.Assert.assertNotNull(jmsBinding20);
        org.junit.Assert.assertNotNull(jmsEndpoint21);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        org.apache.camel.component.jms.ConsumerType consumerType2 = null;
        activeMQConfiguration0.setConsumerType(consumerType2);
        java.lang.String str4 = activeMQConfiguration0.getPassword();
        activeMQConfiguration0.setReplyTo("hi!");
        activeMQConfiguration0.setReplyToMaxConcurrentConsumers((int) (byte) 10);
        int i9 = activeMQConfiguration0.getIdleConsumerLimit();
        boolean b10 = activeMQConfiguration0.isDisableTimeToLive();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        int i4 = jmsEndpoint3.getMaxMessagesPerTask();
        java.lang.String str5 = jmsEndpoint3.getTransactionName();
        org.apache.camel.Processor processor6 = null;
        org.apache.activemq.camel.component.broker.BrokerConsumer brokerConsumer7 = new org.apache.activemq.camel.component.broker.BrokerConsumer((org.apache.camel.Endpoint) jmsEndpoint3, processor6);
        org.apache.camel.spi.ExceptionHandler exceptionHandler8 = brokerConsumer7.getExceptionHandler();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(exceptionHandler8);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        activeMQConfiguration0.setPriority((int) (short) 100);
        activeMQConfiguration0.setTransferException(false);
        boolean b6 = activeMQConfiguration0.isTransactedInOut();
        boolean b7 = activeMQConfiguration0.isExplicitQosEnabled();
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration8 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str9 = activeMQConfiguration8.getReplyTo();
        boolean b10 = activeMQConfiguration8.isPubSubNoLocal();
        activeMQConfiguration8.setCacheLevelName("tcp://localhost:61616");
        org.apache.camel.component.jms.ConsumerType consumerType13 = activeMQConfiguration8.getConsumerType();
        activeMQConfiguration0.setConsumerType(consumerType13);
        long long15 = activeMQConfiguration0.getRecoveryInterval();
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration16 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str17 = activeMQConfiguration16.getReplyTo();
        boolean b18 = activeMQConfiguration16.isPubSubNoLocal();
        boolean b19 = activeMQConfiguration16.isLazyCreateTransactionManager();
        activeMQConfiguration16.setAcknowledgementMode((int) (byte) 10);
        activeMQConfiguration16.setMaxMessagesPerTask((int) (short) 10);
        org.springframework.core.task.TaskExecutor taskExecutor24 = null;
        activeMQConfiguration16.setTaskExecutor(taskExecutor24);
        org.apache.activemq.camel.CamelQueue camelQueue27 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding28 = camelQueue27.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint29 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue27);
        org.apache.activemq.camel.CamelQueue camelQueue31 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding32 = camelQueue31.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint33 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue31);
        jmsEndpoint29.setDestination((javax.jms.Destination) camelQueue31);
        boolean b35 = jmsEndpoint29.isIncludeAllJMSXProperties();
        long long36 = jmsEndpoint29.getTimeToLive();
        org.apache.camel.component.jms.MessageListenerContainerFactory messageListenerContainerFactory37 = null;
        jmsEndpoint29.setMessageListenerContainerFactory(messageListenerContainerFactory37);
        org.apache.camel.component.jms.DefaultTaskExecutorType defaultTaskExecutorType39 = null;
        jmsEndpoint29.setDefaultTaskExecutorType(defaultTaskExecutorType39);
        org.springframework.jms.core.JmsOperations jmsOperations43 = activeMQConfiguration16.createInOnlyTemplate(jmsEndpoint29, true, "2.16.1");
        activeMQConfiguration0.setJmsOperations(jmsOperations43);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + consumerType13 + "' != '" + org.apache.camel.component.jms.ConsumerType.Default + "'", consumerType13.equals(org.apache.camel.component.jms.ConsumerType.Default));
        org.junit.Assert.assertTrue(long15 == 5000L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(jmsBinding28);
        org.junit.Assert.assertNotNull(jmsEndpoint29);
        org.junit.Assert.assertNotNull(jmsBinding32);
        org.junit.Assert.assertNotNull(jmsEndpoint33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(long36 == (-1L));
        org.junit.Assert.assertNotNull(jmsOperations43);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        boolean b3 = activeMQConfiguration0.isErrorHandlerLogStackTrace();
        boolean b4 = activeMQConfiguration0.isMessageTimestampEnabled();
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy5 = activeMQConfiguration0.getMessageCreatedStrategy();
        activeMQConfiguration0.setReplyToCacheLevelName("");
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration8 = activeMQConfiguration0.copy();
        boolean b9 = activeMQConfiguration0.isAsyncConsumer();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(messageCreatedStrategy5);
        org.junit.Assert.assertNotNull(jmsConfiguration8);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        int i4 = jmsEndpoint3.getMaxMessagesPerTask();
        java.lang.String str5 = jmsEndpoint3.getTransactionName();
        org.apache.camel.Processor processor6 = null;
        org.apache.activemq.camel.component.broker.BrokerConsumer brokerConsumer7 = new org.apache.activemq.camel.component.broker.BrokerConsumer((org.apache.camel.Endpoint) jmsEndpoint3, processor6);
        org.apache.camel.ServiceStatus serviceStatus8 = brokerConsumer7.getStatus();
        org.apache.camel.Exchange exchange9 = null;
        try {
            brokerConsumer7.doneUoW(exchange9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + serviceStatus8 + "' != '" + org.apache.camel.ServiceStatus.Stopped + "'", serviceStatus8.equals(org.apache.camel.ServiceStatus.Stopped));
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        boolean b3 = activeMQConfiguration0.isErrorHandlerLogStackTrace();
        boolean b4 = activeMQConfiguration0.isMessageTimestampEnabled();
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy5 = activeMQConfiguration0.getMessageCreatedStrategy();
        activeMQConfiguration0.setReplyToCacheLevelName("");
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration8 = activeMQConfiguration0.copy();
        jmsConfiguration8.setLazyCreateTransactionManager(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(messageCreatedStrategy5);
        org.junit.Assert.assertNotNull(jmsConfiguration8);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        boolean b3 = activeMQConfiguration0.isLazyCreateTransactionManager();
        activeMQConfiguration0.setAcknowledgementMode((int) (byte) 10);
        activeMQConfiguration0.setMaxMessagesPerTask((int) (short) 10);
        org.springframework.core.task.TaskExecutor taskExecutor8 = null;
        activeMQConfiguration0.setTaskExecutor(taskExecutor8);
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy10 = null;
        activeMQConfiguration0.setMessageCreatedStrategy(messageCreatedStrategy10);
        boolean b12 = activeMQConfiguration0.isMessageIdEnabled();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        java.lang.String str2 = camelRoutesBroker1.getRoutesFile();
        try {
            camelRoutesBroker1.brokerServiceStarted();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        java.lang.String str2 = camelRoutesBroker1.getRoutesFile();
        org.apache.activemq.command.MessageDispatchNotification messageDispatchNotification3 = null;
        try {
            camelRoutesBroker1.processDispatchNotification(messageDispatchNotification3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        long long1 = camelConnectionFactory0.getWarnAboutUnstartedConnectionTimeout();
        org.apache.activemq.RedeliveryPolicy redeliveryPolicy2 = null;
        camelConnectionFactory0.setRedeliveryPolicy(redeliveryPolicy2);
        org.apache.camel.component.jms.JmsComponent jmsComponent4 = org.apache.camel.component.jms.JmsComponent.jmsComponentAutoAcknowledge((javax.jms.ConnectionFactory) camelConnectionFactory0);
        org.junit.Assert.assertTrue(long1 == 500L);
        org.junit.Assert.assertNotNull(jmsComponent4);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        boolean b3 = activeMQConfiguration0.isErrorHandlerLogStackTrace();
        boolean b4 = activeMQConfiguration0.isMessageTimestampEnabled();
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy5 = activeMQConfiguration0.getMessageCreatedStrategy();
        activeMQConfiguration0.setReplyToCacheLevelName("");
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration8 = activeMQConfiguration0.copy();
        javax.jms.ExceptionListener exceptionListener9 = activeMQConfiguration0.getExceptionListener();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(messageCreatedStrategy5);
        org.junit.Assert.assertNotNull(jmsConfiguration8);
        org.junit.Assert.assertNull(exceptionListener9);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDisableReplyTo(true);
        org.apache.camel.spi.HeaderFilterStrategy headerFilterStrategy11 = null;
        jmsEndpoint3.setHeaderFilterStrategy(headerFilterStrategy11);
        jmsEndpoint3.setTransactionTimeout((int) ' ');
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration15 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str16 = activeMQConfiguration15.getReplyTo();
        activeMQConfiguration15.setPriority((int) (short) 100);
        activeMQConfiguration15.setTransferException(false);
        boolean b21 = activeMQConfiguration15.isReplyToSameDestinationAllowed();
        activeMQConfiguration15.setPassword("hi!");
        activeMQConfiguration15.setAsyncStartListener(false);
        org.apache.activemq.camel.CamelQueue camelQueue27 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding28 = camelQueue27.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint29 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue27);
        org.apache.activemq.camel.CamelQueue camelQueue31 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding32 = camelQueue31.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint33 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue31);
        jmsEndpoint29.setDestination((javax.jms.Destination) camelQueue31);
        org.apache.activemq.camel.CamelQueue camelQueue36 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding37 = camelQueue36.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint38 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue36);
        org.apache.activemq.camel.CamelQueue camelQueue40 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding41 = camelQueue40.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint42 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue40);
        jmsEndpoint38.setDestination((javax.jms.Destination) camelQueue40);
        org.apache.activemq.ActiveMQSession activeMQSession44 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer47 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelQueue31, (org.apache.camel.Endpoint) jmsEndpoint38, activeMQSession44, "failover://tcp://localhost:61616", false);
        boolean b48 = jmsEndpoint38.isStarting();
        org.springframework.jms.core.JmsOperations jmsOperations49 = null;
        jmsEndpoint38.setMetadataJmsOperations(jmsOperations49);
        org.apache.camel.component.jms.JmsKeyFormatStrategy jmsKeyFormatStrategy51 = null;
        jmsEndpoint38.setJmsKeyFormatStrategy(jmsKeyFormatStrategy51);
        int i53 = jmsEndpoint38.getPollingConsumerQueueSize();
        org.springframework.jms.listener.AbstractMessageListenerContainer abstractMessageListenerContainer54 = activeMQConfiguration15.createMessageListenerContainer(jmsEndpoint38);
        jmsEndpoint3.onListenerContainerStopped(abstractMessageListenerContainer54);
        boolean b56 = jmsEndpoint3.isAsyncStopListener();
        org.springframework.jms.support.destination.DestinationResolver destinationResolver57 = null;
        jmsEndpoint3.setDestinationResolver(destinationResolver57);
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(jmsBinding28);
        org.junit.Assert.assertNotNull(jmsEndpoint29);
        org.junit.Assert.assertNotNull(jmsBinding32);
        org.junit.Assert.assertNotNull(jmsEndpoint33);
        org.junit.Assert.assertNotNull(jmsBinding37);
        org.junit.Assert.assertNotNull(jmsEndpoint38);
        org.junit.Assert.assertNotNull(jmsBinding41);
        org.junit.Assert.assertNotNull(jmsEndpoint42);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(i53 == 1000);
        org.junit.Assert.assertNotNull(abstractMessageListenerContainer54);
        org.junit.Assert.assertTrue(b56 == false);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        activeMQConfiguration0.setPriority((int) (short) 100);
        boolean b4 = activeMQConfiguration0.isIncludeSentJMSMessageID();
        java.lang.Integer i5 = activeMQConfiguration0.getDeliveryMode();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(i5);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        org.apache.activemq.broker.ConnectionContext connectionContext2 = null;
        org.apache.activemq.command.ProducerInfo producerInfo3 = null;
        org.apache.activemq.command.ActiveMQDestination activeMQDestination5 = org.apache.activemq.camel.converter.ActiveMQConverter.toDestination("2.16.1");
        try {
            camelRoutesBroker1.fastProducer(connectionContext2, producerInfo3, activeMQDestination5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(activeMQDestination5);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        activeMQConfiguration0.setCacheLevelName("tcp://localhost:61616");
        org.apache.camel.component.jms.ConsumerType consumerType5 = activeMQConfiguration0.getConsumerType();
        boolean b6 = activeMQConfiguration0.isTransferException();
        java.lang.String str7 = activeMQConfiguration0.getReplyTo();
        boolean b8 = activeMQConfiguration0.isTransacted();
        activeMQConfiguration0.setBrokerURL("queue:");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + consumerType5 + "' != '" + org.apache.camel.component.jms.ConsumerType.Default + "'", consumerType5.equals(org.apache.camel.component.jms.ConsumerType.Default));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        long long1 = camelConnectionFactory0.getWarnAboutUnstartedConnectionTimeout();
        org.apache.activemq.RedeliveryPolicy redeliveryPolicy2 = null;
        camelConnectionFactory0.setRedeliveryPolicy(redeliveryPolicy2);
        camelConnectionFactory0.setBeanName("tcp://localhost:61616");
        org.springframework.transaction.PlatformTransactionManager platformTransactionManager6 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent7 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted((javax.jms.ConnectionFactory) camelConnectionFactory0, platformTransactionManager6);
        org.junit.Assert.assertTrue(long1 == 500L);
        org.junit.Assert.assertNotNull(jmsComponent7);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isReplyToDeliveryPersistent();
        activeMQConfiguration0.setTransferException(false);
        boolean b5 = activeMQConfiguration0.isTransferExchange();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        jmsComponent1.setAcknowledgementModeName("hi!");
        boolean b4 = jmsComponent1.isStarting();
        jmsComponent1.setRequestTimeoutCheckerInterval((long) 15000);
        jmsComponent1.setIncludeSentJMSMessageID(false);
        org.junit.Assert.assertNotNull(jmsComponent1);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        jmsComponent1.setAcknowledgementModeName("hi!");
        jmsComponent1.setLazyCreateTransactionManager(false);
        jmsComponent1.setErrorHandlerLogStackTrace(false);
        org.junit.Assert.assertNotNull(jmsComponent1);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.activemq.camel.CamelQueue camelQueue4 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding5 = camelQueue4.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint6 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue4);
        org.apache.activemq.camel.CamelQueue camelQueue8 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding9 = camelQueue8.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint10 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue8);
        jmsEndpoint6.setDestination((javax.jms.Destination) camelQueue8);
        boolean b12 = jmsEndpoint6.isIncludeAllJMSXProperties();
        long long13 = jmsEndpoint6.getTimeToLive();
        org.apache.camel.component.jms.MessageListenerContainerFactory messageListenerContainerFactory14 = null;
        jmsEndpoint6.setMessageListenerContainerFactory(messageListenerContainerFactory14);
        org.apache.camel.component.jms.DefaultTaskExecutorType defaultTaskExecutorType16 = null;
        jmsEndpoint6.setDefaultTaskExecutorType(defaultTaskExecutorType16);
        jmsEndpoint6.setAcknowledgementMode((int) '#');
        org.apache.activemq.ActiveMQSession activeMQSession20 = null;
        try {
            org.apache.activemq.camel.CamelQueueSender camelQueueSender21 = new org.apache.activemq.camel.CamelQueueSender(camelQueue1, (org.apache.camel.Endpoint) jmsEndpoint6, activeMQSession20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsBinding5);
        org.junit.Assert.assertNotNull(jmsEndpoint6);
        org.junit.Assert.assertNotNull(jmsBinding9);
        org.junit.Assert.assertNotNull(jmsEndpoint10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(long13 == (-1L));
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        jmsEndpoint3.setReplyToDestinationSelectorName("2.16.1");
        org.apache.camel.EndpointConfiguration endpointConfiguration6 = null;
        jmsEndpoint3.setEndpointConfiguration(endpointConfiguration6);
        jmsEndpoint3.setForceSendOriginalMessage(true);
        javax.jms.Destination destination10 = jmsEndpoint3.getDestination();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(destination10);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentClientAcknowledge(connectionFactory0);
        jmsComponent1.setAcceptMessagesWhileStopping(false);
        boolean b4 = jmsComponent1.isStarting();
        org.apache.camel.CamelContext camelContext5 = null;
        jmsComponent1.setCamelContext(camelContext5);
        jmsComponent1.setAsyncConsumer(false);
        jmsComponent1.setReplyToConcurrentConsumers(4);
        org.junit.Assert.assertNotNull(jmsComponent1);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        java.lang.ClassLoader classLoader1 = null;
        try {
            java.lang.Class<?> cls2 = org.apache.activemq.camel.component.ActiveMQConfiguration.loadClass("topic:", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory0.setExclusiveConsumer(false);
        java.util.concurrent.RejectedExecutionHandler rejectedExecutionHandler3 = camelConnectionFactory0.getRejectedTaskHandler();
        camelConnectionFactory0.setStatsEnabled(false);
        org.junit.Assert.assertNull(rejectedExecutionHandler3);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setAlwaysCopyMessage(false);
        jmsEndpoint3.setReplyToConcurrentConsumers(100);
        jmsEndpoint3.stop();
        org.apache.camel.EndpointConfiguration endpointConfiguration14 = jmsEndpoint3.getEndpointConfiguration();
        boolean b15 = jmsEndpoint3.isDisableReplyTo();
        jmsEndpoint3.setLazyCreateTransactionManager(false);
        org.apache.activemq.camel.CamelQueue camelQueue19 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding20 = camelQueue19.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint21 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue19);
        boolean b22 = jmsEndpoint21.isPubSubNoLocal();
        org.apache.camel.component.jms.JmsKeyFormatStrategy jmsKeyFormatStrategy23 = null;
        jmsEndpoint21.setJmsKeyFormatStrategy(jmsKeyFormatStrategy23);
        org.apache.camel.spi.HeaderFilterStrategy headerFilterStrategy25 = null;
        jmsEndpoint21.setHeaderFilterStrategy(headerFilterStrategy25);
        int i27 = jmsEndpoint21.getPriority();
        org.apache.activemq.camel.CamelQueue camelQueue29 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding30 = camelQueue29.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint31 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue29);
        jmsEndpoint31.setReplyToDestinationSelectorName("2.16.1");
        org.apache.camel.EndpointConfiguration endpointConfiguration34 = null;
        jmsEndpoint31.setEndpointConfiguration(endpointConfiguration34);
        org.apache.camel.ExchangePattern exchangePattern36 = jmsEndpoint31.getExchangePattern();
        jmsEndpoint21.setExchangePattern(exchangePattern36);
        jmsEndpoint3.setExchangePattern(exchangePattern36);
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNull(endpointConfiguration14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(jmsBinding20);
        org.junit.Assert.assertNotNull(jmsEndpoint21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i27 == 4);
        org.junit.Assert.assertNotNull(jmsBinding30);
        org.junit.Assert.assertNotNull(jmsEndpoint31);
        org.junit.Assert.assertTrue("'" + exchangePattern36 + "' != '" + org.apache.camel.ExchangePattern.InOnly + "'", exchangePattern36.equals(org.apache.camel.ExchangePattern.InOnly));
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        java.lang.String str2 = camelRoutesBroker1.getRoutesFile();
        javax.jms.ConnectionFactory connectionFactory3 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent4 = org.apache.camel.component.jms.JmsComponent.jmsComponentClientAcknowledge(connectionFactory3);
        jmsComponent4.setReplyToConcurrentConsumers((int) (byte) -1);
        jmsComponent4.setLazyCreateTransactionManager(false);
        java.lang.Class<? extends org.apache.camel.Endpoint> cls9 = jmsComponent4.getEndpointClass();
        try {
            org.apache.activemq.broker.Broker broker10 = camelRoutesBroker1.getAdaptor((java.lang.Class) cls9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertNotNull(jmsComponent4);
        org.junit.Assert.assertNotNull(cls9);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory1 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory1.setDisableTimeStampsByDefault(true);
        java.util.Properties properties4 = camelConnectionFactory1.getProperties();
        camelConnectionFactory0.populateProperties(properties4);
        try {
            camelConnectionFactory0.setBrokerURL("topic:");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(properties4);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        org.apache.camel.CamelContext camelContext0 = null;
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent1 = new org.apache.activemq.camel.component.ActiveMQComponent(camelContext0);
        boolean b2 = activeMQComponent1.isExposeAllQueues();
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        long long1 = camelConnectionFactory0.getWarnAboutUnstartedConnectionTimeout();
        java.util.concurrent.RejectedExecutionHandler rejectedExecutionHandler2 = null;
        camelConnectionFactory0.setRejectedTaskHandler(rejectedExecutionHandler2);
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory4 = new org.apache.activemq.camel.CamelConnectionFactory();
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory5 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory5.setDisableTimeStampsByDefault(true);
        java.util.Properties properties8 = camelConnectionFactory5.getProperties();
        camelConnectionFactory4.populateProperties(properties8);
        camelConnectionFactory0.buildFromProperties(properties8);
        org.junit.Assert.assertTrue(long1 == 500L);
        org.junit.Assert.assertNotNull(properties8);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        activeMQConfiguration0.setCacheLevelName("tcp://localhost:61616");
        org.apache.camel.component.jms.ConsumerType consumerType5 = activeMQConfiguration0.getConsumerType();
        boolean b6 = activeMQConfiguration0.isTransferException();
        java.lang.String str7 = activeMQConfiguration0.getReplyTo();
        activeMQConfiguration0.setIncludeSentJMSMessageID(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + consumerType5 + "' != '" + org.apache.camel.component.jms.ConsumerType.Default + "'", consumerType5.equals(org.apache.camel.component.jms.ConsumerType.Default));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent1 = org.apache.activemq.camel.component.ActiveMQComponent.activeMQComponent("2.16.1");
        activeMQComponent1.setUsePooledConnection(true);
        activeMQComponent1.setTestConnectionOnStartup(true);
        activeMQComponent1.setUserName("tcp://localhost:61616");
        org.junit.Assert.assertNotNull(activeMQComponent1);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        long long1 = camelConnectionFactory0.getWarnAboutUnstartedConnectionTimeout();
        org.apache.activemq.RedeliveryPolicy redeliveryPolicy2 = null;
        camelConnectionFactory0.setRedeliveryPolicy(redeliveryPolicy2);
        camelConnectionFactory0.setBeanName("tcp://localhost:61616");
        javax.jms.TopicConnection topicConnection6 = camelConnectionFactory0.createTopicConnection();
        org.junit.Assert.assertTrue(long1 == 500L);
        org.junit.Assert.assertNotNull(topicConnection6);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        jmsEndpoint3.setReplyToDestinationSelectorName("2.16.1");
        org.apache.camel.EndpointConfiguration endpointConfiguration6 = null;
        jmsEndpoint3.setEndpointConfiguration(endpointConfiguration6);
        org.apache.camel.ExchangePattern exchangePattern8 = jmsEndpoint3.getExchangePattern();
        jmsEndpoint3.setMessageTimestampEnabled(false);
        jmsEndpoint3.setPreserveMessageQos(false);
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertTrue("'" + exchangePattern8 + "' != '" + org.apache.camel.ExchangePattern.InOnly + "'", exchangePattern8.equals(org.apache.camel.ExchangePattern.InOnly));
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        activeMQConfiguration0.setPriority((int) (short) 100);
        activeMQConfiguration0.setTransferException(false);
        java.lang.String str6 = activeMQConfiguration0.getReplyToOverride();
        activeMQConfiguration0.setBrokerURL("topic:");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isAlwaysSyncSend();
        boolean b2 = activeMQConnection0.isConsumerExpiryCheckEnabled();
        javax.jms.ExceptionListener exceptionListener3 = activeMQConnection0.getExceptionListener();
        org.apache.activemq.thread.TaskRunnerFactory taskRunnerFactory4 = activeMQConnection0.getSessionTaskRunner();
        boolean b5 = activeMQConnection0.isOptimizedMessageDispatch();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(exceptionListener3);
        org.junit.Assert.assertNotNull(taskRunnerFactory4);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory1 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory1.setDisableTimeStampsByDefault(true);
        java.util.Properties properties4 = camelConnectionFactory1.getProperties();
        camelConnectionFactory0.populateProperties(properties4);
        camelConnectionFactory0.setWarnAboutUnstartedConnectionTimeout((long) (short) -1);
        boolean b8 = camelConnectionFactory0.isAlwaysSyncSend();
        org.apache.activemq.ActiveMQConnectionFactory activeMQConnectionFactory9 = camelConnectionFactory0.copy();
        boolean b10 = camelConnectionFactory0.isCheckForDuplicates();
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(activeMQConnectionFactory9);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDisableReplyTo(true);
        org.apache.camel.spi.HeaderFilterStrategy headerFilterStrategy11 = null;
        jmsEndpoint3.setHeaderFilterStrategy(headerFilterStrategy11);
        jmsEndpoint3.setAcknowledgementModeName("temp:topic:");
        boolean b15 = jmsEndpoint3.isIncludeAllJMSXProperties();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        boolean b4 = jmsEndpoint3.isPubSubNoLocal();
        jmsEndpoint3.setTimeToLive((long) (byte) 1);
        boolean b7 = jmsEndpoint3.isDeliveryPersistent();
        boolean b8 = jmsEndpoint3.isSuspending();
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory9 = new org.apache.activemq.camel.CamelConnectionFactory();
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory10 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory10.setDisableTimeStampsByDefault(true);
        java.util.Properties properties13 = camelConnectionFactory10.getProperties();
        camelConnectionFactory9.populateProperties(properties13);
        jmsEndpoint3.setListenerConnectionFactory((javax.jms.ConnectionFactory) camelConnectionFactory9);
        camelConnectionFactory9.setOptimizeAcknowledgeTimeOut((long) (-1));
        camelConnectionFactory9.setSendAcksAsync(true);
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        boolean b4 = jmsEndpoint3.isPubSubNoLocal();
        jmsEndpoint3.setTimeToLive((long) (byte) 1);
        boolean b7 = jmsEndpoint3.isSynchronous();
        org.springframework.core.task.TaskExecutor taskExecutor8 = jmsEndpoint3.getTaskExecutor();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(taskExecutor8);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        activeMQConfiguration0.setPriority((int) (short) 100);
        activeMQConfiguration0.setTransferException(false);
        boolean b6 = activeMQConfiguration0.isReplyToSameDestinationAllowed();
        activeMQConfiguration0.setPassword("hi!");
        activeMQConfiguration0.setAsyncStartListener(false);
        org.apache.activemq.camel.CamelQueue camelQueue12 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding13 = camelQueue12.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint14 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue12);
        org.apache.activemq.camel.CamelQueue camelQueue16 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding17 = camelQueue16.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint18 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue16);
        jmsEndpoint14.setDestination((javax.jms.Destination) camelQueue16);
        org.apache.activemq.camel.CamelQueue camelQueue21 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding22 = camelQueue21.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint23 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue21);
        org.apache.activemq.camel.CamelQueue camelQueue25 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding26 = camelQueue25.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint27 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue25);
        jmsEndpoint23.setDestination((javax.jms.Destination) camelQueue25);
        org.apache.activemq.ActiveMQSession activeMQSession29 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer32 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelQueue16, (org.apache.camel.Endpoint) jmsEndpoint23, activeMQSession29, "failover://tcp://localhost:61616", false);
        boolean b33 = jmsEndpoint23.isStarting();
        org.springframework.jms.core.JmsOperations jmsOperations34 = null;
        jmsEndpoint23.setMetadataJmsOperations(jmsOperations34);
        org.apache.camel.component.jms.JmsKeyFormatStrategy jmsKeyFormatStrategy36 = null;
        jmsEndpoint23.setJmsKeyFormatStrategy(jmsKeyFormatStrategy36);
        int i38 = jmsEndpoint23.getPollingConsumerQueueSize();
        org.springframework.jms.listener.AbstractMessageListenerContainer abstractMessageListenerContainer39 = activeMQConfiguration0.createMessageListenerContainer(jmsEndpoint23);
        org.apache.camel.component.jms.DefaultTaskExecutorType defaultTaskExecutorType40 = jmsEndpoint23.getDefaultTaskExecutorType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(jmsBinding13);
        org.junit.Assert.assertNotNull(jmsEndpoint14);
        org.junit.Assert.assertNotNull(jmsBinding17);
        org.junit.Assert.assertNotNull(jmsEndpoint18);
        org.junit.Assert.assertNotNull(jmsBinding22);
        org.junit.Assert.assertNotNull(jmsEndpoint23);
        org.junit.Assert.assertNotNull(jmsBinding26);
        org.junit.Assert.assertNotNull(jmsEndpoint27);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i38 == 1000);
        org.junit.Assert.assertNotNull(abstractMessageListenerContainer39);
        org.junit.Assert.assertNull(defaultTaskExecutorType40);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        org.apache.activemq.camel.camelplugin.CamelRoutesBrokerPlugin camelRoutesBrokerPlugin0 = new org.apache.activemq.camel.camelplugin.CamelRoutesBrokerPlugin();
        org.apache.activemq.broker.Broker broker1 = null;
        org.apache.activemq.broker.Broker broker2 = camelRoutesBrokerPlugin0.installPlugin(broker1);
        camelRoutesBrokerPlugin0.setRoutesFile("2.16.1");
        org.junit.Assert.assertNotNull(broker2);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory0.setObjectMessageSerializationDefered(true);
        org.springframework.transaction.PlatformTransactionManager platformTransactionManager3 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent4 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted((javax.jms.ConnectionFactory) camelConnectionFactory0, platformTransactionManager3);
        org.junit.Assert.assertNotNull(jmsComponent4);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.CamelContext camelContext3 = null;
        camelQueue1.setCamelContext(camelContext3);
        org.apache.activemq.camel.CamelQueue camelQueue6 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding7 = camelQueue6.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint8 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue6);
        org.apache.activemq.camel.CamelQueue camelQueue10 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding11 = camelQueue10.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint12 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue10);
        jmsEndpoint8.setDestination((javax.jms.Destination) camelQueue10);
        org.apache.activemq.camel.CamelQueue camelQueue15 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding16 = camelQueue15.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint17 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue15);
        org.apache.activemq.camel.CamelQueue camelQueue19 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding20 = camelQueue19.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint21 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue19);
        jmsEndpoint17.setDestination((javax.jms.Destination) camelQueue19);
        org.apache.activemq.ActiveMQSession activeMQSession23 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer26 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelQueue10, (org.apache.camel.Endpoint) jmsEndpoint17, activeMQSession23, "failover://tcp://localhost:61616", false);
        org.apache.activemq.ActiveMQSession activeMQSession27 = null;
        org.apache.activemq.camel.CamelQueueReceiver camelQueueReceiver29 = new org.apache.activemq.camel.CamelQueueReceiver(camelQueue1, (org.apache.camel.Endpoint) jmsEndpoint17, activeMQSession27, "queue:");
        java.lang.String str30 = camelQueue1.toString();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsBinding7);
        org.junit.Assert.assertNotNull(jmsEndpoint8);
        org.junit.Assert.assertNotNull(jmsBinding11);
        org.junit.Assert.assertNotNull(jmsEndpoint12);
        org.junit.Assert.assertNotNull(jmsBinding16);
        org.junit.Assert.assertNotNull(jmsEndpoint17);
        org.junit.Assert.assertNotNull(jmsBinding20);
        org.junit.Assert.assertNotNull(jmsEndpoint21);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "queue:" + "'", str30.equals("queue:"));
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        boolean b9 = jmsEndpoint3.isIncludeAllJMSXProperties();
        long long10 = jmsEndpoint3.getTimeToLive();
        jmsEndpoint3.setReplyToMaxConcurrentConsumers(100);
        jmsEndpoint3.setTransactedInOut(false);
        jmsEndpoint3.setAllowNullBody(true);
        boolean b17 = jmsEndpoint3.isPubSubNoLocal();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(long10 == (-1L));
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        boolean b3 = activeMQConfiguration0.isLazyCreateTransactionManager();
        activeMQConfiguration0.setAcknowledgementMode((int) (byte) 10);
        org.springframework.jms.support.converter.MessageConverter messageConverter6 = null;
        activeMQConfiguration0.setMessageConverter(messageConverter6);
        activeMQConfiguration0.setClientId("2.16.1");
        activeMQConfiguration0.setTransacted(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        long long1 = camelConnectionFactory0.getWarnAboutUnstartedConnectionTimeout();
        camelConnectionFactory0.setAuditMaximumProducerNumber((int) (byte) 1);
        org.apache.camel.component.jms.JmsComponent jmsComponent4 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted((javax.jms.ConnectionFactory) camelConnectionFactory0);
        org.springframework.core.task.TaskExecutor taskExecutor5 = null;
        jmsComponent4.setTaskExecutor(taskExecutor5);
        org.junit.Assert.assertTrue(long1 == 500L);
        org.junit.Assert.assertNotNull(jmsComponent4);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        java.lang.String str2 = camelRoutesBroker1.getRoutesFile();
        int i3 = camelRoutesBroker1.getCheckPeriod();
        camelRoutesBroker1.setRoutesFile("hi!");
        org.apache.activemq.broker.ConnectionContext connectionContext6 = null;
        org.apache.activemq.command.DestinationInfo destinationInfo7 = null;
        try {
            camelRoutesBroker1.removeDestinationInfo(connectionContext6, destinationInfo7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 1000);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        activeMQConfiguration0.setPriority((int) (short) 100);
        activeMQConfiguration0.setTransferException(false);
        boolean b6 = activeMQConfiguration0.isReplyToSameDestinationAllowed();
        activeMQConfiguration0.setPassword("hi!");
        activeMQConfiguration0.setAsyncStartListener(false);
        org.springframework.jms.core.JmsOperations jmsOperations11 = activeMQConfiguration0.getJmsOperations();
        java.lang.String str12 = activeMQConfiguration0.getCacheLevelName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(jmsOperations11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isAlwaysSyncSend();
        org.apache.activemq.management.StatsImpl statsImpl2 = activeMQConnection0.getStats();
        activeMQConnection0.setConsumerFailoverRedeliveryWaitPeriod((long) (byte) 0);
        boolean b5 = activeMQConnection0.isOptimizedMessageDispatch();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(statsImpl2);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory1 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory1.setDisableTimeStampsByDefault(true);
        java.util.Properties properties4 = camelConnectionFactory1.getProperties();
        camelConnectionFactory0.populateProperties(properties4);
        java.lang.String str6 = camelConnectionFactory0.getBrokerURL();
        org.apache.activemq.ActiveMQConnection activeMQConnection7 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b8 = activeMQConnection7.isAlwaysSyncSend();
        boolean b9 = activeMQConnection7.isConsumerExpiryCheckEnabled();
        javax.jms.ExceptionListener exceptionListener10 = activeMQConnection7.getExceptionListener();
        org.apache.activemq.ActiveMQConnection activeMQConnection11 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b12 = activeMQConnection11.isAlwaysSyncSend();
        boolean b13 = activeMQConnection11.isConsumerExpiryCheckEnabled();
        org.apache.activemq.blob.BlobTransferPolicy blobTransferPolicy14 = activeMQConnection11.getBlobTransferPolicy();
        activeMQConnection7.setBlobTransferPolicy(blobTransferPolicy14);
        camelConnectionFactory0.setBlobTransferPolicy(blobTransferPolicy14);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "failover://tcp://localhost:61616" + "'", str6.equals("failover://tcp://localhost:61616"));
        org.junit.Assert.assertNotNull(activeMQConnection7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(exceptionListener10);
        org.junit.Assert.assertNotNull(activeMQConnection11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(blobTransferPolicy14);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        org.apache.activemq.camel.component.CamelEndpointLoader camelEndpointLoader0 = new org.apache.activemq.camel.component.CamelEndpointLoader();
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        boolean b9 = jmsEndpoint3.isIncludeAllJMSXProperties();
        long long10 = jmsEndpoint3.getTimeToLive();
        jmsEndpoint3.setReplyToMaxConcurrentConsumers(100);
        jmsEndpoint3.shutdown();
        jmsEndpoint3.setAcknowledgementModeName("queue:");
        org.apache.camel.component.jms.MessageListenerContainerFactory messageListenerContainerFactory16 = null;
        jmsEndpoint3.setMessageListenerContainerFactory(messageListenerContainerFactory16);
        java.lang.String str18 = jmsEndpoint3.getAcknowledgementModeName();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(long10 == (-1L));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "queue:" + "'", str18.equals("queue:"));
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        activeMQConfiguration0.setCacheLevelName("tcp://localhost:61616");
        boolean b5 = activeMQConfiguration0.isAcceptMessagesWhileStopping();
        activeMQConfiguration0.setAcknowledgementModeName("hi!");
        org.apache.camel.component.jms.JmsMessageType jmsMessageType8 = null;
        activeMQConfiguration0.setJmsMessageType(jmsMessageType8);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        java.lang.String str2 = camelRoutesBroker1.getRoutesFile();
        int i3 = camelRoutesBroker1.getCheckPeriod();
        org.apache.activemq.broker.ConnectionContext connectionContext4 = null;
        org.apache.activemq.command.ConsumerInfo consumerInfo5 = null;
        try {
            camelRoutesBroker1.removeConsumer(connectionContext4, consumerInfo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 1000);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        jmsComponent1.setTransactionTimeout((int) (short) -1);
        org.springframework.jms.core.JmsOperations jmsOperations4 = null;
        jmsComponent1.setJmsOperations(jmsOperations4);
        jmsComponent1.setMapJmsMessage(false);
        jmsComponent1.setAsyncStartListener(false);
        org.junit.Assert.assertNotNull(jmsComponent1);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        jmsComponent1.setTransactionTimeout((int) (short) -1);
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration4 = jmsComponent1.getConfiguration();
        jmsComponent1.setReplyToCacheLevelName("");
        jmsComponent1.setReplyToMaxConcurrentConsumers((-1));
        org.junit.Assert.assertNotNull(jmsComponent1);
        org.junit.Assert.assertNotNull(jmsConfiguration4);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        boolean b2 = jmsComponent1.useRawUri();
        jmsComponent1.setAcknowledgementModeName("failover://tcp://localhost:61616");
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy5 = null;
        jmsComponent1.setMessageCreatedStrategy(messageCreatedStrategy5);
        org.junit.Assert.assertNotNull(jmsComponent1);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        org.apache.activemq.camel.CamelQueue camelQueue10 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding11 = camelQueue10.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint12 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue10);
        org.apache.activemq.camel.CamelQueue camelQueue14 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding15 = camelQueue14.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint16 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue14);
        jmsEndpoint12.setDestination((javax.jms.Destination) camelQueue14);
        org.apache.activemq.ActiveMQSession activeMQSession18 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer21 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelQueue5, (org.apache.camel.Endpoint) jmsEndpoint12, activeMQSession18, "failover://tcp://localhost:61616", false);
        jmsEndpoint12.setAcknowledgementModeName("hi!");
        long long24 = jmsEndpoint12.getRequestTimeout();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNotNull(jmsBinding11);
        org.junit.Assert.assertNotNull(jmsEndpoint12);
        org.junit.Assert.assertNotNull(jmsBinding15);
        org.junit.Assert.assertNotNull(jmsEndpoint16);
        org.junit.Assert.assertTrue(long24 == 20000L);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isAlwaysSyncSend();
        boolean b2 = activeMQConnection0.isConsumerExpiryCheckEnabled();
        javax.jms.ExceptionListener exceptionListener3 = activeMQConnection0.getExceptionListener();
        org.apache.activemq.thread.TaskRunnerFactory taskRunnerFactory4 = activeMQConnection0.getSessionTaskRunner();
        boolean b5 = activeMQConnection0.isNestedMapAndListEnabled();
        try {
            activeMQConnection0.checkClientIDWasManuallySpecified();
            org.junit.Assert.fail("Expected exception of type javax.jms.JMSException");
        } catch (javax.jms.JMSException e) {
        }
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(exceptionListener3);
        org.junit.Assert.assertNotNull(taskRunnerFactory4);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        java.lang.String str2 = camelRoutesBroker1.getRoutesFile();
        org.apache.activemq.broker.Connection connection3 = null;
        org.apache.activemq.command.BrokerInfo brokerInfo4 = null;
        try {
            camelRoutesBroker1.addBroker(connection3, brokerInfo4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        activeMQConfiguration0.setCacheLevelName("tcp://localhost:61616");
        boolean b5 = activeMQConfiguration0.isAcceptMessagesWhileStopping();
        activeMQConfiguration0.setUseSingleConnection(false);
        java.lang.String str8 = activeMQConfiguration0.getBrokerURL();
        org.apache.camel.component.jms.ConsumerType consumerType9 = activeMQConfiguration0.getConsumerType();
        boolean b10 = activeMQConfiguration0.isLazyCreateTransactionManager();
        activeMQConfiguration0.setMaxConcurrentConsumers((int) 'a');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "failover://tcp://localhost:61616" + "'", str8.equals("failover://tcp://localhost:61616"));
        org.junit.Assert.assertTrue("'" + consumerType9 + "' != '" + org.apache.camel.component.jms.ConsumerType.Default + "'", consumerType9.equals(org.apache.camel.component.jms.ConsumerType.Default));
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        activeMQConfiguration0.setCacheLevelName("tcp://localhost:61616");
        activeMQConfiguration0.setAcknowledgementMode((int) (byte) 0);
        activeMQConfiguration0.setAcknowledgementModeName("endpoint1130");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDisableReplyTo(true);
        org.apache.camel.spi.HeaderFilterStrategy headerFilterStrategy11 = null;
        jmsEndpoint3.setHeaderFilterStrategy(headerFilterStrategy11);
        try {
            javax.jms.ConnectionFactory connectionFactory13 = jmsEndpoint3.getListenerConnectionFactory();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        boolean b3 = activeMQConfiguration0.isLazyCreateTransactionManager();
        activeMQConfiguration0.setUsePooledConnection(true);
        java.lang.String str6 = activeMQConfiguration0.getReplyToDestinationSelectorName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        boolean b3 = activeMQConfiguration0.isErrorHandlerLogStackTrace();
        boolean b4 = activeMQConfiguration0.isMessageTimestampEnabled();
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy5 = activeMQConfiguration0.getMessageCreatedStrategy();
        activeMQConfiguration0.setReplyToCacheLevelName("");
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration8 = activeMQConfiguration0.copy();
        org.springframework.transaction.PlatformTransactionManager platformTransactionManager9 = null;
        activeMQConfiguration0.setTransactionManager(platformTransactionManager9);
        activeMQConfiguration0.setAllowNullBody(true);
        activeMQConfiguration0.setAcknowledgementMode((int) (short) 1);
        activeMQConfiguration0.setUseSingleConnection(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(messageCreatedStrategy5);
        org.junit.Assert.assertNotNull(jmsConfiguration8);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.Endpoint endpoint2 = null;
        camelQueue1.setEndpoint(endpoint2);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        org.apache.activemq.camel.CamelQueue camelQueue9 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding10 = camelQueue9.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint11 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue9);
        jmsEndpoint7.setDestination((javax.jms.Destination) camelQueue9);
        boolean b13 = jmsEndpoint7.isIncludeAllJMSXProperties();
        long long14 = jmsEndpoint7.getTimeToLive();
        org.apache.camel.component.jms.MessageListenerContainerFactory messageListenerContainerFactory15 = null;
        jmsEndpoint7.setMessageListenerContainerFactory(messageListenerContainerFactory15);
        jmsEndpoint7.setReplyToDeliveryPersistent(false);
        org.apache.activemq.ActiveMQSession activeMQSession19 = null;
        org.apache.activemq.camel.CamelQueueReceiver camelQueueReceiver21 = new org.apache.activemq.camel.CamelQueueReceiver(camelQueue1, (org.apache.camel.Endpoint) jmsEndpoint7, activeMQSession19, "temp:topic:");
        org.apache.camel.component.jms.JmsBinding jmsBinding22 = camelQueue1.getBinding();
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNotNull(jmsBinding10);
        org.junit.Assert.assertNotNull(jmsEndpoint11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(long14 == (-1L));
        org.junit.Assert.assertNotNull(jmsBinding22);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        activeMQConfiguration0.setCacheLevelName("tcp://localhost:61616");
        activeMQConfiguration0.setAcknowledgementMode((int) (byte) 0);
        java.lang.String str7 = activeMQConfiguration0.getTransactionName();
        activeMQConfiguration0.setRequestTimeout((long) (short) 0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        long long1 = camelConnectionFactory0.getWarnAboutUnstartedConnectionTimeout();
        camelConnectionFactory0.setAuditMaximumProducerNumber((int) (byte) 1);
        org.apache.camel.component.jms.JmsComponent jmsComponent4 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted((javax.jms.ConnectionFactory) camelConnectionFactory0);
        jmsComponent4.setConcurrentConsumers((int) (short) 100);
        jmsComponent4.setAsyncStopListener(true);
        org.junit.Assert.assertTrue(long1 == 500L);
        org.junit.Assert.assertNotNull(jmsComponent4);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        long long1 = camelConnectionFactory0.getWarnAboutUnstartedConnectionTimeout();
        javax.naming.Reference reference2 = camelConnectionFactory0.getReference();
        camelConnectionFactory0.setUseRetroactiveConsumer(false);
        org.junit.Assert.assertTrue(long1 == 500L);
        org.junit.Assert.assertNotNull(reference2);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        jmsComponent1.setTransactionTimeout((int) (short) -1);
        jmsComponent1.setDurableSubscriptionName("topic:");
        org.junit.Assert.assertNotNull(jmsComponent1);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory1 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory1.setDisableTimeStampsByDefault(true);
        java.util.Properties properties4 = camelConnectionFactory1.getProperties();
        camelConnectionFactory0.populateProperties(properties4);
        camelConnectionFactory0.setWarnAboutUnstartedConnectionTimeout((long) (short) -1);
        boolean b8 = camelConnectionFactory0.isAlwaysSyncSend();
        org.apache.activemq.ActiveMQConnectionFactory activeMQConnectionFactory9 = camelConnectionFactory0.copy();
        boolean b10 = camelConnectionFactory0.isUseAsyncSend();
        org.apache.camel.component.jms.JmsComponent jmsComponent11 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted((javax.jms.ConnectionFactory) camelConnectionFactory0);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(activeMQConnectionFactory9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(jmsComponent11);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory0.setObjectMessageSerializationDefered(true);
        camelConnectionFactory0.setSendTimeout((int) 'a');
        camelConnectionFactory0.setClientIDPrefix("failover://tcp://localhost:61616");
        camelConnectionFactory0.setNonBlockingRedelivery(false);
        java.io.ObjectInput objectInput9 = null;
        try {
            camelConnectionFactory0.readExternal(objectInput9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        org.apache.activemq.camel.CamelQueue camelQueue10 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding11 = camelQueue10.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint12 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue10);
        org.apache.activemq.camel.CamelQueue camelQueue14 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding15 = camelQueue14.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint16 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue14);
        jmsEndpoint12.setDestination((javax.jms.Destination) camelQueue14);
        org.apache.activemq.ActiveMQSession activeMQSession18 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer21 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelQueue5, (org.apache.camel.Endpoint) jmsEndpoint12, activeMQSession18, "failover://tcp://localhost:61616", false);
        boolean b22 = jmsEndpoint12.isStarting();
        org.springframework.jms.core.JmsOperations jmsOperations23 = null;
        jmsEndpoint12.setMetadataJmsOperations(jmsOperations23);
        org.apache.camel.component.jms.JmsKeyFormatStrategy jmsKeyFormatStrategy25 = null;
        jmsEndpoint12.setJmsKeyFormatStrategy(jmsKeyFormatStrategy25);
        int i27 = jmsEndpoint12.getPollingConsumerQueueSize();
        int i28 = jmsEndpoint12.getReplyToConcurrentConsumers();
        java.lang.String str29 = jmsEndpoint12.getReplyToType();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNotNull(jmsBinding11);
        org.junit.Assert.assertNotNull(jmsEndpoint12);
        org.junit.Assert.assertNotNull(jmsBinding15);
        org.junit.Assert.assertNotNull(jmsEndpoint16);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i27 == 1000);
        org.junit.Assert.assertTrue(i28 == 1);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        boolean b3 = activeMQConfiguration0.isErrorHandlerLogStackTrace();
        boolean b4 = activeMQConfiguration0.isMessageTimestampEnabled();
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy5 = activeMQConfiguration0.getMessageCreatedStrategy();
        activeMQConfiguration0.setDeliveryMode((java.lang.Integer) 100);
        org.apache.camel.component.jms.DefaultTaskExecutorType defaultTaskExecutorType8 = null;
        activeMQConfiguration0.setDefaultTaskExecutorType(defaultTaskExecutorType8);
        activeMQConfiguration0.setIncludeSentJMSMessageID(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(messageCreatedStrategy5);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        boolean b4 = jmsEndpoint3.isPubSubNoLocal();
        org.apache.camel.component.jms.JmsKeyFormatStrategy jmsKeyFormatStrategy5 = null;
        jmsEndpoint3.setJmsKeyFormatStrategy(jmsKeyFormatStrategy5);
        org.apache.camel.spi.HeaderFilterStrategy headerFilterStrategy7 = null;
        jmsEndpoint3.setHeaderFilterStrategy(headerFilterStrategy7);
        int i9 = jmsEndpoint3.getPriority();
        jmsEndpoint3.setTransactedInOut(false);
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i9 == 4);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        activeMQConfiguration0.setCacheLevelName("tcp://localhost:61616");
        org.apache.camel.component.jms.ConsumerType consumerType5 = activeMQConfiguration0.getConsumerType();
        boolean b6 = activeMQConfiguration0.isTransferException();
        java.lang.String str7 = activeMQConfiguration0.getReplyTo();
        boolean b8 = activeMQConfiguration0.isTransacted();
        activeMQConfiguration0.setRequestTimeout((-1L));
        activeMQConfiguration0.setReceiveTimeout((long) 100);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + consumerType5 + "' != '" + org.apache.camel.component.jms.ConsumerType.Default + "'", consumerType5.equals(org.apache.camel.component.jms.ConsumerType.Default));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        java.lang.String str0 = org.apache.activemq.ActiveMQConnection.DEFAULT_USER;
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory0.setDisableTimeStampsByDefault(true);
        camelConnectionFactory0.setBeanName("");
        int i5 = camelConnectionFactory0.getProducerWindowSize();
        java.io.ObjectInput objectInput6 = null;
        try {
            camelConnectionFactory0.readExternal(objectInput6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        javax.jms.Destination destination0 = null;
        try {
            org.apache.camel.component.jms.JmsEndpoint jmsEndpoint1 = org.apache.camel.component.jms.JmsEndpoint.newInstance(destination0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        boolean b3 = activeMQConfiguration0.isLazyCreateTransactionManager();
        activeMQConfiguration0.setAcknowledgementMode((int) (byte) 10);
        org.springframework.jms.support.converter.MessageConverter messageConverter6 = null;
        activeMQConfiguration0.setMessageConverter(messageConverter6);
        long long8 = activeMQConfiguration0.getRequestTimeout();
        activeMQConfiguration0.setPreserveMessageQos(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(long8 == 20000L);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        jmsComponent1.setAcknowledgementModeName("hi!");
        jmsComponent1.setAlwaysCopyMessage(true);
        boolean b6 = jmsComponent1.isSuspendingOrSuspended();
        org.apache.camel.component.jms.QueueBrowseStrategy queueBrowseStrategy7 = jmsComponent1.getQueueBrowseStrategy();
        jmsComponent1.setRecoveryInterval((long) 15000);
        jmsComponent1.setMapJmsMessage(false);
        org.junit.Assert.assertNotNull(jmsComponent1);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(queueBrowseStrategy7);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        boolean b4 = jmsEndpoint3.isPubSubNoLocal();
        jmsEndpoint3.setTimeToLive((long) (byte) 1);
        boolean b7 = jmsEndpoint3.isLenientProperties();
        int i8 = jmsEndpoint3.getIdleTaskExecutionLimit();
        org.apache.camel.EndpointConfiguration endpointConfiguration9 = null;
        jmsEndpoint3.setEndpointConfiguration(endpointConfiguration9);
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 1);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory0.setDisableTimeStampsByDefault(true);
        camelConnectionFactory0.setBeanName("");
        camelConnectionFactory0.setOptimizeAcknowledge(true);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration9 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str10 = activeMQConfiguration9.getReplyTo();
        boolean b11 = activeMQConfiguration9.isPubSubNoLocal();
        boolean b12 = activeMQConfiguration9.isLazyCreateTransactionManager();
        activeMQConfiguration9.setAcknowledgementMode((int) (byte) 10);
        activeMQConfiguration9.setMaxMessagesPerTask((int) (short) 10);
        org.springframework.core.task.TaskExecutor taskExecutor17 = null;
        activeMQConfiguration9.setTaskExecutor(taskExecutor17);
        org.apache.activemq.camel.CamelQueue camelQueue20 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding21 = camelQueue20.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint22 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue20);
        org.apache.activemq.camel.CamelQueue camelQueue24 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding25 = camelQueue24.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint26 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue24);
        jmsEndpoint22.setDestination((javax.jms.Destination) camelQueue24);
        boolean b28 = jmsEndpoint22.isIncludeAllJMSXProperties();
        long long29 = jmsEndpoint22.getTimeToLive();
        org.apache.camel.component.jms.MessageListenerContainerFactory messageListenerContainerFactory30 = null;
        jmsEndpoint22.setMessageListenerContainerFactory(messageListenerContainerFactory30);
        org.apache.camel.component.jms.DefaultTaskExecutorType defaultTaskExecutorType32 = null;
        jmsEndpoint22.setDefaultTaskExecutorType(defaultTaskExecutorType32);
        org.springframework.jms.core.JmsOperations jmsOperations36 = activeMQConfiguration9.createInOnlyTemplate(jmsEndpoint22, true, "2.16.1");
        jmsEndpoint3.setJmsOperations(jmsOperations36);
        org.apache.activemq.camel.CamelQueue camelQueue39 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding40 = camelQueue39.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint41 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue39);
        org.apache.activemq.camel.CamelQueue camelQueue43 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding44 = camelQueue43.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint45 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue43);
        jmsEndpoint41.setDestination((javax.jms.Destination) camelQueue43);
        org.apache.activemq.camel.CamelQueue camelQueue48 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding49 = camelQueue48.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint50 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue48);
        org.apache.activemq.camel.CamelQueue camelQueue52 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding53 = camelQueue52.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint54 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue52);
        jmsEndpoint50.setDestination((javax.jms.Destination) camelQueue52);
        org.apache.activemq.ActiveMQSession activeMQSession56 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer59 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelQueue43, (org.apache.camel.Endpoint) jmsEndpoint50, activeMQSession56, "failover://tcp://localhost:61616", false);
        boolean b60 = jmsEndpoint50.isStarting();
        org.springframework.jms.core.JmsOperations jmsOperations61 = null;
        jmsEndpoint50.setMetadataJmsOperations(jmsOperations61);
        org.apache.camel.component.jms.JmsKeyFormatStrategy jmsKeyFormatStrategy63 = null;
        jmsEndpoint50.setJmsKeyFormatStrategy(jmsKeyFormatStrategy63);
        org.springframework.transaction.PlatformTransactionManager platformTransactionManager65 = null;
        jmsEndpoint50.setTransactionManager(platformTransactionManager65);
        javax.jms.ConnectionFactory connectionFactory67 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent68 = org.apache.camel.component.jms.JmsComponent.jmsComponentClientAcknowledge(connectionFactory67);
        jmsComponent68.setAcceptMessagesWhileStopping(false);
        jmsComponent68.setPreserveMessageQos(true);
        jmsComponent68.setMapJmsMessage(false);
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration75 = jmsComponent68.getConfiguration();
        org.apache.camel.component.jms.JmsProviderMetadata jmsProviderMetadata76 = jmsConfiguration75.getProviderMetadata();
        jmsEndpoint50.setProviderMetadata(jmsProviderMetadata76);
        jmsEndpoint3.setProviderMetadata(jmsProviderMetadata76);
        java.lang.String str79 = jmsEndpoint3.getSelector();
        boolean b80 = jmsEndpoint3.isMessageTimestampEnabled();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(jmsBinding21);
        org.junit.Assert.assertNotNull(jmsEndpoint22);
        org.junit.Assert.assertNotNull(jmsBinding25);
        org.junit.Assert.assertNotNull(jmsEndpoint26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(long29 == (-1L));
        org.junit.Assert.assertNotNull(jmsOperations36);
        org.junit.Assert.assertNotNull(jmsBinding40);
        org.junit.Assert.assertNotNull(jmsEndpoint41);
        org.junit.Assert.assertNotNull(jmsBinding44);
        org.junit.Assert.assertNotNull(jmsEndpoint45);
        org.junit.Assert.assertNotNull(jmsBinding49);
        org.junit.Assert.assertNotNull(jmsEndpoint50);
        org.junit.Assert.assertNotNull(jmsBinding53);
        org.junit.Assert.assertNotNull(jmsEndpoint54);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(jmsComponent68);
        org.junit.Assert.assertNotNull(jmsConfiguration75);
        org.junit.Assert.assertNotNull(jmsProviderMetadata76);
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertTrue(b80 == true);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        org.apache.activemq.camel.CamelQueue camelQueue10 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding11 = camelQueue10.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint12 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue10);
        org.apache.activemq.camel.CamelQueue camelQueue14 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding15 = camelQueue14.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint16 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue14);
        jmsEndpoint12.setDestination((javax.jms.Destination) camelQueue14);
        org.apache.activemq.ActiveMQSession activeMQSession18 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer21 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelQueue5, (org.apache.camel.Endpoint) jmsEndpoint12, activeMQSession18, "failover://tcp://localhost:61616", false);
        jmsEndpoint12.setAcknowledgementModeName("hi!");
        try {
            org.springframework.jms.core.JmsOperations jmsOperations24 = jmsEndpoint12.createInOutTemplate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNotNull(jmsBinding11);
        org.junit.Assert.assertNotNull(jmsEndpoint12);
        org.junit.Assert.assertNotNull(jmsBinding15);
        org.junit.Assert.assertNotNull(jmsEndpoint16);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        int i4 = jmsEndpoint3.getMaxMessagesPerTask();
        java.lang.String str5 = jmsEndpoint3.getTransactionName();
        org.apache.camel.Processor processor6 = null;
        org.apache.activemq.camel.component.broker.BrokerConsumer brokerConsumer7 = new org.apache.activemq.camel.component.broker.BrokerConsumer((org.apache.camel.Endpoint) jmsEndpoint3, processor6);
        org.apache.camel.Route route8 = null;
        brokerConsumer7.setRoute(route8);
        org.apache.activemq.broker.ProducerBrokerExchange producerBrokerExchange10 = null;
        org.apache.activemq.command.Message message11 = null;
        brokerConsumer7.intercept(producerBrokerExchange10, message11);
        org.apache.activemq.broker.ProducerBrokerExchange producerBrokerExchange13 = null;
        org.apache.activemq.command.Message message14 = null;
        brokerConsumer7.intercept(producerBrokerExchange13, message14);
        org.apache.activemq.camel.CamelQueue camelQueue17 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding18 = camelQueue17.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint19 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue17);
        boolean b20 = jmsEndpoint19.isPubSubNoLocal();
        org.apache.camel.component.jms.JmsKeyFormatStrategy jmsKeyFormatStrategy21 = null;
        jmsEndpoint19.setJmsKeyFormatStrategy(jmsKeyFormatStrategy21);
        org.apache.activemq.camel.CamelQueue camelQueue24 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding25 = camelQueue24.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint26 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue24);
        jmsEndpoint26.setReplyToDestinationSelectorName("2.16.1");
        org.apache.camel.EndpointConfiguration endpointConfiguration29 = null;
        jmsEndpoint26.setEndpointConfiguration(endpointConfiguration29);
        org.apache.camel.ExchangePattern exchangePattern31 = jmsEndpoint26.getExchangePattern();
        org.apache.camel.Exchange exchange32 = jmsEndpoint19.createExchange(exchangePattern31);
        try {
            org.apache.camel.spi.UnitOfWork unitOfWork33 = brokerConsumer7.createUoW(exchange32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(jmsBinding18);
        org.junit.Assert.assertNotNull(jmsEndpoint19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(jmsBinding25);
        org.junit.Assert.assertNotNull(jmsEndpoint26);
        org.junit.Assert.assertTrue("'" + exchangePattern31 + "' != '" + org.apache.camel.ExchangePattern.InOnly + "'", exchangePattern31.equals(org.apache.camel.ExchangePattern.InOnly));
        org.junit.Assert.assertNotNull(exchange32);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory0.setExclusiveConsumer(false);
        boolean b3 = camelConnectionFactory0.isDisableTimeStampsByDefault();
        javax.jms.Connection connection6 = camelConnectionFactory0.createConnection("", "endpoint1130");
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(connection6);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent1 = org.apache.activemq.camel.component.ActiveMQComponent.activeMQComponent("2.16.1");
        activeMQComponent1.setAutoStartup(false);
        activeMQComponent1.setUsePooledConnection(false);
        org.junit.Assert.assertNotNull(activeMQComponent1);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        java.lang.String str2 = camelRoutesBroker1.getRoutesFile();
        int i3 = camelRoutesBroker1.getCheckPeriod();
        org.apache.activemq.broker.region.MessageReference messageReference4 = null;
        try {
            boolean b5 = camelRoutesBroker1.isExpired(messageReference4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 1000);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        activeMQConfiguration0.setCacheLevelName("tcp://localhost:61616");
        activeMQConfiguration0.setAcknowledgementMode((int) (byte) 0);
        boolean b7 = activeMQConfiguration0.isPubSubNoLocal();
        boolean b8 = activeMQConfiguration0.isExposeListenerSession();
        org.apache.camel.component.jms.EndpointMessageListener endpointMessageListener9 = null;
        try {
            activeMQConfiguration0.configureMessageListener(endpointMessageListener9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        jmsComponent1.setAcknowledgementModeName("hi!");
        jmsComponent1.setAlwaysCopyMessage(true);
        boolean b6 = jmsComponent1.isSuspendingOrSuspended();
        org.apache.camel.component.jms.QueueBrowseStrategy queueBrowseStrategy7 = jmsComponent1.getQueueBrowseStrategy();
        jmsComponent1.setUseMessageIDAsCorrelationID(false);
        org.junit.Assert.assertNotNull(jmsComponent1);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(queueBrowseStrategy7);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        org.apache.activemq.camel.CamelQueue camelQueue10 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding11 = camelQueue10.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint12 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue10);
        org.apache.activemq.camel.CamelQueue camelQueue14 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding15 = camelQueue14.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint16 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue14);
        jmsEndpoint12.setDestination((javax.jms.Destination) camelQueue14);
        org.apache.activemq.ActiveMQSession activeMQSession18 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer21 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelQueue5, (org.apache.camel.Endpoint) jmsEndpoint12, activeMQSession18, "failover://tcp://localhost:61616", false);
        boolean b22 = camelMessageConsumer21.isNoLocal();
        camelMessageConsumer21.close();
        java.lang.String str24 = camelMessageConsumer21.getMessageSelector();
        javax.jms.MessageListener messageListener25 = camelMessageConsumer21.getMessageListener();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNotNull(jmsBinding11);
        org.junit.Assert.assertNotNull(jmsEndpoint12);
        org.junit.Assert.assertNotNull(jmsBinding15);
        org.junit.Assert.assertNotNull(jmsEndpoint16);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "failover://tcp://localhost:61616" + "'", str24.equals("failover://tcp://localhost:61616"));
        org.junit.Assert.assertNull(messageListener25);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        boolean b4 = jmsEndpoint3.isPubSubNoLocal();
        jmsEndpoint3.setTimeToLive((long) (byte) 1);
        java.lang.Integer i7 = jmsEndpoint3.getDeliveryMode();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(i7);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        boolean b3 = activeMQConfiguration0.isLazyCreateTransactionManager();
        activeMQConfiguration0.setAcknowledgementMode((int) (byte) 10);
        org.springframework.jms.support.converter.MessageConverter messageConverter6 = null;
        activeMQConfiguration0.setMessageConverter(messageConverter6);
        long long8 = activeMQConfiguration0.getRequestTimeout();
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory9 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory9.setObjectMessageSerializationDefered(true);
        camelConnectionFactory9.setSendTimeout((int) 'a');
        camelConnectionFactory9.setDisableTimeStampsByDefault(false);
        activeMQConfiguration0.setTemplateConnectionFactory((javax.jms.ConnectionFactory) camelConnectionFactory9);
        boolean b17 = camelConnectionFactory9.isObjectMessageSerializationDefered();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(long8 == 20000L);
        org.junit.Assert.assertTrue(b17 == true);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory1 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory1.setDisableTimeStampsByDefault(true);
        java.util.Properties properties4 = camelConnectionFactory1.getProperties();
        camelConnectionFactory0.populateProperties(properties4);
        javax.jms.TopicConnection topicConnection8 = camelConnectionFactory0.createTopicConnection("queue:", "tcp://localhost:61616");
        boolean b9 = camelConnectionFactory0.isUseRetroactiveConsumer();
        camelConnectionFactory0.setBeanName("2.16.1");
        java.lang.String str12 = camelConnectionFactory0.getBrokerURL();
        camelConnectionFactory0.setConsumerFailoverRedeliveryWaitPeriod((-1L));
        camelConnectionFactory0.setClientID("");
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNotNull(topicConnection8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "failover://tcp://localhost:61616" + "'", str12.equals("failover://tcp://localhost:61616"));
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        boolean b3 = activeMQConfiguration0.isErrorHandlerLogStackTrace();
        boolean b4 = activeMQConfiguration0.isMessageTimestampEnabled();
        activeMQConfiguration0.setBrokerURL("temp:topic:");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        java.lang.String str2 = camelRoutesBroker1.getRoutesFile();
        int i3 = camelRoutesBroker1.getCheckPeriod();
        camelRoutesBroker1.setRoutesFile("hi!");
        try {
            camelRoutesBroker1.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 1000);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentClientAcknowledge(connectionFactory0);
        jmsComponent1.setAcceptMessagesWhileStopping(false);
        jmsComponent1.setPreserveMessageQos(true);
        org.apache.camel.spi.HeaderFilterStrategy headerFilterStrategy6 = jmsComponent1.getHeaderFilterStrategy();
        boolean b7 = jmsComponent1.isSuspendingOrSuspended();
        jmsComponent1.setDeliveryPersistent(false);
        jmsComponent1.setLazyCreateTransactionManager(false);
        org.junit.Assert.assertNotNull(jmsComponent1);
        org.junit.Assert.assertNull(headerFilterStrategy6);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isAlwaysSyncSend();
        org.apache.activemq.management.StatsImpl statsImpl2 = activeMQConnection0.getStats();
        activeMQConnection0.setExclusiveConsumer(true);
        org.apache.activemq.command.Command command5 = null;
        org.apache.activemq.AsyncCallback asyncCallback6 = null;
        try {
            activeMQConnection0.syncSendPacket(command5, asyncCallback6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(statsImpl2);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        boolean b4 = jmsEndpoint3.isPubSubNoLocal();
        jmsEndpoint3.setTimeToLive((long) (byte) 1);
        boolean b7 = jmsEndpoint3.isDeliveryPersistent();
        boolean b8 = jmsEndpoint3.isSuspending();
        org.apache.camel.CamelContext camelContext9 = null;
        jmsEndpoint3.setCamelContext(camelContext9);
        boolean b11 = jmsEndpoint3.isTransactedInOut();
        org.apache.camel.component.jms.JmsComponent jmsComponent12 = jmsEndpoint3.getComponent();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(jmsComponent12);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        activeMQConfiguration0.setCacheLevelName("tcp://localhost:61616");
        boolean b5 = activeMQConfiguration0.isExplicitQosEnabled();
        javax.jms.ExceptionListener exceptionListener6 = activeMQConfiguration0.getExceptionListener();
        activeMQConfiguration0.setSubscriptionDurable(true);
        org.apache.camel.component.jms.ReplyToType replyToType9 = activeMQConfiguration0.getReplyToType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(exceptionListener6);
        org.junit.Assert.assertNull(replyToType9);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        org.apache.activemq.camel.CamelQueue camelQueue10 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding11 = camelQueue10.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint12 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue10);
        org.apache.activemq.camel.CamelQueue camelQueue14 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding15 = camelQueue14.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint16 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue14);
        jmsEndpoint12.setDestination((javax.jms.Destination) camelQueue14);
        org.apache.activemq.ActiveMQSession activeMQSession18 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer21 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelQueue5, (org.apache.camel.Endpoint) jmsEndpoint12, activeMQSession18, "failover://tcp://localhost:61616", false);
        boolean b22 = jmsEndpoint12.isAlwaysCopyMessage();
        jmsEndpoint12.setLazyCreateTransactionManager(false);
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNotNull(jmsBinding11);
        org.junit.Assert.assertNotNull(jmsEndpoint12);
        org.junit.Assert.assertNotNull(jmsBinding15);
        org.junit.Assert.assertNotNull(jmsEndpoint16);
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setAlwaysCopyMessage(false);
        jmsEndpoint3.setReplyToConcurrentConsumers(100);
        jmsEndpoint3.stop();
        org.apache.camel.EndpointConfiguration endpointConfiguration14 = jmsEndpoint3.getEndpointConfiguration();
        boolean b15 = jmsEndpoint3.isDisableReplyTo();
        jmsEndpoint3.setLazyCreateTransactionManager(false);
        int i18 = jmsEndpoint3.getMaxConcurrentConsumers();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNull(endpointConfiguration14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i18 == 0);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory1 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory1.setDisableTimeStampsByDefault(true);
        java.util.Properties properties4 = camelConnectionFactory1.getProperties();
        camelConnectionFactory0.populateProperties(properties4);
        javax.jms.TopicConnection topicConnection8 = camelConnectionFactory0.createTopicConnection("queue:", "tcp://localhost:61616");
        boolean b9 = camelConnectionFactory0.isUseRetroactiveConsumer();
        int i10 = camelConnectionFactory0.getAuditMaximumProducerNumber();
        boolean b11 = camelConnectionFactory0.isUseBeanNameAsClientIdPrefix();
        javax.jms.Connection connection14 = camelConnectionFactory0.createConnection("queue:", "2.16.1");
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNotNull(topicConnection8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 64);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(connection14);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        boolean b3 = activeMQConfiguration0.isLazyCreateTransactionManager();
        activeMQConfiguration0.setAcknowledgementMode((int) (byte) 10);
        activeMQConfiguration0.setMaxMessagesPerTask((int) (short) 10);
        org.springframework.core.task.TaskExecutor taskExecutor8 = null;
        activeMQConfiguration0.setTaskExecutor(taskExecutor8);
        org.apache.activemq.camel.CamelQueue camelQueue11 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding12 = camelQueue11.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint13 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue11);
        org.apache.activemq.camel.CamelQueue camelQueue15 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding16 = camelQueue15.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint17 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue15);
        jmsEndpoint13.setDestination((javax.jms.Destination) camelQueue15);
        boolean b19 = jmsEndpoint13.isIncludeAllJMSXProperties();
        long long20 = jmsEndpoint13.getTimeToLive();
        org.apache.camel.component.jms.MessageListenerContainerFactory messageListenerContainerFactory21 = null;
        jmsEndpoint13.setMessageListenerContainerFactory(messageListenerContainerFactory21);
        org.apache.camel.component.jms.DefaultTaskExecutorType defaultTaskExecutorType23 = null;
        jmsEndpoint13.setDefaultTaskExecutorType(defaultTaskExecutorType23);
        org.springframework.jms.core.JmsOperations jmsOperations27 = activeMQConfiguration0.createInOnlyTemplate(jmsEndpoint13, true, "2.16.1");
        jmsEndpoint13.setMaxConcurrentConsumers((int) (byte) 100);
        org.springframework.core.task.TaskExecutor taskExecutor30 = null;
        jmsEndpoint13.setTaskExecutor(taskExecutor30);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(jmsBinding12);
        org.junit.Assert.assertNotNull(jmsEndpoint13);
        org.junit.Assert.assertNotNull(jmsBinding16);
        org.junit.Assert.assertNotNull(jmsEndpoint17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(long20 == (-1L));
        org.junit.Assert.assertNotNull(jmsOperations27);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDisableReplyTo(true);
        org.apache.camel.spi.HeaderFilterStrategy headerFilterStrategy11 = null;
        jmsEndpoint3.setHeaderFilterStrategy(headerFilterStrategy11);
        jmsEndpoint3.setTransactionTimeout((int) ' ');
        org.apache.camel.CamelContext camelContext15 = null;
        jmsEndpoint3.setCamelContext(camelContext15);
        org.apache.camel.spi.HeaderFilterStrategy headerFilterStrategy17 = null;
        jmsEndpoint3.setHeaderFilterStrategy(headerFilterStrategy17);
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        jmsComponent1.setAcknowledgementModeName("hi!");
        jmsComponent1.setLazyCreateTransactionManager(false);
        jmsComponent1.suspend();
        java.util.SortedMap<java.lang.String, org.apache.camel.impl.ParameterConfiguration> sortedmap_str_parameterConfiguration7 = jmsComponent1.getParameterConfigurationMap();
        org.junit.Assert.assertNotNull(jmsComponent1);
        org.junit.Assert.assertNotNull(sortedmap_str_parameterConfiguration7);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory0.setDisableTimeStampsByDefault(true);
        java.lang.String str3 = camelConnectionFactory0.getPassword();
        camelConnectionFactory0.setDisableTimeStampsByDefault(false);
        long long6 = camelConnectionFactory0.getOptimizedAckScheduledAckInterval();
        boolean b7 = camelConnectionFactory0.isMessagePrioritySupported();
        long long8 = camelConnectionFactory0.getOptimizeAcknowledgeTimeOut();
        camelConnectionFactory0.setMaxThreadPoolSize(0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue(long6 == 0L);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(long8 == 300L);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        boolean b3 = activeMQConfiguration0.isErrorHandlerLogStackTrace();
        activeMQConfiguration0.setTransactedInOut(false);
        org.apache.camel.component.jms.JmsComponent jmsComponent6 = org.apache.camel.component.jms.JmsComponent.jmsComponent((org.apache.camel.component.jms.JmsConfiguration) activeMQConfiguration0);
        org.apache.camel.component.jms.DefaultTaskExecutorType defaultTaskExecutorType7 = activeMQConfiguration0.getDefaultTaskExecutorType();
        boolean b8 = activeMQConfiguration0.isReplyToSameDestinationAllowed();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(jmsComponent6);
        org.junit.Assert.assertNull(defaultTaskExecutorType7);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent1 = org.apache.activemq.camel.component.ActiveMQComponent.activeMQComponent("queue:");
        activeMQComponent1.setExposeAllQueues(false);
        boolean b4 = activeMQComponent1.isExposeAllQueues();
        activeMQComponent1.setAsyncConsumer(true);
        activeMQComponent1.setReplyToConcurrentConsumers(1);
        org.junit.Assert.assertNotNull(activeMQComponent1);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        org.apache.activemq.camel.CamelQueue camelQueue10 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding11 = camelQueue10.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint12 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue10);
        org.apache.activemq.camel.CamelQueue camelQueue14 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding15 = camelQueue14.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint16 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue14);
        jmsEndpoint12.setDestination((javax.jms.Destination) camelQueue14);
        org.apache.activemq.ActiveMQSession activeMQSession18 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer21 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelQueue5, (org.apache.camel.Endpoint) jmsEndpoint12, activeMQSession18, "failover://tcp://localhost:61616", false);
        boolean b22 = jmsEndpoint12.isAlwaysCopyMessage();
        boolean b23 = jmsEndpoint12.isMultipleConsumersSupported();
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj24 = jmsEndpoint12.getConsumerProperties();
        org.apache.camel.spi.HeaderFilterStrategy headerFilterStrategy25 = null;
        jmsEndpoint12.setHeaderFilterStrategy(headerFilterStrategy25);
        int i27 = jmsEndpoint12.getTransactionTimeout();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNotNull(jmsBinding11);
        org.junit.Assert.assertNotNull(jmsEndpoint12);
        org.junit.Assert.assertNotNull(jmsBinding15);
        org.junit.Assert.assertNotNull(jmsEndpoint16);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(map_str_obj24);
        org.junit.Assert.assertTrue(i27 == (-1));
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isAlwaysSyncSend();
        org.apache.activemq.management.StatsImpl statsImpl2 = activeMQConnection0.getStats();
        activeMQConnection0.setConsumerFailoverRedeliveryWaitPeriod((long) (byte) 0);
        java.util.concurrent.ConcurrentMap<org.apache.activemq.command.ActiveMQTempDestination, org.apache.activemq.command.ActiveMQTempDestination> concurrentmap_activeMQTempDestination_activeMQTempDestination5 = activeMQConnection0.activeTempDestinations;
        boolean b6 = activeMQConnection0.isWatchTopicAdvisories();
        activeMQConnection0.setUseAsyncSend(false);
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(statsImpl2);
        org.junit.Assert.assertNotNull(concurrentmap_activeMQTempDestination_activeMQTempDestination5);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        org.apache.activemq.camel.CamelQueue camelQueue10 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding11 = camelQueue10.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint12 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue10);
        org.apache.activemq.camel.CamelQueue camelQueue14 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding15 = camelQueue14.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint16 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue14);
        jmsEndpoint12.setDestination((javax.jms.Destination) camelQueue14);
        org.apache.activemq.ActiveMQSession activeMQSession18 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer21 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelQueue5, (org.apache.camel.Endpoint) jmsEndpoint12, activeMQSession18, "failover://tcp://localhost:61616", false);
        boolean b22 = jmsEndpoint12.isAlwaysCopyMessage();
        boolean b23 = jmsEndpoint12.isMultipleConsumersSupported();
        jmsEndpoint12.setReplyToConcurrentConsumers((int) (short) 0);
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNotNull(jmsBinding11);
        org.junit.Assert.assertNotNull(jmsEndpoint12);
        org.junit.Assert.assertNotNull(jmsBinding15);
        org.junit.Assert.assertNotNull(jmsEndpoint16);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == true);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        long long1 = camelConnectionFactory0.getWarnAboutUnstartedConnectionTimeout();
        org.apache.activemq.RedeliveryPolicy redeliveryPolicy2 = null;
        camelConnectionFactory0.setRedeliveryPolicy(redeliveryPolicy2);
        camelConnectionFactory0.setBeanName("tcp://localhost:61616");
        java.lang.String str6 = camelConnectionFactory0.getUserName();
        org.apache.camel.component.jms.JmsComponent jmsComponent7 = org.apache.camel.component.jms.JmsComponent.jmsComponentClientAcknowledge((javax.jms.ConnectionFactory) camelConnectionFactory0);
        jmsComponent7.setIncludeSentJMSMessageID(false);
        org.junit.Assert.assertTrue(long1 == 500L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(jmsComponent7);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        try {
            org.apache.activemq.ActiveMQConnection activeMQConnection3 = org.apache.activemq.ActiveMQConnection.makeConnection("", "Consumer[jms:queue:queue:]", "endpoint1079");
            org.junit.Assert.fail("Expected exception of type javax.jms.JMSException");
        } catch (javax.jms.JMSException e) {
        }
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        int i4 = jmsEndpoint3.getMaxMessagesPerTask();
        java.lang.String str5 = jmsEndpoint3.getTransactionName();
        org.apache.camel.Processor processor6 = null;
        org.apache.activemq.camel.component.broker.BrokerConsumer brokerConsumer7 = new org.apache.activemq.camel.component.broker.BrokerConsumer((org.apache.camel.Endpoint) jmsEndpoint3, processor6);
        org.apache.camel.Route route8 = null;
        brokerConsumer7.setRoute(route8);
        org.apache.activemq.broker.ProducerBrokerExchange producerBrokerExchange10 = null;
        org.apache.activemq.command.Message message11 = null;
        brokerConsumer7.intercept(producerBrokerExchange10, message11);
        org.apache.activemq.broker.ProducerBrokerExchange producerBrokerExchange13 = null;
        org.apache.activemq.command.Message message14 = null;
        brokerConsumer7.intercept(producerBrokerExchange13, message14);
        org.apache.activemq.broker.ProducerBrokerExchange producerBrokerExchange16 = null;
        org.apache.activemq.command.Message message17 = null;
        brokerConsumer7.intercept(producerBrokerExchange16, message17);
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        activeMQConfiguration0.setPriority((int) (short) 100);
        activeMQConfiguration0.setTransferException(false);
        boolean b6 = activeMQConfiguration0.isTransactedInOut();
        boolean b7 = activeMQConfiguration0.isExplicitQosEnabled();
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration8 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str9 = activeMQConfiguration8.getReplyTo();
        boolean b10 = activeMQConfiguration8.isPubSubNoLocal();
        activeMQConfiguration8.setCacheLevelName("tcp://localhost:61616");
        org.apache.camel.component.jms.ConsumerType consumerType13 = activeMQConfiguration8.getConsumerType();
        activeMQConfiguration0.setConsumerType(consumerType13);
        activeMQConfiguration0.setIdleConsumerLimit((int) '4');
        activeMQConfiguration0.setErrorHandlerLogStackTrace(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + consumerType13 + "' != '" + org.apache.camel.component.jms.ConsumerType.Default + "'", consumerType13.equals(org.apache.camel.component.jms.ConsumerType.Default));
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isAlwaysSyncSend();
        org.apache.activemq.management.StatsImpl statsImpl2 = activeMQConnection0.getStats();
        activeMQConnection0.setExclusiveConsumer(true);
        int i5 = activeMQConnection0.getSendTimeout();
        boolean b6 = activeMQConnection0.isOptimizedMessageDispatch();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(statsImpl2);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        org.apache.activemq.camel.CamelQueue camelQueue10 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding11 = camelQueue10.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint12 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue10);
        org.apache.activemq.camel.CamelQueue camelQueue14 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding15 = camelQueue14.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint16 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue14);
        jmsEndpoint12.setDestination((javax.jms.Destination) camelQueue14);
        org.apache.activemq.ActiveMQSession activeMQSession18 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer21 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelQueue5, (org.apache.camel.Endpoint) jmsEndpoint12, activeMQSession18, "failover://tcp://localhost:61616", false);
        boolean b22 = jmsEndpoint12.isAlwaysCopyMessage();
        boolean b23 = jmsEndpoint12.isMultipleConsumersSupported();
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj24 = jmsEndpoint12.getConsumerProperties();
        org.apache.camel.spi.HeaderFilterStrategy headerFilterStrategy25 = null;
        jmsEndpoint12.setHeaderFilterStrategy(headerFilterStrategy25);
        boolean b27 = jmsEndpoint12.isIncludeSentJMSMessageID();
        jmsEndpoint12.setReplyToDeliveryPersistent(false);
        java.lang.String str30 = jmsEndpoint12.getReplyToDestinationSelectorName();
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory31 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory31.setObjectMessageSerializationDefered(true);
        camelConnectionFactory31.setSendTimeout((int) 'a');
        camelConnectionFactory31.setDisableTimeStampsByDefault(false);
        jmsEndpoint12.setConnectionFactory((javax.jms.ConnectionFactory) camelConnectionFactory31);
        camelConnectionFactory31.setPassword("queue:");
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNotNull(jmsBinding11);
        org.junit.Assert.assertNotNull(jmsEndpoint12);
        org.junit.Assert.assertNotNull(jmsBinding15);
        org.junit.Assert.assertNotNull(jmsEndpoint16);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(map_str_obj24);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory1 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory1.setDisableTimeStampsByDefault(true);
        java.util.Properties properties4 = camelConnectionFactory1.getProperties();
        camelConnectionFactory0.populateProperties(properties4);
        javax.jms.TopicConnection topicConnection8 = camelConnectionFactory0.createTopicConnection("queue:", "tcp://localhost:61616");
        boolean b9 = camelConnectionFactory0.isUseRetroactiveConsumer();
        int i10 = camelConnectionFactory0.getAuditMaximumProducerNumber();
        boolean b11 = camelConnectionFactory0.isUseBeanNameAsClientIdPrefix();
        org.apache.activemq.MessageTransformer messageTransformer12 = null;
        camelConnectionFactory0.setTransformer(messageTransformer12);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNotNull(topicConnection8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 64);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration9 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str10 = activeMQConfiguration9.getReplyTo();
        boolean b11 = activeMQConfiguration9.isPubSubNoLocal();
        boolean b12 = activeMQConfiguration9.isLazyCreateTransactionManager();
        activeMQConfiguration9.setAcknowledgementMode((int) (byte) 10);
        activeMQConfiguration9.setMaxMessagesPerTask((int) (short) 10);
        org.springframework.core.task.TaskExecutor taskExecutor17 = null;
        activeMQConfiguration9.setTaskExecutor(taskExecutor17);
        org.apache.activemq.camel.CamelQueue camelQueue20 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding21 = camelQueue20.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint22 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue20);
        org.apache.activemq.camel.CamelQueue camelQueue24 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding25 = camelQueue24.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint26 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue24);
        jmsEndpoint22.setDestination((javax.jms.Destination) camelQueue24);
        boolean b28 = jmsEndpoint22.isIncludeAllJMSXProperties();
        long long29 = jmsEndpoint22.getTimeToLive();
        org.apache.camel.component.jms.MessageListenerContainerFactory messageListenerContainerFactory30 = null;
        jmsEndpoint22.setMessageListenerContainerFactory(messageListenerContainerFactory30);
        org.apache.camel.component.jms.DefaultTaskExecutorType defaultTaskExecutorType32 = null;
        jmsEndpoint22.setDefaultTaskExecutorType(defaultTaskExecutorType32);
        org.springframework.jms.core.JmsOperations jmsOperations36 = activeMQConfiguration9.createInOnlyTemplate(jmsEndpoint22, true, "2.16.1");
        jmsEndpoint3.setJmsOperations(jmsOperations36);
        jmsEndpoint3.setPreserveMessageQos(true);
        boolean b40 = jmsEndpoint3.isTestConnectionOnStartup();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(jmsBinding21);
        org.junit.Assert.assertNotNull(jmsEndpoint22);
        org.junit.Assert.assertNotNull(jmsBinding25);
        org.junit.Assert.assertNotNull(jmsEndpoint26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(long29 == (-1L));
        org.junit.Assert.assertNotNull(jmsOperations36);
        org.junit.Assert.assertTrue(b40 == false);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent1 = org.apache.activemq.camel.component.ActiveMQComponent.activeMQComponent("2.16.1");
        activeMQComponent1.setUsePooledConnection(true);
        java.lang.String str4 = activeMQComponent1.getVersion();
        org.junit.Assert.assertNotNull(activeMQComponent1);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "2.16.1" + "'", str4.equals("2.16.1"));
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentClientAcknowledge(connectionFactory0);
        jmsComponent1.setAcceptMessagesWhileStopping(false);
        boolean b4 = jmsComponent1.isStarting();
        jmsComponent1.setDeliveryPersistent(false);
        org.junit.Assert.assertNotNull(jmsComponent1);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        java.lang.String str3 = activeMQConfiguration0.getDurableSubscriptionName();
        org.apache.camel.component.jms.ReplyToType replyToType4 = activeMQConfiguration0.getReplyToType();
        activeMQConfiguration0.setDisableTimeToLive(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(replyToType4);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        org.apache.activemq.camel.CamelQueue camelQueue10 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding11 = camelQueue10.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint12 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue10);
        org.apache.activemq.camel.CamelQueue camelQueue14 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding15 = camelQueue14.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint16 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue14);
        jmsEndpoint12.setDestination((javax.jms.Destination) camelQueue14);
        org.apache.activemq.ActiveMQSession activeMQSession18 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer21 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelQueue5, (org.apache.camel.Endpoint) jmsEndpoint12, activeMQSession18, "failover://tcp://localhost:61616", false);
        jmsEndpoint12.setAcknowledgementModeName("hi!");
        jmsEndpoint12.setLazyCreateTransactionManager(false);
        boolean b26 = jmsEndpoint12.isDeliveryPersistent();
        boolean b27 = jmsEndpoint12.isIncludeAllJMSXProperties();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNotNull(jmsBinding11);
        org.junit.Assert.assertNotNull(jmsEndpoint12);
        org.junit.Assert.assertNotNull(jmsBinding15);
        org.junit.Assert.assertNotNull(jmsEndpoint16);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        org.apache.activemq.camel.CamelQueue camelQueue10 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding11 = camelQueue10.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint12 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue10);
        org.apache.activemq.camel.CamelQueue camelQueue14 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding15 = camelQueue14.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint16 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue14);
        jmsEndpoint12.setDestination((javax.jms.Destination) camelQueue14);
        org.apache.activemq.ActiveMQSession activeMQSession18 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer21 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelQueue5, (org.apache.camel.Endpoint) jmsEndpoint12, activeMQSession18, "failover://tcp://localhost:61616", false);
        org.springframework.jms.core.JmsOperations jmsOperations22 = jmsEndpoint12.getJmsOperations();
        jmsEndpoint12.setClientId("tcp://localhost:61616");
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNotNull(jmsBinding11);
        org.junit.Assert.assertNotNull(jmsEndpoint12);
        org.junit.Assert.assertNotNull(jmsBinding15);
        org.junit.Assert.assertNotNull(jmsEndpoint16);
        org.junit.Assert.assertNull(jmsOperations22);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        jmsComponent1.setTransactionTimeout((int) (short) -1);
        jmsComponent1.setAsyncConsumer(true);
        jmsComponent1.setCacheLevelName("endpoint1130");
        org.junit.Assert.assertNotNull(jmsComponent1);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        activeMQConfiguration0.setMapJmsMessage(true);
        activeMQConfiguration0.setTestConnectionOnStartup(true);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setAlwaysCopyMessage(false);
        jmsEndpoint3.setReplyToConcurrentConsumers(100);
        jmsEndpoint3.stop();
        boolean b14 = jmsEndpoint3.isLazyCreateTransactionManager();
        jmsEndpoint3.setClientId("ActiveMQConnection {id=ID:ubuntu-48220-1505887086933-133:1,clientId=null,started=false}");
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        boolean b4 = jmsEndpoint3.isPubSubNoLocal();
        jmsEndpoint3.setTimeToLive((long) (byte) 1);
        boolean b7 = jmsEndpoint3.isDeliveryPersistent();
        boolean b8 = jmsEndpoint3.isSuspending();
        org.apache.camel.CamelContext camelContext9 = null;
        jmsEndpoint3.setCamelContext(camelContext9);
        org.apache.camel.component.jms.JmsKeyFormatStrategy jmsKeyFormatStrategy11 = null;
        jmsEndpoint3.setJmsKeyFormatStrategy(jmsKeyFormatStrategy11);
        org.springframework.transaction.PlatformTransactionManager platformTransactionManager13 = jmsEndpoint3.getTransactionManager();
        java.lang.String str14 = jmsEndpoint3.getEndpointUri();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(platformTransactionManager13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "jms:queue:queue:" + "'", str14.equals("jms:queue:queue:"));
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        activeMQConfiguration0.setCacheLevelName("tcp://localhost:61616");
        org.apache.camel.component.jms.ConsumerType consumerType5 = activeMQConfiguration0.getConsumerType();
        boolean b6 = activeMQConfiguration0.isErrorHandlerLogStackTrace();
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration7 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str8 = activeMQConfiguration7.getReplyTo();
        boolean b9 = activeMQConfiguration7.isPubSubNoLocal();
        activeMQConfiguration7.setCacheLevelName("tcp://localhost:61616");
        long long12 = activeMQConfiguration7.getTimeToLive();
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration13 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str14 = activeMQConfiguration13.getReplyTo();
        boolean b15 = activeMQConfiguration13.isPubSubNoLocal();
        activeMQConfiguration13.setCacheLevelName("tcp://localhost:61616");
        org.apache.camel.component.jms.ConsumerType consumerType18 = activeMQConfiguration13.getConsumerType();
        activeMQConfiguration7.setConsumerType(consumerType18);
        activeMQConfiguration0.setConsumerType(consumerType18);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + consumerType5 + "' != '" + org.apache.camel.component.jms.ConsumerType.Default + "'", consumerType5.equals(org.apache.camel.component.jms.ConsumerType.Default));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(long12 == (-1L));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + consumerType18 + "' != '" + org.apache.camel.component.jms.ConsumerType.Default + "'", consumerType18.equals(org.apache.camel.component.jms.ConsumerType.Default));
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentClientAcknowledge(connectionFactory0);
        jmsComponent1.setAcceptMessagesWhileStopping(false);
        boolean b4 = jmsComponent1.isStarting();
        org.apache.camel.CamelContext camelContext5 = null;
        jmsComponent1.setCamelContext(camelContext5);
        jmsComponent1.setAsyncConsumer(false);
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration9 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str10 = activeMQConfiguration9.getReplyTo();
        org.apache.camel.component.jms.ConsumerType consumerType11 = null;
        activeMQConfiguration9.setConsumerType(consumerType11);
        activeMQConfiguration9.setConcurrentConsumers((int) (short) 1);
        activeMQConfiguration9.setExplicitQosEnabled(false);
        org.apache.camel.component.jms.JmsKeyFormatStrategy jmsKeyFormatStrategy17 = activeMQConfiguration9.getJmsKeyFormatStrategy();
        jmsComponent1.setJmsKeyFormatStrategy(jmsKeyFormatStrategy17);
        org.junit.Assert.assertNotNull(jmsComponent1);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(jmsKeyFormatStrategy17);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        long long3 = activeMQConfiguration0.getRequestTimeout();
        activeMQConfiguration0.setExposeListenerSession(false);
        int i6 = activeMQConfiguration0.getTransactionTimeout();
        org.springframework.jms.support.destination.DestinationResolver destinationResolver7 = activeMQConfiguration0.getDestinationResolver();
        boolean b8 = activeMQConfiguration0.isDisableReplyTo();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(long3 == 20000L);
        org.junit.Assert.assertTrue(i6 == (-1));
        org.junit.Assert.assertNull(destinationResolver7);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory0.setDisableTimeStampsByDefault(true);
        camelConnectionFactory0.setBeanName("");
        int i5 = camelConnectionFactory0.getProducerWindowSize();
        camelConnectionFactory0.setExclusiveConsumer(false);
        camelConnectionFactory0.setOptimizeAcknowledgeTimeOut(0L);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        int i4 = jmsEndpoint3.getMaxMessagesPerTask();
        java.lang.String str5 = jmsEndpoint3.getTransactionName();
        org.apache.camel.Processor processor6 = null;
        org.apache.activemq.camel.component.broker.BrokerConsumer brokerConsumer7 = new org.apache.activemq.camel.component.broker.BrokerConsumer((org.apache.camel.Endpoint) jmsEndpoint3, processor6);
        org.apache.camel.Route route8 = null;
        brokerConsumer7.setRoute(route8);
        org.apache.activemq.broker.ProducerBrokerExchange producerBrokerExchange10 = null;
        org.apache.activemq.command.Message message11 = null;
        brokerConsumer7.intercept(producerBrokerExchange10, message11);
        java.lang.String str13 = brokerConsumer7.toString();
        org.apache.activemq.camel.CamelQueue camelQueue15 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding16 = camelQueue15.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint17 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue15);
        boolean b18 = jmsEndpoint17.isPubSubNoLocal();
        org.apache.camel.component.jms.JmsKeyFormatStrategy jmsKeyFormatStrategy19 = null;
        jmsEndpoint17.setJmsKeyFormatStrategy(jmsKeyFormatStrategy19);
        org.apache.activemq.camel.CamelQueue camelQueue22 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding23 = camelQueue22.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint24 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue22);
        jmsEndpoint24.setReplyToDestinationSelectorName("2.16.1");
        org.apache.camel.EndpointConfiguration endpointConfiguration27 = null;
        jmsEndpoint24.setEndpointConfiguration(endpointConfiguration27);
        org.apache.camel.ExchangePattern exchangePattern29 = jmsEndpoint24.getExchangePattern();
        org.apache.camel.Exchange exchange30 = jmsEndpoint17.createExchange(exchangePattern29);
        try {
            org.apache.camel.spi.UnitOfWork unitOfWork31 = brokerConsumer7.createUoW(exchange30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Consumer[jms:queue:queue:]" + "'", str13.equals("Consumer[jms:queue:queue:]"));
        org.junit.Assert.assertNotNull(jmsBinding16);
        org.junit.Assert.assertNotNull(jmsEndpoint17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(jmsBinding23);
        org.junit.Assert.assertNotNull(jmsEndpoint24);
        org.junit.Assert.assertTrue("'" + exchangePattern29 + "' != '" + org.apache.camel.ExchangePattern.InOnly + "'", exchangePattern29.equals(org.apache.camel.ExchangePattern.InOnly));
        org.junit.Assert.assertNotNull(exchange30);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        jmsComponent1.start();
        jmsComponent1.setAcknowledgementModeName("temp:topic:");
        java.lang.String str5 = jmsComponent1.getVersion();
        org.junit.Assert.assertNotNull(jmsComponent1);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "2.16.1" + "'", str5.equals("2.16.1"));
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        jmsEndpoint3.setReplyToDestinationSelectorName("2.16.1");
        boolean b6 = jmsEndpoint3.isExposeListenerSession();
        jmsEndpoint3.setTransferException(false);
        jmsEndpoint3.setRequestTimeout((long) 2048);
        boolean b11 = jmsEndpoint3.isMultipleConsumersSupported();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        boolean b3 = activeMQConfiguration0.isLazyCreateTransactionManager();
        activeMQConfiguration0.setAcknowledgementMode((int) (byte) 10);
        org.springframework.jms.support.converter.MessageConverter messageConverter6 = null;
        activeMQConfiguration0.setMessageConverter(messageConverter6);
        long long8 = activeMQConfiguration0.getRequestTimeout();
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory9 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory9.setObjectMessageSerializationDefered(true);
        camelConnectionFactory9.setSendTimeout((int) 'a');
        camelConnectionFactory9.setDisableTimeStampsByDefault(false);
        activeMQConfiguration0.setTemplateConnectionFactory((javax.jms.ConnectionFactory) camelConnectionFactory9);
        java.lang.String str17 = activeMQConfiguration0.getReplyToOverride();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(long8 == 20000L);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        activeMQConfiguration0.setCacheLevelName("tcp://localhost:61616");
        boolean b5 = activeMQConfiguration0.isExplicitQosEnabled();
        javax.jms.ExceptionListener exceptionListener6 = activeMQConfiguration0.getExceptionListener();
        int i7 = activeMQConfiguration0.getIdleConsumerLimit();
        boolean b8 = activeMQConfiguration0.isUsePooledConnection();
        org.springframework.core.task.TaskExecutor taskExecutor9 = null;
        activeMQConfiguration0.setTaskExecutor(taskExecutor9);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(exceptionListener6);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        org.apache.activemq.camel.CamelQueue camelQueue10 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding11 = camelQueue10.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint12 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue10);
        org.apache.activemq.camel.CamelQueue camelQueue14 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding15 = camelQueue14.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint16 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue14);
        jmsEndpoint12.setDestination((javax.jms.Destination) camelQueue14);
        org.apache.activemq.ActiveMQSession activeMQSession18 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer21 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelQueue5, (org.apache.camel.Endpoint) jmsEndpoint12, activeMQSession18, "failover://tcp://localhost:61616", false);
        jmsEndpoint12.setAcknowledgementModeName("hi!");
        jmsEndpoint12.setLazyCreateTransactionManager(false);
        jmsEndpoint12.setDisableTimeToLive(false);
        java.lang.String str28 = jmsEndpoint12.getReplyTo();
        jmsEndpoint12.setSubscriptionDurable(false);
        boolean b31 = jmsEndpoint12.isSubscriptionDurable();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNotNull(jmsBinding11);
        org.junit.Assert.assertNotNull(jmsEndpoint12);
        org.junit.Assert.assertNotNull(jmsBinding15);
        org.junit.Assert.assertNotNull(jmsEndpoint16);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        java.lang.String str4 = jmsEndpoint3.getEndpointUri();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "jms:queue:queue:" + "'", str4.equals("jms:queue:queue:"));
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        org.apache.activemq.camel.CamelQueue camelQueue10 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding11 = camelQueue10.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint12 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue10);
        org.apache.activemq.camel.CamelQueue camelQueue14 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding15 = camelQueue14.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint16 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue14);
        jmsEndpoint12.setDestination((javax.jms.Destination) camelQueue14);
        org.apache.activemq.ActiveMQSession activeMQSession18 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer21 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelQueue5, (org.apache.camel.Endpoint) jmsEndpoint12, activeMQSession18, "failover://tcp://localhost:61616", false);
        org.springframework.jms.core.JmsOperations jmsOperations22 = jmsEndpoint12.getJmsOperations();
        jmsEndpoint12.setTimeToLive((long) 0);
        long long25 = jmsEndpoint12.getRequestTimeout();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNotNull(jmsBinding11);
        org.junit.Assert.assertNotNull(jmsEndpoint12);
        org.junit.Assert.assertNotNull(jmsBinding15);
        org.junit.Assert.assertNotNull(jmsEndpoint16);
        org.junit.Assert.assertNull(jmsOperations22);
        org.junit.Assert.assertTrue(long25 == 20000L);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        jmsComponent1.setTransactionTimeout((int) (short) -1);
        jmsComponent1.setAsyncConsumer(true);
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration6 = jmsComponent1.getConfiguration();
        org.apache.camel.component.jms.JmsMessageType jmsMessageType7 = jmsConfiguration6.getJmsMessageType();
        jmsConfiguration6.setAsyncStartListener(true);
        org.junit.Assert.assertNotNull(jmsComponent1);
        org.junit.Assert.assertNotNull(jmsConfiguration6);
        org.junit.Assert.assertNull(jmsMessageType7);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        activeMQConfiguration0.setCacheLevelName("tcp://localhost:61616");
        org.apache.camel.component.jms.ConsumerType consumerType5 = activeMQConfiguration0.getConsumerType();
        boolean b6 = activeMQConfiguration0.isErrorHandlerLogStackTrace();
        boolean b7 = activeMQConfiguration0.isAutoStartup();
        boolean b8 = activeMQConfiguration0.isUseSingleConnection();
        java.lang.String str9 = activeMQConfiguration0.getBrokerURL();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + consumerType5 + "' != '" + org.apache.camel.component.jms.ConsumerType.Default + "'", consumerType5.equals(org.apache.camel.component.jms.ConsumerType.Default));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "failover://tcp://localhost:61616" + "'", str9.equals("failover://tcp://localhost:61616"));
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        java.lang.String str2 = camelRoutesBroker1.getRoutesFile();
        int i3 = camelRoutesBroker1.getCheckPeriod();
        org.apache.activemq.broker.Connection connection4 = null;
        org.apache.activemq.command.BrokerInfo brokerInfo5 = null;
        try {
            camelRoutesBroker1.removeBroker(connection4, brokerInfo5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 1000);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory0.setDisableTimeStampsByDefault(true);
        camelConnectionFactory0.setBeanName("");
        camelConnectionFactory0.setUseAsyncSend(false);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        long long1 = camelConnectionFactory0.getWarnAboutUnstartedConnectionTimeout();
        javax.naming.Reference reference2 = camelConnectionFactory0.getReference();
        int i3 = camelConnectionFactory0.getSendTimeout();
        org.junit.Assert.assertTrue(long1 == 500L);
        org.junit.Assert.assertNotNull(reference2);
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        jmsComponent1.setAcknowledgementModeName("failover://tcp://localhost:61616");
        jmsComponent1.setDeliveryPersistent(false);
        org.junit.Assert.assertNotNull(jmsComponent1);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        org.apache.activemq.camel.CamelTopic camelTopic0 = null;
        org.apache.activemq.camel.CamelQueue camelQueue2 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding3 = camelQueue2.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint4 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue2);
        org.apache.activemq.camel.CamelQueue camelQueue6 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding7 = camelQueue6.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint8 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue6);
        jmsEndpoint4.setDestination((javax.jms.Destination) camelQueue6);
        boolean b10 = jmsEndpoint4.isIncludeAllJMSXProperties();
        long long11 = jmsEndpoint4.getTimeToLive();
        jmsEndpoint4.setReplyToMaxConcurrentConsumers(100);
        jmsEndpoint4.setMessageIdEnabled(true);
        jmsEndpoint4.stop();
        org.apache.activemq.ActiveMQSession activeMQSession17 = null;
        try {
            org.apache.activemq.camel.CamelTopicPublisher camelTopicPublisher18 = new org.apache.activemq.camel.CamelTopicPublisher(camelTopic0, (org.apache.camel.Endpoint) jmsEndpoint4, activeMQSession17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(jmsBinding3);
        org.junit.Assert.assertNotNull(jmsEndpoint4);
        org.junit.Assert.assertNotNull(jmsBinding7);
        org.junit.Assert.assertNotNull(jmsEndpoint8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(long11 == (-1L));
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.CamelContext camelContext3 = null;
        camelQueue1.setCamelContext(camelContext3);
        java.lang.String str5 = camelQueue1.toString();
        java.lang.String str6 = camelQueue1.getQueueName();
        org.apache.activemq.ActiveMQSession activeMQSession7 = null;
        try {
            javax.jms.TopicPublisher topicPublisher8 = camelQueue1.createPublisher(activeMQSession7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "queue:" + "'", str5.equals("queue:"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "queue:" + "'", str6.equals("queue:"));
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        activeMQConfiguration0.setCacheLevelName("tcp://localhost:61616");
        long long5 = activeMQConfiguration0.getTimeToLive();
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration6 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str7 = activeMQConfiguration6.getReplyTo();
        boolean b8 = activeMQConfiguration6.isPubSubNoLocal();
        activeMQConfiguration6.setCacheLevelName("tcp://localhost:61616");
        org.apache.camel.component.jms.ConsumerType consumerType11 = activeMQConfiguration6.getConsumerType();
        activeMQConfiguration0.setConsumerType(consumerType11);
        long long13 = activeMQConfiguration0.getRecoveryInterval();
        java.lang.String str14 = activeMQConfiguration0.getReplyToCacheLevelName();
        org.apache.camel.component.jms.DefaultTaskExecutorType defaultTaskExecutorType15 = activeMQConfiguration0.getDefaultTaskExecutorType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(long5 == (-1L));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + consumerType11 + "' != '" + org.apache.camel.component.jms.ConsumerType.Default + "'", consumerType11.equals(org.apache.camel.component.jms.ConsumerType.Default));
        org.junit.Assert.assertTrue(long13 == 5000L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(defaultTaskExecutorType15);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        jmsComponent1.setTransactionTimeout((int) (short) -1);
        jmsComponent1.setConcurrentConsumers((int) (byte) 1);
        java.util.SortedMap<java.lang.String, org.apache.camel.impl.ParameterConfiguration> sortedmap_str_parameterConfiguration6 = jmsComponent1.getParameterConfigurationMap();
        javax.jms.ExceptionListener exceptionListener7 = null;
        jmsComponent1.setExceptionListener(exceptionListener7);
        org.springframework.jms.support.destination.DestinationResolver destinationResolver9 = null;
        jmsComponent1.setDestinationResolver(destinationResolver9);
        org.junit.Assert.assertNotNull(jmsComponent1);
        org.junit.Assert.assertNotNull(sortedmap_str_parameterConfiguration6);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        jmsComponent1.setAcknowledgementModeName("hi!");
        jmsComponent1.setAlwaysCopyMessage(true);
        boolean b6 = jmsComponent1.isSuspendingOrSuspended();
        org.apache.camel.component.jms.QueueBrowseStrategy queueBrowseStrategy7 = jmsComponent1.getQueueBrowseStrategy();
        jmsComponent1.setTransactionName("failover://tcp://localhost:61616");
        org.junit.Assert.assertNotNull(jmsComponent1);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(queueBrowseStrategy7);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isReplyToDeliveryPersistent();
        activeMQConfiguration0.setTransferException(false);
        org.springframework.jms.support.converter.MessageConverter messageConverter5 = activeMQConfiguration0.getMessageConverter();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(messageConverter5);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        boolean b9 = jmsEndpoint3.isIncludeAllJMSXProperties();
        long long10 = jmsEndpoint3.getTimeToLive();
        jmsEndpoint3.setReplyToMaxConcurrentConsumers(100);
        jmsEndpoint3.setTransactedInOut(false);
        org.springframework.transaction.PlatformTransactionManager platformTransactionManager15 = jmsEndpoint3.getTransactionManager();
        boolean b16 = jmsEndpoint3.isExplicitQosEnabled();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(long10 == (-1L));
        org.junit.Assert.assertNull(platformTransactionManager15);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        org.apache.camel.component.jms.ConsumerType consumerType2 = null;
        activeMQConfiguration0.setConsumerType(consumerType2);
        activeMQConfiguration0.setConcurrentConsumers((int) (short) 1);
        activeMQConfiguration0.setExplicitQosEnabled(false);
        java.lang.String str8 = activeMQConfiguration0.getDurableSubscriptionName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        org.apache.camel.CamelContext camelContext0 = null;
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent1 = new org.apache.activemq.camel.component.ActiveMQComponent(camelContext0);
        activeMQComponent1.setPassword("2.16.1");
    }
}

