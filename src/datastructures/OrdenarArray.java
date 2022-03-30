package datastructures;

public class OrdenarArray {
	public static void main(String[] args) {

		// 8, 7, 15, 2
		// i = 0 vi 8 j = 1 vj 7 -> vi 7 vj 8 *
		// 7, 8, 15, 2
		// i = 0 vi 7 j = 2 vj 15 -> vi 7 vj 15
		// 7, 8, 15, 2
		// i = 0 vi 7 j = 3 vj 2 -> vi 2 vj 7 *
		// 2, 8, 15, 7
		// i = 1 vi 8 j = 2 vj 15 -> vi 8 vj 15
		// 2, 8, 15, 7
		// i = 1 vi 8 j = 3 vj 7 -> vi 7 vj 8
		// 2, 7, 15, 8
		// i =2 vi 15 j =3 vj 8 -> vi 8 vj 15
		// 2, 7, 8, 15

		// i do primeiro até penultimo indice
		// j do i + 1 até o ultimo indice

		int[] numeros = new int[] { 15, 8, 7, 16, 88, 90, 75, 10, 20, 35, 22, 21, 5, 68, 50, 51, 54, 90, 100, 12 };
		
		for (int i = 0; i < (numeros.length - 1); i++) {
			for(int j = i + 1; j < numeros.length; j++) {
				int valorAux;
				if (numeros[i] > numeros[j]) {
					valorAux = numeros[i];
					numeros[i] = numeros[j];
					numeros[j] = valorAux;
				}
			}
		}
		
		for (int i=0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}
}
