package Exec02;
import java.util.Scanner;

public class Pais {

	//pais
	Scanner leitor=new Scanner(System.in);
	public String nome=new String();
	public String capital=new String();
	public double dimensoes;
	public Pais[] fronteiras;
	public String[] paisescomfronteira=new String[20];
	
	public Pais(String nome,String capital, double dimensoes) {
		
		this.nome=nome;
		this.capital=capital;
		this.dimensoes=dimensoes;
		//this.paisescomfronteira=
	}
	
	public boolean paisigual(Pais p1) {
		
		if(p1.nome==this.nome&&p1.capital==this.capital) {
			return true;
		}else {
			return false;
		}
	}
	
	
	public void adicionar(Pais p) {
		
		if(paisigual(p)==true) {
			return;
		}
		int posicao=0;
		
		while(fronteiras[posicao] !=null) {
			posicao++;
		}
		fronteiras[posicao]=p;
	}
	
	public void mostrarpaisescomfronteira() {
		
		int posicao=0;
		while(fronteiras[posicao]!=null) {
			System.out.println(this.fronteiras[posicao]);
			posicao++;
		}
	}
	
	
	
	
	public void retornaPais() {
		int repet=0;
		while(this.fronteiras[repet]!=null) {
			System.out.println(this.fronteiras[repet]);
			repet++;
		}
	}
	
	public boolean efronteirasimounao(Pais p1) {
		int posicao=0,repet;
		boolean eounao = false;
		
		
			while(fronteiras[posicao]!=null) {
				if(p1.fronteiras[posicao]!=this) {
					eounao=false;
				}else {
					eounao=true;
				}
		}
		
		return eounao;
	}
	
	
	
	
	
	
	
}
