package wesley.noite05;

import java.util.Scanner;

public class Exponenciacao {
	public static void main(String[] args) {
//		System.out.print("Digite um número: ");
//		int meuNumero = (new Scanner(System.in)).nextInt();
//		int meuNumeroAoQuadrado = (int) Math.pow(meuNumero, 2);
//		int meuNumeroAoCubo = (int) Math.pow(meuNumero, 3);
//
//		System.out.println(meuNumero + " ao quadrodo é: " + meuNumeroAoQuadrado);
//		System.out.println(meuNumero + " ao cubo é: " + meuNumeroAoCubo);

		int minimoNumeroInt = (int) Math.pow(-2, 31);
		int maximoNumeroInt = (int) (Math.pow(2, 31)-1);
		System.out.println("O valor minimo de int é "+minimoNumeroInt+" e o valor máximo é "+maximoNumeroInt);
		
		long minimoNumeroLong = (long) Math.pow(-2, 63);
		long maximoNumeroLong = (long) (Math.pow(2,  63)-1);
		System.out.println("O valor minimo de long é "+minimoNumeroLong+" e o valor maximo é "+maximoNumeroLong);
		int minimoShort = 32768;
		if (-minimoShort == -32768) {
			System.out.println("Eu to doido e o wesley ta certo");
		}
	}
}
