package lacoRepeticao;

import java.util.Scanner;

public class Exercise_01 {
	
	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, num2;
		boolean ok = false;
		
		
		do {
		
			System.out.println("Digite o primeiro número: ");
			num1 = leia.nextInt();
			
			System.out.println("Digite o segundo número: ");
			num2 = leia.nextInt();
			
			if(num1 > num2)
				System.out.println("Intervalo inválido!");
				
			else
				ok = true;
		
		} while(ok == false);
		
		
		for(int cont = num1 ; cont <= num2; cont++) {
			if(cont % 3 == 0 && cont % 5 == 0) {
				System.out.println("\n" + cont + " é múltiplo de 3 e 5 ");
			}
			
		}

	}

}
