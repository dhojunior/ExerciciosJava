import java.util.Scanner;

//Desenvolva um programa que dado um n�mero, imprima uma das mensagens: � m�ltiplo de 3 ou n�o � m�ltiplo de 3. 
public class Ex23 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int num, mod;

		System.out.print("Digite o n�mero para saber se � m�ltiplo de 3: ");
		num = leitor.nextInt();

		mod = num % 3;

		if (mod == 0) {
			System.out.printf("O n�mero %d � m�ltiplo de 3!", num);
		} else {
			System.out.printf("O n�mero %d n�o � m�ltiplo de 3!, num");
		}
		leitor.close();
	}

}
