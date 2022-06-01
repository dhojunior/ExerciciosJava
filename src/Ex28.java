import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

//Desenvolva um programa que dada a data de nascimento de uma pessoa e a data atual, informe a idade dessa pessoa em anos completos.
public class Ex28 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int ano, mes, dia;

		System.out.print("Digite o dia de nascimento: ");
		dia = leitor.nextInt();

		System.out.print("Digite o mês de nascimento: ");
		mes = leitor.nextInt();

		System.out.print("Digite o ano de nascimento: ");
		ano = leitor.nextInt();

		LocalDate dataNasc = LocalDate.of(ano, mes, dia);
		LocalDate now = LocalDate.now();
		long age = ChronoUnit.YEARS.between(dataNasc, now);

		System.out.printf("Você possui %d anos de idade!", age);
		leitor.close();
	}

}
