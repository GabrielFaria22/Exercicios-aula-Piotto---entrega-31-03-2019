package Exec04;

public class Casa {
	
	public Porta[] porta=new Porta[3];
	public String cor=new String();
	
	public Casa(){
		this.porta[0]=porta[0];
		this.porta[1]=porta[1];
		this.porta[2]=porta[2];
		this.cor=cor;
		this.cor=cor;
	}
	


	public void pinta(String cornova) {
		this.cor=cornova;
		System.out.println("a casa foi pintada de "+cornova);
	}
	public int totalDePortas() {
		return porta.length;
	}
	public int quantasPortasEstaoAbertas() {
		int qtsportas=0,repet=0;
		while(this.porta[repet]!=null) {
			if(this.porta[repet].aberta=true) {
				qtsportas=qtsportas+1;
			}
			repet++;
		}
		return qtsportas;
	}
}
