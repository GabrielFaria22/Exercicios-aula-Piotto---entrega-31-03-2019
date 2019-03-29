package Exec04;

import java.util.Scanner;


public class Porta {
	
	Scanner leitor=new Scanner(System.in);
	public boolean aberta;
	public String cor = new String();
	public double x,y,z;
	
	public Porta() {
		this.aberta=aberta;
		this.cor=cor;
		this.x=x;
		this.y=y;
		this.z=z;
		
	}
	public void abre() {
		this.aberta=true;
		System.out.println("Porta aberta com sucesso");
	}
	public void fecha() {
		this.aberta=false;
		System.out.println("Porta fechada com sucesso");
	}
	
	void pinta(String s) {
		this.cor=s;
		System.out.println("a porta foi pintada de " +s);
	}
	
	

}
