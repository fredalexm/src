package metodos_03;

public class TestaGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Game g1 = new Game("Fifa 22", "Esporte", 10, "Multi", 200.0f );
		
		Game g2 = new Game("God of War", "Ação/Aventura", 18, "PS5/PS4", 300.0f );
		

		g1.visualizar();
		
		g2.visualizar();
	}

}
