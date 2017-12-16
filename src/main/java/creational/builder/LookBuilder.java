package creational.builder;

/**
 * Created by Dennis on 16-Dec-17.
 **/
public class LookBuilder {

    public Look wearClassical (){
        Look look = new Look();
        look.addClothing(new ClassicalPants());
        look.addClothing(new ClassicalShirt());
        return look;
    }

    public Look wearCasual (){
        Look look = new Look();
        look.addClothing(new CasualPants());
        look.addClothing(new CasualShirt());
        return look;
    }
}
