import java.util.Scanner;
//Desenvolva um programa que dado um número, informe se ele é divisível por 3 e por 7.
public class Ex24 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int num, mod3, mod7;

		System.out.print("Digite um número para saber se é divisível por 3 e por 7: ");
		num = leitor.nextInt();

		mod3 = num % 3;
		mod7 = num % 7;

		if (mod3 == 0 && mod7 == 0) {
			System.out.printf("O número %d é divisível por 3 e por 7!", num);
		} else {
			System.out.printf("O número %d NÃO é divisível por 3 e por 7!", num);
		}

		leitor.close();
	}

}
