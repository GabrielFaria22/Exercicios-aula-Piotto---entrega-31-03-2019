package Exec04;

import Exec04.Porta;
import java.util.Scanner;


public class App {
	public static void main(String[] args) {
		
		//criando porta
		Porta p =new Porta();
		Porta p2=new Porta();
		p2.x=1.9;
		p2.y=1.25;
		p2.z=0.08;
		Porta p3=new Porta();
		p3.x=1.9;
		p3.y=1.25;
		p3.z=0.08;
		
		p.abre();
		p.fecha();
		p.pinta("azul");
		p.x=1.9;
		p.y=1.25;
		p.z=0.08;
		if(p.estaAberta()) {
			System.out.println("porta esta aberta");
		}else {
			System.out.println("porta esta fechada");
		}
		
		//criando casa
		Casa c=new Casa();
		
		c.pinta("vermelho");
		c.porta[0]=p;
		c.porta[1]=p2;
		c.porta[2]=p3;
		c.porta[0].abre();
		//System.out.println(c.quantasPortasEstaoAbertas());
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
