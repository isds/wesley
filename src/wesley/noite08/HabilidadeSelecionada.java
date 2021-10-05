package wesley.noite08;

import java.util.Scanner;

public class HabilidadeSelecionada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual ave você deseja ser?");
		System.out.println("\t1- Pato");
		System.out.println("\t2- Galinha");
		System.out.println("\t3- Pardal");
		System.out.println("\t4- Marreco");
		
		var opcaoSelecionada = sc.nextShort();
		
		if (opcaoSelecionada == TipoAnimal.PATO.valor) {
			System.out.println("Você agora é uma Pato Quachador");
		}
		if (opcaoSelecionada == TipoAnimal.GALINHA.valor) {
			System.out.println("Agora você é uma Galinha Ciscadora");
		}
		if (opcaoSelecionada == TipoAnimal.PARDAL.valor) {
			System.out.println("Agora você é um Pardal Pidão");
		}
		if (opcaoSelecionada == TipoAnimal.MARRECO.valor) {
			System.out.println("Agora você é um Marreco Estressado");
		}
		if (opcaoSelecionada == TipoAnimal.BEM_TE_VI.valor) {
			System.out.println("Agora você é um BemTeVi Amarelo");
		}
		
		System.out.println("Agora escolha o que você deseja fazer:");
		System.out.println("\tw- Andar para Frente");
		System.out.println("\ta- Andar para Esquerda");
		System.out.println("\ts- Andar para Tras");
		System.out.println("\td- Andar para Direita");
		System.out.println("\tc- Comer");
		System.out.println("\tv- Voar");
		
		char teclaSelecionada = sc.next().charAt(0);
		
		if (teclaSelecionada == TeclaSelecionada.FRENTE.codigo) {
			System.out.println("Andou para frente!");
		}
		if (teclaSelecionada == TeclaSelecionada.TRAS.codigo) {
			System.out.println("Andou para tras!");
		}
		if (teclaSelecionada == TeclaSelecionada.DIREITA.codigo) {
			System.out.println("Andou para direita!");
		}
		if (teclaSelecionada == TeclaSelecionada.ESQUERDA.codigo) {
			System.out.println("Andou para esquerda!");
		}
		if (teclaSelecionada == TeclaSelecionada.VOAR.codigo) {
			System.out.println("Voando e dando razantes!");
		}
		if (teclaSelecionada == TeclaSelecionada.COMER.codigo) {
			System.out.println("Comendo até pedra!");
		}
	}
}
