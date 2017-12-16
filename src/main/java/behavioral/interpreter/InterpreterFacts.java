package behavioral.interpreter;

/**
 * Created by Dennis on 16-Dec-17.
 **/
public class InterpreterFacts {

    //Rule: Mike and Carol are smart.
    public static Expression getSmartPeople(){
        Expression smartPersonOne = new TerminalExpression("Mike");
        Expression smartPersonTwo = new TerminalExpression("Carol");
        return new OrExpression(smartPersonOne, smartPersonTwo);
    }

    //Rule: Emily and Leo are married.
    public static Expression getMarriedCouple(){
        Expression factOne = new TerminalExpression("Emily");
        Expression factTwo = new TerminalExpression("married");
        Expression factThree = new TerminalExpression("Leo");
        return new AndExpression(factOne, factTwo, factThree);
    }
}
