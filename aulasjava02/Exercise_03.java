package aulasjava02;

import java.util.Scanner;

public class Exercise_03 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int num1;
		
		System.out.println("Digite a idade: ");
		num1 = leia.nextInt();
		
		if(num1 >= 10 && num1 <= 14 ) {
			System.out.println("Infantil");
		} 
			else if (num1 >= 15 && num1 <= 17) {
				System.out.println("Juvenil");
			}
				else if (num1 >= 18 && num1 <= 25) {
					System.out.println("Adulto");
				}
		else {
			System.out.println("Idade não classificada");
		}
		
	}
}
