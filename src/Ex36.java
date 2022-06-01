import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int h, hextras, hfaltas;

		System.out.print("Digite a quantidade de horas extras: ");
		hextras = leitor.nextInt() * 60;

		System.out.print("Digite a quantidade de horas faltadas: ");
		hfaltas = leitor.nextInt() * 60;

		h = hextras - (2 * hfaltas / 3);

		if (h > 2400) {
			System.out.println("O Valor do Prêmio é de R$ 500,00");
		} else if (h > 1800) {
			System.out.println("O Valor do Prêmio é de R$ 400,00");
		} else if (h > 1200) {
			System.out.println("O Valor do Prêmio é de R$ 300,00");
		} else if (h >= 600) {
			System.out.println("O Valor do Prêmio é de R$ 200,00");
		} else {
			System.out.println("O Valor do Prêmio é de R$ 100,00");
		}

		leitor.close();
	}

}
