package aulasjava02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DecimalFormat df = new DecimalFormat("###.##");
		
		Scanner leia = new Scanner(System.in);
		
		float num1;
		
		System.out.println("Digite um número: ");
		num1 = leia.nextFloat();
		
		if(num1 % 2 == 0) {
			System.out.println("Número par! A raiz quadrada é : " + df.format(Math.sqrt(num1)));
		} 
		else {
			System.out.println("Número impar! O número elevado ao quadrado é: " + Math.pow(num1, 2));
		}
		
		
	}

}
