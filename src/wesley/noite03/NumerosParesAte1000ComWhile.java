package wesley.noite03;

public class NumerosParesAte1000ComWhile {
	public static void main(String[] args) {
//		int n = 0;
//		System.out.println(n);
//		while (n < 1001){
//			n = n + 1;
//			int x = n % 2;
//			if ( x == 0)
//				System.out.println("O numero " + n + " é par");
//		}
		// Esse ta correto
//		int n = 0;
//		System.out.println("O número " + n + " é par");
//		while (n < 1000) {
//			n = n + 2;
//			System.out.println("O número " + n + " é par");
//		}
		
		int m = 0;
		do {
			System.out.println("O número " + m + " é par");
			m += 2;
		}while (m <= 1000);
	}
}
