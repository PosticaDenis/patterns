import behavioral.command.DeliverOrder;
import behavioral.command.Meal;
import behavioral.command.TakeOrder;
import behavioral.command.Waiter;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dennis on 16-Dec-17.
 **/
public class CommandTest {

    @Test
    public void test() {

        String salad = "Caesar salad";
        String main = "Spaghetti";
        String dessert = "Cheese cake";
        Meal m = new Meal(salad, main, dessert);

        TakeOrder takeOrder = new TakeOrder(m);
        DeliverOrder deliverOrder = new DeliverOrder(m);

        Waiter waiter = new Waiter();

        waiter.takeCommand(takeOrder);
        waiter.takeCommand(deliverOrder);

        List<String> expectedResults = new ArrayList<String>();
        expectedResults.add("The order containing: " + salad + ", " + main + ", " + dessert + " was taken by the waiter.");
        expectedResults.add("The order containing: " + salad + ", " + main + ", " + dessert + " was delivered by the waiter.");

        assertEquals(waiter.executeCommands(), expectedResults);
    }
}
