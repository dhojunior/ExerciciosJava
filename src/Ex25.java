import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		double salario, emprestimo, valorParcela, limiteParcela;
		int parcelas;

		System.out.print("Digite seu sal�rio bruto: R$ ");
		salario = leitor.nextDouble();

		System.out.print("Digite o valor do empr�stimo: R$ ");
		emprestimo = leitor.nextDouble();

		System.out.print("Informe o n�mero de parcelas: ");
		parcelas = leitor.nextInt();

		limiteParcela = salario * 0.3;
		valorParcela = emprestimo / parcelas;

		if (valorParcela <= limiteParcela) {
			System.out.printf("O empr�stimo de R$ %.2f pode ser concedido.\n", emprestimo);
			System.out.printf("Valor da parcela ser� R$ %.2f", valorParcela);
		} else {
			System.out.printf("O empr�stimo de R$ %.2f N�O pode ser concedido.\n", emprestimo);
			System.out.printf("Valor da parcela de R$ %.2f ultrapassa limite de parcela de R$ %.2f", valorParcela,
					limiteParcela);
		}

		leitor.close();
	}

}
