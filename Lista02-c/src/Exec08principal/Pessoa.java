package Exec08principal;

public class Pessoa {
	
	public int id;
	public String nome;
	public String CPF;
	
	public boolean ValidaCPF() {
		
		if (CPF.length() > 0)
			return true;
		else
			return false;
		
	}
}
