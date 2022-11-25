package OtrosTemas;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class EjecutarJavaScript {

	public static void main(String[] args) {
	
ScriptEngineManager gestor = new ScriptEngineManager();
ScriptEngine motor =gestor.getEngineByName("nashorn");

String Script = "Var name = 'Danilo Noguera';name;";

try {
	Object codigo = motor.eval(script);
	System.out.println(codigo);
} catch (ScriptException e) {
	e.printStackTrace();
}
		
		
		
		
	}

}
