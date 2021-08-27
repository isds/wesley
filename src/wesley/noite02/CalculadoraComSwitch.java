package wesley.noite02;

import java.util.Scanner;

public class CalculadoraComSwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a operação desejada:\n\t 1 - Adição\n\t 2 - Subtração\n\t 3 - Multiplicação\n\t 4 - Divisão");
		int operacao = sc.nextInt();
		
		System.out.println("Digite o valor de X");
		float valorX = sc.nextFloat();
		System.out.println("Digite o valor de Y");
		float valorY = sc.nextFloat();
		
		switch (operacao) {
		case 1 :
			float adicao = valorX + valorY;
			System.out.println("O resultado é: " + adicao);
			break;
		case 2 :
			float sub = valorX - valorY;
			System.out.println("O resultado é: " + sub);
			break;
		case 3 :
			float mult = valorX * valorY;
			System.out.println("O resultado é: " + mult);
			break;
		case 4 :
			float div = valorX / valorY;
			System.out.println("O resultado é:" + div);
			break;
		default :
			System.out.println("Operação inválida");
			break;
		}
	}

}
