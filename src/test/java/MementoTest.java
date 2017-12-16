import behavioral.memento.CareTaker;
import behavioral.memento.Originator;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Dennis on 16-Dec-17.
 **/
public class MementoTest {

    @Test
    public void test() {

        String stateOne = "State #1";
        String stateTwo = "State #2";
        String stateThree = "State #3";
        String stateFour = "State #4";


        CareTaker caretaker = new CareTaker();
        Originator originator = new Originator();

        originator.setState(stateOne);
        originator.setState(stateTwo);

        //check that the state of originator is #2.
        assertEquals(originator.getState(), stateTwo);

        caretaker.addMemento(originator.save());

        //check that careTaker saved state #2.
        assertEquals(caretaker.getMemento(0).getState(), stateTwo);


        originator.setState(stateThree);
        caretaker.addMemento(originator.save());
        originator.setState(stateFour);

        originator.restore(caretaker.getMemento(0));

        //check that state after restore is state #2.
        assertEquals(originator.getState(), stateTwo);

        originator.restore(caretaker.getMemento(1));

        //check that state after restore is state #3.
        assertEquals(originator.getState(), stateThree);


    }
}
