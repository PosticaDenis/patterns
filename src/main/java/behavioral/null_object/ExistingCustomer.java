package behavioral.null_object;

/**
 * Created by Dennis on 16-Dec-17.
 **/
public class ExistingCustomer extends AbstractCustomer {

    public ExistingCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNull() {
        return false;
    }
}
