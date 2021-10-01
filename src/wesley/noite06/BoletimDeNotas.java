package wesley.noite06;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BoletimDeNotas {
	public static void main (String[] args){
		
		System.out.println("Nome do aluno: ");
		Scanner sc = new Scanner(System.in);
		String nomeAluno = sc.nextLine();
		
		System.out.println("Digite a Nota da Avaliação-01:");
		Scanner scannerNota01 = new Scanner(System.in);
		float nota01 = scannerNota01.nextFloat();
		System.out.println("Digite a Nota da Avaliação-02:");
		Scanner scannerNota02 = new Scanner(System.in);
		float nota02 = scannerNota02.nextFloat();
		System.out.println("Digite a Nota da Avaliação-03:");
		Scanner scannerNota03 = new Scanner(System.in);
		float nota03 = scannerNota03.nextFloat();
		System.out.println("Digite a Nota da Avaliação-04:");
		Scanner scannerNota04 = new Scanner(System.in);
		float nota04 = scannerNota04.nextFloat();
		
		float mediaNotas = ((nota01 + nota02 + nota03 + nota04)/4);
		System.out.println("A média do " + nomeAluno +" é de: " + mediaNotas);
		
		if (mediaNotas == 0) {
			System.out.println("O aluno " + nomeAluno + " está reprovado.");
			
			List<String> frasesDepreciativas = Arrays.asList("Melhora isso daí Zé!" , "Bora estudar fi!");
			Collections.shuffle(frasesDepreciativas);
			System.out.println(frasesDepreciativas.get(0));
		}
		else if(mediaNotas < 4 && mediaNotas > 0) {
			System.out.println("O aluno " + nomeAluno + " está reprovado");
		}
		else if (mediaNotas >= 4 && mediaNotas < 7){
			System.out.println("O aluno " + nomeAluno + " está apto a realizar a prova de recuperação");
			System.out.println("Digite a nota da prova de recuperação: ");
			Scanner scannerRecuperacao = new Scanner(System.in);
			float nota05 = scannerRecuperacao.nextFloat();
			float mediaFinal = (mediaNotas + nota05)/2;
			if (mediaFinal >= 7){
				System.out.println("O aluno " + nomeAluno + " teve a média final: " + mediaFinal + " e está aprovado!");
			} else {
				System.out.println("O aluno " + nomeAluno + " teve a média final: " + mediaFinal + " e está reprovado!");
			}
		} 
		else if(mediaNotas >= 7 && mediaNotas < 10) {
			System.out.println("O aluno " + nomeAluno + " teve média: " + mediaNotas + " e está aprovado");
		} 
		else {
			System.out.println("O aluno " + nomeAluno + " teve média máxima: " + mediaNotas + " e merece ser louvado!");
			
			List<String> frasesMotivacionais = Arrays.asList("Parabéns, continue assim!!!" , "Massa você se garante!!!");
			Collections.shuffle(frasesMotivacionais);
			System.out.println(frasesMotivacionais.get(0));
		}
		
	}
}
	
//	public static void main2(String[] args) {
//		List<String> nomes = Arrays.asList("Ítalo", "Wesley", "Silva", "Paulino", "Souza", "Andrade");
//		String [] nomes = new String [] {"Ítalo", "Wesley", "Silva", "Paulino", "Souza", "Andrade"};
//		System.out.println(nomes);
		
//		System.out.println(nomes.size());
//		System.out.println(nomes.get(0));
//		System.out.println(nomes.get(nomes.size() - 1));

//		System.out.println();
//		Collections.shuffle(nomes);
//		System.out.println(nomes.get(0));
//		System.out.println(nomes);
//		Collections.shuffle(nomes);
//		System.out.println(nomes);
//		Collections.shuffle(nomes);
//		System.out.println(nomes);
//		Collections.shuffle(nomes);
//		System.out.println(nomes);
		
//		for (int index = 0; index < nomes.size(); index++) {			
//			System.out.println(nomes.get(index));
//		}
		

