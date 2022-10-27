package aulasjava;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exercise_02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner leia = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("###.##");
		double num1, num2, num3, num4;
		
		System.out.println("Digite a primeira nota: ");
		num1 = leia.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		num2 = leia.nextDouble();
		
		System.out.println("Digite a terceira nota: ");
		num3 = leia.nextDouble();
		
		System.out.println("Digite a quarta nota: ");
		num4 = leia.nextDouble();
		
		
		System.out.println("\nSua nota média foi de " + df.format(((num1 + num2 + num3 + num4)/4)));
	}

}
