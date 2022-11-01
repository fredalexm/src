package vetoresMatrizes;

import java.util.Scanner;

public class Exercise_03 {

	public static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {

		
		int somaPrinc = 0, somaSec = 0;
		String diagPrin = " ", diagSec = " ";
		
		//quadrada 3 x 3
		
				int [][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
				
				
				for(int i = 0; i < matriz.length; i++) {
					for(int j = 0; j < matriz.length; j++) {
						
						System.out.println("Digite o numero da posição (" + i + "," + j + "): ");
						matriz[i][j] = leia.nextInt();
						
						//Todos os elementos da Diagonal Principal
						if( i == j)
							diagPrin += matriz[i][j] + " ";
							somaPrinc += matriz[i][j];

						if ( i + j == 2)
							diagSec += matriz[i][j] + " ";
							somaSec += matriz[i][j];
						
					}
				}
				
				System.out.println("\nElementos da Diagonal Principal: " + diagPrin);
				System.out.println("\nElementos da Diagonal Secundária: " + diagSec );
				System.out.println("\nSoma dos Elementos da Diagonal Principal: " + somaPrinc);
				System.out.println("\nSoma dos Elementos da Diagonal Secundária: " + somaSec );
				
				
	}

}