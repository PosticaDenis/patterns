package behavioral.memento;

import java.util.ArrayList;

/**
 * Created by Dennis on 16-Dec-17.
 **/
public class CareTaker {
    private ArrayList<Memento> mementos = new ArrayList<Memento>();

    public void addMemento(Memento m) {
        mementos.add(m);
    }

    public Memento getMemento(int index) {
        return mementos.get(index);
    }
}

