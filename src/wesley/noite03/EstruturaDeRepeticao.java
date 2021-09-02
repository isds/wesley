package wesley.noite03;

import java.util.Scanner;

public class EstruturaDeRepeticao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro");
		int n = sc.nextInt();
		int x = n + 3;
		int y = x % 2;
		
		while (y != 0) {
			System.out.println("Resultado ímpar, tente denovo!");
			System.out.println("Digite novamente um numero inteiro");
			n = sc.nextInt();
			x = n + 3;
			y = x % 2;
		}
		
		System.out.println("Parabens infeliz, o resultado deu par");
		
	}
	
}
//for -> para 
// while -> enquanto 
// do while -> faça enquanto