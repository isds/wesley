package wesley.noite08;

import java.time.LocalDate;

public abstract class Animal {
	LocalDate dataNascimento;
	Integer sexo;
	
	public void comer() {
		System.out.println("Comendo");
	}
	
	public void dancar() {
		System.out.println("Estou dançando");
	}
	
	public abstract Animal reproduzir(Animal parceiroReprodutor);
}
