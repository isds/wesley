package wesley.noite08;

import java.util.Scanner;

public class SimuladorAves {
	public static void main(String[] args) {
		System.out.println("Bem vindo ao nosso simulador de aves");
		Ave ave = getPersonagemSelecionado();

		Scanner sc = new Scanner(System.in);
		char teclaDigitada = sc.next().charAt(0);
		
		if (teclaDigitada == '1') {
			ave.voar();
		}
		if (teclaDigitada == '2') {
			ave.comer();
		}
		if (teclaDigitada == '3') {
			ave.reproduzir(new Pato());
		}
	}

	public static Ave getPersonagemSelecionado() {
		System.out.println("Digite a opção desejada: ");
		System.out.println("\t1- Pato");
		System.out.println("\t2- Galinha");
		System.out.println("\t3- Pardal");
		System.out.println("\t4- Marreco");
		
		Scanner sc = new Scanner(System.in);
		var opcaoSelecionada = sc.nextShort();
		
		if (opcaoSelecionada == TipoAnimal.PATO.valor)
			return new Pato();
		if (opcaoSelecionada == TipoAnimal.GALINHA.valor)
			return new Galinha();
		if (opcaoSelecionada == TipoAnimal.PARDAL.valor)
			return new Pardal();
		if (opcaoSelecionada == TipoAnimal.MARRECO.valor)
			return new Marreco();
		if (opcaoSelecionada == TipoAnimal.BEM_TE_VI.valor)
			return new BemTeVi();
		return null;		
	}
}
