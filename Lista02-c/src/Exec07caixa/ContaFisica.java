package Exec07caixa;
import Exec07.Conta;

public class ContaFisica extends Conta {
	
	private String Cpf;
	
	public boolean VerificarConta() {
		
		if (Agencia > 0 && NumeroCta > 0)
			return true;
		else
			return false;
		
	}
	

}
