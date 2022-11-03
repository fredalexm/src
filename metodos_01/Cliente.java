package metodos_01;

public class Cliente {
	
	private String cpf;
	private int idade;
	private String nome;
	private String sexo;
	private float saldo;
	
	
	public Cliente(String cpf, int idade, String nome, String sexo, float saldo) {
		this.cpf = cpf;
		this.idade = idade;
		this.nome = nome;
		this.sexo = sexo;
		this.saldo = saldo;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public float getSaldo() {
		return saldo;
	}


	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public void visualizar() {
		System.out.println("\n****************************************");
		System.out.println("Dados do Cliente");
		System.out.println("\n****************************************");
		System.out.println("\nNome do cliente: " + this.nome);
		System.out.println("\nCPF do cliente: " + getCpf());
		System.out.println("\nIdade do cliente: " + this.idade);
		System.out.println("\nQual sexo o cliente se identifica: " + this.sexo);
		System.out.println("\nSaldo da conta: " + this.saldo);
	}
	
	
	

}
