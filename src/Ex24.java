import java.util.Scanner;
//Desenvolva um programa que dado um n�mero, informe se ele � divis�vel por 3 e por 7.
public class Ex24 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int num, mod3, mod7;

		System.out.print("Digite um n�mero para saber se � divis�vel por 3 e por 7: ");
		num = leitor.nextInt();

		mod3 = num % 3;
		mod7 = num % 7;

		if (mod3 == 0 && mod7 == 0) {
			System.out.printf("O n�mero %d � divis�vel por 3 e por 7!", num);
		} else {
			System.out.printf("O n�mero %d N�O � divis�vel por 3 e por 7!", num);
		}

		leitor.close();
	}

}
