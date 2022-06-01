import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int lados;
		double medida, area;

		System.out.print("Digite quantos lados tem o seu polígono (3, 4 ou 5): ");
		lados = leitor.nextInt();

		System.out.print("Qual o tamanho do lado, em cm: ");
		medida = leitor.nextDouble();

		if (lados == 3) {
			area = (Math.pow(medida, 2) * Math.sqrt(3)) / 4;
			System.out.printf("A Área do TRIÂNGULO será: %.2f cm²", area);
		} else if (lados == 4) {
			area = medida * medida;
			System.out.printf("A Área do QUADRADO será: %.2f cm²", area);
		} else if (lados == 5) {
			area = (5 * (Math.pow(medida, 2)) / (4 * (Math.tan(Math.toRadians(36)))));
			System.out.printf("A Área do PENTÁGONO será: %.2f cm²", area);
		} else {
			System.out.println("Você digitou um valor inválido para o polígono.");
		}

		leitor.close();
	}

}
