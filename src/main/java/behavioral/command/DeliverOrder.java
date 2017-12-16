package behavioral.command;

/**
 * Created by Dennis on 16-Dec-17.
 **/
public class DeliverOrder implements Order {

    private Meal meal;

    public DeliverOrder(Meal meal){
        this.meal = meal;
    }

    public String execute() {
        return meal.deliver();
    }
}
