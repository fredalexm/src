package metodos_01;

public class TestaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente c1 = new Cliente("12345678900", 20, "Jhon Snow", "Masc", 20000.0f);
		
		Cliente c2 = new Cliente("98765432100", 25, "Sansa Stark", "Femin", 50000.0f);
		
		c1.visualizar();
		c2.visualizar();

	}

}
