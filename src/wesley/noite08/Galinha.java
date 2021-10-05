package wesley.noite08;

public class Galinha extends Ave {
	public void voar() {
		System.out.println("Voando como posso");
	}

	public Ave reproduzir(Animal parceiroReprodutor) {
		return new Galinha();
	}
}
