package aulasjava02;

import java.util.Scanner;

public class Exercise_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		float num1, num2, num3;
		
		System.out.println("Digite o primeiro número: ");
		num1 = leia.nextFloat();
		
		System.out.println("Digite o segundo número: ");
		num2 = leia.nextFloat();
		
		System.out.println("Digite o terceiro número: ");
		num3 = leia.nextFloat();
		
		//Estrutura Condicional
		if (num1 < num2 && num1 < num3 && num2 < num3) {
			System.out.println(num1 + " | " + num2 + " | "  + num3);
		} 
		else if (num2 < num1 && num2 < num3 && num1 < num3) {
				System.out.println(num2 + " | " + num1 + " | " + num3);
			}
			else if ( num3 < num2 && num3 < num1 && num1 < num2){
				System.out.println(num3 + " | " + num1 + " | "  + num2);
			}
			else {
				System.out.println(num3 + " | " + num2 + " | "  + num1);
			}


	}

}
