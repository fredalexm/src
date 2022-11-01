package vetoresMatrizes;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Exercise_02 {
	
	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int soma = 0;
		float media;
		String ipar = " ", iimpar = "";

		Integer [] vetor = new Integer[10];
		
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("\nDigite um numero: ");
			vetor[i] = leia.nextInt();
		}
		

		for(int i = 1; i < vetor.length; i+=2) 
			
			iimpar += vetor[i] + " ";
		
			
		for(int i = 0; i < vetor.length; i++)  {
			soma += vetor[i];
			
			if(vetor[i] % 2 == 0)
				ipar += vetor[i] + " ";
			
		}
		
		
		System.out.println("\nElementos nos índices ímpares: " + iimpar);
		System.out.println("\nElementos pares: " + ipar );
		
		media = soma / vetor.length;
		System.out.println("\nSoma: " + soma);
		System.out.println("\nMédia: " + media);
	}

}
