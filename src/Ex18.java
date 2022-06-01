import java.util.Scanner;

//Escreva um programa que leia o valor de 3 ângulos de um triângulo e escreva se o triângulo é Acutângulo, Retângulo ou Obtusângulo.
//Sendo que:
//Triângulo Retângulo: possui um ângulo reto. (igual a 90º)
//Triângulo Obtusângulo: possui um ângulo obtuso. (maior que90º)
//TriânguloAcutângulo: possui três ângulos agudos. (menor que 90º

public class Ex18 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int ang1, ang2, ang3;

		System.out.println("Vamos descobrir o tipo do triângulo?");
		System.out.println("Vale lembrar que a soma dos seus ângulos devem somar 180°.");

		System.out.print("Digite o valor do primeiro ângulo: ");
		ang1 = leitor.nextInt();

		System.out.print("Digite o valor do segundo ângulo: ");
		ang2 = leitor.nextInt();

		System.out.print("Digite o valor do terceiro ângulo: ");
		ang3 = leitor.nextInt();

		leitor.close();

		if (ang1 + ang2 + ang3 != 180) {
			System.out.println("Estes ângulos não formam um triângulo!");
			System.out.println("FIM DO PROGRAMA");
			System.exit(0);
		}

		if (ang1 == 90 || ang2 == 90 || ang3 == 90) {
			System.out.println("Este é um Triângulo Retângulo");
		} else if (ang1 > 90 || ang2 > 90 || ang3 > 90) {
			System.out.println("Este é um Triângulo Obtuso");
		} else {
			System.out.println("Este é um Triângulo Acutângulo");
		}
	}

}
