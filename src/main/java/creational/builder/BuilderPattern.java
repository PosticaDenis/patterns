package creational.builder;

/**
 * Created by Dennis on 16-Dec-17.
 **/
public class BuilderPattern {
    public static void main(String[] args) {

        LookBuilder lookBuilder = new LookBuilder();

        Look classicalLook = lookBuilder.wearClassical();
        System.out.println("Classical look:");
        classicalLook.showItems();
        System.out.println("Total Cost: " + classicalLook.getCost());

        Look casualLook = lookBuilder.wearCasual();
        System.out.println("\n\nCasual look:");
        casualLook.showItems();
        System.out.println("Total Cost: " + casualLook.getCost());
    }

}
