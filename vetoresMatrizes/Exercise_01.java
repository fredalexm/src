package vetoresMatrizes;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Exercise_01 {
	
	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		boolean valid = false;
		
		System.out.println("\nDigite um numero: ");
		num = leia.nextInt();
		
		int [] vetor = {2,5,1,3,4,9,7,8,10,6};
		
		for(int i = 0; i < vetor.length; i++) {
			if(num == vetor[i]) {
			System.out.println("\nO número " + num + " está localizado na posição: " + i);
			valid = true;
			}
		}
		
		if (valid == false)
			System.out.println("\nO número " + num + " não foi encontrado!");

	}

}
