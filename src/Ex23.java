import java.util.Scanner;

//Desenvolva um programa que dado um número, imprima uma das mensagens: é múltiplo de 3 ou não é múltiplo de 3. 
public class Ex23 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int num, mod;

		System.out.print("Digite o número para saber se é múltiplo de 3: ");
		num = leitor.nextInt();

		mod = num % 3;

		if (mod == 0) {
			System.out.printf("O número %d é múltiplo de 3!", num);
		} else {
			System.out.printf("O número %d não é múltiplo de 3!, num");
		}
		leitor.close();
	}

}
