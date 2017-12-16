import behavioral.interpreter.Expression;
import behavioral.interpreter.InterpreterFacts;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by Dennis on 16-Dec-17.
 **/
public class InterpreterTest {

    @Test
    public void test() {

        Expression isSmart = InterpreterFacts.getSmartPeople();

        assertTrue(isSmart.interpret("Mike"));
        assertFalse(isSmart.interpret("Logan"));

        Expression areMarried = InterpreterFacts.getMarriedCouple();

        assertTrue(areMarried.interpret("Leo and Emily married this summer."));
        assertFalse(areMarried.interpret("Leo and Lena married this summer."));
    }
}
