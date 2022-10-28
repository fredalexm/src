package aulasjava02;


import java.util.Scanner;

public class Exercise_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner leia = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("Digite o primeiro número: ");
		num1 = leia.nextInt();
		
		System.out.println("Digite o segundo número: ");
		num2 = leia.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		num3 = leia.nextInt();
		
		//Estrutura Condicional
		if (num1 > num2 && num1 > num3) {
			System.out.println("O Primeiro número é o maior " + num1);
		} 
		else if (num2 > num1 && num2 > num3) {
				System.out.println("O segundo número é o maior " + num2);
			}
			else {
				System.out.println("O terceiro número é o maior " + num3);
			}

			

	}

}
