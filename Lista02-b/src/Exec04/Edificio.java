package Exec04;
import Exec04.Porta;
import java.util.Scanner;

public class Edificio {
	
	public String cor=new String();
	public int totalDeAndares=1;
	public Porta[] porta=new Porta[5]/*pois aqui nao posso deixar de declarar a qtd de portas*/;
	public int totalDePortas=porta.length;/*necessario declarar*/
	public int contador1=0;
	
	public Edificio(){
		this.cor=cor;
		this.totalDePortas=totalDePortas;
		this.totalDeAndares=totalDeAndares;
		this.porta[0]=porta[0];
		this.porta[1]=porta[1];
		this.porta[2]=porta[2];
		this.porta[3]=porta[3];
		this.porta[4]=porta[4];
	}
	
	public int quantasportasnoedificio() {
		return porta.length;
	}
	public void adicionaPorta(Porta p1) {
		int repet=0;
		while(this.porta[repet]!=null) {
			repet++;
		}
		this.porta[repet]=p1;
		totalDePortas=totalDePortas+1;
	}
	public int quantasPortasEstaoAbertas() {
		int repet,totalabertas=0;
		for(repet=0;repet<=totalDePortas;repet++) {
			if(porta[repet].aberta=true) {
				totalabertas=totalabertas+1;
			}
		}
		return totalabertas;
	}
	public void adicionarAndar(int qtdadicionada) {
		this.totalDeAndares=totalDeAndares+qtdadicionada;
	}
	public int totalDeAndares() {
		return totalDeAndares;
	}
	public void pinta(String s) {
		this.cor=s;
		System.out.println("o edificio foi pintado de "+s);
	}
	public void abrirPorta(Porta porta) {
		
		this.porta[this.contador1].aberta=true;
		this.contador1=this.contador1+1;
	}


	
	
}
