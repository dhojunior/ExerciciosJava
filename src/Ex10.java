import java.util.Scanner;

// Escreva um programa que verifique a validade de uma senha fornecida pelo usu�rio. A senha v�lida � o n�mero 1234. 
//Devem ser impressas as seguintes mensagens: ACESSO PERMITIDO caso a senha seja v�lida e  ACESSO NEGADO caso a senha seja inv�lida.
public class Ex10 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int senha = 1234;
		int tentativaSenha;

		System.out.print("Digite a senha: ");
		tentativaSenha = leitor.nextInt();

		if (senha == tentativaSenha) {
			System.out.println("ACESSO PERMITIDO");
		} else {
			System.out.println("ACESSO NEGADO");
		}

		leitor.close();
	}

}
