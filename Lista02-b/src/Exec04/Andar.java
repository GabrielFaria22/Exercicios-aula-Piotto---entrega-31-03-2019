package Exec04;

public class Andar {
	
	public Porta[] porta=new Porta[90];
	
	
	
	public int totalDePortas() {
		int t=0;
		while(porta[t]!=null) {
			t++;
		}
		return t;
	}

}
