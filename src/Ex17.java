import java.util.Scanner;

//Escreva um programa que leia as medidas dos lados de um tri�ngulo e escreva se ele � Equil�tero, Is�sceles ou Escaleno.
//
//Sendo que:
//
//Tri�ngulo Equil�tero: possui os 3 lados iguais.
//Tri�ngulo Is�scele: possui 2 lados iguais.
//Tri�ngulo Escaleno: possui 3 lados diferentes.
public class Ex17 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int lado1, lado2, lado3;

		System.out.print("Digite o primeiro lado do tri�ngulo: ");
		lado1 = leitor.nextInt();

		System.out.print("Digite o segundo lado do tri�ngulo: ");
		lado2 = leitor.nextInt();

		System.out.print("Digite o terceiro lado do tri�ngulo: ");
		lado3 = leitor.nextInt();

		if (lado1 == lado2 && lado1 == lado3) {
			System.out.println("Estas medidas formam um tri�ngulo Equil�tero.");
		} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			System.out.println("Estas medidas formam um tri�ngulo Is�sceles.");
		} else {
			System.out.println("Estas medidas formam um tri�ngulo Escaleno.");
		}

		leitor.close();
	}

}
