package wesley.noite03;

public class While {
	public static void main(String[] args) {
//		int index = 0;
//		while (index < 11) {
//			System.out.println("O valor atual é " + index);
//			index = index + 1;
//		}
		System.out.println("Wesley Paulino de Andrade".charAt(0));
		System.out.println("Wesley Paulino de Andrade".charAt(10));
		System.out.println("Wesley Paulino de Andrade".charAt(11));
		
		int j = 1;
		
		System.out.println(j++); // executa depois soma
		
		System.out.println(j);
		
		System.out.println(++j);  // soma depois executa
//			i += 1; i -= 1; i *= 1; i /= 1;
//			i++; i--;
//			++i; --i;
		
		int i = 0;
		String nome = "Ítalo Souza";
		while (!(nome.charAt(i) == 'w')) {
			i++;
		}
//		[1, 2, 3] -> 
		System.out.println("'z' está na posição " + (i + 1));
	}
}
