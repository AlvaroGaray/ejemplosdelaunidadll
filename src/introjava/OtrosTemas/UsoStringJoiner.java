package OtrosTemas;
import java.util.StringJoiner;


public class UsoStringJoiner {

	public static void main(String[] args) {

		String[] nombres = {"Ironman ","Thor ","Hulk ","Vision ","Capitan America"};
		
		StringJoiner UnionDeCadenas = new StringJoiner(",","{","}");
		
		UnionDeCadenas.setEmptyValue("No hay elemento ");
		
		for (String nombre: nombres) {
			
			UnionDeCadenas.add(nombre);
			
		}
		
		System.out.println(UnionDeCadenas);
	}

}
