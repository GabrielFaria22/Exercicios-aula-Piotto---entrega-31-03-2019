package Exec04;

import Exec04.Porta;
import java.util.Scanner;


public class App {
	public static void main(String[] args) {
		
		//criando porta
		Porta p =new Porta();
		
		p.abre();
		p.fecha();
		p.pinta("azul");
		p.x=1.9;
		p.y=1.25;
		p.z=0.08;
		
		//criando casa
		Casa c=new Casa();
		
		c.pinta("vermelho");
		
		System.out.println(c.quantasPortasEstaoAbertas());
		System.out.println(c.totalDePortas());
		
		//criando edificio
		Edificio e=new Edificio();
		
		e.pinta("branco");
		
		int repet=0;
		for(repet=0;repet<=4;repet++) {
			e.adicionaPorta(e.porta[repet]);
		}
		
		
		e.abrirPorta(e.porta[0]);
		
		System.out.println(e.quantasPortasEstaoAbertas());
		
	}
	
	
	

}
