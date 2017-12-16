import behavioral.null_object.AbstractCustomer;
import behavioral.null_object.CustomerFactory;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Dennis on 16-Dec-17.
 **/
public class NullObjectTest {

    @Test
    public void test() {

        AbstractCustomer customer1 = CustomerFactory.getCustomer("Moe");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");

        assertEquals(customer1.getName(), "Moe");
        assertEquals(customer2.getName(), "Not Available in Customer Database.");
    }
}
