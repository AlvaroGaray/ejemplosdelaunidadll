package ProgramacionOrientadaAObjetos;

public class Casting {

	public static void main(String[] args) {
	
		
		Camioneta PickUp = new Camioneta();
		PickUp.Tipo = "HILUX";
		PickUp.Modelo=207;
		PickUp.EstablecerTieneTina(true);;
		PickUp.KmsConducidos=100;
		PickUp.Precio=22900;
		PickUp.propietario="Humberto";
		
		carro miCarro = (carro)PickUp;
		System.out.println(miCarro.KmsConducidos);
		System.out.println(miCarro.CalcularPrecio());
	}

}
