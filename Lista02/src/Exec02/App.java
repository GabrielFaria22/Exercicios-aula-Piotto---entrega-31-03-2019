package Exec02;
import Exec02.Pais;

public class App {

	public static void main(String[] args) {
		Pais p1=new Pais("Brasil", "Brasilia", 56000.0);
		Pais p2=new Pais("Argentina","BuenosAires",32000.0);
		Pais p3=new Pais("Paraguai","Assuncao",21000.0);
		Pais p4=new Pais("Brasil","Brasilia",47000.0);
		
		//metodos para verificar se o pais e igual ou nao
		if(p1.paisigual(p2)==true) {
			System.out.println("pais e igual");
		}else {
			System.out.println("pais nao e igual");
		}
		if(p1.paisigual(p4)==true) {
			System.out.println("pais e igual");
		}else {
			System.out.println("pais nao e igual");

	}
		//metodo para adicionar o pais p3 a lista de paises que fazem fronteira com p2
		//p1.adicionar(p3); //nao funciona
		/*
		//metodo para mostrar a lista de paises que fazem fronteira com p2
		p2.mostrarpaisescomfronteira();
	*/
		
		//p1.mostrarpaisescomfronteira(); nao funciona tbm
		
		//p1.retornaPais(); tbm nao funciona
		
		//p1.efronteirasimounao(p3); nao funciona

}
}
