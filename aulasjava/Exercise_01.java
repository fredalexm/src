package aulasjava;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exercise_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		Scanner leia = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("###.00");
		

		double num1, num2;
		
		System.out.println("Digite o Salário: ");
		num1 = leia.nextDouble();
		
		System.out.println("Digite o Abono: ");
		num2 = leia.nextDouble();
		
		System.out.println(" O novo salário é de : "  + df.format((num1 + num2)));
	
		

	}

}
