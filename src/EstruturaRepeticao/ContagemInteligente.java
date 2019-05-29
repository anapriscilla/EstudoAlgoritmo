/*
 Realizar uma contagem progressiva e outra regressiva
 */
package EstruturaRepeticao;

import java.util.Scanner;

/**
 *
 * @author ana priscilla
 */
public class ContagemInteligente {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        //variaveis
        int inic, fim;

        //titulo
        System.out.println("  CONTAGEM INTELIGENTE  ");
        System.out.println("------------------------");
        System.out.print("Ínicio: ");
        inic = leia.nextInt();
        System.out.print("Fim: ");
        fim = leia.nextInt();

        //subtitulo
        System.out.println("------------------------");
        System.out.println("    C O N T A N D O     ");
        System.out.println("------------------------");

        if (fim > inic) {
            while (inic <= fim) {
                System.out.print(inic + "..");
                inic = inic + 1;
            }
        } else {
            while (inic >= fim) {
                System.out.print(inic + "..");
                inic = inic - 1;
            }
        }
    }
}
