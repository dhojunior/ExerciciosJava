import java.util.Scanner;

//As ma��s custam R$ 0,30 cada se forem compradas menos do que uma d�zia, e R$ 0,25 se forem compradas pelo menos doze. 
//Escreva um programa que leia o n�mero de ma��s compradas, calcule e escreva o valor total da compra.
public class Ex11 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int qtdMacas;
		double valor;

		System.out.println("Quantas ma�as quer comprar?");
		qtdMacas = leitor.nextInt();

		if (qtdMacas >= 12) {
			valor = qtdMacas * 0.25;
			System.out.printf("Comprando %d ma��s, cada uma vai custar R$ 0,25\nO total da compra ser� R$ %.2f",
					qtdMacas, valor);
		} else {
			valor = qtdMacas * 0.30;
			System.out.printf("Comprando %d ma��s, cada uma vai custar R$ 0,30\nO total da compra ser� R$ %.2f",
					qtdMacas, valor);
		}

		leitor.close();
	}

}
