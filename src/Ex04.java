import java.util.Scanner;

//Fa�a um programa que receba o sal�rio bruto de um funcion�rio e, usando a tabela a seguir, calcule e mostre o valor a receber. 
//Sabe-se que este � composto pelo sal�rio bruto acrescido de gratifica��o e descontado o imposto de 7% sobre o sal�rio.
public class Ex04 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		double salario;

		System.out.print("Digite o sal�rio bruto do funcion�rio: ");
		salario = leitor.nextDouble();

		if (salario <= 350) {
			salario = (salario + 100) * 0.93;
			System.out.printf("Este funcion�rio receber� R$ %.2f", salario);
		} else if (salario <= 600) {
			salario = (salario + 75) * 0.93;
			System.out.printf("Este funcion�rio receber� R$ %.2f", salario);
		} else if (salario <= 900) {
			salario = (salario + 50) * 0.93;
			System.out.printf("Este funcion�rio receber� R$ %.2f", salario);
		} else {
			salario = (salario + 35) * 0.93;
			System.out.printf("Este funcion�rio receber� R$ %.2f", salario);
		}

		leitor.close();

	}

}
