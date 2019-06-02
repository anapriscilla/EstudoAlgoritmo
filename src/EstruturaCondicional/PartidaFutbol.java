/*
 Mostrar no titulo Time1 x tim2, diferença de gols
 e mostrar a diferença e o status.Algoritmo para analise de jogos de futbol.
 Pode-se utilizar if ou switch
 */
package EstruturaCondicional;

import java.util.Scanner;

/**
 *
 * @author ana priscilla
 */
public class PartidaFutbol {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //variaveis
        int time1, time2, diferenca;
        //titulo
        System.out.println("     TIME 1 X TIME 2     ");
        System.out.println("-------------------------");
        //entrada de dados
        System.out.print("Quantos gols do TIME 1: ");
        time1 = input.nextInt();
        System.out.print("Quantos gols do TIME 2: ");
        time2 = input.nextInt();
        System.out.println("-------------------------");

        //processamento
        diferenca = time1 - time2;

        //tratativa para não dar NEGATIVO durante a conta do processamento
        if (diferenca < 0) {
            diferenca = diferenca * (-1);
        }
        //fim da tratativa

        System.out.println("DIFERENÇA: " + diferenca);
        //saída de dados
        if (diferenca == 0) {
            System.out.println("STATUS: EMPATE");
        } else if (diferenca >= 3) {
            System.out.println("STATUS: GOLEADA");
        } else {
            System.out.println("STATUS NORMAL");
        }
        System.out.println("-------------------------");
    }

}
