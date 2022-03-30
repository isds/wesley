package datastructures;

public class Arrays {
	public static void main(String[] args) {
		// pedaço contínuo de memoria alocada	
		// ############################################################################################## ##### ###
		int [] array ;
		array = new int [] {1, 3, 4, 5, 7, 10, 45, 89, 23, 11, 45};
	
		System.out.println(array);
		// os limite foi atingido?
		// declara um novo array maior
		// copia os valores para o novo array
		
		// buscar e ordenar 
		int numeroProcurado = 45;
		int menorValor = array[0];
		int maiorValor = array[0];
		
		for (int i = 0; i < array.length; i++) {
			if (numeroProcurado == array[i])
				System.out.println("Encontrei no índice= " + i);
			
			if (array[i]< menorValor ) {
				menorValor = array[i];
			}
			
			if (array[i] > maiorValor) {
				maiorValor = array[i];
			}
		}
		System.out.println("O menor valor encontrado foi: " + menorValor);
		System.out.println("O maior valor encontrado foi: " + maiorValor);
	}
	
	
}
