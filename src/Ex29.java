import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		double nota1, nota2, nota3, media, coef;
		int aulas, faltas;

		System.out.print("Digite a nota da primeira prova: ");
		nota1 = leitor.nextDouble();

		System.out.print("Digite a nota da segunda prova: ");
		nota2 = leitor.nextDouble();

		System.out.print("Digite a nota da terceira prova: ");
		nota3 = leitor.nextDouble();

		media = (nota1 + nota2 + nota3) / 3;

		System.out.print("Digite a quantidade de aulas ministradas: ");
		aulas = leitor.nextInt();

		System.out.print("Digite a quantidade de faltas do aluno: ");
		faltas = leitor.nextInt();

		coef = aulas * 0.25;

		if (faltas > coef) {
			System.out.printf("Aluno reprovado por falta.\nTotal de faltas: %d\nFaltas Permitidas: %.0f", faltas, coef);
		} else if (media >= 7) {
			System.out.printf("Aluno APROVADO.\nMédia: %.2f\nTotal de faltas: %d\nFaltas Permitidas: %.0f", media,
					faltas, coef);
		} else if (media >= 3) {
			System.out.printf("Aluno em EXAME.\nMédia: %.2f\nTotal de faltas: %d\nFaltas Permitidas: %.0f", media,
					faltas, coef);
		} else {
			System.out.printf("Aluno REPROVADO.\nMédia: %.2f\nTotal de faltas: %d\nFaltas Permitidas: %.0f", media,
					faltas, coef);
		}

		leitor.close();
	}

}
