package aulasjava;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exercise_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		Scanner leia = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("###.##");
		double num1, num2, num3, num4;
		
		System.out.println("Digite o primeiro valor: ");
		num1 = leia.nextDouble();
		
		System.out.println("Digite o segundo valor: ");
		num2 = leia.nextDouble();
		
		System.out.println("Digite o terceiro valor: ");
		num3 = leia.nextDouble();
		
		System.out.println("Digite o quarto valor: ");
		num4 = leia.nextDouble();
		
		
		System.out.println("\nA diferença do produto entre o primeiro e segundo numeros digitados pelo produto entre o terceiro e quarto valor é: " + df.format(((num1 * num2) - (num3 * num4))));


	}

}
