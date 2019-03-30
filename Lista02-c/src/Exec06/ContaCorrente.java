package Exec06;

public class ContaCorrente {
	
	public double saldo,valorrepassadoaobanco;
	public double taxasaque=0.5;
	
	public ContaCorrente() {
		this.saldo=saldo;
		this.valorrepassadoaobanco=valorrepassadoaobanco;
		this.taxasaque=taxasaque;
	}
	
	public void depositar(double valor) {
		saldo=saldo+valor;
	}
	
	public void sacar(double valor) {
		
		saldo=saldo-(valor+(valor*(taxasaque/100)));
		
	}
	
	public void obterSaldo() {
		System.out.println(this.saldo);
	}
	
	
	
	

}
