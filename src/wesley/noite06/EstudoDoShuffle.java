package wesley.noite06;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EstudoDoShuffle {
	public static void main(String[] args) {
		List<Integer> numeroVariados = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
				20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45,
				46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60);
		Collections.shuffle(numeroVariados);
		System.out.println(numeroVariados.get(0) + " - " + numeroVariados.get(1) + " - " + numeroVariados.get(2) + " - " 
		+ numeroVariados.get(3) +  " - " + numeroVariados.get(4) + " - " + numeroVariados.get(5));

//		int a = 1;
//		Integer aWrapper = 1;
//		short b = 1;
//		Short bWrapper = 1;
//		double c = 2D;
//		Double cWrapper = 2D;
//		float d = 2f;
//		Float dWrapper = 2f;
//		long e = 219009821309L;
//		Long eWrapper = 219009821309L;
	}
}

