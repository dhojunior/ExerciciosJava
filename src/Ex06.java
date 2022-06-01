import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		double salarioCarlos, salarioJoao;
		int meses = 1;

		System.out.print("Digite o salário de Carlos: ");
		salarioCarlos = leitor.nextDouble();

		salarioJoao = salarioCarlos / 3;

		while (salarioJoao <= salarioCarlos) {
			salarioCarlos = salarioCarlos * 1.02;
			salarioJoao = salarioJoao * 1.05;
			
			if (salarioJoao < salarioCarlos) {
			meses++; }
		}

		System.out.printf("Vai demorar %d meses para que o salário de João iguale, ou ultrapasse o de Carlos\n",
				(meses));
		System.out.printf("Mês %d | Salário Carlos R$ %.2f | Salário João R$ %.2f \n", (meses), salarioCarlos,
				salarioJoao);

		leitor.close();

	}

}
