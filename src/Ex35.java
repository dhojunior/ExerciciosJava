import java.util.Scanner;

public class Ex35 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		double custo, venda;

		System.out.print("Digite o custo de fábrica: R$ ");
		custo = leitor.nextDouble();

		if (custo <= 12000) {
			venda = custo + (custo * 0.05);
			System.out.printf("O Valor de venda deste carro será R$ %.2f", venda);
		} else if (custo <= 25000) {
			venda = custo + ((custo * 0.1) + (custo * 0.15));
			System.out.printf("O Valor de venda deste carro será R$ %.2f", venda);
		} else {
			venda = custo + ((custo * 0.15) + (custo * 0.20));
			System.out.printf("O Valor de venda deste carro será R$ %.2f", venda);
		}

		leitor.close();
	}

}
