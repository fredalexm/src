package metodos_02;

import metodos_01.Cliente;

public class TestaFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionario f1 = new Funcionario(1234, "Jhon Snow", "TI", "Desenvolvedor",20000.0f);
		
		Funcionario f2 = new Funcionario(4321, "Sansa Stark", "RH", "Gerente", 50000.0f);
		
		f1.visualizar();
		f2.visualizar();

	}

}
