package wesley.noite02;

import java.util.Scanner;

public class CalculadoraImc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite sua altura em metros\n");
		float alt = sc.nextFloat();
		System.out.print("Digite seu peso em Kg\n");
		float peso = sc.nextFloat();
		float imc = peso / (alt * alt);
		System.out.println("Seu IMC é: " + imc);

		if (imc < 18.5) {
			System.out.println("Você está abaixo do peso normal");
		} else if (imc >= 18.5 && imc < 25) {
			System.out.println("Você está com peso normal");
		} else if (imc >= 25 && imc < 30) {
			System.out.println("Você está com excesso de peso");
		} else if (imc >= 30 && imc < 35) {
			System.out.println("Você está com obesidade classe I");
		} else if (imc >= 35 && imc < 40) {
			System.out.println("Você está com obesidade classe II");
		} else if (imc >= 40) {
			System.out.println("Você está com obesidade classe III");
		}

	}
}
