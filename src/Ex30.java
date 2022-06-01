import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		double compra, venda = 0;

		System.out.print("Digite o valor de compra do produto: R$ ");
		compra = leitor.nextDouble();

		if (compra < 20) {
			venda = compra * 1.45;
		} else {
			venda = compra * 1.30;
		}

		System.out.printf("Este produto terá preço de venda de R$ %.2f", venda);

		leitor.close();

	}
}