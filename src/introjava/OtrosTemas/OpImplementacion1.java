package OtrosTemas;

public class OpImplementacion1 implements Operaciones {
     int x=10,y=15;
	
	@Override
	public int sumar(int x, int y ) {
		
		return x+y;
	}
	
	public int ObtenerX() {
		
		return x;
	}
	
	public static void main(String[]args) {
		
		System.out.println(new OpImplementacion1().ObtenerX());
		new OpImplementacion1().Mostrar();
		Operaciones.MostrarY();
	}
}
