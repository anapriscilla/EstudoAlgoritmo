/*
 Utilizando o Switch CASE com algoritmo de estrutura condicional
 para o exercicio de Dependentes de Funcionarios

 */
package EstruturaCondicional;

import java.util.Scanner;

/**
 *
 * @author ana priscilla
 */
public class DependentesFuncionario {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //variaveis
        String nome;
        double sal, nsal;
        int dep;
        //entrada de dados
        System.out.print("Qual o nome do Funcionário? ");
        nome = input.nextLine();
        System.out.print("Qual o salário do Funcionário? ");
        sal = input.nextDouble();
        System.out.print("Qual é a quantidade de dependentes? ");
        dep = input.nextInt();
        //saída de dados
        switch (dep) {
            case 0:
                nsal = sal + (sal * 5 / 100);
                break;
            case 1:
            case 2:
            case 3:
                nsal = sal + (sal * 10 / 100);
                break;
            case 4:
            case 5:
            case 6:
                nsal = sal + (sal * 15 / 100);
                break;
            default:
                nsal = sal + (sal * 18 / 100);
                break;
        }
        System.out.println("O novo salário de " + nome + " sera de R$: " + nsal);
    }

}
