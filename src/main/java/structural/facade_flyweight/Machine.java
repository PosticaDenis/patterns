package structural.facade_flyweight;

/**
 * Created by Dennis on 16-Dec-17.
 **/
public class Machine {

    private String mName;

    public Machine(String mName) {
        this.mName = mName;
    }

    public String installOS(String installation) {
        return mName + ": " + installation;
    }
}
