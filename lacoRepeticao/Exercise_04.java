package lacoRepeticao;

import java.util.Scanner;

public class Exercise_04 {

	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade, sexo, stack, backend = 0, frontend = 0, mobile = 0, fullstack = 0;
		String continua = "S";

		while (continua.equals("S")) {

			System.out.println("Digite a sua idade: ");
			idade = leia.nextInt();

			do {
				System.out.println("Digite o sexo (1-M/2-F/3-Outros): ");
				sexo = leia.nextInt();
				
				if(sexo < 1 || sexo > 3)
					System.out.println("Digite um número entre 1 e 3");
				
			}while(sexo < 1 || sexo > 3);
			
			do {
				System.out.println("Digite a sua área Dev (1-Back/2-Front/3-Mobile/4-Fullstack): ");
				stack = leia.nextInt();
				
				if(stack < 1 || stack > 4)
					System.out.println("Digite um número entre 1 e 4");
				
			}while(stack < 1 || stack > 4);
			
			if (stack == 1)
				backend++;

			if (stack == 2 && sexo == 2)
				frontend++;

			if (stack == 3 && sexo == 1 && idade > 40)
				mobile++;

			if ((stack == 1 || stack == 2) && idade > 30)
				fullstack++;

			System.out.println("Deseja continuar(S/N)? ");
			leia.skip("\\R?");
			continua = leia.nextLine().toUpperCase();
			
		}

		System.out.println("\nO número de pessoas desenvolvedoras Backend: " + backend);
		System.out.println("\nO número de mulheres desenvolvedoras Frontend: " + frontend);
		System.out.println("\nO número de homens desenvolvedores Mobile maiores de 40 anos: " + mobile);
		System.out.println("\nO número de mulheres desenvolvedoras FullStack menores de 30 anos: " + fullstack);
	
	}

}