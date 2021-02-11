package exercicios_capacitacao;

import java.util.Scanner;

public class Ex1 {
	public void verificaIdade() {
		Scanner in = new Scanner(System.in);
		System.out.println("Informe a idade: ");
		int idade = in.nextInt();
		if(idade < 18) {
			System.out.println("Idade: "+idade+"\nMenor de idade!");
		}else{
			System.out.println("Idade: "+idade+"\nMaior de idade!");
		}
	}
}
