import java.util.Scanner;

//Escreva um programa que leia as medidas dos lados de um triângulo e escreva se ele é Equilátero, Isósceles ou Escaleno.
//
//Sendo que:
//
//Triângulo Equilátero: possui os 3 lados iguais.
//Triângulo Isóscele: possui 2 lados iguais.
//Triângulo Escaleno: possui 3 lados diferentes.
public class Ex17 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int lado1, lado2, lado3;

		System.out.print("Digite o primeiro lado do triângulo: ");
		lado1 = leitor.nextInt();

		System.out.print("Digite o segundo lado do triângulo: ");
		lado2 = leitor.nextInt();

		System.out.print("Digite o terceiro lado do triângulo: ");
		lado3 = leitor.nextInt();

		if (lado1 == lado2 && lado1 == lado3) {
			System.out.println("Estas medidas formam um triângulo Equilátero.");
		} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			System.out.println("Estas medidas formam um triângulo Isósceles.");
		} else {
			System.out.println("Estas medidas formam um triângulo Escaleno.");
		}

		leitor.close();
	}

}
