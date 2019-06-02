/*
 Bianca vai viajar e precisa comprar dolares.
 */
package EstruturaCondicional;

import java.util.Scanner;

/**
 *
 * @author ana priscilla
 */
public class RealpDolar {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        //declaração de variaveis
        double reais, dolar;

        //dados de entrada
        System.out.println("O valor que tenho em real? : ");
        reais = leia.nextDouble();

        //processamento
        dolar = reais / 2.22;

        //dados de saída
        System.out.println("O valor que tenho em US$ é: " + dolar);
    }
}
