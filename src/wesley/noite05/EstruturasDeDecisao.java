package wesley.noite05;

import java.util.Scanner;

public class EstruturasDeDecisao {
	public static void main(String[] args) {
		System.out.print("Digite um número: ");
		int nota = (new Scanner(System.in)).nextInt();
		if ( nota == 10) {
			System.out.print("Aprovado com mérito");
		} else if (nota >= 7) {
			System.out.print("Aprovado");
		} else if (nota >= 4) {
			System.out.print("Recuperação");
		} else if (nota >= 1) {
			System.out.print("Reprovado");
		} else {
			System.out.print("Expulso do Colégio");
		}
			
		
	}
}
