package Exec08principal;

public class Aluno extends Pessoa {

	public boolean ValidaCPF(String CPF) {
		
		if (CPF.length() == 11)
			return true;
		else
			return false;
		
	}

}
