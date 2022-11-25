package OtrosTemas;

import java.util.ArrayList;
import java.util.Iterator;

public class InicioDeSesionMain {

	public static void main(String[] args) {
	
		ArrayList<InicioDeSesion> UsuarioSesion = new ArrayList<InicioDeSesion>();
		
		UsuarioSesion.add(new InicioDeSesion("Danilo","12345"));
		UsuarioSesion.add(new InicioDeSesion("Luis","123456"));
		UsuarioSesion.add(new InicioDeSesion("Joshua","1234567"));
		UsuarioSesion.add(new InicioDeSesion("Neffer","12345678"));

for(InicioDeSesion sesion:UsuarioSesion) {
	
	
	System.out.println("Nombre de usuario: "+sesion.UserName + " Contrasena de usuario: "+sesion.Password);
}

Iterator<InicioDeSesion> itr = UsuarioSesion.iterator();
while (itr.hasNext()) {
	InicioDeSesion iniciodesesion = itr.next();
System.out.println("Nombre del usuario: "+iniciodesesion.UserName);
System.out.println("\tContrasena de usuario: "+iniciodesesion.Password);
}

System.out.println("Con expresiones LambDa-ForEach");
UsuarioSesion.forEach((sesionInfo) -> {
	
	System.out.println("Nombre del usuario: "+ sesionInfo.UserName);
	System.out.println("\t Contrasena de usuario: "+sesionInfo.Password);
});
	}

}
