/*
 Faça um programa, que indique se a pessoa é apto ou não para dirigir,
 é preciso ter acima de 18 anos para ser apto.
 */
package EstruturaCondicional;

/**
 *
 * @author ana priscilla
 */
import java.util.Scanner;

public class AptoaDirigir {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        //Declaração de Variaveis
        int ano, nasc, idade;

        //Entrada de Dados
        System.out.println("------------------------------");
        System.out.println("DEPARTAMENTO DE TRÂNSITO");
        System.out.println("------------------------------");
        System.out.print("Ano Atual (yyyy): ");
        ano = leia.nextInt();
        System.out.print("Ano de Nascimento (yyyy): ");
        nasc = leia.nextInt();

        //processamento
        idade = ano - nasc;

        System.out.println("--------- STATUS ---------");
        if (idade >= 18) {
            System.out.println("Idade: " + idade + " anos");
            System.out.println("Apto a Dirigir!");
            System.out.println("-------------------------");
            System.out.println("");
        } else {
            System.out.println("Idade: " + idade + "anos");
            System.out.println("Não está Apto a Dirigir!");
            System.out.println("-------------------------");
            System.out.println("");
        }
    }

}
