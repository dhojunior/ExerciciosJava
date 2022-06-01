import java.util.Scanner;

//Fa�a um programa que receba a idade de um nadador e mostre sua categoria, usando as regras a seguir. Para idade inferior a 5, dever� mostrar mensagem.
public class Ex03 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int idade;

		System.out.print("Informe a idade do nadador: ");
		idade = leitor.nextInt();

		if (idade > 30) {
			System.out.println("Nadador na categoria S�NIOR.");
		} else if (idade > 15) {
			System.out.println("Nadador na categoria ADULTO.");
		} else if (idade > 10) {
			System.out.println("Nadador na categoria ADOLESCENTE.");
		} else if (idade > 7) {
			System.out.println("Nadador na categoria JUVENIL.");
		} else if (idade >= 5) {
			System.out.println("Nadador na categoria INFANTIL.");
		} else {
			System.out.println("Este nadador n�o pode participar, pois idade � inferior a 5 anos.");
		}

		leitor.close();

	}

}
