package wesley.noite03;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int x;
		int y;
		System.out.println("Digite um numero");
		do {
			 n = sc.nextInt();
			 x = n +3;
			 y = x % 2;
			if (y != 0) {
				System.out.println("Digite o numero denovo");
			}
		} while (y != 0);
		
		System.out.println("Parabens, um dia você consegue");
	}	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//		int opcao;
//		boolean isOpcaoSelecionadaValida;
//		do {
//			System.out.println("Cadastro de telefones. Escolha uma opção: ");
//			System.out.println("\t[ 1 ] - Criar");
//			System.out.println("\t[ 2 ] - Editar");
//			System.out.println("\t[ 3 ] - Excluir");
//			System.out.println("\t[ 4 ] - Pesquisar");
//			opcao = scanner.nextInt();
//
//			if (opcao == 1) {
//				System.out.println("CRIANDO UM USUÁRIO");
//				isOpcaoSelecionadaValida = true;
//			} else if (opcao == 2) {
//				System.out.println("EDITANDO UM USUÁRIO");
//				isOpcaoSelecionadaValida = true;
//			} else if (opcao == 3) {
//				System.out.println("EXCLUINDO UM USUÁRIO");
//				isOpcaoSelecionadaValida = true;
//			} else if (opcao == 4) {
//				System.out.println("PESQUISANDO UM USUÁRIO");
//				isOpcaoSelecionadaValida = true;
//			} else {
//				System.out.println("OPCAO INVALIDA");
//				isOpcaoSelecionadaValida = false;
//			}
////		} while (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4);
//		} while (!isOpcaoSelecionadaValida);
//
//	}
//}
