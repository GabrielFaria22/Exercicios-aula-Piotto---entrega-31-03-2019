package Exec04;

import Exec04.Porta;
import java.util.Scanner;


public class App {

	public static void main(String[] args) {
		
		Casa c1 = new Casa();
		
		Porta p1 = new Porta();
		p1.dimensaoX = 0.7;
		p1.dimensaoY = 1.2;
		p1.dimensaoZ = 0.04;
		
		Porta p2 = new Porta();
		p2.dimensaoX = 0.9;
		p2.dimensaoY = 1.4;
		p2.dimensaoZ = 0.07;
		
		Porta p3 = new Porta();
		p3.dimensaoX = 1;
		p3.dimensaoY = 1.6;
		p3.dimensaoZ = 0.2;
		
		c1.portas[0] = p1;
		c1.portas[1] = p2;
		c1.portas[2] = p3;
		
		c1.portas[2].abre();
		
		
		
	}

}
