package wesley.noite08.calculadora;

public class Main {
	public static void main(String[] args) {
		int resultado;
		resultado = Calculadora.somar(5, 5);
		System.out.println(resultado);
		
		resultado = Calculadora.diminuir(5, 4);
		System.out.println(resultado);
		
		resultado = Calculadora.multiplicar(1, 10);
		System.out.println(resultado);
		
		resultado = Calculadora.dividir(0, 1);
		System.out.println(resultado);
		/*
		 * abstract  
		 * static 
		 * public 
		 * private
		 * */
	}
}
