import java.util.Scanner;

//Desenvolva um programa que dados tr�s n�meros inteiros, informe quantos s�o negativos.
public class Ex26 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int num1, num2, num3, contagem;

		contagem = 0;

		System.out.print("Digite o primeiro n�mero: ");
		num1 = leitor.nextInt();

		System.out.print("Digite o segundo n�mero: ");
		num2 = leitor.nextInt();

		System.out.print("Digite o terceiro n�mero: ");
		num3 = leitor.nextInt();

		if (num1 < 0) {
			contagem++;
		}

		if (num2 < 0) {
			contagem++;
		}

		if (num3 < 0) {
			contagem++;
		}

		if (contagem == 1) {
			System.out.printf("Voc� digitou 1 n�mero negativo!", contagem);
		} else if (contagem > 1) {
			System.out.printf("Voc� digitou %d n�meros negativos!", contagem);
		} else {
			System.out.println("Voc� n�o digitou n�meros negativos!");
		}

		leitor.close();
	}

}
