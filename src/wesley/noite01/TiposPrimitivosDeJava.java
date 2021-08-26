package wesley.noite01;


public class TiposPrimitivosDeJava {
	public static void main(String[] args) {
		// Tipos de dados primários
		
		// Número inteiros
		byte oitoBits = 99; // 8 bits
		short inteiroCurto = 9999; // 16 bits
		int inteiro = 999999999; // 32 bits
		long inteiroGrande = 999999999999999999L; // 64 bits
	
		// Números decimais
		// Números de ponto flutuante
		float numeroDecimal = 9999999.99F; // 32 bits
		double duasVezesFloat = 999999999999999.999D;
		
		// Tipos de texto
		char letraW = 'W';
		char letraE = 'e';
		char letraS = 's';
		char letraL = 'l';
		char letraY = 'y';
		
		// String não é um tipo primitivo
		String nome  = "\nWesley";
		
		System.out.print(letraW);
		System.out.print(letraE);
		System.out.print(letraS);
		System.out.print(letraL);
		System.out.print(letraE);
		System.out.print(letraY);

		System.out.println(nome);
		
		boolean oCeuEhAzul = true;
		boolean oSolEhVerde = false;
	}
}
