package behavioral.null_object;

/**
 * Created by Dennis on 16-Dec-17.
 **/
public class CustomerFactory {

    public static final String[] names = {"Eeny", "Meeny", "Miny", "Moe"};

    public static AbstractCustomer getCustomer(String name){

        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)){
                return new ExistingCustomer(name);
            }
        }
        return new NonExistingCustomer();
    }
}
