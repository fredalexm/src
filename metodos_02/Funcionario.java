package metodos_02;

public class Funcionario {
	
	private int matricula;
	private String nome;
	private String departamento;
	private String funcao;
	private float salario;
	
	public Funcionario(int matricula, String nome, String departamento, String funcao, float salario) {
		this.matricula = matricula;
		this.nome = nome;
		this.departamento = departamento;
		this.funcao = funcao;
		this.salario = salario;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public void visualizar() {
		System.out.println("\n****************************************");
		System.out.println("Dados do Funcionario");
		System.out.println("\n****************************************");
		System.out.println("\nNome do funcionário: " + this.nome);
		System.out.println("\nMatrícula: " + getMatricula());
		System.out.println("\nDepartamento: " + this.departamento);
		System.out.println("\nFunção: " + this.funcao);
		System.out.println("\nSalário do funcionário: " + this.salario);
	}
	

}
