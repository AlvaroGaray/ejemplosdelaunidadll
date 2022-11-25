package Arreglos;

public class ArreglosMultidimensionales {

	public static void main(String[] args) {
	
		int[][] notas = new int [3][3];
		notas[0][0] = 68;
		notas[0][1] = 86;
		notas[0][2] = 75;
		notas[1][0] = 59;
		notas[1][1] = 87;
		notas[1][2] = 72;
		notas[2][0] = 67;
		notas[2][1] = 91;
		notas[2][2] = 85;
		
		for(int i = 0; i< notas.length; i++) {
			for(int j = 0; j<notas.length;j++) {
				if(i > j) {
					System.out.println(notas[i][j] + "\t");
				}
				
			}
			
			System.out.println("\n");
			
		}

	}

}
