package wesley.noite08;

public class Pardal extends Ave {
	public Ave reproduzir(Animal aveParceira) {
		return new Pardal();
	}
	
	public void voar() {
		System.out.println("Voando bem rápido");
	}
}
