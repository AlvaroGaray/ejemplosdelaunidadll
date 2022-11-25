package ProgramacionOrientadaAObjetos;

public class CamionetaMain {

	public static void main(String[] args) {
	
		Camioneta PickUp= new Camioneta();
		
		PickUp.Tipo = "HILUX";
		PickUp.Modelo=207;
		PickUp.EstablecerTieneTina(true);;
		PickUp.KmsConducidos=100;
		PickUp.Precio=22900;
		PickUp.propietario="Humberto";
		
		
		System.out.println("El precio actual es de: "+PickUp.CalcularPrecio());
		
        PickUp.buscarPropietario();
	}

}
