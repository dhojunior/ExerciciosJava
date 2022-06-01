import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int codigo = 1;
		String turno, categoria;
		int horasMes;
		double valorHora, valorAux, salarioInicial, salarioFinal;

		while (codigo <= 10) {
			salarioInicial = 0;
			valorHora = 0;
			horasMes = 0;
			valorAux = 0;
			salarioFinal = 0;
			System.out.printf("Digite a quantidade de horas trabalhadas do funcion�rio %d: ", codigo);
			horasMes = leitor.nextInt();
			System.out.print("Digite o turno do funcion�rio [M, V, N]: ");
			turno = leitor.next();
			System.out.print("Digite a categoria do funcion�rio [G , O]: ");
			categoria = leitor.next();

			if (categoria.equals("G")) {
				if (turno.equals("N")) {
					valorHora = 450 * 0.18;
					salarioInicial = valorHora * horasMes;
				} else if (turno.equals("M") || turno.equals("V")) {
					valorHora = 450 * 0.15;
					salarioInicial = valorHora * horasMes;
				} else {
					System.out.println("Voc� Digitou o turno errado.");
				}
			} else if (categoria.equals("O")) {
				if (turno.equals("N")) {
					valorHora = 450 * 0.13;
					salarioInicial = valorHora * horasMes;
				} else if (turno.equals("M") || turno.equals("V")) {
					valorHora = 450 * 0.10;
					salarioInicial = valorHora * horasMes;
				} else {
					System.out.println("Voc� Digitou o turno errado.");
				}
			} else {
				System.out.println("Voc� digitou a categoria errada.");
			}

			if (salarioInicial <= 300) {
				valorAux = salarioInicial * 0.20;
			} else if (salarioInicial <= 600) {
				valorAux = salarioInicial * 0.15;
			} else {
				valorAux = salarioInicial * 0.05;
			}

			salarioFinal = salarioInicial + valorAux;

			System.out.printf(
					"C�digo Funcion�rio: %d | Horas Trabalhadas: %d | Valor Hora: R$ %.2f | Sal�rio Inicial: R$ %.2f | Aux�lio Alimenta��o: R$ %.2f | Sal�rio Final: R$ %.2f\n",
					codigo, horasMes, valorHora, salarioInicial, valorAux, salarioFinal);

			codigo++;
		}

		System.out.println("FIM DO PROGRAMA");
		leitor.close();

	}

}
