package ProgramacionOrientadaAObjetos;

public class Camioneta extends carro {

	
	private boolean TieneTina;
	
	public void EstablecerTieneTina(boolean TieneTina) {
		
		this.TieneTina=TieneTina;
	}
	
	 void buscarPropietario() {
		
		System.out.println("El propietario es: "+propietario);
		System.out.println("Precio: "+super.CalcularPrecio());
	}
	
	
	
	public Camioneta() {
		
		System.out.println("Constructor de la clase camioneta ");
		
	}
	
	@Override
	double CalcularPrecio() {
		
		double NuevoPrecio = Precio- (KmsConducidos*50);
		return NuevoPrecio;
	}
	
}
