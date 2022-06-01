package parte02;

public class Ex01 {

	public static void main(String[] args) {
		double salario = 1000;
		double aumento = 0.015;
		int ano = 2000;

		System.out.printf("2000 | Salário: R$ %.2f\n", salario);

		salario = salario + (salario * aumento);
		ano++;
		System.out.printf("%d | Salário: R$ %.2f\n", ano, salario);

		for (int i = 2; i <= 17; i++) {
			aumento = aumento * 2;
			salario = salario + (salario * aumento);
			ano++;
			System.out.printf("%d | Salário: R$ %.2f\n", ano, salario);
		}

	}

}
