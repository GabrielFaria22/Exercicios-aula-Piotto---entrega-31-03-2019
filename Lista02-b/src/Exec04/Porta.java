package Exec04;

import java.util.Scanner;


public class Porta {

	public boolean aberta;
	public String cor;
	public double dimensaoX;
	public double dimensaoY;
	public double dimensaoZ;
	
	public void abre() {
		aberta = true;
	}
	
	public void fecha() {
		aberta = false;
	}
	
	public void pinta(String s) {
		cor = s;
	}
	
	public boolean estaAberta() {
		return aberta;
	}
	
}
