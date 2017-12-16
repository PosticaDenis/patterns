package behavioral.command;

/**
 * Created by Dennis on 16-Dec-17.
 **/
public class Meal {

    private String salad = "";
    private String desert = "";
    private String main = "";

    public Meal(String salad, String main, String desert) {
        this.salad = salad;
        this.main = main;
        this.desert = desert;
    }

    public String take() {
        return "The order containing: " + salad + ", " + main + ", " + desert + " was taken by the waiter.";
    }

    public String deliver() {
        return "The order containing: " + salad + ", " + main + ", " + desert + " was delivered by the waiter.";
    }
}
