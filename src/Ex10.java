import java.util.Scanner;

// Escreva um programa que verifique a validade de uma senha fornecida pelo usuário. A senha válida é o número 1234. 
//Devem ser impressas as seguintes mensagens: ACESSO PERMITIDO caso a senha seja válida e  ACESSO NEGADO caso a senha seja inválida.
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
