package lacoRepeticao;

import java.util.Scanner;

public class Exercise_02 {

	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, impar = 0, par = 0, cont = 1;
		
		
		
		do {
		
			System.out.println("Digite o " + cont + "º número: ");
			num1 = leia.nextInt();
			
			if (num1 % 2 == 0)
				par++;
			else
				impar++;
			
			cont++;
				
		
		} while(cont <= 10);
		
		
		System.out.println("Total de números pares: " + par);
		System.out.println("Total de números impares: " + impar);


	}

}