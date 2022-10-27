package aulasjava;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exercise_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		Scanner leia = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("###.00");
		double salario, adcNoturno, horaExtra, descontos;
		
		System.out.println("Digite o Sálario Bruto: ");
		salario = leia.nextDouble();
		
		System.out.println("Digite o Adicional Noturno: ");
		adcNoturno = leia.nextDouble();
		
		System.out.println("Digite as Horas Extras: ");
		horaExtra = leia.nextDouble();
		
		System.out.println("Digite os Descontos: ");
		descontos = leia.nextDouble();
		
		
		System.out.println("\nSeu sálario Líquido será de: " + df.format((salario + adcNoturno + (horaExtra * 5) - descontos)));

	}

}
