import java.util.Scanner;

//Uma empresa decidiu dar uma gratifica��o de Natal a seus funcion�rios, baseada no n�mero de horas extras e no n�mero de horas que o funcion�rio faltou ao trabalho. 
//O valor do pr�mio � obtido pela consulta � tabela que se segue, na qual:
//
//H = n�mero de horas extras � (2/3 * ( n�mero de horas falta ))


public class Ex01 {

	public static void main(String[] args) {
		Scanner leitor =  new Scanner(System.in);
		int h, hextras, hfaltas;
		
		System.out.print("Digite a quantidade de horas extras: ");
		hextras = leitor.nextInt() * 60;
		
		System.out.print("Digite a quantidade de horas faltadas: ");
		hfaltas = leitor.nextInt() * 60;
		
		h = hextras - (2 * hfaltas / 3);
		
		System.out.println(h);
		
		if (h >= 2401) {
			System.out.println("O Valor do Pr�mio � de R$ 500,00");
		} else if (h > 1800) {
			System.out.println("O Valor do Pr�mio � de R$ 400,00");
		} else if (h > 1200) {
			System.out.println("O Valor do Pr�mio � de R$ 300,00");
		} else if (h >= 600) {
			System.out.println("O Valor do Pr�mio � de R$ 200,00");
		} else {
			System.out.println("O Valor do Pr�mio � de R$ 100,00");
		}
		
		leitor.close();

	}

}
