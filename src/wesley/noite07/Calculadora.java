package wesley.noite07;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {		
		Funcoes.facaAlgumaCoisa();
		Funcoes.facaAlgumaCoisa(1);
		Funcoes.facaAlgumaCoisa("AA");
		Funcoes.facaAlgumaCoisa(1, "SS");
		Funcoes.facaAlgumaCoisa("SS", 2);
	}

	private static void calculadora() {
		int a = lerValorDaVariavel("A");
		int b = lerValorDaVariavel("B");

		short opcao = lerOpcao();

		if (opcao == 1)
			System.out.println(somar(a, b));
		if (opcao == 2)
			System.out.println(subtrair(a, b));
		if (opcao == 3)
			System.out.println(dividir(a, b));
		if (opcao == 4)
			System.out.println(multiplicar(a, b));
	}

	public static int somar(int a, int b) {
		return a + b;
	}

	public static int subtrair(int a, int b) {
		return a - b;
	}

	public static int dividir(int a, int b) {
		return a / b;
	}

	public static int multiplicar(int a, int b) {
		return a * b;
	}

	public static int lerValorDaVariavel(String variavel) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite " + variavel + ": ");
		return sc.nextInt();
	}
	
	public static short lerOpcao() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Opção: \n\t 1 - Somar\n\t 2 - Subtrair\n\t 3 - Dividir\n\t 4 - Multiplicar");
		return sc.nextShort();
	}
}
