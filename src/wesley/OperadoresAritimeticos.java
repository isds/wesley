package wesley;

public class OperadoresAritimeticos {
	public static void main(String[] args) {
		float nota01 = 8f;
		float nota02 = 7.5f;
		float nota03 = 9.1f;
		float nota04 = 6f;
		float totalNotas = nota01 + nota02 + nota03 + nota04;

		float a = (1 + 2 * 5) * 3 / 4;

		System.out.println(totalNotas);
		float mediaNotas = totalNotas / 4;
		System.out.println(mediaNotas);

		if (mediaNotas >= 7) {
			System.out.println("Aprovado");
		} else if (mediaNotas < 7 && mediaNotas >= 4) {
			System.out.println("Recuperação");
		} else if (mediaNotas < 4) {
			System.out.println("Reprovado");
		}

		if (mediaNotas >= 7) {
			System.out.println("Aprovado");
		} else if (mediaNotas >= 5) {
			System.out.println("Recuperação");
		} else if (mediaNotas >= 4) {
			System.out.println("Recuperação se for sorteado");
		} else {
			System.out.println("Reprovado");
		}

		var idade = 17;

		boolean ehMaiorDe18Anos = idade >= 18;
		boolean temComorbidade = false;

		boolean podeSeAgendar = ehMaiorDe18Anos && temComorbidade;

		/*
		 * true && true -> true false && false -> false true && false -> false false &&
		 * true -> false
		 * 
		 * true || false -> true false || true -> true true || true -> true false ||
		 * false -> false
		 * 
		 * > -> maior que >= -> maior que ou igual < -> menor que <= -> menor que ou
		 * igual
		 * 
		 * == -> igual != -> diferente
		 * 
		 * && -> e || -> ou
		 */

	}
}
