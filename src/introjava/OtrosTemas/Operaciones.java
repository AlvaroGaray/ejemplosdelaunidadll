package OtrosTemas;

public interface Operaciones {

	
	int sumar(int x, int y);
	
	int ObtenerX();
	
	default void Mostrar() {
		
		System.out.println("X="+ObtenerX());
		
	}
	
	
	static void MostrarY() {
		
		
		System.out.println("Hola desde un metodo static ");
	}
}
