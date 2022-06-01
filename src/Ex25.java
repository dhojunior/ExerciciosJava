import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		double salario, emprestimo, valorParcela, limiteParcela;
		int parcelas;

		System.out.print("Digite seu salário bruto: R$ ");
		salario = leitor.nextDouble();

		System.out.print("Digite o valor do empréstimo: R$ ");
		emprestimo = leitor.nextDouble();

		System.out.print("Informe o número de parcelas: ");
		parcelas = leitor.nextInt();

		limiteParcela = salario * 0.3;
		valorParcela = emprestimo / parcelas;

		if (valorParcela <= limiteParcela) {
			System.out.printf("O empréstimo de R$ %.2f pode ser concedido.\n", emprestimo);
			System.out.printf("Valor da parcela será R$ %.2f", valorParcela);
		} else {
			System.out.printf("O empréstimo de R$ %.2f NÃO pode ser concedido.\n", emprestimo);
			System.out.printf("Valor da parcela de R$ %.2f ultrapassa limite de parcela de R$ %.2f", valorParcela,
					limiteParcela);
		}

		leitor.close();
	}

}
