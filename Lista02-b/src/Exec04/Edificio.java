package Exec04;
import Exec04.Porta;
import java.util.Scanner;

public class Edificio {
	
	public String cor;
	public Andar[] andares = new Andar[300];
	
	public void pinta(String s) {
		cor = s;
	}
	
	public int totalDeAndares() {
		
		int t = 0;
		
		while (andares[t] != null)
			t++;
		
		return t;
	}
	
	public void adicionarAndar(int total) {
		
		Andar a = new Andar();
				
		for(int i = 0; i < total; i++) {
			
			Porta p = new Porta();
			
			a.porta[i] = p;
		}
		
		int indice = 0;
		while (andares[indice] != null)
			indice++;
			
		andares[indice] = a;
		
	}
	
	public int totalDePortas() {
		
		int indice = 0;
		int total = 0;
		
		while (andares[indice] != null)
			total += andares[indice].totalDePortas();
		
		return total;
		
	}
	
}
