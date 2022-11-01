package lacoRepeticao;

import java.util.Scanner;

public class Exercise_03 {

	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, menor = 0, maior = 0;
		
		
		
		do {
		
			System.out.println("Digite uma idade: ");
			num1 = leia.nextInt();
			
			if (num1 >= 1 && num1 < 21)
				menor++;
			if (num1 > 50)
				maior++;

				
		
		} while(num1 > 0);
		
		
		System.out.println("\nTotal de pessoas menores de 21 anos " + menor);
		System.out.println("\nTotal de pessoas maiores de 50 anos " + maior);


	}

}