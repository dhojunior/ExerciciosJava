import java.util.Scanner;

//Escreva um programa que leia o valor de 3 �ngulos de um tri�ngulo e escreva se o tri�ngulo � Acut�ngulo, Ret�ngulo ou Obtus�ngulo.
//Sendo que:
//Tri�ngulo Ret�ngulo: possui um �ngulo reto. (igual a 90�)
//Tri�ngulo Obtus�ngulo: possui um �ngulo obtuso. (maior que90�)
//Tri�nguloAcut�ngulo: possui tr�s �ngulos agudos. (menor que 90�

public class Ex18 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int ang1, ang2, ang3;

		System.out.println("Vamos descobrir o tipo do tri�ngulo?");
		System.out.println("Vale lembrar que a soma dos seus �ngulos devem somar 180�.");

		System.out.print("Digite o valor do primeiro �ngulo: ");
		ang1 = leitor.nextInt();

		System.out.print("Digite o valor do segundo �ngulo: ");
		ang2 = leitor.nextInt();

		System.out.print("Digite o valor do terceiro �ngulo: ");
		ang3 = leitor.nextInt();

		leitor.close();

		if (ang1 + ang2 + ang3 != 180) {
			System.out.println("Estes �ngulos n�o formam um tri�ngulo!");
			System.out.println("FIM DO PROGRAMA");
			System.exit(0);
		}

		if (ang1 == 90 || ang2 == 90 || ang3 == 90) {
			System.out.println("Este � um Tri�ngulo Ret�ngulo");
		} else if (ang1 > 90 || ang2 > 90 || ang3 > 90) {
			System.out.println("Este � um Tri�ngulo Obtuso");
		} else {
			System.out.println("Este � um Tri�ngulo Acut�ngulo");
		}
	}

}
