import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int lados;
		double medida, area;

		System.out.print("Digite quantos lados tem o seu pol�gono (3, 4 ou 5): ");
		lados = leitor.nextInt();

		System.out.print("Qual o tamanho do lado, em cm: ");
		medida = leitor.nextDouble();

		if (lados == 3) {
			area = (Math.pow(medida, 2) * Math.sqrt(3)) / 4;
			System.out.printf("A �rea do TRI�NGULO ser�: %.2f cm�", area);
		} else if (lados == 4) {
			area = medida * medida;
			System.out.printf("A �rea do QUADRADO ser�: %.2f cm�", area);
		} else if (lados == 5) {
			area = (5 * (Math.pow(medida, 2)) / (4 * (Math.tan(Math.toRadians(36)))));
			System.out.printf("A �rea do PENT�GONO ser�: %.2f cm�", area);
		} else {
			System.out.println("Voc� digitou um valor inv�lido para o pol�gono.");
		}

		leitor.close();
	}

}
