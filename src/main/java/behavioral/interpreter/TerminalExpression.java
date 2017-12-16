package behavioral.interpreter;

/**
 * Created by Dennis on 16-Dec-17.
 **/
public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    public boolean interpret(String context) {

        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
