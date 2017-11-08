import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        org.apache.activemq.camel.component.ActiveMQEndpoint activeMQEndpoint0 = new org.apache.activemq.camel.component.ActiveMQEndpoint();
        org.junit.Assert.assertTrue("Contract failed: activeMQEndpoint0.equals(activeMQEndpoint0)", activeMQEndpoint0.equals(activeMQEndpoint0));
    }
}

