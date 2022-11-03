package metodos_03;

public class Game {

	private String nome;
	private String tipo;
	private int classificacao;
	private String plataforma;
	private float valor;
	
	public Game(String nome, String tipo, int classificacao, String plataforma, float valor) {
		this.nome = nome;
		this.tipo = tipo;
		this.classificacao = classificacao;
		this.plataforma = plataforma;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public void visualizar() {
		System.out.println("\n****************************************");
		System.out.println("\n            ###  Game  ###");
		System.out.println("\n****************************************");
		System.out.println("\nNome do jogo: " + this.nome);
		System.out.println("\nTipo do jogo: " + getTipo());
		System.out.println("\nClassificação: " + this.classificacao);
		System.out.println("\nPlataforma/Console: " + this.plataforma);
		System.out.println("\nValor do jogo: " + this.valor);
	}
	
}
