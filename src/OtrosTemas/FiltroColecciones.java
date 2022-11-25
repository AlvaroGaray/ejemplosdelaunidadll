package OtrosTemas;
import java.util.ArrayList;
import java.util.function.Predicate;


public class FiltroColecciones {

	public static void main(String[] args) {
ArrayList<InicioDeSesion> UsuarioSesion = new ArrayList<InicioDeSesion>();


UsuarioSesion.add(new InicioDeSesion("Danilo ","12345"));
UsuarioSesion.add(new InicioDeSesion("Luis ","123456"));
UsuarioSesion.add(new InicioDeSesion("Joshua ","1234567"));
UsuarioSesion.add(new InicioDeSesion("Neffer ","12345678"));

Predicate<InicioDeSesion> reglasDePredicate = (Clave)->Clave.EsDebil()==true;





System.out.println("Usuarios con clave debil(menos de 8 caracteres\n----------------------)");
UsuarioSesion.forEach((sesionInfo) -> {
	if(reglasDePredicate.test(sesionInfo)) {
	System.out.println("Nombre del usuario: "+ sesionInfo.UserName);
	System.out.println("\t Contrasena de usuario: "+sesionInfo.Password);
	}
});
		
		
		
	}

}
