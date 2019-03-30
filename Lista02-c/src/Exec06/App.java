package Exec06;

public class App {

	public static void main(String[] args) {
		
		ContaCorrente conta1=new ContaCorrente();
		ContaCorrenteEspecial conta2=new ContaCorrenteEspecial();
		
		conta1.depositar(1000);
		conta1.obterSaldo();
		conta1.sacar(100);
		conta1.obterSaldo();
		
		conta2.depositar(1000);
		conta2.obterSaldo();
		conta2.sacar(100);
		conta2.obterSaldo();
		

	}

}
