import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test001");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        jmsEndpoint3.setReplyToDestinationSelectorName("2.16.1");
        org.apache.camel.EndpointConfiguration endpointConfiguration6 = null;
        jmsEndpoint3.setEndpointConfiguration(endpointConfiguration6);
        org.apache.camel.ExchangePattern exchangePattern8 = jmsEndpoint3.getExchangePattern();
        jmsEndpoint3.setMessageTimestampEnabled(false);
        long long11 = jmsEndpoint3.getRequestTimeout();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertTrue("'" + exchangePattern8 + "' != '" + org.apache.camel.ExchangePattern.InOnly + "'", exchangePattern8.equals(org.apache.camel.ExchangePattern.InOnly));
        org.junit.Assert.assertTrue(long11 == 20000L);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test002");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory1 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory1.setDisableTimeStampsByDefault(true);
        java.util.Properties properties4 = camelConnectionFactory1.getProperties();
        camelConnectionFactory0.populateProperties(properties4);
        javax.jms.TopicConnection topicConnection8 = camelConnectionFactory0.createTopicConnection("queue:", "tcp://localhost:61616");
        boolean b9 = camelConnectionFactory0.isUseRetroactiveConsumer();
        camelConnectionFactory0.setBeanName("2.16.1");
        java.lang.String str12 = camelConnectionFactory0.getBrokerURL();
        org.apache.activemq.broker.region.policy.RedeliveryPolicyMap redeliveryPolicyMap13 = camelConnectionFactory0.getRedeliveryPolicyMap();
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNotNull(topicConnection8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "failover://tcp://localhost:61616" + "'", str12.equals("failover://tcp://localhost:61616"));
        org.junit.Assert.assertNotNull(redeliveryPolicyMap13);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test003");
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
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration24 = jmsEndpoint12.getConfiguration();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNotNull(jmsBinding11);
        org.junit.Assert.assertNotNull(jmsEndpoint12);
        org.junit.Assert.assertNotNull(jmsBinding15);
        org.junit.Assert.assertNotNull(jmsEndpoint16);
        org.junit.Assert.assertNotNull(jmsConfiguration24);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test004");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.CamelContext camelContext3 = null;
        camelQueue1.setCamelContext(camelContext3);
        java.lang.String str5 = camelQueue1.toString();
        org.apache.activemq.ActiveMQSession activeMQSession6 = null;
        try {
            javax.jms.TopicPublisher topicPublisher7 = camelQueue1.createPublisher(activeMQSession6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "queue:" + "'", str5.equals("queue:"));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test005");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDeliveryMode((java.lang.Integer) 1000);
        jmsEndpoint3.setDisableReplyTo(false);
        boolean b13 = jmsEndpoint3.isStopping();
        jmsEndpoint3.setDestinationName("2.16.1");
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test006");
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
        org.apache.camel.Endpoint endpoint16 = brokerConsumer7.getEndpoint();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(endpoint16);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test007");
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
        int i13 = jmsEndpoint3.getRunningMessageListeners();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertTrue(i13 == 0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test008");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isAlwaysSyncSend();
        boolean b2 = activeMQConnection0.isConsumerExpiryCheckEnabled();
        org.apache.activemq.blob.BlobTransferPolicy blobTransferPolicy3 = activeMQConnection0.getBlobTransferPolicy();
        long long4 = activeMQConnection0.getConsumerFailoverRedeliveryWaitPeriod();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(blobTransferPolicy3);
        org.junit.Assert.assertTrue(long4 == 0L);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test009");
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
        long long29 = jmsEndpoint12.getReceiveTimeout();
        boolean b30 = jmsEndpoint12.isPubSubNoLocal();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNotNull(jmsBinding11);
        org.junit.Assert.assertNotNull(jmsEndpoint12);
        org.junit.Assert.assertNotNull(jmsBinding15);
        org.junit.Assert.assertNotNull(jmsEndpoint16);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(long29 == 1000L);
        org.junit.Assert.assertTrue(b30 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test010");
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
        int i17 = activeMQConfiguration0.getPriority();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(long8 == 20000L);
        org.junit.Assert.assertTrue(i17 == 4);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test011");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        jmsComponent1.setAcknowledgementModeName("hi!");
        jmsComponent1.setAlwaysCopyMessage(true);
        boolean b6 = jmsComponent1.isSuspendingOrSuspended();
        jmsComponent1.setMaxMessagesPerTask((int) (short) -1);
        jmsComponent1.setMessageTimestampEnabled(false);
        org.junit.Assert.assertNotNull(jmsComponent1);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test012");
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
        boolean b23 = jmsEndpoint12.isExplicitQosEnabled();
        java.lang.String str24 = jmsEndpoint12.getReplyToType();
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
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test013");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        java.lang.String str1 = camelConnectionFactory0.getBeanName();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test014");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isAlwaysSyncSend();
        boolean b2 = activeMQConnection0.isConsumerExpiryCheckEnabled();
        javax.jms.ExceptionListener exceptionListener3 = activeMQConnection0.getExceptionListener();
        org.apache.activemq.thread.TaskRunnerFactory taskRunnerFactory4 = activeMQConnection0.getSessionTaskRunner();
        boolean b5 = activeMQConnection0.isNestedMapAndListEnabled();
        org.apache.activemq.ActiveMQConnection activeMQConnection6 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b7 = activeMQConnection6.isAlwaysSyncSend();
        boolean b8 = activeMQConnection6.isConsumerExpiryCheckEnabled();
        javax.jms.ExceptionListener exceptionListener9 = activeMQConnection6.getExceptionListener();
        org.apache.activemq.thread.TaskRunnerFactory taskRunnerFactory10 = activeMQConnection6.getSessionTaskRunner();
        activeMQConnection0.setSessionTaskRunner(taskRunnerFactory10);
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(exceptionListener3);
        org.junit.Assert.assertNotNull(taskRunnerFactory4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(activeMQConnection6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(exceptionListener9);
        org.junit.Assert.assertNotNull(taskRunnerFactory10);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test015");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentClientAcknowledge(connectionFactory0);
        jmsComponent1.setAcceptMessagesWhileStopping(false);
        jmsComponent1.setPreserveMessageQos(true);
        jmsComponent1.setAsyncStartListener(false);
        org.junit.Assert.assertNotNull(jmsComponent1);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test016");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        int i2 = camelRoutesBroker1.getCheckPeriod();
        try {
            camelRoutesBroker1.reapplyInterceptor();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i2 == 1000);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test017");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isAlwaysSyncSend();
        boolean b2 = activeMQConnection0.isConsumerExpiryCheckEnabled();
        javax.jms.ExceptionListener exceptionListener3 = activeMQConnection0.getExceptionListener();
        org.apache.activemq.thread.TaskRunnerFactory taskRunnerFactory4 = activeMQConnection0.getSessionTaskRunner();
        javax.jms.ExceptionListener exceptionListener5 = activeMQConnection0.getExceptionListener();
        org.apache.activemq.thread.TaskRunnerFactory taskRunnerFactory6 = activeMQConnection0.getSessionTaskRunner();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(exceptionListener3);
        org.junit.Assert.assertNotNull(taskRunnerFactory4);
        org.junit.Assert.assertNull(exceptionListener5);
        org.junit.Assert.assertNotNull(taskRunnerFactory6);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test018");
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
        jmsEndpoint3.setDurableSubscriptionName("failover://tcp://localhost:61616");
        jmsEndpoint3.setAsyncConsumer(false);
        org.springframework.jms.support.converter.MessageConverter messageConverter18 = jmsEndpoint3.getMessageConverter();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(platformTransactionManager13);
        org.junit.Assert.assertNull(messageConverter18);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test019");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        jmsComponent1.setAcknowledgementModeName("hi!");
        jmsComponent1.setLazyCreateTransactionManager(false);
        jmsComponent1.setConcurrentConsumers((int) '4');
        java.util.SortedMap<java.lang.String, org.apache.camel.impl.ParameterConfiguration> sortedmap_str_parameterConfiguration8 = jmsComponent1.getParameterConfigurationMap();
        org.apache.camel.component.jms.DefaultTaskExecutorType defaultTaskExecutorType9 = null;
        jmsComponent1.setDefaultTaskExecutorType(defaultTaskExecutorType9);
        org.junit.Assert.assertNotNull(jmsComponent1);
        org.junit.Assert.assertNotNull(sortedmap_str_parameterConfiguration8);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test020");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        boolean b3 = activeMQConfiguration0.isErrorHandlerLogStackTrace();
        activeMQConfiguration0.setTransactedInOut(false);
        activeMQConfiguration0.setPreserveMessageQos(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test021");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        jmsComponent1.setAcknowledgementModeName("hi!");
        jmsComponent1.setAlwaysCopyMessage(true);
        jmsComponent1.setAllowNullBody(true);
        boolean b8 = jmsComponent1.isSuspended();
        jmsComponent1.setReplyToMaxConcurrentConsumers((int) 'a');
        jmsComponent1.setAsyncConsumer(false);
        jmsComponent1.setReplyToMaxConcurrentConsumers((int) (byte) 1);
        org.junit.Assert.assertNotNull(jmsComponent1);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test022");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isAlwaysSyncSend();
        org.apache.activemq.management.StatsImpl statsImpl2 = activeMQConnection0.getStats();
        activeMQConnection0.setExclusiveConsumer(true);
        java.lang.String str5 = activeMQConnection0.toString();
        activeMQConnection0.setUseDedicatedTaskRunner(false);
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(statsImpl2);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "ActiveMQConnection {id=ID:ubuntu-48220-1505887086933-163:1,clientId=null,started=false}" + "'", str5.equals("ActiveMQConnection {id=ID:ubuntu-48220-1505887086933-163:1,clientId=null,started=false}"));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test023");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        jmsEndpoint3.setDestination((javax.jms.Destination) camelQueue5);
        boolean b9 = jmsEndpoint3.isIncludeAllJMSXProperties();
        org.apache.camel.component.jms.JmsMessageType jmsMessageType10 = jmsEndpoint3.getJmsMessageType();
        jmsEndpoint3.setAcknowledgementModeName("queue:");
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(jmsMessageType10);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test024");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory0.setExclusiveConsumer(false);
        camelConnectionFactory0.setObjectMessageSerializationDefered(false);
        boolean b5 = camelConnectionFactory0.isCopyMessageOnSend();
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test025");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory1 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory1.setDisableTimeStampsByDefault(true);
        java.util.Properties properties4 = camelConnectionFactory1.getProperties();
        camelConnectionFactory0.populateProperties(properties4);
        javax.jms.TopicConnection topicConnection8 = camelConnectionFactory0.createTopicConnection("queue:", "tcp://localhost:61616");
        boolean b9 = camelConnectionFactory0.isStatsEnabled();
        java.util.Properties properties10 = camelConnectionFactory0.getProperties();
        camelConnectionFactory0.setObjectMessageSerializationDefered(false);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNotNull(topicConnection8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test026");
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
        boolean b25 = jmsEndpoint12.isPollingConsumerBlockWhenFull();
        boolean b26 = jmsEndpoint12.isTransactedInOut();
        jmsEndpoint12.setReplyToCacheLevelName("endpoint1130");
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNotNull(jmsBinding11);
        org.junit.Assert.assertNotNull(jmsEndpoint12);
        org.junit.Assert.assertNotNull(jmsBinding15);
        org.junit.Assert.assertNotNull(jmsEndpoint16);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test027");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isAlwaysSyncSend();
        boolean b2 = activeMQConnection0.isConsumerExpiryCheckEnabled();
        javax.jms.ExceptionListener exceptionListener3 = activeMQConnection0.getExceptionListener();
        org.apache.activemq.ActiveMQConnection activeMQConnection4 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b5 = activeMQConnection4.isAlwaysSyncSend();
        boolean b6 = activeMQConnection4.isConsumerExpiryCheckEnabled();
        org.apache.activemq.blob.BlobTransferPolicy blobTransferPolicy7 = activeMQConnection4.getBlobTransferPolicy();
        activeMQConnection0.setBlobTransferPolicy(blobTransferPolicy7);
        boolean b9 = activeMQConnection0.isUseRetroactiveConsumer();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(exceptionListener3);
        org.junit.Assert.assertNotNull(activeMQConnection4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(blobTransferPolicy7);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test028");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        jmsEndpoint3.setReplyToDestinationSelectorName("2.16.1");
        boolean b6 = jmsEndpoint3.isExposeListenerSession();
        int i7 = jmsEndpoint3.getMaxMessagesPerTask();
        java.lang.String str8 = jmsEndpoint3.getSelector();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test029");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        java.lang.String str2 = camelRoutesBroker1.getRoutesFile();
        int i3 = camelRoutesBroker1.getCheckPeriod();
        camelRoutesBroker1.setRoutesFile("hi!");
        javax.jms.ConnectionFactory connectionFactory6 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent7 = org.apache.camel.component.jms.JmsComponent.jmsComponentClientAcknowledge(connectionFactory6);
        jmsComponent7.setTransactionName("tcp://localhost:61616");
        java.lang.Class<? extends org.apache.camel.Endpoint> cls10 = jmsComponent7.getEndpointClass();
        try {
            org.apache.activemq.broker.Broker broker11 = camelRoutesBroker1.getAdaptor((java.lang.Class) cls10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 1000);
        org.junit.Assert.assertNotNull(jmsComponent7);
        org.junit.Assert.assertNotNull(cls10);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test030");
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
        jmsEndpoint3.setIdleConsumerLimit(100);
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
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test031");
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
        int i22 = jmsEndpoint7.getReplyToConcurrentConsumers();
        org.apache.camel.component.jms.DefaultTaskExecutorType defaultTaskExecutorType23 = jmsEndpoint7.getDefaultTaskExecutorType();
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNotNull(jmsBinding10);
        org.junit.Assert.assertNotNull(jmsEndpoint11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(long14 == (-1L));
        org.junit.Assert.assertTrue(i22 == 1);
        org.junit.Assert.assertNull(defaultTaskExecutorType23);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test032");
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
        org.apache.camel.Endpoint endpoint30 = camelQueueReceiver29.getEndpoint();
        camelQueueReceiver29.close();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsBinding7);
        org.junit.Assert.assertNotNull(jmsEndpoint8);
        org.junit.Assert.assertNotNull(jmsBinding11);
        org.junit.Assert.assertNotNull(jmsEndpoint12);
        org.junit.Assert.assertNotNull(jmsBinding16);
        org.junit.Assert.assertNotNull(jmsEndpoint17);
        org.junit.Assert.assertNotNull(jmsBinding20);
        org.junit.Assert.assertNotNull(jmsEndpoint21);
        org.junit.Assert.assertNotNull(endpoint30);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test033");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        activeMQConfiguration0.setExplicitQosEnabled(true);
        activeMQConfiguration0.setIncludeSentJMSMessageID(true);
        org.springframework.jms.support.destination.DestinationResolver destinationResolver5 = activeMQConfiguration0.getDestinationResolver();
        org.junit.Assert.assertNull(destinationResolver5);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test034");
        org.apache.activemq.camel.camelplugin.CamelRoutesBrokerPlugin camelRoutesBrokerPlugin0 = new org.apache.activemq.camel.camelplugin.CamelRoutesBrokerPlugin();
        org.apache.activemq.broker.Broker broker1 = null;
        org.apache.activemq.broker.Broker broker2 = camelRoutesBrokerPlugin0.installPlugin(broker1);
        camelRoutesBrokerPlugin0.setCheckPeriod((int) (byte) 100);
        org.junit.Assert.assertNotNull(broker2);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test035");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        jmsEndpoint3.setReplyToDestinationSelectorName("2.16.1");
        org.apache.activemq.camel.CamelQueue camelQueue7 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding8 = camelQueue7.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint9 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue7);
        boolean b10 = jmsEndpoint9.isPubSubNoLocal();
        jmsEndpoint9.setTimeToLive((long) (byte) 1);
        boolean b13 = jmsEndpoint9.isDeliveryPersistent();
        boolean b14 = jmsEndpoint9.isSuspending();
        boolean b15 = jmsEndpoint9.isStarted();
        jmsEndpoint9.setReceiveTimeout((long) ' ');
        int i18 = jmsEndpoint9.getRunningMessageListeners();
        org.apache.activemq.camel.CamelQueue camelQueue20 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding21 = camelQueue20.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint22 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue20);
        org.apache.activemq.camel.CamelQueue camelQueue24 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding25 = camelQueue24.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint26 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue24);
        jmsEndpoint22.setDestination((javax.jms.Destination) camelQueue24);
        org.apache.activemq.camel.CamelQueue camelQueue29 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding30 = camelQueue29.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint31 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue29);
        org.apache.activemq.camel.CamelQueue camelQueue33 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding34 = camelQueue33.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint35 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue33);
        jmsEndpoint31.setDestination((javax.jms.Destination) camelQueue33);
        org.apache.activemq.ActiveMQSession activeMQSession37 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer40 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelQueue24, (org.apache.camel.Endpoint) jmsEndpoint31, activeMQSession37, "failover://tcp://localhost:61616", false);
        boolean b41 = jmsEndpoint31.isAlwaysCopyMessage();
        boolean b42 = jmsEndpoint31.isMultipleConsumersSupported();
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj43 = jmsEndpoint31.getConsumerProperties();
        org.apache.camel.spi.HeaderFilterStrategy headerFilterStrategy44 = null;
        jmsEndpoint31.setHeaderFilterStrategy(headerFilterStrategy44);
        boolean b46 = jmsEndpoint31.isIncludeSentJMSMessageID();
        jmsEndpoint31.setReplyToDeliveryPersistent(false);
        java.lang.String str49 = jmsEndpoint31.getReplyToDestinationSelectorName();
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory50 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory50.setObjectMessageSerializationDefered(true);
        camelConnectionFactory50.setSendTimeout((int) 'a');
        camelConnectionFactory50.setDisableTimeStampsByDefault(false);
        jmsEndpoint31.setConnectionFactory((javax.jms.ConnectionFactory) camelConnectionFactory50);
        org.apache.activemq.camel.CamelQueue camelQueue59 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding60 = camelQueue59.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint61 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue59);
        boolean b62 = jmsEndpoint61.isPubSubNoLocal();
        jmsEndpoint61.setTimeToLive((long) (byte) 1);
        boolean b65 = jmsEndpoint61.isLenientProperties();
        int i66 = jmsEndpoint61.getIdleTaskExecutionLimit();
        org.apache.activemq.camel.CamelQueue camelQueue68 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding69 = camelQueue68.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint70 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue68);
        boolean b71 = jmsEndpoint70.isPubSubNoLocal();
        org.apache.camel.component.jms.JmsKeyFormatStrategy jmsKeyFormatStrategy72 = null;
        jmsEndpoint70.setJmsKeyFormatStrategy(jmsKeyFormatStrategy72);
        org.apache.activemq.camel.CamelQueue camelQueue75 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding76 = camelQueue75.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint77 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue75);
        jmsEndpoint77.setReplyToDestinationSelectorName("2.16.1");
        org.apache.camel.EndpointConfiguration endpointConfiguration80 = null;
        jmsEndpoint77.setEndpointConfiguration(endpointConfiguration80);
        org.apache.camel.ExchangePattern exchangePattern82 = jmsEndpoint77.getExchangePattern();
        org.apache.camel.Exchange exchange83 = jmsEndpoint70.createExchange(exchangePattern82);
        org.apache.camel.Exchange exchange84 = jmsEndpoint61.createExchange(exchangePattern82);
        org.apache.camel.Exchange exchange85 = jmsEndpoint31.createExchange(exchangePattern82);
        org.apache.camel.Exchange exchange86 = jmsEndpoint9.createExchange(exchangePattern82);
        org.apache.camel.Exchange exchange87 = jmsEndpoint3.createExchange(exchangePattern82);
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding8);
        org.junit.Assert.assertNotNull(jmsEndpoint9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(jmsBinding21);
        org.junit.Assert.assertNotNull(jmsEndpoint22);
        org.junit.Assert.assertNotNull(jmsBinding25);
        org.junit.Assert.assertNotNull(jmsEndpoint26);
        org.junit.Assert.assertNotNull(jmsBinding30);
        org.junit.Assert.assertNotNull(jmsEndpoint31);
        org.junit.Assert.assertNotNull(jmsBinding34);
        org.junit.Assert.assertNotNull(jmsEndpoint35);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(map_str_obj43);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(jmsBinding60);
        org.junit.Assert.assertNotNull(jmsEndpoint61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue(i66 == 1);
        org.junit.Assert.assertNotNull(jmsBinding69);
        org.junit.Assert.assertNotNull(jmsEndpoint70);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(jmsBinding76);
        org.junit.Assert.assertNotNull(jmsEndpoint77);
        org.junit.Assert.assertTrue("'" + exchangePattern82 + "' != '" + org.apache.camel.ExchangePattern.InOnly + "'", exchangePattern82.equals(org.apache.camel.ExchangePattern.InOnly));
        org.junit.Assert.assertNotNull(exchange83);
        org.junit.Assert.assertNotNull(exchange84);
        org.junit.Assert.assertNotNull(exchange85);
        org.junit.Assert.assertNotNull(exchange86);
        org.junit.Assert.assertNotNull(exchange87);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test036");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        jmsComponent1.setTransactionTimeout((int) (short) -1);
        jmsComponent1.setConcurrentConsumers((int) (byte) 1);
        jmsComponent1.setMessageIdEnabled(true);
        jmsComponent1.suspend();
        jmsComponent1.setPubSubNoLocal(true);
        org.junit.Assert.assertNotNull(jmsComponent1);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test037");
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
        int i14 = jmsEndpoint3.getReplyToMaxConcurrentConsumers();
        jmsEndpoint3.resume();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(i14 == 0);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test038");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        activeMQConfiguration0.setCacheLevelName("tcp://localhost:61616");
        org.apache.camel.component.jms.ConsumerType consumerType5 = activeMQConfiguration0.getConsumerType();
        boolean b6 = activeMQConfiguration0.isTransferException();
        java.lang.String str7 = activeMQConfiguration0.getReplyTo();
        boolean b8 = activeMQConfiguration0.isTransacted();
        activeMQConfiguration0.setRequestTimeout((-1L));
        boolean b11 = activeMQConfiguration0.isAsyncStartListener();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + consumerType5 + "' != '" + org.apache.camel.component.jms.ConsumerType.Default + "'", consumerType5.equals(org.apache.camel.component.jms.ConsumerType.Default));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test039");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory0.setObjectMessageSerializationDefered(true);
        camelConnectionFactory0.setSendTimeout((int) 'a');
        camelConnectionFactory0.setClientIDPrefix("failover://tcp://localhost:61616");
        camelConnectionFactory0.setNonBlockingRedelivery(false);
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory9 = new org.apache.activemq.camel.CamelConnectionFactory();
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory10 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory10.setDisableTimeStampsByDefault(true);
        java.util.Properties properties13 = camelConnectionFactory10.getProperties();
        camelConnectionFactory9.populateProperties(properties13);
        javax.jms.TopicConnection topicConnection17 = camelConnectionFactory9.createTopicConnection("queue:", "tcp://localhost:61616");
        boolean b18 = camelConnectionFactory9.isStatsEnabled();
        java.util.Properties properties19 = camelConnectionFactory9.getProperties();
        camelConnectionFactory0.populateProperties(properties19);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNotNull(topicConnection17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(properties19);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test040");
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
        long long29 = jmsEndpoint12.getReceiveTimeout();
        java.lang.Integer i30 = jmsEndpoint12.getDeliveryMode();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNotNull(jmsBinding11);
        org.junit.Assert.assertNotNull(jmsEndpoint12);
        org.junit.Assert.assertNotNull(jmsBinding15);
        org.junit.Assert.assertNotNull(jmsEndpoint16);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(long29 == 1000L);
        org.junit.Assert.assertNull(i30);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test041");
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
        java.lang.Integer i40 = jmsEndpoint12.getDeliveryMode();
        boolean b41 = jmsEndpoint12.isAllowNullBody();
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
        org.junit.Assert.assertNull(i40);
        org.junit.Assert.assertTrue(b41 == true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test042");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        activeMQConfiguration0.setCacheLevelName("tcp://localhost:61616");
        boolean b5 = activeMQConfiguration0.isAcceptMessagesWhileStopping();
        boolean b6 = activeMQConfiguration0.isReplyToSameDestinationAllowed();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test043");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        activeMQConfiguration0.setCacheLevelName("tcp://localhost:61616");
        org.apache.camel.component.jms.ConsumerType consumerType5 = activeMQConfiguration0.getConsumerType();
        org.apache.camel.component.jms.DefaultTaskExecutorType defaultTaskExecutorType6 = activeMQConfiguration0.getDefaultTaskExecutorType();
        boolean b7 = activeMQConfiguration0.isUseMessageIDAsCorrelationID();
        activeMQConfiguration0.setClientId("topic:");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + consumerType5 + "' != '" + org.apache.camel.component.jms.ConsumerType.Default + "'", consumerType5.equals(org.apache.camel.component.jms.ConsumerType.Default));
        org.junit.Assert.assertNull(defaultTaskExecutorType6);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test044");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory0.setDisableTimeStampsByDefault(true);
        java.util.Properties properties3 = camelConnectionFactory0.getProperties();
        long long4 = camelConnectionFactory0.getConsumerFailoverRedeliveryWaitPeriod();
        boolean b5 = camelConnectionFactory0.isUseAsyncSend();
        camelConnectionFactory0.setProducerWindowSize((int) (byte) 0);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertTrue(long4 == 0L);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test045");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        boolean b3 = activeMQConfiguration0.isErrorHandlerLogStackTrace();
        boolean b4 = activeMQConfiguration0.isMessageTimestampEnabled();
        org.apache.camel.LoggingLevel loggingLevel5 = activeMQConfiguration0.getErrorHandlerLoggingLevel();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + loggingLevel5 + "' != '" + org.apache.camel.LoggingLevel.WARN + "'", loggingLevel5.equals(org.apache.camel.LoggingLevel.WARN));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test046");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        boolean b4 = jmsEndpoint3.isPubSubNoLocal();
        jmsEndpoint3.setTimeToLive((long) (byte) 1);
        boolean b7 = jmsEndpoint3.isDeliveryPersistent();
        javax.jms.ExceptionListener exceptionListener8 = null;
        jmsEndpoint3.setExceptionListener(exceptionListener8);
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test047");
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
        org.apache.activemq.ActiveMQSession activeMQSession22 = null;
        try {
            javax.jms.TopicSubscriber topicSubscriber26 = camelQueue1.createDurableSubscriber(activeMQSession22, "failover://tcp://localhost:61616", "2.16.1", true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNotNull(jmsBinding10);
        org.junit.Assert.assertNotNull(jmsEndpoint11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(long14 == (-1L));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test048");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent1 = org.apache.activemq.camel.component.ActiveMQComponent.activeMQComponent("2.16.1");
        activeMQComponent1.setUsePooledConnection(true);
        activeMQComponent1.setTestConnectionOnStartup(true);
        activeMQComponent1.setDurableSubscriptionName("ActiveMQConnection {id=ID:ubuntu-48220-1505887086933-133:1,clientId=null,started=false}");
        org.junit.Assert.assertNotNull(activeMQComponent1);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test049");
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
        activeMQConfiguration0.setAsyncConsumer(true);
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration18 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str19 = activeMQConfiguration18.getReplyTo();
        org.apache.camel.component.jms.ConsumerType consumerType20 = null;
        activeMQConfiguration18.setConsumerType(consumerType20);
        activeMQConfiguration18.setConcurrentConsumers((int) (short) 1);
        activeMQConfiguration18.setExplicitQosEnabled(false);
        org.apache.camel.component.jms.JmsKeyFormatStrategy jmsKeyFormatStrategy26 = activeMQConfiguration18.getJmsKeyFormatStrategy();
        activeMQConfiguration0.setJmsKeyFormatStrategy(jmsKeyFormatStrategy26);
        org.apache.camel.component.jms.JmsKeyFormatStrategy jmsKeyFormatStrategy28 = activeMQConfiguration0.getJmsKeyFormatStrategy();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + consumerType13 + "' != '" + org.apache.camel.component.jms.ConsumerType.Default + "'", consumerType13.equals(org.apache.camel.component.jms.ConsumerType.Default));
        org.junit.Assert.assertTrue(long15 == 5000L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(jmsKeyFormatStrategy26);
        org.junit.Assert.assertNotNull(jmsKeyFormatStrategy28);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test050");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent0 = org.apache.activemq.camel.component.ActiveMQComponent.activeMQComponent();
        activeMQComponent0.setPassword("temp:topic:");
        org.junit.Assert.assertNotNull(activeMQComponent0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test051");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        boolean b3 = activeMQConfiguration0.isMessageIdEnabled();
        boolean b4 = activeMQConfiguration0.isPubSubNoLocal();
        activeMQConfiguration0.setAllowNullBody(true);
        org.apache.camel.component.jms.JmsKeyFormatStrategy jmsKeyFormatStrategy7 = activeMQConfiguration0.getJmsKeyFormatStrategy();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(jmsKeyFormatStrategy7);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test052");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        java.lang.String str2 = activeMQConfiguration0.getPassword();
        java.lang.String str3 = activeMQConfiguration0.getDurableSubscriptionName();
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration4 = activeMQConfiguration0.copy();
        jmsConfiguration4.setPriority(4);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(jmsConfiguration4);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test053");
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
        boolean b24 = jmsEndpoint12.isIncludeAllJMSXProperties();
        boolean b25 = jmsEndpoint12.isSuspendingOrSuspended();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNotNull(jmsBinding11);
        org.junit.Assert.assertNotNull(jmsEndpoint12);
        org.junit.Assert.assertNotNull(jmsBinding15);
        org.junit.Assert.assertNotNull(jmsEndpoint16);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b25 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test054");
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
        boolean b24 = jmsEndpoint12.isIncludeAllJMSXProperties();
        jmsEndpoint12.setMessageTimestampEnabled(false);
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNotNull(jmsBinding11);
        org.junit.Assert.assertNotNull(jmsEndpoint12);
        org.junit.Assert.assertNotNull(jmsBinding15);
        org.junit.Assert.assertNotNull(jmsEndpoint16);
        org.junit.Assert.assertTrue(b24 == true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test055");
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
        boolean b24 = jmsEndpoint12.isIncludeAllJMSXProperties();
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
        org.junit.Assert.assertTrue(b24 == true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test056");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isAlwaysSyncSend();
        boolean b2 = activeMQConnection0.isConsumerExpiryCheckEnabled();
        javax.jms.ExceptionListener exceptionListener3 = activeMQConnection0.getExceptionListener();
        org.apache.activemq.thread.TaskRunnerFactory taskRunnerFactory4 = activeMQConnection0.getSessionTaskRunner();
        javax.jms.ExceptionListener exceptionListener5 = activeMQConnection0.getExceptionListener();
        activeMQConnection0.setConsumerExpiryCheckEnabled(true);
        org.apache.activemq.MessageTransformer messageTransformer8 = activeMQConnection0.getTransformer();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(exceptionListener3);
        org.junit.Assert.assertNotNull(taskRunnerFactory4);
        org.junit.Assert.assertNull(exceptionListener5);
        org.junit.Assert.assertNull(messageTransformer8);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test057");
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
        org.springframework.transaction.PlatformTransactionManager platformTransactionManager25 = jmsEndpoint12.getTransactionManager();
        org.springframework.jms.core.JmsOperations jmsOperations26 = jmsEndpoint12.getJmsOperations();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNotNull(jmsBinding11);
        org.junit.Assert.assertNotNull(jmsEndpoint12);
        org.junit.Assert.assertNotNull(jmsBinding15);
        org.junit.Assert.assertNotNull(jmsEndpoint16);
        org.junit.Assert.assertNull(jmsOperations22);
        org.junit.Assert.assertNull(platformTransactionManager25);
        org.junit.Assert.assertNull(jmsOperations26);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test058");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        boolean b3 = activeMQConfiguration0.isLazyCreateTransactionManager();
        activeMQConfiguration0.setMessageIdEnabled(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test059");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        boolean b3 = activeMQConfiguration0.isLazyCreateTransactionManager();
        activeMQConfiguration0.setAcknowledgementMode((int) (byte) 10);
        activeMQConfiguration0.setMaxMessagesPerTask((int) (short) 10);
        boolean b8 = activeMQConfiguration0.isAlwaysCopyMessage();
        activeMQConfiguration0.setConcurrentConsumers(15000);
        activeMQConfiguration0.setIdleTaskExecutionLimit((int) (short) 100);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test060");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory0.setObjectMessageSerializationDefered(true);
        camelConnectionFactory0.setSendTimeout((int) 'a');
        camelConnectionFactory0.setClientIDPrefix("failover://tcp://localhost:61616");
        camelConnectionFactory0.setNonBlockingRedelivery(false);
        camelConnectionFactory0.setUseDedicatedTaskRunner(false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test061");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent1 = org.apache.activemq.camel.component.ActiveMQComponent.activeMQComponent("queue:");
        activeMQComponent1.setExposeAllQueues(false);
        boolean b4 = activeMQComponent1.isExposeAllQueues();
        activeMQComponent1.setAsyncConsumer(true);
        org.springframework.jms.support.destination.DestinationResolver destinationResolver7 = null;
        activeMQComponent1.setDestinationResolver(destinationResolver7);
        org.junit.Assert.assertNotNull(activeMQComponent1);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test062");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        long long1 = camelConnectionFactory0.getWarnAboutUnstartedConnectionTimeout();
        org.apache.activemq.RedeliveryPolicy redeliveryPolicy2 = null;
        camelConnectionFactory0.setRedeliveryPolicy(redeliveryPolicy2);
        camelConnectionFactory0.setTransactedIndividualAck(true);
        try {
            javax.naming.Reference reference6 = camelConnectionFactory0.getReference();
            org.junit.Assert.fail("Expected exception of type javax.naming.NamingException");
        } catch (javax.naming.NamingException e) {
        }
        org.junit.Assert.assertTrue(long1 == 500L);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test063");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        javax.jms.ConnectionMetaData connectionMetaData1 = activeMQConnection0.getMetaData();
        org.apache.activemq.command.ProducerId producerId2 = null;
        org.apache.activemq.ActiveMQMessageProducer activeMQMessageProducer3 = null;
        try {
            activeMQConnection0.addProducer(producerId2, activeMQMessageProducer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertNotNull(connectionMetaData1);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test064");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isAlwaysSyncSend();
        boolean b2 = activeMQConnection0.isConsumerExpiryCheckEnabled();
        org.apache.activemq.blob.BlobTransferPolicy blobTransferPolicy3 = activeMQConnection0.getBlobTransferPolicy();
        activeMQConnection0.doCleanup(false);
        java.util.concurrent.RejectedExecutionHandler rejectedExecutionHandler6 = activeMQConnection0.getRejectedTaskHandler();
        org.apache.activemq.transport.Transport transport7 = activeMQConnection0.getTransportChannel();
        java.io.IOException iOException8 = activeMQConnection0.getFirstFailureError();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(blobTransferPolicy3);
        org.junit.Assert.assertNull(rejectedExecutionHandler6);
        org.junit.Assert.assertNotNull(transport7);
        org.junit.Assert.assertNull(iOException8);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test065");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        java.lang.String str2 = camelRoutesBroker1.getRoutesFile();
        int i3 = camelRoutesBroker1.getCheckPeriod();
        camelRoutesBroker1.setRoutesFile("hi!");
        camelRoutesBroker1.setCheckPeriod((int) (byte) 10);
        org.apache.activemq.broker.ConnectionContext connectionContext8 = null;
        org.apache.activemq.command.TransactionId transactionId9 = null;
        try {
            camelRoutesBroker1.commitTransaction(connectionContext8, transactionId9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 1000);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test066");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent1 = org.apache.activemq.camel.component.ActiveMQComponent.activeMQComponent("queue:");
        activeMQComponent1.setExposeAllQueues(false);
        boolean b4 = activeMQComponent1.isExposeAllQueues();
        activeMQComponent1.setAutoStartup(false);
        org.junit.Assert.assertNotNull(activeMQComponent1);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test067");
        org.apache.activemq.camel.component.broker.BrokerComponent brokerComponent1 = new org.apache.activemq.camel.component.broker.BrokerComponent();
        org.apache.camel.CamelContext camelContext2 = brokerComponent1.getCamelContext();
        boolean b3 = brokerComponent1.useRawUri();
        org.apache.activemq.command.ActiveMQDestination activeMQDestination6 = org.apache.activemq.camel.converter.ActiveMQConverter.toDestination("2.16.1");
        org.apache.activemq.camel.component.broker.BrokerConfiguration brokerConfiguration7 = null;
        org.apache.activemq.camel.component.broker.BrokerEndpoint brokerEndpoint8 = new org.apache.activemq.camel.component.broker.BrokerEndpoint("tcp://localhost:61616", brokerComponent1, "tcp://localhost:61616", activeMQDestination6, brokerConfiguration7);
        boolean b9 = brokerEndpoint8.isMultipleConsumersSupported();
        java.lang.String str10 = brokerEndpoint8.getDestinationName();
        java.lang.String str11 = brokerEndpoint8.getDestinationName();
        org.junit.Assert.assertNull(camelContext2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(activeMQDestination6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tcp://localhost:61616" + "'", str10.equals("tcp://localhost:61616"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "tcp://localhost:61616" + "'", str11.equals("tcp://localhost:61616"));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test068");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        activeMQConfiguration0.setExplicitQosEnabled(true);
        activeMQConfiguration0.setAcknowledgementModeName("queue:");
        activeMQConfiguration0.setAsyncStopListener(false);
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent7 = new org.apache.activemq.camel.component.ActiveMQComponent(activeMQConfiguration0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test069");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        jmsComponent1.setAcknowledgementModeName("hi!");
        jmsComponent1.setAlwaysCopyMessage(true);
        boolean b6 = jmsComponent1.isSuspendingOrSuspended();
        jmsComponent1.setAcceptMessagesWhileStopping(false);
        try {
            org.apache.camel.Endpoint endpoint10 = jmsComponent1.createEndpoint("ActiveMQConnection {id=ID:ubuntu-48220-1505887086933-133:1,clientId=null,started=false}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(jmsComponent1);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test070");
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
        jmsEndpoint3.setForceSendOriginalMessage(true);
        javax.jms.ExceptionListener exceptionListener14 = jmsEndpoint3.getExceptionListener();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(jmsMessageType10);
        org.junit.Assert.assertNull(exceptionListener14);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test071");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        int i2 = camelRoutesBroker1.getCheckPeriod();
        int i3 = camelRoutesBroker1.getCheckPeriod();
        try {
            java.util.concurrent.ThreadPoolExecutor threadPoolExecutor4 = camelRoutesBroker1.getExecutor();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i2 == 1000);
        org.junit.Assert.assertTrue(i3 == 1000);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test072");
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
        boolean b25 = jmsEndpoint12.isAutoStartup();
        jmsEndpoint12.setConcurrentConsumers(1000);
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
        org.junit.Assert.assertTrue(b25 == true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test073");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory1 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory1.setDisableTimeStampsByDefault(true);
        java.util.Properties properties4 = camelConnectionFactory1.getProperties();
        camelConnectionFactory0.populateProperties(properties4);
        javax.jms.TopicConnection topicConnection8 = camelConnectionFactory0.createTopicConnection("queue:", "tcp://localhost:61616");
        boolean b9 = camelConnectionFactory0.isStatsEnabled();
        java.util.concurrent.RejectedExecutionHandler rejectedExecutionHandler10 = camelConnectionFactory0.getRejectedTaskHandler();
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNotNull(topicConnection8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(rejectedExecutionHandler10);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test074");
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
        java.lang.String str27 = jmsEndpoint12.getEndpointUri();
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
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "jms:queue:queue:" + "'", str27.equals("jms:queue:queue:"));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test075");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isAlwaysSyncSend();
        boolean b2 = activeMQConnection0.isConsumerExpiryCheckEnabled();
        org.apache.activemq.blob.BlobTransferPolicy blobTransferPolicy3 = activeMQConnection0.getBlobTransferPolicy();
        org.apache.activemq.transport.Transport transport4 = activeMQConnection0.getTransportChannel();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(blobTransferPolicy3);
        org.junit.Assert.assertNotNull(transport4);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test076");
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
        boolean b29 = jmsEndpoint12.isMultipleConsumersSupported();
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
        org.junit.Assert.assertTrue(b29 == true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test077");
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
        boolean b17 = jmsEndpoint3.isAcceptMessagesWhileStopping();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(long10 == (-1L));
        org.junit.Assert.assertNull(platformTransactionManager15);
        org.junit.Assert.assertNotNull(jmsBinding16);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test078");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        int i1 = activeMQConfiguration0.getConcurrentConsumers();
        boolean b2 = activeMQConfiguration0.isDisableTimeToLive();
        org.junit.Assert.assertTrue(i1 == 1);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test079");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        activeMQConfiguration0.setCacheLevelName("tcp://localhost:61616");
        org.apache.camel.component.jms.ConsumerType consumerType5 = activeMQConfiguration0.getConsumerType();
        org.apache.camel.component.jms.DefaultTaskExecutorType defaultTaskExecutorType6 = activeMQConfiguration0.getDefaultTaskExecutorType();
        boolean b7 = activeMQConfiguration0.isUseMessageIDAsCorrelationID();
        org.apache.camel.component.jms.ReplyToType replyToType8 = activeMQConfiguration0.getReplyToType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + consumerType5 + "' != '" + org.apache.camel.component.jms.ConsumerType.Default + "'", consumerType5.equals(org.apache.camel.component.jms.ConsumerType.Default));
        org.junit.Assert.assertNull(defaultTaskExecutorType6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(replyToType8);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test080");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        java.lang.String str3 = activeMQConfiguration0.getDurableSubscriptionName();
        org.apache.camel.component.jms.ReplyToType replyToType4 = activeMQConfiguration0.getReplyToType();
        javax.jms.ConnectionFactory connectionFactory5 = activeMQConfiguration0.getTemplateConnectionFactory();
        activeMQConfiguration0.setReplyTo("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(replyToType4);
        org.junit.Assert.assertNotNull(connectionFactory5);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test081");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isAlwaysSyncSend();
        org.apache.activemq.management.StatsImpl statsImpl2 = activeMQConnection0.getStats();
        activeMQConnection0.setExclusiveConsumer(true);
        int i5 = activeMQConnection0.getSendTimeout();
        org.apache.activemq.command.ActiveMQTempDestination activeMQTempDestination6 = null;
        try {
            activeMQConnection0.deleteTempDestination(activeMQTempDestination6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(statsImpl2);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test082");
        org.apache.activemq.camel.component.broker.BrokerComponent brokerComponent1 = new org.apache.activemq.camel.component.broker.BrokerComponent();
        org.apache.camel.CamelContext camelContext2 = brokerComponent1.getCamelContext();
        boolean b3 = brokerComponent1.useRawUri();
        org.apache.activemq.command.ActiveMQDestination activeMQDestination6 = org.apache.activemq.camel.converter.ActiveMQConverter.toDestination("2.16.1");
        org.apache.activemq.camel.component.broker.BrokerConfiguration brokerConfiguration7 = null;
        org.apache.activemq.camel.component.broker.BrokerEndpoint brokerEndpoint8 = new org.apache.activemq.camel.component.broker.BrokerEndpoint("tcp://localhost:61616", brokerComponent1, "tcp://localhost:61616", activeMQDestination6, brokerConfiguration7);
        boolean b9 = brokerEndpoint8.isMultipleConsumersSupported();
        java.lang.String str10 = brokerEndpoint8.getDestinationName();
        brokerEndpoint8.setPollingConsumerBlockTimeout(5000L);
        org.apache.activemq.camel.component.broker.BrokerProducer brokerProducer13 = new org.apache.activemq.camel.component.broker.BrokerProducer(brokerEndpoint8);
        org.junit.Assert.assertNull(camelContext2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(activeMQDestination6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tcp://localhost:61616" + "'", str10.equals("tcp://localhost:61616"));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test083");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        java.lang.String str2 = camelRoutesBroker1.getRoutesFile();
        org.apache.activemq.broker.ConnectionContext connectionContext3 = null;
        org.apache.activemq.command.SessionInfo sessionInfo4 = null;
        try {
            camelRoutesBroker1.removeSession(connectionContext3, sessionInfo4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test084");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory0.setExclusiveConsumer(false);
        boolean b3 = camelConnectionFactory0.isDisableTimeStampsByDefault();
        camelConnectionFactory0.setRmIdFromConnectionId(false);
        int i6 = camelConnectionFactory0.getSendTimeout();
        org.apache.activemq.ActiveMQConnectionFactory activeMQConnectionFactory7 = camelConnectionFactory0.copy();
        activeMQConnectionFactory7.setWatchTopicAdvisories(true);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(activeMQConnectionFactory7);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test085");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        jmsComponent1.setTransactionTimeout((int) (short) -1);
        org.springframework.jms.core.JmsOperations jmsOperations4 = null;
        jmsComponent1.setJmsOperations(jmsOperations4);
        jmsComponent1.setMapJmsMessage(false);
        org.apache.camel.CamelContext camelContext8 = null;
        jmsComponent1.setCamelContext(camelContext8);
        org.junit.Assert.assertNotNull(jmsComponent1);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test086");
        org.apache.camel.CamelContext camelContext0 = null;
        org.apache.activemq.advisory.DestinationSource destinationSource1 = null;
        org.apache.activemq.camel.component.CamelEndpointLoader camelEndpointLoader2 = new org.apache.activemq.camel.component.CamelEndpointLoader(camelContext0, destinationSource1);
        org.apache.camel.CamelContext camelContext3 = camelEndpointLoader2.getCamelContext();
        camelEndpointLoader2.afterPropertiesSet();
        org.junit.Assert.assertNull(camelContext3);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test087");
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
        long long29 = jmsEndpoint12.getReceiveTimeout();
        try {
            java.lang.Class<? extends javax.jms.TemporaryTopic> cls30 = jmsEndpoint12.getTemporaryTopicType();
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
        org.junit.Assert.assertTrue(long29 == 1000L);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test088");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        int i1 = activeMQConfiguration0.getConcurrentConsumers();
        int i2 = activeMQConfiguration0.getIdleTaskExecutionLimit();
        org.junit.Assert.assertTrue(i1 == 1);
        org.junit.Assert.assertTrue(i2 == 1);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test089");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        long long1 = camelConnectionFactory0.getWarnAboutUnstartedConnectionTimeout();
        camelConnectionFactory0.setAuditMaximumProducerNumber((int) (byte) 1);
        org.apache.camel.component.jms.JmsComponent jmsComponent4 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted((javax.jms.ConnectionFactory) camelConnectionFactory0);
        camelConnectionFactory0.setConsumerFailoverRedeliveryWaitPeriod(20000L);
        org.junit.Assert.assertTrue(long1 == 500L);
        org.junit.Assert.assertNotNull(jmsComponent4);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test090");
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
        boolean b14 = jmsEndpoint3.isExposeListenerSession();
        jmsEndpoint3.setReplyToDestinationSelectorName("");
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
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test091");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        long long1 = camelConnectionFactory0.getWarnAboutUnstartedConnectionTimeout();
        camelConnectionFactory0.setCheckForDuplicates(false);
        org.junit.Assert.assertTrue(long1 == 500L);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test092");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        java.lang.String str2 = activeMQConfiguration0.getPassword();
        java.lang.String str3 = activeMQConfiguration0.getDurableSubscriptionName();
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration4 = activeMQConfiguration0.copy();
        activeMQConfiguration0.setAcceptMessagesWhileStopping(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(jmsConfiguration4);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test093");
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
        org.apache.camel.component.jms.JmsMessageType jmsMessageType26 = jmsEndpoint12.getJmsMessageType();
        boolean b27 = jmsEndpoint12.isMessageIdEnabled();
        boolean b28 = jmsEndpoint12.isExposeListenerSession();
        javax.jms.ExceptionListener exceptionListener29 = null;
        jmsEndpoint12.setExceptionListener(exceptionListener29);
        boolean b31 = jmsEndpoint12.isSuspending();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNotNull(jmsBinding11);
        org.junit.Assert.assertNotNull(jmsEndpoint12);
        org.junit.Assert.assertNotNull(jmsBinding15);
        org.junit.Assert.assertNotNull(jmsEndpoint16);
        org.junit.Assert.assertNull(jmsMessageType26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test094");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isAlwaysSyncSend();
        activeMQConnection0.setCloseTimeout((int) (byte) 10);
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test095");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        long long1 = camelConnectionFactory0.getWarnAboutUnstartedConnectionTimeout();
        org.apache.activemq.RedeliveryPolicy redeliveryPolicy2 = null;
        camelConnectionFactory0.setRedeliveryPolicy(redeliveryPolicy2);
        int i4 = camelConnectionFactory0.getProducerWindowSize();
        camelConnectionFactory0.setClientID("ActiveMQConnection {id=ID:ubuntu-48220-1505887086933-133:1,clientId=null,started=false}");
        org.junit.Assert.assertTrue(long1 == 500L);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test096");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isAlwaysSyncSend();
        boolean b2 = activeMQConnection0.isConsumerExpiryCheckEnabled();
        org.apache.activemq.blob.BlobTransferPolicy blobTransferPolicy3 = activeMQConnection0.getBlobTransferPolicy();
        activeMQConnection0.doCleanup(false);
        java.util.concurrent.RejectedExecutionHandler rejectedExecutionHandler6 = activeMQConnection0.getRejectedTaskHandler();
        org.apache.activemq.transport.Transport transport7 = activeMQConnection0.getTransportChannel();
        activeMQConnection0.setCopyMessageOnSend(false);
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(blobTransferPolicy3);
        org.junit.Assert.assertNull(rejectedExecutionHandler6);
        org.junit.Assert.assertNotNull(transport7);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test097");
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
        boolean b30 = jmsEndpoint17.isErrorHandlerLogStackTrace();
        try {
            org.springframework.jms.listener.AbstractMessageListenerContainer abstractMessageListenerContainer31 = jmsEndpoint17.createMessageListenerContainer();
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
        org.junit.Assert.assertTrue(b30 == true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test098");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent1 = org.apache.activemq.camel.component.ActiveMQComponent.activeMQComponent("2.16.1");
        activeMQComponent1.setUseSingleConnection(true);
        activeMQComponent1.setTransferExchange(true);
        org.junit.Assert.assertNotNull(activeMQComponent1);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test099");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isAlwaysSyncSend();
        boolean b2 = activeMQConnection0.isConsumerExpiryCheckEnabled();
        javax.jms.ExceptionListener exceptionListener3 = activeMQConnection0.getExceptionListener();
        org.apache.activemq.ActiveMQConnection activeMQConnection4 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b5 = activeMQConnection4.isAlwaysSyncSend();
        boolean b6 = activeMQConnection4.isConsumerExpiryCheckEnabled();
        org.apache.activemq.blob.BlobTransferPolicy blobTransferPolicy7 = activeMQConnection4.getBlobTransferPolicy();
        activeMQConnection0.setBlobTransferPolicy(blobTransferPolicy7);
        java.util.concurrent.RejectedExecutionHandler rejectedExecutionHandler9 = null;
        activeMQConnection0.setRejectedTaskHandler(rejectedExecutionHandler9);
        java.lang.Throwable throwable11 = null;
        activeMQConnection0.onClientInternalException(throwable11);
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(exceptionListener3);
        org.junit.Assert.assertNotNull(activeMQConnection4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(blobTransferPolicy7);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test100");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        jmsComponent1.setAcknowledgementModeName("hi!");
        jmsComponent1.setLazyCreateTransactionManager(false);
        jmsComponent1.setClientId("hi!");
        jmsComponent1.setClientId("temp:topic:");
        jmsComponent1.setUseMessageIDAsCorrelationID(true);
        org.junit.Assert.assertNotNull(jmsComponent1);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test101");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        jmsComponent1.setAcknowledgementModeName("hi!");
        jmsComponent1.setAlwaysCopyMessage(true);
        jmsComponent1.setAllowNullBody(true);
        jmsComponent1.setMaxMessagesPerTask((int) (short) 1);
        org.junit.Assert.assertNotNull(jmsComponent1);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test102");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        boolean b3 = activeMQConfiguration0.isLazyCreateTransactionManager();
        activeMQConfiguration0.setAcknowledgementMode((int) (byte) 10);
        activeMQConfiguration0.setSubscriptionDurable(false);
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent8 = new org.apache.activemq.camel.component.ActiveMQComponent(activeMQConfiguration0);
        activeMQComponent8.setPassword("failover://tcp://localhost:61616");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test103");
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
        int i23 = jmsEndpoint12.getIdleConsumerLimit();
        boolean b24 = jmsEndpoint12.isTransacted();
        boolean b25 = jmsEndpoint12.isRunAllowed();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNotNull(jmsBinding11);
        org.junit.Assert.assertNotNull(jmsEndpoint12);
        org.junit.Assert.assertNotNull(jmsBinding15);
        org.junit.Assert.assertNotNull(jmsEndpoint16);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i23 == 1);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test104");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        boolean b3 = activeMQConfiguration0.isErrorHandlerLogStackTrace();
        activeMQConfiguration0.setTransactedInOut(false);
        activeMQConfiguration0.setPriority(0);
        org.apache.activemq.camel.CamelQueue camelQueue9 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding10 = camelQueue9.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint11 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue9);
        org.apache.activemq.camel.CamelQueue camelQueue13 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding14 = camelQueue13.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint15 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue13);
        jmsEndpoint11.setDestination((javax.jms.Destination) camelQueue13);
        org.apache.activemq.camel.CamelQueue camelQueue18 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding19 = camelQueue18.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint20 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue18);
        org.apache.activemq.camel.CamelQueue camelQueue22 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding23 = camelQueue22.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint24 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue22);
        jmsEndpoint20.setDestination((javax.jms.Destination) camelQueue22);
        org.apache.activemq.ActiveMQSession activeMQSession26 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer29 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelQueue13, (org.apache.camel.Endpoint) jmsEndpoint20, activeMQSession26, "failover://tcp://localhost:61616", false);
        boolean b30 = jmsEndpoint20.isStarting();
        org.springframework.jms.core.JmsOperations jmsOperations31 = null;
        jmsEndpoint20.setMetadataJmsOperations(jmsOperations31);
        boolean b33 = jmsEndpoint20.isPollingConsumerBlockWhenFull();
        org.springframework.jms.core.JmsOperations jmsOperations37 = activeMQConfiguration0.createInOutTemplate(jmsEndpoint20, true, "endpoint1130", (long) '4');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(jmsBinding10);
        org.junit.Assert.assertNotNull(jmsEndpoint11);
        org.junit.Assert.assertNotNull(jmsBinding14);
        org.junit.Assert.assertNotNull(jmsEndpoint15);
        org.junit.Assert.assertNotNull(jmsBinding19);
        org.junit.Assert.assertNotNull(jmsEndpoint20);
        org.junit.Assert.assertNotNull(jmsBinding23);
        org.junit.Assert.assertNotNull(jmsEndpoint24);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(jmsOperations37);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test105");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        activeMQConfiguration0.setCacheLevelName("tcp://localhost:61616");
        boolean b5 = activeMQConfiguration0.isExplicitQosEnabled();
        int i6 = activeMQConfiguration0.getPriority();
        boolean b7 = activeMQConfiguration0.isReplyToDeliveryPersistent();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 4);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test106");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        int i2 = camelRoutesBroker1.getCheckPeriod();
        org.apache.activemq.broker.ConnectionContext connectionContext3 = null;
        org.apache.activemq.command.SessionInfo sessionInfo4 = null;
        try {
            camelRoutesBroker1.addSession(connectionContext3, sessionInfo4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i2 == 1000);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test107");
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
        boolean b25 = jmsEndpoint12.isAutoStartup();
        jmsEndpoint12.setIdleConsumerLimit(10);
        boolean b28 = jmsEndpoint12.isTransacted();
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
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b28 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test108");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentClientAcknowledge(connectionFactory0);
        jmsComponent1.setReplyToConcurrentConsumers((int) (byte) -1);
        java.lang.String str4 = jmsComponent1.getVersion();
        jmsComponent1.setErrorHandlerLogStackTrace(false);
        jmsComponent1.stop();
        org.junit.Assert.assertNotNull(jmsComponent1);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "2.16.1" + "'", str4.equals("2.16.1"));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test109");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        long long1 = camelConnectionFactory0.getWarnAboutUnstartedConnectionTimeout();
        org.apache.activemq.RedeliveryPolicy redeliveryPolicy2 = null;
        camelConnectionFactory0.setRedeliveryPolicy(redeliveryPolicy2);
        camelConnectionFactory0.setBeanName("tcp://localhost:61616");
        java.util.Properties properties6 = null;
        camelConnectionFactory0.setProperties(properties6);
        camelConnectionFactory0.setOptimizedMessageDispatch(true);
        camelConnectionFactory0.setAuditMaximumProducerNumber((int) (byte) 10);
        org.junit.Assert.assertTrue(long1 == 500L);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test110");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isAlwaysSyncSend();
        boolean b2 = activeMQConnection0.isConsumerExpiryCheckEnabled();
        javax.jms.ExceptionListener exceptionListener3 = activeMQConnection0.getExceptionListener();
        org.apache.activemq.command.ActiveMQDestination activeMQDestination5 = org.apache.activemq.camel.converter.ActiveMQConverter.toDestination("failover://tcp://localhost:61616");
        boolean b6 = activeMQConnection0.isDeleted(activeMQDestination5);
        boolean b7 = activeMQConnection0.isObjectMessageSerializationDefered();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(exceptionListener3);
        org.junit.Assert.assertNotNull(activeMQDestination5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test111");
        org.apache.activemq.camel.converter.ActiveMQMessageConverter activeMQMessageConverter0 = new org.apache.activemq.camel.converter.ActiveMQMessageConverter();
        javax.jms.MessageListener messageListener1 = null;
        org.apache.camel.Processor processor2 = activeMQMessageConverter0.toProcessor(messageListener1);
        org.apache.activemq.camel.CamelQueue camelQueue4 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding5 = camelQueue4.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint6 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue4);
        org.apache.activemq.camel.CamelQueue camelQueue8 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding9 = camelQueue8.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint10 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue8);
        jmsEndpoint6.setDestination((javax.jms.Destination) camelQueue8);
        boolean b12 = jmsEndpoint6.isIncludeAllJMSXProperties();
        long long13 = jmsEndpoint6.getTimeToLive();
        jmsEndpoint6.setReplyToMaxConcurrentConsumers(100);
        jmsEndpoint6.setTransactedInOut(false);
        jmsEndpoint6.setAllowNullBody(true);
        org.apache.activemq.camel.CamelQueue camelQueue21 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding22 = camelQueue21.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint23 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue21);
        org.apache.activemq.camel.CamelQueue camelQueue25 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding26 = camelQueue25.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint27 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue25);
        jmsEndpoint23.setDestination((javax.jms.Destination) camelQueue25);
        boolean b29 = jmsEndpoint23.isIncludeAllJMSXProperties();
        long long30 = jmsEndpoint23.getTimeToLive();
        jmsEndpoint23.setReplyToMaxConcurrentConsumers(100);
        jmsEndpoint23.setTransactedInOut(false);
        org.springframework.transaction.PlatformTransactionManager platformTransactionManager35 = jmsEndpoint23.getTransactionManager();
        org.apache.camel.component.jms.JmsBinding jmsBinding36 = jmsEndpoint23.getBinding();
        jmsEndpoint6.setBinding(jmsBinding36);
        activeMQMessageConverter0.setBinding(jmsBinding36);
        org.apache.camel.component.jms.JmsBinding jmsBinding39 = activeMQMessageConverter0.getBinding();
        org.junit.Assert.assertNotNull(processor2);
        org.junit.Assert.assertNotNull(jmsBinding5);
        org.junit.Assert.assertNotNull(jmsEndpoint6);
        org.junit.Assert.assertNotNull(jmsBinding9);
        org.junit.Assert.assertNotNull(jmsEndpoint10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(long13 == (-1L));
        org.junit.Assert.assertNotNull(jmsBinding22);
        org.junit.Assert.assertNotNull(jmsEndpoint23);
        org.junit.Assert.assertNotNull(jmsBinding26);
        org.junit.Assert.assertNotNull(jmsEndpoint27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(long30 == (-1L));
        org.junit.Assert.assertNull(platformTransactionManager35);
        org.junit.Assert.assertNotNull(jmsBinding36);
        org.junit.Assert.assertNotNull(jmsBinding39);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test112");
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
        int i23 = jmsEndpoint12.getIdleConsumerLimit();
        boolean b24 = jmsEndpoint12.isTransacted();
        jmsEndpoint12.setCacheLevelName("jms:queue:queue:");
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNotNull(jmsBinding11);
        org.junit.Assert.assertNotNull(jmsEndpoint12);
        org.junit.Assert.assertNotNull(jmsBinding15);
        org.junit.Assert.assertNotNull(jmsEndpoint16);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(i23 == 1);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test113");
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
        org.apache.camel.component.jms.JmsMessageType jmsMessageType27 = jmsEndpoint12.getJmsMessageType();
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
        org.junit.Assert.assertNull(jmsMessageType27);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test114");
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
        org.apache.activemq.camel.CamelQueue camelQueue23 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding24 = camelQueue23.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint25 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue23);
        org.apache.activemq.camel.CamelQueue camelQueue27 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding28 = camelQueue27.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint29 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue27);
        jmsEndpoint25.setDestination((javax.jms.Destination) camelQueue27);
        org.apache.activemq.camel.CamelQueue camelQueue32 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding33 = camelQueue32.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint34 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue32);
        org.apache.activemq.camel.CamelQueue camelQueue36 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding37 = camelQueue36.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint38 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue36);
        jmsEndpoint34.setDestination((javax.jms.Destination) camelQueue36);
        org.apache.activemq.ActiveMQSession activeMQSession40 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer43 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelQueue27, (org.apache.camel.Endpoint) jmsEndpoint34, activeMQSession40, "failover://tcp://localhost:61616", false);
        boolean b44 = jmsEndpoint34.isStarting();
        org.springframework.jms.core.JmsOperations jmsOperations45 = null;
        jmsEndpoint34.setMetadataJmsOperations(jmsOperations45);
        org.apache.camel.component.jms.JmsKeyFormatStrategy jmsKeyFormatStrategy47 = null;
        jmsEndpoint34.setJmsKeyFormatStrategy(jmsKeyFormatStrategy47);
        org.apache.activemq.ActiveMQSession activeMQSession49 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer52 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelQueue1, (org.apache.camel.Endpoint) jmsEndpoint34, activeMQSession49, "", false);
        jmsEndpoint34.setDestinationName("queue:");
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNotNull(jmsBinding10);
        org.junit.Assert.assertNotNull(jmsEndpoint11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(long14 == (-1L));
        org.junit.Assert.assertNotNull(jmsBinding24);
        org.junit.Assert.assertNotNull(jmsEndpoint25);
        org.junit.Assert.assertNotNull(jmsBinding28);
        org.junit.Assert.assertNotNull(jmsEndpoint29);
        org.junit.Assert.assertNotNull(jmsBinding33);
        org.junit.Assert.assertNotNull(jmsEndpoint34);
        org.junit.Assert.assertNotNull(jmsBinding37);
        org.junit.Assert.assertNotNull(jmsEndpoint38);
        org.junit.Assert.assertTrue(b44 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test115");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        int i4 = jmsEndpoint3.getMaxMessagesPerTask();
        java.lang.String str5 = jmsEndpoint3.getTransactionName();
        jmsEndpoint3.setEndpointUriIfNotSpecified("hi!");
        long long8 = jmsEndpoint3.getRequestTimeoutCheckerInterval();
        try {
            org.apache.camel.PollingConsumer pollingConsumer9 = jmsEndpoint3.createPollingConsumer();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue(long8 == 1000L);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test116");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory0.setObjectMessageSerializationDefered(true);
        camelConnectionFactory0.setSendTimeout((int) 'a');
        camelConnectionFactory0.setClientIDPrefix("failover://tcp://localhost:61616");
        javax.jms.TopicConnection topicConnection7 = camelConnectionFactory0.createTopicConnection();
        camelConnectionFactory0.setProducerWindowSize(4);
        org.junit.Assert.assertNotNull(topicConnection7);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test117");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        activeMQConfiguration0.setCacheLevelName("tcp://localhost:61616");
        org.apache.camel.component.jms.ConsumerType consumerType5 = activeMQConfiguration0.getConsumerType();
        boolean b6 = activeMQConfiguration0.isTransferException();
        java.lang.String str7 = activeMQConfiguration0.getReplyTo();
        boolean b8 = activeMQConfiguration0.isTransacted();
        activeMQConfiguration0.setRequestTimeout((-1L));
        activeMQConfiguration0.setAcceptMessagesWhileStopping(true);
        activeMQConfiguration0.setUseSingleConnection(false);
        long long15 = activeMQConfiguration0.getRecoveryInterval();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue("'" + consumerType5 + "' != '" + org.apache.camel.component.jms.ConsumerType.Default + "'", consumerType5.equals(org.apache.camel.component.jms.ConsumerType.Default));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(long15 == 5000L);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test118");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        jmsComponent1.setTransactionTimeout((int) (short) -1);
        jmsComponent1.setAsyncConsumer(true);
        jmsComponent1.setAcknowledgementMode(0);
        org.junit.Assert.assertNotNull(jmsComponent1);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test119");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        boolean b3 = activeMQConfiguration0.isErrorHandlerLogStackTrace();
        boolean b4 = activeMQConfiguration0.isMessageTimestampEnabled();
        javax.jms.ConnectionFactory connectionFactory5 = activeMQConfiguration0.getTemplateConnectionFactory();
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration6 = activeMQConfiguration0.copy();
        boolean b7 = jmsConfiguration6.isAsyncStopListener();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(connectionFactory5);
        org.junit.Assert.assertNotNull(jmsConfiguration6);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test120");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        int i1 = activeMQConfiguration0.getConcurrentConsumers();
        int i2 = activeMQConfiguration0.getReplyToMaxConcurrentConsumers();
        boolean b3 = activeMQConfiguration0.isAcceptMessagesWhileStopping();
        javax.jms.ConnectionFactory connectionFactory4 = activeMQConfiguration0.getTemplateConnectionFactory();
        org.junit.Assert.assertTrue(i1 == 1);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(connectionFactory4);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test121");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        jmsComponent1.setAcknowledgementModeName("hi!");
        jmsComponent1.setLazyCreateTransactionManager(false);
        try {
            org.apache.camel.Endpoint endpoint7 = jmsComponent1.createEndpoint("Consumer[jms:queue:queue:]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(jmsComponent1);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test122");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory0.setDisableTimeStampsByDefault(true);
        java.util.Properties properties3 = camelConnectionFactory0.getProperties();
        org.apache.camel.CamelContext camelContext4 = camelConnectionFactory0.getCamelContext();
        javax.jms.ExceptionListener exceptionListener5 = null;
        camelConnectionFactory0.setExceptionListener(exceptionListener5);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNull(camelContext4);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test123");
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
        jmsEndpoint12.setMaxConcurrentConsumers(1);
        jmsEndpoint12.setPollingConsumerQueueSize((int) (short) 0);
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
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test124");
        org.apache.activemq.camel.component.broker.BrokerEndpoint brokerEndpoint0 = null;
        org.apache.activemq.camel.component.broker.BrokerProducer brokerProducer1 = new org.apache.activemq.camel.component.broker.BrokerProducer(brokerEndpoint0);
        org.apache.activemq.camel.CamelQueue camelQueue3 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding4 = camelQueue3.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint5 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue3);
        boolean b6 = jmsEndpoint5.isPubSubNoLocal();
        jmsEndpoint5.setTimeToLive((long) (byte) 1);
        boolean b9 = jmsEndpoint5.isLenientProperties();
        int i10 = jmsEndpoint5.getIdleTaskExecutionLimit();
        org.apache.activemq.camel.CamelQueue camelQueue12 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding13 = camelQueue12.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint14 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue12);
        boolean b15 = jmsEndpoint14.isPubSubNoLocal();
        org.apache.camel.component.jms.JmsKeyFormatStrategy jmsKeyFormatStrategy16 = null;
        jmsEndpoint14.setJmsKeyFormatStrategy(jmsKeyFormatStrategy16);
        org.apache.activemq.camel.CamelQueue camelQueue19 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding20 = camelQueue19.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint21 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue19);
        jmsEndpoint21.setReplyToDestinationSelectorName("2.16.1");
        org.apache.camel.EndpointConfiguration endpointConfiguration24 = null;
        jmsEndpoint21.setEndpointConfiguration(endpointConfiguration24);
        org.apache.camel.ExchangePattern exchangePattern26 = jmsEndpoint21.getExchangePattern();
        org.apache.camel.Exchange exchange27 = jmsEndpoint14.createExchange(exchangePattern26);
        org.apache.camel.Exchange exchange28 = jmsEndpoint5.createExchange(exchangePattern26);
        org.apache.camel.AsyncCallback asyncCallback29 = null;
        try {
            boolean b30 = brokerProducer1.process(exchange28, asyncCallback29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(jmsBinding4);
        org.junit.Assert.assertNotNull(jmsEndpoint5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNotNull(jmsBinding13);
        org.junit.Assert.assertNotNull(jmsEndpoint14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(jmsBinding20);
        org.junit.Assert.assertNotNull(jmsEndpoint21);
        org.junit.Assert.assertTrue("'" + exchangePattern26 + "' != '" + org.apache.camel.ExchangePattern.InOnly + "'", exchangePattern26.equals(org.apache.camel.ExchangePattern.InOnly));
        org.junit.Assert.assertNotNull(exchange27);
        org.junit.Assert.assertNotNull(exchange28);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test125");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        boolean b4 = jmsEndpoint3.isPubSubNoLocal();
        jmsEndpoint3.setTimeToLive((long) (byte) 1);
        boolean b7 = jmsEndpoint3.isSynchronous();
        boolean b8 = jmsEndpoint3.isErrorHandlerLogStackTrace();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test126");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        long long1 = camelConnectionFactory0.getWarnAboutUnstartedConnectionTimeout();
        org.apache.activemq.RedeliveryPolicy redeliveryPolicy2 = null;
        camelConnectionFactory0.setRedeliveryPolicy(redeliveryPolicy2);
        camelConnectionFactory0.setBeanName("tcp://localhost:61616");
        java.lang.String str6 = camelConnectionFactory0.getUserName();
        camelConnectionFactory0.setCopyMessageOnSend(false);
        java.lang.String str9 = camelConnectionFactory0.getUserName();
        org.junit.Assert.assertTrue(long1 == 500L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test127");
        org.apache.activemq.camel.camelplugin.CamelRoutesBrokerPlugin camelRoutesBrokerPlugin0 = new org.apache.activemq.camel.camelplugin.CamelRoutesBrokerPlugin();
        java.lang.String str1 = camelRoutesBrokerPlugin0.getRoutesFile();
        camelRoutesBrokerPlugin0.setCheckPeriod((int) (byte) 0);
        org.apache.activemq.broker.Broker broker4 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker5 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker4);
        java.lang.String str6 = camelRoutesBroker5.getRoutesFile();
        int i7 = camelRoutesBroker5.getCheckPeriod();
        camelRoutesBroker5.setRoutesFile("hi!");
        org.apache.activemq.broker.Broker broker10 = camelRoutesBrokerPlugin0.installPlugin((org.apache.activemq.broker.Broker) camelRoutesBroker5);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(i7 == 1000);
        org.junit.Assert.assertNotNull(broker10);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test128");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory1 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory1.setDisableTimeStampsByDefault(true);
        java.util.Properties properties4 = camelConnectionFactory1.getProperties();
        camelConnectionFactory0.populateProperties(properties4);
        javax.jms.TopicConnection topicConnection8 = camelConnectionFactory0.createTopicConnection("queue:", "tcp://localhost:61616");
        boolean b9 = camelConnectionFactory0.isStatsEnabled();
        org.apache.activemq.blob.BlobTransferPolicy blobTransferPolicy10 = camelConnectionFactory0.getBlobTransferPolicy();
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNotNull(topicConnection8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(blobTransferPolicy10);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test129");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isAlwaysSyncSend();
        boolean b2 = activeMQConnection0.isConsumerExpiryCheckEnabled();
        javax.jms.ExceptionListener exceptionListener3 = activeMQConnection0.getExceptionListener();
        org.apache.activemq.thread.TaskRunnerFactory taskRunnerFactory4 = activeMQConnection0.getSessionTaskRunner();
        boolean b5 = activeMQConnection0.isNestedMapAndListEnabled();
        org.apache.activemq.command.Command command6 = null;
        org.apache.activemq.AsyncCallback asyncCallback7 = null;
        try {
            activeMQConnection0.syncSendPacket(command6, asyncCallback7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(exceptionListener3);
        org.junit.Assert.assertNotNull(taskRunnerFactory4);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test130");
        org.apache.activemq.camel.component.broker.BrokerEndpoint brokerEndpoint0 = null;
        org.apache.activemq.camel.component.broker.BrokerProducer brokerProducer1 = new org.apache.activemq.camel.component.broker.BrokerProducer(brokerEndpoint0);
        org.apache.camel.Endpoint endpoint2 = brokerProducer1.getEndpoint();
        org.apache.camel.Endpoint endpoint3 = brokerProducer1.getEndpoint();
        org.apache.camel.Endpoint endpoint4 = brokerProducer1.getEndpoint();
        org.apache.activemq.camel.CamelQueue camelQueue6 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding7 = camelQueue6.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint8 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue6);
        boolean b9 = jmsEndpoint8.isPubSubNoLocal();
        jmsEndpoint8.setTimeToLive((long) (byte) 1);
        boolean b12 = jmsEndpoint8.isLenientProperties();
        int i13 = jmsEndpoint8.getIdleTaskExecutionLimit();
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
        org.apache.camel.Exchange exchange31 = jmsEndpoint8.createExchange(exchangePattern29);
        try {
            brokerProducer1.process(exchange31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(endpoint2);
        org.junit.Assert.assertNull(endpoint3);
        org.junit.Assert.assertNull(endpoint4);
        org.junit.Assert.assertNotNull(jmsBinding7);
        org.junit.Assert.assertNotNull(jmsEndpoint8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertNotNull(jmsBinding16);
        org.junit.Assert.assertNotNull(jmsEndpoint17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(jmsBinding23);
        org.junit.Assert.assertNotNull(jmsEndpoint24);
        org.junit.Assert.assertTrue("'" + exchangePattern29 + "' != '" + org.apache.camel.ExchangePattern.InOnly + "'", exchangePattern29.equals(org.apache.camel.ExchangePattern.InOnly));
        org.junit.Assert.assertNotNull(exchange30);
        org.junit.Assert.assertNotNull(exchange31);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test131");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isAlwaysSyncSend();
        boolean b2 = activeMQConnection0.isConsumerExpiryCheckEnabled();
        javax.jms.ExceptionListener exceptionListener3 = activeMQConnection0.getExceptionListener();
        org.apache.activemq.thread.TaskRunnerFactory taskRunnerFactory4 = activeMQConnection0.getSessionTaskRunner();
        javax.jms.ExceptionListener exceptionListener5 = activeMQConnection0.getExceptionListener();
        activeMQConnection0.setConsumerExpiryCheckEnabled(true);
        activeMQConnection0.setAuditMaximumProducerNumber(0);
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(exceptionListener3);
        org.junit.Assert.assertNotNull(taskRunnerFactory4);
        org.junit.Assert.assertNull(exceptionListener5);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test132");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory0.setExclusiveConsumer(false);
        boolean b3 = camelConnectionFactory0.isDisableTimeStampsByDefault();
        camelConnectionFactory0.setRmIdFromConnectionId(false);
        int i6 = camelConnectionFactory0.getSendTimeout();
        org.apache.activemq.ActiveMQConnection activeMQConnection7 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b8 = activeMQConnection7.isAlwaysSyncSend();
        boolean b9 = activeMQConnection7.isConsumerExpiryCheckEnabled();
        org.apache.activemq.blob.BlobTransferPolicy blobTransferPolicy10 = activeMQConnection7.getBlobTransferPolicy();
        activeMQConnection7.setSendAcksAsync(true);
        camelConnectionFactory0.setTransportListener((org.apache.activemq.transport.TransportListener) activeMQConnection7);
        javax.jms.ConnectionMetaData connectionMetaData14 = activeMQConnection7.getMetaData();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(activeMQConnection7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(blobTransferPolicy10);
        org.junit.Assert.assertNotNull(connectionMetaData14);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test133");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        activeMQConfiguration0.setCacheLevelName("tcp://localhost:61616");
        boolean b5 = activeMQConfiguration0.isExplicitQosEnabled();
        activeMQConfiguration0.setPassword("");
        long long8 = activeMQConfiguration0.getRequestTimeout();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(long8 == 20000L);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test134");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        org.apache.camel.component.jms.ConsumerType consumerType2 = null;
        activeMQConfiguration0.setConsumerType(consumerType2);
        activeMQConfiguration0.setRequestTimeoutCheckerInterval((long) 'a');
        int i6 = activeMQConfiguration0.getTransactionTimeout();
        boolean b7 = activeMQConfiguration0.isPubSubNoLocal();
        java.lang.String str8 = activeMQConfiguration0.getReplyTo();
        java.lang.String str9 = activeMQConfiguration0.getAcknowledgementModeName();
        activeMQConfiguration0.setRecoveryInterval((long) (byte) 0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(i6 == (-1));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test135");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        boolean b4 = jmsEndpoint3.isPubSubNoLocal();
        jmsEndpoint3.setTimeToLive((long) (byte) 1);
        boolean b7 = jmsEndpoint3.isDeliveryPersistent();
        boolean b8 = jmsEndpoint3.isSuspending();
        jmsEndpoint3.setAcknowledgementMode((int) (short) 100);
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test136");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory1 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory1.setDisableTimeStampsByDefault(true);
        java.util.Properties properties4 = camelConnectionFactory1.getProperties();
        camelConnectionFactory0.populateProperties(properties4);
        javax.jms.TopicConnection topicConnection8 = camelConnectionFactory0.createTopicConnection("queue:", "tcp://localhost:61616");
        boolean b9 = camelConnectionFactory0.isUseRetroactiveConsumer();
        boolean b10 = camelConnectionFactory0.isMessagePrioritySupported();
        org.apache.activemq.transport.TransportListener transportListener11 = camelConnectionFactory0.getTransportListener();
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNotNull(topicConnection8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(transportListener11);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test137");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory0.setDisableTimeStampsByDefault(true);
        java.util.Properties properties3 = camelConnectionFactory0.getProperties();
        long long4 = camelConnectionFactory0.getConsumerFailoverRedeliveryWaitPeriod();
        boolean b5 = camelConnectionFactory0.isUseAsyncSend();
        javax.jms.Connection connection8 = camelConnectionFactory0.createConnection("tcp://localhost:61616", "");
        camelConnectionFactory0.setCopyMessageOnSend(false);
        int i11 = camelConnectionFactory0.getProducerWindowSize();
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertTrue(long4 == 0L);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(connection8);
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test138");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isAlwaysSyncSend();
        boolean b2 = activeMQConnection0.isConsumerExpiryCheckEnabled();
        org.apache.activemq.blob.BlobTransferPolicy blobTransferPolicy3 = activeMQConnection0.getBlobTransferPolicy();
        activeMQConnection0.doCleanup(false);
        java.util.concurrent.RejectedExecutionHandler rejectedExecutionHandler6 = activeMQConnection0.getRejectedTaskHandler();
        org.apache.activemq.transport.Transport transport7 = activeMQConnection0.getTransportChannel();
        activeMQConnection0.cleanup();
        org.apache.activemq.ActiveMQConnection activeMQConnection9 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b10 = activeMQConnection9.isAlwaysSyncSend();
        boolean b11 = activeMQConnection9.isConsumerExpiryCheckEnabled();
        javax.jms.ExceptionListener exceptionListener12 = activeMQConnection9.getExceptionListener();
        org.apache.activemq.thread.TaskRunnerFactory taskRunnerFactory13 = activeMQConnection9.getSessionTaskRunner();
        activeMQConnection0.setSessionTaskRunner(taskRunnerFactory13);
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(blobTransferPolicy3);
        org.junit.Assert.assertNull(rejectedExecutionHandler6);
        org.junit.Assert.assertNotNull(transport7);
        org.junit.Assert.assertNotNull(activeMQConnection9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(exceptionListener12);
        org.junit.Assert.assertNotNull(taskRunnerFactory13);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test139");
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
        org.apache.camel.component.jms.JmsMessageType jmsMessageType26 = jmsEndpoint12.getJmsMessageType();
        boolean b27 = jmsEndpoint12.isStarting();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNotNull(jmsBinding11);
        org.junit.Assert.assertNotNull(jmsEndpoint12);
        org.junit.Assert.assertNotNull(jmsBinding15);
        org.junit.Assert.assertNotNull(jmsEndpoint16);
        org.junit.Assert.assertNull(jmsMessageType26);
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test140");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        boolean b3 = activeMQConfiguration0.isErrorHandlerLogStackTrace();
        boolean b4 = activeMQConfiguration0.isMessageTimestampEnabled();
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy5 = activeMQConfiguration0.getMessageCreatedStrategy();
        int i6 = activeMQConfiguration0.getReplyToMaxConcurrentConsumers();
        activeMQConfiguration0.setTransacted(false);
        boolean b9 = activeMQConfiguration0.isAllowNullBody();
        activeMQConfiguration0.setIncludeSentJMSMessageID(false);
        int i12 = activeMQConfiguration0.getConcurrentConsumers();
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration13 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str14 = activeMQConfiguration13.getReplyTo();
        org.apache.camel.component.jms.ConsumerType consumerType15 = null;
        activeMQConfiguration13.setConsumerType(consumerType15);
        activeMQConfiguration13.setConcurrentConsumers((int) (short) 1);
        activeMQConfiguration13.setExplicitQosEnabled(false);
        org.apache.camel.component.jms.JmsKeyFormatStrategy jmsKeyFormatStrategy21 = activeMQConfiguration13.getJmsKeyFormatStrategy();
        activeMQConfiguration0.setJmsKeyFormatStrategy(jmsKeyFormatStrategy21);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(messageCreatedStrategy5);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(jmsKeyFormatStrategy21);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test141");
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent1 = org.apache.activemq.camel.component.ActiveMQComponent.activeMQComponent("2.16.1");
        activeMQComponent1.setUsePooledConnection(true);
        activeMQComponent1.setTestConnectionOnStartup(true);
        activeMQComponent1.setPriority((int) 'a');
        activeMQComponent1.setUseSingleConnection(false);
        org.junit.Assert.assertNotNull(activeMQComponent1);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test142");
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
        int i13 = activeMQConfiguration0.getMaxConcurrentConsumers();
        org.apache.camel.component.jms.DefaultTaskExecutorType defaultTaskExecutorType14 = null;
        activeMQConfiguration0.setDefaultTaskExecutorType(defaultTaskExecutorType14);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(long5 == (-1L));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + consumerType11 + "' != '" + org.apache.camel.component.jms.ConsumerType.Default + "'", consumerType11.equals(org.apache.camel.component.jms.ConsumerType.Default));
        org.junit.Assert.assertTrue(i13 == 0);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test143");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        jmsComponent1.setAcknowledgementModeName("hi!");
        jmsComponent1.setLazyCreateTransactionManager(false);
        jmsComponent1.setEagerLoadingOfProperties(true);
        jmsComponent1.setTimeToLive((long) (byte) -1);
        org.springframework.transaction.PlatformTransactionManager platformTransactionManager10 = null;
        jmsComponent1.setTransactionManager(platformTransactionManager10);
        org.junit.Assert.assertNotNull(jmsComponent1);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test144");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        activeMQConfiguration0.setAsyncConsumer(true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test145");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        boolean b4 = jmsEndpoint3.isPubSubNoLocal();
        jmsEndpoint3.setTimeToLive((long) (byte) 1);
        boolean b7 = jmsEndpoint3.isLenientProperties();
        int i8 = jmsEndpoint3.getIdleTaskExecutionLimit();
        org.apache.activemq.camel.CamelQueue camelQueue10 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding11 = camelQueue10.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint12 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue10);
        boolean b13 = jmsEndpoint12.isPubSubNoLocal();
        org.apache.camel.component.jms.JmsKeyFormatStrategy jmsKeyFormatStrategy14 = null;
        jmsEndpoint12.setJmsKeyFormatStrategy(jmsKeyFormatStrategy14);
        org.apache.activemq.camel.CamelQueue camelQueue17 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding18 = camelQueue17.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint19 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue17);
        jmsEndpoint19.setReplyToDestinationSelectorName("2.16.1");
        org.apache.camel.EndpointConfiguration endpointConfiguration22 = null;
        jmsEndpoint19.setEndpointConfiguration(endpointConfiguration22);
        org.apache.camel.ExchangePattern exchangePattern24 = jmsEndpoint19.getExchangePattern();
        org.apache.camel.Exchange exchange25 = jmsEndpoint12.createExchange(exchangePattern24);
        org.apache.camel.Exchange exchange26 = jmsEndpoint3.createExchange(exchangePattern24);
        boolean b27 = jmsEndpoint3.isSubscriptionDurable();
        jmsEndpoint3.setAcknowledgementModeName("queue:");
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertNotNull(jmsBinding11);
        org.junit.Assert.assertNotNull(jmsEndpoint12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(jmsBinding18);
        org.junit.Assert.assertNotNull(jmsEndpoint19);
        org.junit.Assert.assertTrue("'" + exchangePattern24 + "' != '" + org.apache.camel.ExchangePattern.InOnly + "'", exchangePattern24.equals(org.apache.camel.ExchangePattern.InOnly));
        org.junit.Assert.assertNotNull(exchange25);
        org.junit.Assert.assertNotNull(exchange26);
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test146");
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
        try {
            org.springframework.jms.listener.AbstractMessageListenerContainer abstractMessageListenerContainer24 = jmsEndpoint12.createMessageListenerContainer();
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
        org.junit.Assert.assertTrue(b23 == true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test147");
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
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy57 = null;
        jmsEndpoint3.setMessageCreatedStrategy(messageCreatedStrategy57);
        jmsEndpoint3.stop();
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
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test148");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory0.setExclusiveConsumer(false);
        java.util.concurrent.RejectedExecutionHandler rejectedExecutionHandler3 = camelConnectionFactory0.getRejectedTaskHandler();
        java.util.concurrent.RejectedExecutionHandler rejectedExecutionHandler4 = camelConnectionFactory0.getRejectedTaskHandler();
        org.apache.activemq.broker.region.policy.RedeliveryPolicyMap redeliveryPolicyMap5 = camelConnectionFactory0.getRedeliveryPolicyMap();
        org.junit.Assert.assertNull(rejectedExecutionHandler3);
        org.junit.Assert.assertNull(rejectedExecutionHandler4);
        org.junit.Assert.assertNotNull(redeliveryPolicyMap5);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test149");
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
        boolean b25 = jmsEndpoint12.isAutoStartup();
        boolean b26 = jmsEndpoint12.isAsyncStopListener();
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
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test150");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isAlwaysSyncSend();
        boolean b2 = activeMQConnection0.isConsumerExpiryCheckEnabled();
        javax.jms.ExceptionListener exceptionListener3 = activeMQConnection0.getExceptionListener();
        org.apache.activemq.thread.TaskRunnerFactory taskRunnerFactory4 = activeMQConnection0.getSessionTaskRunner();
        javax.jms.ExceptionListener exceptionListener5 = activeMQConnection0.getExceptionListener();
        boolean b6 = activeMQConnection0.isTransportFailed();
        activeMQConnection0.doCleanup(false);
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(exceptionListener3);
        org.junit.Assert.assertNotNull(taskRunnerFactory4);
        org.junit.Assert.assertNull(exceptionListener5);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test151");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        jmsComponent1.setAcknowledgementModeName("hi!");
        jmsComponent1.setLazyCreateTransactionManager(false);
        jmsComponent1.setClientId("hi!");
        jmsComponent1.setClientId("temp:topic:");
        jmsComponent1.setDeliveryPersistent(false);
        org.junit.Assert.assertNotNull(jmsComponent1);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test152");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory0.setObjectMessageSerializationDefered(true);
        camelConnectionFactory0.setCheckForDuplicates(true);
        org.apache.camel.CamelContext camelContext5 = null;
        camelConnectionFactory0.setCamelContext(camelContext5);
        boolean b7 = camelConnectionFactory0.isCheckForDuplicates();
        camelConnectionFactory0.setCloseTimeout((int) '4');
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test153");
        org.apache.activemq.camel.component.broker.BrokerComponent brokerComponent1 = new org.apache.activemq.camel.component.broker.BrokerComponent();
        org.apache.camel.CamelContext camelContext2 = brokerComponent1.getCamelContext();
        boolean b3 = brokerComponent1.useRawUri();
        org.apache.activemq.command.ActiveMQDestination activeMQDestination6 = org.apache.activemq.camel.converter.ActiveMQConverter.toDestination("2.16.1");
        org.apache.activemq.camel.component.broker.BrokerConfiguration brokerConfiguration7 = null;
        org.apache.activemq.camel.component.broker.BrokerEndpoint brokerEndpoint8 = new org.apache.activemq.camel.component.broker.BrokerEndpoint("tcp://localhost:61616", brokerComponent1, "tcp://localhost:61616", activeMQDestination6, brokerConfiguration7);
        boolean b9 = brokerEndpoint8.isMultipleConsumersSupported();
        java.lang.String str10 = brokerEndpoint8.getDestinationName();
        org.apache.activemq.command.ActiveMQDestination activeMQDestination11 = brokerEndpoint8.getDestination();
        org.apache.activemq.camel.component.broker.BrokerEndpoint brokerEndpoint12 = null;
        org.apache.activemq.camel.component.broker.BrokerProducer brokerProducer13 = new org.apache.activemq.camel.component.broker.BrokerProducer(brokerEndpoint12);
        org.apache.camel.Endpoint endpoint14 = brokerProducer13.getEndpoint();
        org.apache.camel.Endpoint endpoint15 = brokerProducer13.getEndpoint();
        org.apache.camel.Endpoint endpoint16 = brokerProducer13.getEndpoint();
        org.apache.camel.Consumer consumer17 = brokerEndpoint8.createConsumer((org.apache.camel.Processor) brokerProducer13);
        try {
            java.lang.String str18 = brokerProducer13.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(camelContext2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(activeMQDestination6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tcp://localhost:61616" + "'", str10.equals("tcp://localhost:61616"));
        org.junit.Assert.assertNotNull(activeMQDestination11);
        org.junit.Assert.assertNull(endpoint14);
        org.junit.Assert.assertNull(endpoint15);
        org.junit.Assert.assertNull(endpoint16);
        org.junit.Assert.assertNotNull(consumer17);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test154");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        boolean b3 = activeMQConfiguration0.isLazyCreateTransactionManager();
        activeMQConfiguration0.setAcknowledgementMode((int) (byte) 10);
        activeMQConfiguration0.setMaxMessagesPerTask((int) (short) 10);
        boolean b8 = activeMQConfiguration0.isAlwaysCopyMessage();
        activeMQConfiguration0.setConcurrentConsumers(15000);
        java.lang.String str11 = activeMQConfiguration0.getUserName();
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy12 = activeMQConfiguration0.getMessageCreatedStrategy();
        boolean b13 = activeMQConfiguration0.isAlwaysCopyMessage();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(messageCreatedStrategy12);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test155");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isAlwaysSyncSend();
        boolean b2 = activeMQConnection0.isConsumerExpiryCheckEnabled();
        javax.jms.ExceptionListener exceptionListener3 = activeMQConnection0.getExceptionListener();
        org.apache.activemq.thread.TaskRunnerFactory taskRunnerFactory4 = activeMQConnection0.getSessionTaskRunner();
        long long5 = activeMQConnection0.getConsumerFailoverRedeliveryWaitPeriod();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(exceptionListener3);
        org.junit.Assert.assertNotNull(taskRunnerFactory4);
        org.junit.Assert.assertTrue(long5 == 0L);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test156");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentClientAcknowledge(connectionFactory0);
        jmsComponent1.setAcceptMessagesWhileStopping(false);
        jmsComponent1.setPreserveMessageQos(true);
        jmsComponent1.setExplicitQosEnabled(true);
        boolean b8 = jmsComponent1.isStarting();
        jmsComponent1.setAcknowledgementMode((int) (short) 100);
        jmsComponent1.setPreserveMessageQos(true);
        jmsComponent1.setTransacted(true);
        org.junit.Assert.assertNotNull(jmsComponent1);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test157");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.springframework.transaction.PlatformTransactionManager platformTransactionManager1 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent2 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0, platformTransactionManager1);
        org.junit.Assert.assertNotNull(jmsComponent2);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test158");
        org.apache.camel.CamelContext camelContext0 = null;
        org.apache.activemq.camel.component.ActiveMQComponent activeMQComponent1 = new org.apache.activemq.camel.component.ActiveMQComponent(camelContext0);
        activeMQComponent1.setIdleTaskExecutionLimit((-1));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test159");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        java.lang.String str2 = camelRoutesBroker1.getRoutesFile();
        int i3 = camelRoutesBroker1.getCheckPeriod();
        camelRoutesBroker1.setRoutesFile("hi!");
        org.apache.activemq.broker.ConnectionContext connectionContext6 = null;
        org.apache.activemq.command.RemoveSubscriptionInfo removeSubscriptionInfo7 = null;
        try {
            camelRoutesBroker1.removeSubscription(connectionContext6, removeSubscriptionInfo7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 1000);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test160");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory0.setDisableTimeStampsByDefault(true);
        java.lang.String str3 = camelConnectionFactory0.getPassword();
        camelConnectionFactory0.setDisableTimeStampsByDefault(false);
        javax.jms.Connection connection6 = camelConnectionFactory0.createConnection();
        boolean b7 = camelConnectionFactory0.isDispatchAsync();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(connection6);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test161");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory0.setObjectMessageSerializationDefered(true);
        camelConnectionFactory0.setCheckForDuplicates(true);
        org.apache.camel.CamelContext camelContext5 = null;
        camelConnectionFactory0.setCamelContext(camelContext5);
        org.apache.camel.component.jms.JmsComponent jmsComponent7 = org.apache.camel.component.jms.JmsComponent.jmsComponent((javax.jms.ConnectionFactory) camelConnectionFactory0);
        org.apache.activemq.ActiveMQConnection activeMQConnection8 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b9 = activeMQConnection8.isAlwaysSyncSend();
        boolean b10 = activeMQConnection8.isConsumerExpiryCheckEnabled();
        javax.jms.ExceptionListener exceptionListener11 = activeMQConnection8.getExceptionListener();
        org.apache.activemq.thread.TaskRunnerFactory taskRunnerFactory12 = activeMQConnection8.getSessionTaskRunner();
        camelConnectionFactory0.setSessionTaskRunner(taskRunnerFactory12);
        org.apache.activemq.MessageTransformer messageTransformer14 = null;
        camelConnectionFactory0.setTransformer(messageTransformer14);
        org.junit.Assert.assertNotNull(jmsComponent7);
        org.junit.Assert.assertNotNull(activeMQConnection8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNull(exceptionListener11);
        org.junit.Assert.assertNotNull(taskRunnerFactory12);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test162");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        activeMQConfiguration0.setPriority((int) (short) 100);
        activeMQConfiguration0.setTransferException(false);
        boolean b6 = activeMQConfiguration0.isReplyToSameDestinationAllowed();
        activeMQConfiguration0.setAcknowledgementModeName("temp:topic:");
        activeMQConfiguration0.setPubSubNoLocal(false);
        org.springframework.core.task.TaskExecutor taskExecutor11 = null;
        activeMQConfiguration0.setTaskExecutor(taskExecutor11);
        activeMQConfiguration0.setReplyToDeliveryPersistent(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test163");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        org.apache.camel.component.jms.ConsumerType consumerType2 = null;
        activeMQConfiguration0.setConsumerType(consumerType2);
        java.lang.String str4 = activeMQConfiguration0.getPassword();
        org.apache.camel.component.jms.JmsKeyFormatStrategy jmsKeyFormatStrategy5 = activeMQConfiguration0.getJmsKeyFormatStrategy();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(jmsKeyFormatStrategy5);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test164");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory0.setExclusiveConsumer(false);
        boolean b3 = camelConnectionFactory0.isDisableTimeStampsByDefault();
        camelConnectionFactory0.setRmIdFromConnectionId(false);
        boolean b6 = camelConnectionFactory0.isCopyMessageOnSend();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test165");
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
        activeMQConfiguration0.setIncludeAllJMSXProperties(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(long5 == (-1L));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + consumerType11 + "' != '" + org.apache.camel.component.jms.ConsumerType.Default + "'", consumerType11.equals(org.apache.camel.component.jms.ConsumerType.Default));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test166");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        activeMQConfiguration0.setBrokerURL("temp:topic:");
        activeMQConfiguration0.setIdleConsumerLimit((int) (short) -1);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test167");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        activeMQConfiguration0.setCacheLevelName("tcp://localhost:61616");
        activeMQConfiguration0.setAcknowledgementMode((int) (byte) 0);
        org.apache.camel.component.jms.DefaultTaskExecutorType defaultTaskExecutorType7 = activeMQConfiguration0.getDefaultTaskExecutorType();
        boolean b8 = activeMQConfiguration0.isTransferException();
        activeMQConfiguration0.setAsyncStopListener(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNull(defaultTaskExecutorType7);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test168");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isAlwaysSyncSend();
        boolean b2 = activeMQConnection0.isConsumerExpiryCheckEnabled();
        activeMQConnection0.setNonBlockingRedelivery(false);
        activeMQConnection0.setNonBlockingRedelivery(true);
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test169");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        jmsComponent1.setTransactionTimeout((int) (short) -1);
        jmsComponent1.setConcurrentConsumers((int) (byte) 1);
        jmsComponent1.setMessageIdEnabled(true);
        jmsComponent1.suspend();
        jmsComponent1.setErrorHandlerLogStackTrace(false);
        org.springframework.jms.support.destination.DestinationResolver destinationResolver11 = null;
        jmsComponent1.setDestinationResolver(destinationResolver11);
        org.junit.Assert.assertNotNull(jmsComponent1);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test170");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        jmsComponent1.setAcknowledgementModeName("failover://tcp://localhost:61616");
        jmsComponent1.setTimeToLive(500L);
        jmsComponent1.setClientId("topic:");
        org.junit.Assert.assertNotNull(jmsComponent1);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test171");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        java.lang.String str2 = camelRoutesBroker1.getRoutesFile();
        int i3 = camelRoutesBroker1.getCheckPeriod();
        camelRoutesBroker1.setRoutesFile("hi!");
        camelRoutesBroker1.setCheckPeriod((int) (byte) 10);
        org.apache.activemq.broker.region.MessageReference messageReference8 = null;
        try {
            boolean b9 = camelRoutesBroker1.isExpired(messageReference8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 1000);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test172");
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
        boolean b28 = jmsEndpoint12.isForceSendOriginalMessage();
        org.apache.camel.LoggingLevel loggingLevel29 = jmsEndpoint12.getErrorHandlerLoggingLevel();
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
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + loggingLevel29 + "' != '" + org.apache.camel.LoggingLevel.WARN + "'", loggingLevel29.equals(org.apache.camel.LoggingLevel.WARN));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test173");
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
        org.apache.activemq.camel.CamelQueue camelQueue23 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding24 = camelQueue23.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint25 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue23);
        boolean b26 = jmsEndpoint25.isPubSubNoLocal();
        org.apache.camel.component.jms.JmsKeyFormatStrategy jmsKeyFormatStrategy27 = null;
        jmsEndpoint25.setJmsKeyFormatStrategy(jmsKeyFormatStrategy27);
        org.apache.activemq.ActiveMQSession activeMQSession29 = null;
        org.apache.activemq.camel.CamelMessageConsumer camelMessageConsumer32 = new org.apache.activemq.camel.CamelMessageConsumer((org.apache.activemq.camel.CamelDestination) camelQueue1, (org.apache.camel.Endpoint) jmsEndpoint25, activeMQSession29, "", true);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNotNull(jmsBinding10);
        org.junit.Assert.assertNotNull(jmsEndpoint11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(long14 == (-1L));
        org.junit.Assert.assertNotNull(jmsBinding24);
        org.junit.Assert.assertNotNull(jmsEndpoint25);
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test174");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        java.lang.String str2 = camelRoutesBroker1.getRoutesFile();
        int i3 = camelRoutesBroker1.getCheckPeriod();
        camelRoutesBroker1.setRoutesFile("hi!");
        try {
            java.util.concurrent.ThreadPoolExecutor threadPoolExecutor6 = camelRoutesBroker1.getExecutor();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 1000);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test175");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        org.apache.camel.component.jms.ConsumerType consumerType2 = null;
        activeMQConfiguration0.setConsumerType(consumerType2);
        activeMQConfiguration0.setRequestTimeoutCheckerInterval((long) 'a');
        int i6 = activeMQConfiguration0.getTransactionTimeout();
        javax.jms.ConnectionFactory connectionFactory7 = activeMQConfiguration0.getListenerConnectionFactory();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(i6 == (-1));
        org.junit.Assert.assertNotNull(connectionFactory7);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test176");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isAlwaysSyncSend();
        boolean b2 = activeMQConnection0.isConsumerExpiryCheckEnabled();
        javax.jms.ExceptionListener exceptionListener3 = activeMQConnection0.getExceptionListener();
        org.apache.activemq.thread.TaskRunnerFactory taskRunnerFactory4 = activeMQConnection0.getSessionTaskRunner();
        boolean b5 = activeMQConnection0.isNestedMapAndListEnabled();
        org.apache.activemq.blob.BlobTransferPolicy blobTransferPolicy6 = activeMQConnection0.getBlobTransferPolicy();
        org.apache.activemq.RedeliveryPolicy redeliveryPolicy7 = activeMQConnection0.getRedeliveryPolicy();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(exceptionListener3);
        org.junit.Assert.assertNotNull(taskRunnerFactory4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(blobTransferPolicy6);
        org.junit.Assert.assertNotNull(redeliveryPolicy7);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test177");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        activeMQConfiguration0.setExplicitQosEnabled(true);
        activeMQConfiguration0.setAcknowledgementModeName("queue:");
        activeMQConfiguration0.setAsyncStopListener(false);
        activeMQConfiguration0.setMapJmsMessage(false);
        int i9 = activeMQConfiguration0.getPriority();
        org.junit.Assert.assertTrue(i9 == 4);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test178");
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
        jmsEndpoint12.setDestinationName("2.16.1");
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
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test179");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        java.lang.String str3 = activeMQConfiguration0.getDurableSubscriptionName();
        org.apache.camel.component.jms.ReplyToType replyToType4 = activeMQConfiguration0.getReplyToType();
        javax.jms.ConnectionFactory connectionFactory5 = activeMQConfiguration0.getTemplateConnectionFactory();
        activeMQConfiguration0.setTimeToLive((long) (byte) -1);
        long long8 = activeMQConfiguration0.getTimeToLive();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(replyToType4);
        org.junit.Assert.assertNotNull(connectionFactory5);
        org.junit.Assert.assertTrue(long8 == (-1L));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test180");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        boolean b3 = activeMQConfiguration0.isLazyCreateTransactionManager();
        activeMQConfiguration0.setAcknowledgementMode((int) (byte) 10);
        activeMQConfiguration0.setMaxMessagesPerTask((int) (short) 10);
        boolean b8 = activeMQConfiguration0.isAlwaysCopyMessage();
        activeMQConfiguration0.setConcurrentConsumers(15000);
        java.lang.String str11 = activeMQConfiguration0.getUserName();
        activeMQConfiguration0.setIdleConsumerLimit((int) (byte) 0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test181");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory0.setObjectMessageSerializationDefered(true);
        camelConnectionFactory0.setCheckForDuplicates(true);
        org.apache.camel.CamelContext camelContext5 = null;
        camelConnectionFactory0.setCamelContext(camelContext5);
        org.apache.camel.component.jms.JmsComponent jmsComponent7 = org.apache.camel.component.jms.JmsComponent.jmsComponent((javax.jms.ConnectionFactory) camelConnectionFactory0);
        org.apache.camel.component.jms.MessageCreatedStrategy messageCreatedStrategy8 = jmsComponent7.getMessageCreatedStrategy();
        org.junit.Assert.assertNotNull(jmsComponent7);
        org.junit.Assert.assertNull(messageCreatedStrategy8);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test182");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("tcp://localhost:61616");
        org.apache.activemq.ActiveMQSession activeMQSession2 = null;
        try {
            javax.jms.TopicSubscriber topicSubscriber5 = camelTopic1.createSubscriber(activeMQSession2, "tcp://localhost:61616", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test183");
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
        camelConnectionFactory9.setConnectionIDPrefix("");
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test184");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        java.lang.String str2 = camelRoutesBroker1.getRoutesFile();
        int i3 = camelRoutesBroker1.getCheckPeriod();
        camelRoutesBroker1.setRoutesFile("hi!");
        camelRoutesBroker1.setCheckPeriod(2048);
        try {
            camelRoutesBroker1.brokerServiceStarted();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 1000);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test185");
        org.apache.activemq.camel.component.broker.BrokerEndpoint brokerEndpoint0 = null;
        org.apache.activemq.camel.component.broker.BrokerProducer brokerProducer1 = new org.apache.activemq.camel.component.broker.BrokerProducer(brokerEndpoint0);
        org.apache.camel.Endpoint endpoint2 = brokerProducer1.getEndpoint();
        org.apache.camel.Endpoint endpoint3 = brokerProducer1.getEndpoint();
        org.apache.activemq.camel.CamelQueue camelQueue5 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding6 = camelQueue5.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint7 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue5);
        boolean b8 = jmsEndpoint7.isPubSubNoLocal();
        jmsEndpoint7.setTimeToLive((long) (byte) 1);
        boolean b11 = jmsEndpoint7.isLenientProperties();
        int i12 = jmsEndpoint7.getIdleTaskExecutionLimit();
        org.apache.activemq.camel.CamelQueue camelQueue14 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding15 = camelQueue14.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint16 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue14);
        boolean b17 = jmsEndpoint16.isPubSubNoLocal();
        org.apache.camel.component.jms.JmsKeyFormatStrategy jmsKeyFormatStrategy18 = null;
        jmsEndpoint16.setJmsKeyFormatStrategy(jmsKeyFormatStrategy18);
        org.apache.activemq.camel.CamelQueue camelQueue21 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding22 = camelQueue21.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint23 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue21);
        jmsEndpoint23.setReplyToDestinationSelectorName("2.16.1");
        org.apache.camel.EndpointConfiguration endpointConfiguration26 = null;
        jmsEndpoint23.setEndpointConfiguration(endpointConfiguration26);
        org.apache.camel.ExchangePattern exchangePattern28 = jmsEndpoint23.getExchangePattern();
        org.apache.camel.Exchange exchange29 = jmsEndpoint16.createExchange(exchangePattern28);
        org.apache.camel.Exchange exchange30 = jmsEndpoint7.createExchange(exchangePattern28);
        try {
            org.apache.camel.Exchange exchange31 = brokerProducer1.createExchange(exchange30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(endpoint2);
        org.junit.Assert.assertNull(endpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertNotNull(jmsBinding15);
        org.junit.Assert.assertNotNull(jmsEndpoint16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(jmsBinding22);
        org.junit.Assert.assertNotNull(jmsEndpoint23);
        org.junit.Assert.assertTrue("'" + exchangePattern28 + "' != '" + org.apache.camel.ExchangePattern.InOnly + "'", exchangePattern28.equals(org.apache.camel.ExchangePattern.InOnly));
        org.junit.Assert.assertNotNull(exchange29);
        org.junit.Assert.assertNotNull(exchange30);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test186");
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
        jmsEndpoint12.setClientId("queue:");
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
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test187");
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
        org.apache.camel.CamelContext camelContext28 = null;
        jmsEndpoint12.setCamelContext(camelContext28);
        org.apache.activemq.camel.CamelQueue camelQueue31 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding32 = camelQueue31.getBinding();
        org.apache.camel.CamelContext camelContext33 = null;
        camelQueue31.setCamelContext(camelContext33);
        java.lang.String str35 = camelQueue31.toString();
        java.lang.String str36 = camelQueue31.toString();
        jmsEndpoint12.setDestination((javax.jms.Destination) camelQueue31);
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNotNull(jmsBinding11);
        org.junit.Assert.assertNotNull(jmsEndpoint12);
        org.junit.Assert.assertNotNull(jmsBinding15);
        org.junit.Assert.assertNotNull(jmsEndpoint16);
        org.junit.Assert.assertNotNull(jmsBinding32);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "queue:" + "'", str35.equals("queue:"));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "queue:" + "'", str36.equals("queue:"));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test188");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isAlwaysSyncSend();
        activeMQConnection0.setCheckForDuplicates(true);
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test189");
        org.apache.activemq.camel.CamelTopic camelTopic1 = new org.apache.activemq.camel.CamelTopic("tcp://localhost:61616");
        org.apache.activemq.camel.CamelQueue camelQueue3 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding4 = camelQueue3.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint5 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue3);
        boolean b6 = jmsEndpoint5.isPubSubNoLocal();
        jmsEndpoint5.setTimeToLive((long) (byte) 1);
        boolean b9 = jmsEndpoint5.isSynchronous();
        org.apache.activemq.ActiveMQSession activeMQSession10 = null;
        org.apache.activemq.camel.CamelTopicSubscriber camelTopicSubscriber14 = new org.apache.activemq.camel.CamelTopicSubscriber(camelTopic1, (org.apache.camel.Endpoint) jmsEndpoint5, activeMQSession10, "failover://tcp://localhost:61616", "failover://tcp://localhost:61616", false);
        org.apache.activemq.camel.CamelQueue camelQueue16 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding17 = camelQueue16.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint18 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue16);
        org.apache.activemq.camel.CamelQueue camelQueue20 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding21 = camelQueue20.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint22 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue20);
        jmsEndpoint18.setDestination((javax.jms.Destination) camelQueue20);
        boolean b24 = jmsEndpoint18.isIncludeAllJMSXProperties();
        long long25 = jmsEndpoint18.getTimeToLive();
        org.apache.camel.component.jms.MessageListenerContainerFactory messageListenerContainerFactory26 = null;
        jmsEndpoint18.setMessageListenerContainerFactory(messageListenerContainerFactory26);
        jmsEndpoint18.setReplyToDeliveryPersistent(false);
        org.apache.activemq.ActiveMQSession activeMQSession30 = null;
        try {
            org.apache.activemq.camel.CamelTopicPublisher camelTopicPublisher31 = new org.apache.activemq.camel.CamelTopicPublisher(camelTopic1, (org.apache.camel.Endpoint) jmsEndpoint18, activeMQSession30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(jmsBinding4);
        org.junit.Assert.assertNotNull(jmsEndpoint5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(jmsBinding17);
        org.junit.Assert.assertNotNull(jmsEndpoint18);
        org.junit.Assert.assertNotNull(jmsBinding21);
        org.junit.Assert.assertNotNull(jmsEndpoint22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(long25 == (-1L));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test190");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        int i1 = activeMQConfiguration0.getConcurrentConsumers();
        org.apache.camel.component.jms.ConsumerType consumerType2 = activeMQConfiguration0.getConsumerType();
        activeMQConfiguration0.setAcknowledgementMode((int) '#');
        activeMQConfiguration0.setMaxConcurrentConsumers((int) (byte) 10);
        org.apache.activemq.camel.CamelQueue camelQueue8 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding9 = camelQueue8.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint10 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue8);
        org.apache.activemq.camel.CamelQueue camelQueue12 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding13 = camelQueue12.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint14 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue12);
        jmsEndpoint10.setDestination((javax.jms.Destination) camelQueue12);
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
        jmsEndpoint10.setJmsOperations(jmsOperations43);
        activeMQConfiguration0.setJmsOperations(jmsOperations43);
        org.junit.Assert.assertTrue(i1 == 1);
        org.junit.Assert.assertTrue("'" + consumerType2 + "' != '" + org.apache.camel.component.jms.ConsumerType.Default + "'", consumerType2.equals(org.apache.camel.component.jms.ConsumerType.Default));
        org.junit.Assert.assertNotNull(jmsBinding9);
        org.junit.Assert.assertNotNull(jmsEndpoint10);
        org.junit.Assert.assertNotNull(jmsBinding13);
        org.junit.Assert.assertNotNull(jmsEndpoint14);
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
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test191");
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
        org.apache.camel.component.jms.JmsMessageType jmsMessageType26 = jmsEndpoint12.getJmsMessageType();
        boolean b27 = jmsEndpoint12.isMessageIdEnabled();
        boolean b28 = jmsEndpoint12.isExposeListenerSession();
        boolean b29 = jmsEndpoint12.isAllowNullBody();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertNotNull(jmsBinding11);
        org.junit.Assert.assertNotNull(jmsEndpoint12);
        org.junit.Assert.assertNotNull(jmsBinding15);
        org.junit.Assert.assertNotNull(jmsEndpoint16);
        org.junit.Assert.assertNull(jmsMessageType26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b29 == true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test192");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isAlwaysSyncSend();
        boolean b2 = activeMQConnection0.isConsumerExpiryCheckEnabled();
        javax.jms.ExceptionListener exceptionListener3 = activeMQConnection0.getExceptionListener();
        org.apache.activemq.thread.TaskRunnerFactory taskRunnerFactory4 = activeMQConnection0.getSessionTaskRunner();
        activeMQConnection0.changeUserInfo("topic:", "failover://tcp://localhost:61616");
        activeMQConnection0.transportResumed();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(exceptionListener3);
        org.junit.Assert.assertNotNull(taskRunnerFactory4);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test193");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isAlwaysSyncSend();
        boolean b2 = activeMQConnection0.isConsumerExpiryCheckEnabled();
        javax.jms.ExceptionListener exceptionListener3 = activeMQConnection0.getExceptionListener();
        activeMQConnection0.setOptimizeAcknowledge(true);
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(exceptionListener3);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test194");
        org.apache.activemq.broker.Broker broker0 = null;
        org.apache.activemq.camel.camelplugin.CamelRoutesBroker camelRoutesBroker1 = new org.apache.activemq.camel.camelplugin.CamelRoutesBroker(broker0);
        java.lang.String str2 = camelRoutesBroker1.getRoutesFile();
        int i3 = camelRoutesBroker1.getCheckPeriod();
        camelRoutesBroker1.setRoutesFile("ActiveMQConnection {id=ID:ubuntu-48220-1505887086933-163:1,clientId=null,started=false}");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 1000);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test195");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isAlwaysSyncSend();
        boolean b2 = activeMQConnection0.isConsumerExpiryCheckEnabled();
        javax.jms.ExceptionListener exceptionListener3 = activeMQConnection0.getExceptionListener();
        org.apache.activemq.command.ActiveMQDestination activeMQDestination5 = org.apache.activemq.camel.converter.ActiveMQConverter.toDestination("failover://tcp://localhost:61616");
        boolean b6 = activeMQConnection0.isDeleted(activeMQDestination5);
        org.apache.activemq.transport.Transport transport7 = activeMQConnection0.getTransportChannel();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(exceptionListener3);
        org.junit.Assert.assertNotNull(activeMQDestination5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(transport7);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test196");
        org.apache.activemq.camel.component.broker.BrokerComponent brokerComponent1 = new org.apache.activemq.camel.component.broker.BrokerComponent();
        org.apache.camel.CamelContext camelContext2 = brokerComponent1.getCamelContext();
        boolean b3 = brokerComponent1.useRawUri();
        org.apache.activemq.command.ActiveMQDestination activeMQDestination6 = org.apache.activemq.camel.converter.ActiveMQConverter.toDestination("2.16.1");
        org.apache.activemq.camel.component.broker.BrokerConfiguration brokerConfiguration7 = null;
        org.apache.activemq.camel.component.broker.BrokerEndpoint brokerEndpoint8 = new org.apache.activemq.camel.component.broker.BrokerEndpoint("tcp://localhost:61616", brokerComponent1, "tcp://localhost:61616", activeMQDestination6, brokerConfiguration7);
        boolean b9 = brokerEndpoint8.isMultipleConsumersSupported();
        java.lang.String str10 = brokerEndpoint8.getDestinationName();
        org.apache.activemq.camel.CamelQueue camelQueue12 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding13 = camelQueue12.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint14 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue12);
        boolean b15 = jmsEndpoint14.isPubSubNoLocal();
        jmsEndpoint14.setTimeToLive((long) (byte) 1);
        boolean b18 = jmsEndpoint14.isLenientProperties();
        int i19 = jmsEndpoint14.getIdleTaskExecutionLimit();
        org.apache.activemq.camel.CamelQueue camelQueue21 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding22 = camelQueue21.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint23 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue21);
        boolean b24 = jmsEndpoint23.isPubSubNoLocal();
        org.apache.camel.component.jms.JmsKeyFormatStrategy jmsKeyFormatStrategy25 = null;
        jmsEndpoint23.setJmsKeyFormatStrategy(jmsKeyFormatStrategy25);
        org.apache.activemq.camel.CamelQueue camelQueue28 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding29 = camelQueue28.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint30 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue28);
        jmsEndpoint30.setReplyToDestinationSelectorName("2.16.1");
        org.apache.camel.EndpointConfiguration endpointConfiguration33 = null;
        jmsEndpoint30.setEndpointConfiguration(endpointConfiguration33);
        org.apache.camel.ExchangePattern exchangePattern35 = jmsEndpoint30.getExchangePattern();
        org.apache.camel.Exchange exchange36 = jmsEndpoint23.createExchange(exchangePattern35);
        org.apache.camel.Exchange exchange37 = jmsEndpoint14.createExchange(exchangePattern35);
        org.apache.camel.Exchange exchange38 = brokerEndpoint8.createExchange(exchangePattern35);
        org.junit.Assert.assertNull(camelContext2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(activeMQDestination6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tcp://localhost:61616" + "'", str10.equals("tcp://localhost:61616"));
        org.junit.Assert.assertNotNull(jmsBinding13);
        org.junit.Assert.assertNotNull(jmsEndpoint14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertNotNull(jmsBinding22);
        org.junit.Assert.assertNotNull(jmsEndpoint23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(jmsBinding29);
        org.junit.Assert.assertNotNull(jmsEndpoint30);
        org.junit.Assert.assertTrue("'" + exchangePattern35 + "' != '" + org.apache.camel.ExchangePattern.InOnly + "'", exchangePattern35.equals(org.apache.camel.ExchangePattern.InOnly));
        org.junit.Assert.assertNotNull(exchange36);
        org.junit.Assert.assertNotNull(exchange37);
        org.junit.Assert.assertNotNull(exchange38);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test197");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isAlwaysSyncSend();
        boolean b2 = activeMQConnection0.isConsumerExpiryCheckEnabled();
        javax.jms.ExceptionListener exceptionListener3 = activeMQConnection0.getExceptionListener();
        boolean b4 = activeMQConnection0.isUseDedicatedTaskRunner();
        activeMQConnection0.setMessagePrioritySupported(true);
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(exceptionListener3);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test198");
        org.apache.camel.CamelContext camelContext0 = null;
        org.apache.activemq.advisory.DestinationSource destinationSource1 = null;
        org.apache.activemq.camel.component.CamelEndpointLoader camelEndpointLoader2 = new org.apache.activemq.camel.component.CamelEndpointLoader(camelContext0, destinationSource1);
        org.apache.camel.CamelContext camelContext3 = null;
        camelEndpointLoader2.setCamelContext(camelContext3);
        org.apache.camel.CamelContext camelContext5 = null;
        camelEndpointLoader2.setCamelContext(camelContext5);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test199");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        jmsComponent1.setAcknowledgementModeName("hi!");
        boolean b4 = jmsComponent1.isStarting();
        jmsComponent1.setReplyToConcurrentConsumers((int) (short) 10);
        jmsComponent1.setDeliveryMode((java.lang.Integer) 0);
        jmsComponent1.setAllowNullBody(false);
        org.junit.Assert.assertNotNull(jmsComponent1);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test200");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        boolean b2 = activeMQConfiguration0.isPubSubNoLocal();
        boolean b3 = activeMQConfiguration0.isErrorHandlerLogStackTrace();
        boolean b4 = activeMQConfiguration0.isPreserveMessageQos();
        boolean b5 = activeMQConfiguration0.isDisableReplyTo();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test201");
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
        boolean b28 = jmsEndpoint13.isDisableTimeToLive();
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
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test202");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isAlwaysSyncSend();
        boolean b2 = activeMQConnection0.isConsumerExpiryCheckEnabled();
        org.apache.activemq.blob.BlobTransferPolicy blobTransferPolicy3 = activeMQConnection0.getBlobTransferPolicy();
        activeMQConnection0.doCleanup(false);
        activeMQConnection0.setConsumerFailoverRedeliveryWaitPeriod(500L);
        int i8 = activeMQConnection0.getMaxThreadPoolSize();
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(blobTransferPolicy3);
        org.junit.Assert.assertTrue(i8 == 1);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test203");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        java.lang.String str4 = camelQueue1.getUri();
        org.apache.camel.Endpoint endpoint5 = camelQueue1.getEndpoint();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "queue:" + "'", str4.equals("queue:"));
        org.junit.Assert.assertNull(endpoint5);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test204");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isAlwaysSyncSend();
        boolean b2 = activeMQConnection0.isConsumerExpiryCheckEnabled();
        javax.jms.ExceptionListener exceptionListener3 = activeMQConnection0.getExceptionListener();
        org.apache.activemq.thread.TaskRunnerFactory taskRunnerFactory4 = activeMQConnection0.getSessionTaskRunner();
        boolean b5 = activeMQConnection0.isUseAsyncSend();
        activeMQConnection0.setAlwaysSessionAsync(true);
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(exceptionListener3);
        org.junit.Assert.assertNotNull(taskRunnerFactory4);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test205");
        org.apache.activemq.camel.component.broker.BrokerComponent brokerComponent1 = new org.apache.activemq.camel.component.broker.BrokerComponent();
        org.apache.camel.CamelContext camelContext2 = brokerComponent1.getCamelContext();
        boolean b3 = brokerComponent1.useRawUri();
        org.apache.activemq.command.ActiveMQDestination activeMQDestination6 = org.apache.activemq.camel.converter.ActiveMQConverter.toDestination("2.16.1");
        org.apache.activemq.camel.component.broker.BrokerConfiguration brokerConfiguration7 = null;
        org.apache.activemq.camel.component.broker.BrokerEndpoint brokerEndpoint8 = new org.apache.activemq.camel.component.broker.BrokerEndpoint("tcp://localhost:61616", brokerComponent1, "tcp://localhost:61616", activeMQDestination6, brokerConfiguration7);
        boolean b9 = brokerEndpoint8.isMultipleConsumersSupported();
        java.lang.String str10 = brokerEndpoint8.getDestinationName();
        org.apache.activemq.command.ActiveMQDestination activeMQDestination11 = brokerEndpoint8.getDestination();
        boolean b12 = brokerEndpoint8.isSingleton();
        org.junit.Assert.assertNull(camelContext2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(activeMQDestination6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "tcp://localhost:61616" + "'", str10.equals("tcp://localhost:61616"));
        org.junit.Assert.assertNotNull(activeMQDestination11);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test206");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentClientAcknowledge(connectionFactory0);
        jmsComponent1.setAcceptMessagesWhileStopping(false);
        jmsComponent1.setPreserveMessageQos(true);
        jmsComponent1.setMapJmsMessage(false);
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration8 = jmsComponent1.getConfiguration();
        boolean b9 = jmsConfiguration8.isReplyToDeliveryPersistent();
        boolean b10 = jmsConfiguration8.isReplyToSameDestinationAllowed();
        int i11 = jmsConfiguration8.getReplyToConcurrentConsumers();
        org.junit.Assert.assertNotNull(jmsComponent1);
        org.junit.Assert.assertNotNull(jmsConfiguration8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 1);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test207");
        org.apache.activemq.camel.component.ActiveMQConfiguration activeMQConfiguration0 = new org.apache.activemq.camel.component.ActiveMQConfiguration();
        java.lang.String str1 = activeMQConfiguration0.getReplyTo();
        activeMQConfiguration0.setPriority((int) (short) 100);
        activeMQConfiguration0.setTransferException(false);
        boolean b6 = activeMQConfiguration0.isReplyToSameDestinationAllowed();
        activeMQConfiguration0.setAcknowledgementModeName("temp:topic:");
        activeMQConfiguration0.setPubSubNoLocal(false);
        org.springframework.transaction.PlatformTransactionManager platformTransactionManager11 = activeMQConfiguration0.getTransactionManager();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(platformTransactionManager11);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test208");
        javax.jms.ConnectionFactory connectionFactory0 = null;
        org.apache.camel.component.jms.JmsComponent jmsComponent1 = org.apache.camel.component.jms.JmsComponent.jmsComponentTransacted(connectionFactory0);
        jmsComponent1.setTransactionTimeout((int) (short) -1);
        jmsComponent1.setAsyncConsumer(true);
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration6 = jmsComponent1.getConfiguration();
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory7 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory7.setDisableTimeStampsByDefault(true);
        camelConnectionFactory7.setBeanName("");
        int i12 = camelConnectionFactory7.getProducerWindowSize();
        jmsConfiguration6.setTemplateConnectionFactory((javax.jms.ConnectionFactory) camelConnectionFactory7);
        int i14 = jmsConfiguration6.getAcknowledgementMode();
        org.junit.Assert.assertNotNull(jmsComponent1);
        org.junit.Assert.assertNotNull(jmsConfiguration6);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i14 == (-1));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test209");
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
        org.springframework.jms.support.destination.DestinationResolver destinationResolver18 = jmsEndpoint3.getDestinationResolver();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(long10 == (-1L));
        org.junit.Assert.assertNull(destinationResolver18);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test210");
        org.apache.activemq.ActiveMQConnection activeMQConnection0 = org.apache.activemq.ActiveMQConnection.makeConnection();
        boolean b1 = activeMQConnection0.isAlwaysSyncSend();
        boolean b2 = activeMQConnection0.isConsumerExpiryCheckEnabled();
        javax.jms.ExceptionListener exceptionListener3 = activeMQConnection0.getExceptionListener();
        org.apache.activemq.thread.TaskRunnerFactory taskRunnerFactory4 = activeMQConnection0.getSessionTaskRunner();
        activeMQConnection0.setRmIdFromConnectionId(false);
        org.junit.Assert.assertNotNull(activeMQConnection0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(exceptionListener3);
        org.junit.Assert.assertNotNull(taskRunnerFactory4);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test211");
        org.apache.activemq.camel.CamelQueue camelQueue1 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding2 = camelQueue1.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint3 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue1);
        boolean b4 = jmsEndpoint3.isPubSubNoLocal();
        jmsEndpoint3.setTimeToLive((long) (byte) 1);
        boolean b7 = jmsEndpoint3.isDeliveryPersistent();
        jmsEndpoint3.setExplicitQosEnabled(true);
        jmsEndpoint3.setMaxConcurrentConsumers(0);
        org.apache.camel.component.jms.JmsConfiguration jmsConfiguration12 = jmsEndpoint3.getConfiguration();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(jmsConfiguration12);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test212");
        org.apache.activemq.camel.CamelConnectionFactory camelConnectionFactory0 = new org.apache.activemq.camel.CamelConnectionFactory();
        camelConnectionFactory0.setObjectMessageSerializationDefered(true);
        boolean b3 = camelConnectionFactory0.isNestedMapAndListEnabled();
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test213");
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
        org.apache.activemq.camel.CamelQueue camelQueue18 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding19 = camelQueue18.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint20 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue18);
        org.apache.activemq.camel.CamelQueue camelQueue22 = new org.apache.activemq.camel.CamelQueue("queue:");
        org.apache.camel.component.jms.JmsBinding jmsBinding23 = camelQueue22.getBinding();
        org.apache.camel.component.jms.JmsEndpoint jmsEndpoint24 = org.apache.camel.component.jms.JmsEndpoint.newInstance((javax.jms.Destination) camelQueue22);
        jmsEndpoint20.setDestination((javax.jms.Destination) camelQueue22);
        boolean b26 = jmsEndpoint20.isIncludeAllJMSXProperties();
        long long27 = jmsEndpoint20.getTimeToLive();
        jmsEndpoint20.setReplyToMaxConcurrentConsumers(100);
        jmsEndpoint20.setTransactedInOut(false);
        org.springframework.transaction.PlatformTransactionManager platformTransactionManager32 = jmsEndpoint20.getTransactionManager();
        org.apache.camel.component.jms.JmsBinding jmsBinding33 = jmsEndpoint20.getBinding();
        jmsEndpoint3.setBinding(jmsBinding33);
        boolean b35 = jmsEndpoint3.isPollingConsumerBlockWhenFull();
        org.springframework.util.ErrorHandler errorHandler36 = jmsEndpoint3.getErrorHandler();
        org.junit.Assert.assertNotNull(jmsBinding2);
        org.junit.Assert.assertNotNull(jmsEndpoint3);
        org.junit.Assert.assertNotNull(jmsBinding6);
        org.junit.Assert.assertNotNull(jmsEndpoint7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(long10 == (-1L));
        org.junit.Assert.assertNotNull(jmsBinding19);
        org.junit.Assert.assertNotNull(jmsEndpoint20);
        org.junit.Assert.assertNotNull(jmsBinding23);
        org.junit.Assert.assertNotNull(jmsEndpoint24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(long27 == (-1L));
        org.junit.Assert.assertNull(platformTransactionManager32);
        org.junit.Assert.assertNotNull(jmsBinding33);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNull(errorHandler36);
    }
}

