/*
 Bianca está confusa sobre a sua idade, ela vai fazer aniversário
 e não sabe quantos anos irá fazer!
 */
package EstruturaCondicional;

import java.util.Scanner;

/**
 *
 * @author ana priscilla
 */
public class Aniversario {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        //declarando variaveis
        int idade, ano_atual, ano_nasc;

        //entrada de dados
        System.out.println("Em que ano nós estamos? ");
        ano_atual = leia.nextInt();
        System.out.println("Em que ano nasci? ");
        ano_nasc = leia.nextInt();

        //processamento
        idade = ano_atual - ano_nasc;

        //saida de dados
        System.out.println("Minha idade é " + idade + " anos!");
    }

}
