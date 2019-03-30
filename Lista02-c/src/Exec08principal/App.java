package Exec08principal;

public class App {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		aluno.CPF = "123";
		
		if (aluno.ValidaCPF() == true)
			System.out.println("CPF válido");
		else
			System.out.println("CPF inválido");

	}
	//RESPOSTA: SEM ERRO DE COMPILACAO, COM RESULTADO "CPF válido".


}
