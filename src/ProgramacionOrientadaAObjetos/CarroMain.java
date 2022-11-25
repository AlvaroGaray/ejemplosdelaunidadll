package ProgramacionOrientadaAObjetos;

public class CarroMain {

	public static void main(String[] args) {
	carro.propietario = "Danilo";
		carro automovil = new carro("BMW",2018,200000,500,"Danilo");
        //automovil.Tipo = "BMW";
        //automovil.Modelo = 2018;
        //automovil.Precio = 200000;
        //automovil.KmsConducidos = 500;
		System.out.println("El propietario del vehiculo 1 es: "+automovil.propietario);
	    System.out.println("El precio del vehiculo  es: "+automovil.CalcularPrecio());

       
        carro OtroAutomovil = new carro();
        OtroAutomovil.Tipo = "Toyota";
        OtroAutomovil.Modelo = 2015;
        OtroAutomovil.Precio = 150000;
        OtroAutomovil.KmsConducidos = 350;
        OtroAutomovil.propietario= "Danilo";
        
        
       
		System.out.println("El propietario del vehiculo 2 es: "+automovil.propietario);

       
       System.out.println("El precio del vehiculo 2  es: "+OtroAutomovil.CalcularPrecio());
        		
	}

}
