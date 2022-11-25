package ProgramacionOrientadaAObjetos;

abstract public class carro {

	 String Tipo;
	protected  int Modelo;
	 double Precio;
	double KmsConducidos;
	static String propietario;
	
	
	PropietariosCarros propietarios;
	
	public carro(String Tipo,int Modelo,double Precio,double KmsConducidos,String Propietario) {
		this.Tipo=Tipo;
		this.Modelo=Modelo;
		this.Precio=Precio;
		this.KmsConducidos=KmsConducidos;
		//this.propietario=Propietario;
		System.out.println("Clase creada!");
		
		propietarios=new PropietariosCarros();
		propietarios.Nombre = "Danilo";
		propietarios.Apellido="Noguera";
		
		
	}
	
	public carro() {
		
		System.out.println("Clase 2 creada !");
	}
	
	
	
	
	double CalcularPrecio() {
		
		double NuevoPrecio= Precio - (KmsConducidos*100);
		return NuevoPrecio;
		
	}
	
	
}
