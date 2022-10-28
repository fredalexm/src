package aulaOperadores;

import java.util.Scanner;

public class Cadastro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		String sigla;
		
		System.out.println("Insira a sigla do seu Estado: ");
		sigla = leia.nextLine();
		
		switch(sigla) {
		case "SP":
			System.out.println("Você é de São Paulo");
			break;
		
		case "BA":
			System.out.println("Você é da Bahia");
			break;
			
		case "RS":
			System.out.println("Você é do Rio Grande do Sul");
			break;
			
		default:
			System.out.println("Sigla não reconhecida");
		}
		

	}

}
