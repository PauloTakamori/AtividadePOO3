package pincipalAluno;

import java.util.Locale;
import java.util.Scanner;

import dadosAluno.infoAluno;

public class aluno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		infoAluno aluno = new infoAluno();
		System.out.print("Nome: ");
		aluno.nome = sc.nextLine();
		System.out.print("Nota 1: ");
		aluno.nota1 =sc.nextDouble();
		System.out.print("Nota 2: ");
		aluno.nota2 = sc.nextDouble();
		System.out.print("Nota 3: ");
		aluno.nota3 =  sc.nextDouble();

		System.out.println();
		System.out.printf("Nota Final: %.2f", aluno.Media());
		
		if (aluno.Media() < 60) {
			System.out.println(" Reprovado!!!!! ");
			System.out.printf("Faltaram %.2f pontos para passar! ",aluno.pontosFinais());
		}
		else 
			System.out.println(" Aprovado!!!!! ");
		
		
		sc.close();
	}

}
