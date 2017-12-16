package behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dennis on 16-Dec-17.
 **/
public class Waiter {

    private List<Order> orderList = new ArrayList<Order>();

    public void takeCommand(Order order){
        orderList.add(order);
    }

    public List<String> executeCommands(){

        List<String> result = new ArrayList<String>();
        for (Order order : orderList) {
            result.add(order.execute());
        }
        orderList.clear();

        return result;
    }
}
