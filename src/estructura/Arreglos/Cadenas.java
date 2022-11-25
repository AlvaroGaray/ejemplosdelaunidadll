package Arreglos;

import java.util.Iterator;

public class Cadenas {

	public static void main(String[] args) {
	
		String nombre = "Danilo Noguera";
		//Cantidad de caracteres (tamano de la cadena) con la propiedad.length{}
		System.out.println("Cantidad de caracteres: "+nombre.length());
		//Caracter en una posicion especifica
		System.out.println("Primer caracter: "+nombre.charAt(0));
		//Para ultimo caracter = tamano de la cadena -1
		System.out.println("Ultimo caracter: "+ nombre.charAt(nombre.length()-1));
		//Imprimir toda la cadena de caracteres usando el ciclo for 
		System.out.println("toda la cadena , usando el ciclo for");
		
		for (int i = 0; i <nombre.length(); i++) {
			System.out.print(nombre.charAt(i));
		}
		System.out.println("Toda la cadena al reves, usando ciclo for");
		for (int i = nombre.length()-1; i >=0; i--) {
			System.out.print(nombre.charAt(i));
		}
		
		
		//Tomar una cadena de caracteres y poner cada palabra en lineas separadas 
		
		String texto = "Ya soy un crack en java ";
		String[] separador =texto.split(" ");
		System.out.println("\nImprimir palabras por separado: ");
		
		for (int i = 0; i < separador.length; i++) {
			System.out.println(separador[i]);
			
		}
	}

}
