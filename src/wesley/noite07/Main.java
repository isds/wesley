package wesley.noite07;

import wesley.noite07.oo.Cavalo;
import wesley.noite07.oo.Galinha;
import wesley.noite07.oo.Pato;

public class Main {
	public static void main(String[] args) {
		System.out.println("CAVALO");
		Cavalo cavalo = new Cavalo();
		cavalo.comer();
		cavalo.reproduzir();
		
		System.out.println("\nGALINHA");
		Galinha galinha = new Galinha();
		galinha.comer();
		galinha.reproduzir();
		galinha.voar();
		
		System.out.println("\nPATO");
		Pato pato = new Pato();
		pato.comer();
		pato.reproduzir();
		pato.voar();
	}
}
