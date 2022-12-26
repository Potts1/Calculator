import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;


public class Function {
    private ScriptEngineManager mgr = new ScriptEngineManager();
    private ScriptEngine engine = mgr.getEngineByName("JavaScript");

    private int variable;
    private String equation;

    public Function(int variable, String equation)
    {
        this.variable = variable;
        this.equation = equation;
    }

    public double getY()
    {
        equation = String.format(equation, );

        return 0;
    }
    
}

