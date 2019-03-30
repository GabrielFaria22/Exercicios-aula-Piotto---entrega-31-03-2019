package Exec04;

public class Casa {

	public String cor;
	public Porta[] portas = new Porta[90];
	
	public void Pinta(String s) {
		cor = s;
	}
	
	public int quantasPortasEstaoAbertas() {
		
		int t = 0, i = 0;
		
		while (portas[i] != null) {
			if (portas[i].estaAberta()) {
				t++;
			}
			i++;
		}
		
		return t;
		
	}
	
	public int totalDePortas() {
		
		int t = 0;
		
		while (portas[t] != null) {
			t++;
		}
		
		return t;	
		
	}
	
}
