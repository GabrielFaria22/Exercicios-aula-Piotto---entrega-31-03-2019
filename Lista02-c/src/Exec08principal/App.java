package Exec08principal;

public class App {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		aluno.CPF = "123";
		
		if (aluno.ValidaCPF() == true)
			System.out.println("CPF v�lido");
		else
			System.out.println("CPF inv�lido");

	}
	//RESPOSTA: SEM ERRO DE COMPILACAO, COM RESULTADO "CPF v�lido".


}
