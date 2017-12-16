package behavioral.command;

/**
 * Created by Dennis on 16-Dec-17.
 **/
public class TakeOrder implements Order {

    private Meal meal;

    public TakeOrder(Meal meal){
        this.meal = meal;
    }

    public String execute() {
        return meal.take();
    }
}
