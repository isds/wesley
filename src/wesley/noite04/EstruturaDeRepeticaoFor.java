package wesley.noite04;

import java.util.Scanner;

public class EstruturaDeRepeticaoFor {
	public static void main(String[] args) {
// 		while - > enquanto 
// 		do while -> faça enquanto
// 		for -> para
		
//		for(int i = 0; i < 10; i++) {
//			System.out.println(i);
//		}
		
//		for(int i = 0; i < 1001; i++) {
//			if (i % 2 == 0)
//				System.out.println(i);
//		}
//		for(int i = 0; i < 1001; i++) {
//			if(i % 5 == 0)
//				System.out.println(i);
//		}
		
		Scanner sc  = new Scanner(System.in);
		float n = sc.nextFloat();

		for(int i = 0; i < n; i++) {
			if(i % 2 == 0 && i > 0)
				System.out.println(i);
		}
		
	}
}
