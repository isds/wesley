package wesley.noite07.oo;

import java.time.LocalDate;

public class Animal {
	LocalDate dataNascimento;
	Integer sexo;
	
	public void comer() {
		System.out.println("Comendo");
	}
	
	public void reproduzir() {
		System.out.println("Reproduzindo");
	}
}
