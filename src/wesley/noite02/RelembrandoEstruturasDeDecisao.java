package wesley.noite02;

public class RelembrandoEstruturasDeDecisao {
	public static void main(String[] args) {
		int numeroParImpar = 770;
		System.out.println(4 % 2);
		System.out.println(13 % 10);
		System.out.println(9 % 4);
		if (numeroParImpar % 2 == 0) {
			System.out.println("Este número é par");
		} else if (numeroParImpar % 2 != 0) {
			System.out.println("Este número é ímpar");
		}

		char key = 'a';
		switch (key) {
		case 'W':
			System.out.println("move para frente");
			break;
		case 'S':
			System.out.println("move para trás");
			break;
		case 'D':
			System.out.print("move para a direita");
			break;
		case 'A':
			System.out.println("move para a esquerda");
			break;
		case '1':
			System.out.println("Arma primária");
			break;
		case '2':
			System.out.println("Arma secundaria");
			break;
		case '3':
			System.out.println("Arma branca");
			break;
		case '4':
			System.out.println("Granada");
			break;
		default:
			System.out.println("Tecla inválida");
			break;
		}
		
		
	}
}
