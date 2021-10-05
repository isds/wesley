package wesley.noite08;

public enum TeclaSelecionada {
	FRENTE('w'),
	TRAS('s'),
	DIREITA('d'),
	ESQUERDA('a'),
	VOAR('v'),
	COMER('c');
	
	public final char codigo;
		private TeclaSelecionada(char c) {
			this.codigo = c;
	}
	
}
