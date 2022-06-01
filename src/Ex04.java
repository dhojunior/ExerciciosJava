import java.util.Scanner;

//Faça um programa que receba o salário bruto de um funcionário e, usando a tabela a seguir, calcule e mostre o valor a receber. 
//Sabe-se que este é composto pelo salário bruto acrescido de gratificação e descontado o imposto de 7% sobre o salário.
public class Ex04 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		double salario;

		System.out.print("Digite o salário bruto do funcionário: ");
		salario = leitor.nextDouble();

		if (salario <= 350) {
			salario = (salario + 100) * 0.93;
			System.out.printf("Este funcionário receberá R$ %.2f", salario);
		} else if (salario <= 600) {
			salario = (salario + 75) * 0.93;
			System.out.printf("Este funcionário receberá R$ %.2f", salario);
		} else if (salario <= 900) {
			salario = (salario + 50) * 0.93;
			System.out.printf("Este funcionário receberá R$ %.2f", salario);
		} else {
			salario = (salario + 35) * 0.93;
			System.out.printf("Este funcionário receberá R$ %.2f", salario);
		}

		leitor.close();

	}

}
