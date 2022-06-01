import java.util.Scanner;

//As maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia, e R$ 0,25 se forem compradas pelo menos doze. 
//Escreva um programa que leia o número de maçãs compradas, calcule e escreva o valor total da compra.
public class Ex11 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int qtdMacas;
		double valor;

		System.out.println("Quantas maças quer comprar?");
		qtdMacas = leitor.nextInt();

		if (qtdMacas >= 12) {
			valor = qtdMacas * 0.25;
			System.out.printf("Comprando %d maçãs, cada uma vai custar R$ 0,25\nO total da compra será R$ %.2f",
					qtdMacas, valor);
		} else {
			valor = qtdMacas * 0.30;
			System.out.printf("Comprando %d maçãs, cada uma vai custar R$ 0,30\nO total da compra será R$ %.2f",
					qtdMacas, valor);
		}

		leitor.close();
	}

}
