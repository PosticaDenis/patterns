package behavioral.null_object;

/**
 * Created by Dennis on 16-Dec-17.
 **/
public class NonExistingCustomer extends AbstractCustomer{

    @Override
    public String getName() {
        return "Not Available in Customer Database.";
    }

    @Override
    public boolean isNull() {
        return true;
    }
}
