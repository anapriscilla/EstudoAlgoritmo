/*
 Exercício para verificar o melhor aluno e sua nota, dentro de uma classificação.
 */
package EstruturaRepeticao;

import java.util.Scanner;

/**
 *
 * @author ana priscilla
 */
public class MelhorAlunoTurma {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        //variaveis
        int n = 0;
        int cont, valor = 0;
        int maior = 0;
        String aluno = null;
        String melhoraluno = null;

        cont = 1;

        //titulo
        System.out.println("---------------------------------");
        System.out.println("  ESCOLA MODELO DE ENSINO  ");
        System.out.println("---------------------------------");

        //escolha da quantidade de alunos em lista
        //dados de entrada
        while (cont <= 3) {
            System.out.println("ALUNO " + cont);
            System.out.print("Nome do aluno: ");
            aluno = leia.nextLine();
            System.out.print("Nota de " + aluno + ": ");
            n = input.nextInt();
            cont = cont + 1;

            if (n > maior) {
                maior = n;
                melhoraluno = aluno;
            }

            System.out.println("---------------------------------");
        }

        System.out.println("O melhor aproveitamento foi de " + melhoraluno + " com nota " + maior);

    }
}
