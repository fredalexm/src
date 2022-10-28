package aulaOperadores;

import java.util.Locale;
import java.util.Scanner;

public class Boletim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		
		Scanner leia = new Scanner(System.in);
		
		float nota1, nota2, media = 0;
		boolean resposta;
		
		System.out.println("Insira a primeira nota: ");
		nota1 = leia.nextFloat();
		
		System.out.println("Insira a segunda nota: ");
		nota2 = leia.nextFloat();
		
		if(nota1 != 0 || nota2 != 0) {
			media = (nota1 + nota2) / 2;
		
		
//		media = (nota1 + nota2) /2;
//		
//		resposta = media >= 7;
//		
		//Estrutura Condicional 
		
			if(media >= 7) {
				System.out.println("O valor da média é maior ou igual a 7!");
			} else {
				System.out.println("O valor da média é menor que 7 " );
			}
		} else {
			System.out.println("As notas devem ser maiores do que 0");
		}
		
		

	}

}
