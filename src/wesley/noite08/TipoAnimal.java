package wesley.noite08;

public enum TipoAnimal {
	PATO(1),
	GALINHA(2),
	PARDAL(3),
	MARRECO(4),
	BEM_TE_VI(5);
			
	public final int valor;
	private TipoAnimal(int codigo) {
		this.valor = codigo;
	}
}
