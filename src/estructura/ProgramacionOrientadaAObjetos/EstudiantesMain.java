package ProgramacionOrientadaAObjetos;

public class EstudiantesMain {

	public static void main(String[] args) {
	
		Estudiantes estudiante = new Estudiantes ("Danilo","Noguera",Genero.Masculino);
		
		System.out.println("Datos del estudiante: ");
        System.out.println("-------------------------------");
        System.out.println(estudiante.Nombre);
        System.out.println(estudiante.Apellido);
        System.out.println(estudiante.genero);
	}

}
