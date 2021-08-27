package wesley.noite02;

import java.util.Scanner;

public class MinhaCalculadora {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner é uma classe que consegue ler do teclado

//		System.out.print("Digite seu nome: ");
//		String nome = sc.nextLine(); // nextLine() para ler um texto
//		
//		System.out.print("Digite sua idade: ");
//		int idade = sc.nextInt(); // nextInt para ler um inteiro
//
//		System.out.print("Digite sua altura: ");
//		float altura = sc.nextFloat();
//		
//		System.out.println("Oi " + nome + ", você tem " + idade);

		System.out.print("Qual operação aritimética deseja fazer?");
		System.out.print("\n\t [A]dição\n\t [S]ubtração\n\t [M]ultiplicação\n\t [D]ivisão");
		String operacao = sc.nextLine();
		System.out.println("VocÊ escolheu a opção " + operacao);

		System.out.print("Digite o valor de X: ");
		int a = sc.nextInt();
		System.out.print("Digite o valor de Y: ");
		int b = sc.nextInt();

		if (operacao.equals("A")) {
			int adicao = a + b;
			System.out.print("O resultadao desta operação é: " + adicao);
		} else if (operacao.equals("S")) {
			int subtracao = a - b;
			System.out.print("O resultado desta operação é: " + subtracao);
		} else if (operacao.equals("M")) {
			int mult = a * b;
			System.out.print("o resultado desta operação é: " + mult);
		} else if (operacao.equals("D")) {
			int div = a / b;
			System.out.print("O resultado desta operação é: " + div);
		} else { 
//			if (!operacao.equals("A") && !operacao.equals("S") && !operacao.equals("D") && !operacao.equals("M")) {
			System.out.print("Esta operação é inválida");
		}

	}

}
