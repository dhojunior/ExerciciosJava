import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		double numero = 1;
		System.out.println("Caso queira sair do programa, digite 0");

		while (numero > 0) {
			System.out.print("Digite um número: ");
			numero = leitor.nextDouble();

			System.out.printf("Seu Número: %.2f | Seu Quadrado: %.2f | Seu Cubo: %.2f | Sua Raiz Quadrada: %.2f\n",
					numero, Math.pow(numero, 2), Math.pow(numero, 3), Math.sqrt(numero));
		}

		System.out.println("FIM DO PROGRAMA!");

		leitor.close();

	}

}
