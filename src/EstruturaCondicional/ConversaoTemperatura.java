/*
 Converter graus celsius para Fahrenheit
 */
package EstruturaCondicional;

import java.util.Scanner;

/**
 *
 * @author ana priscilla
 */
public class ConversaoTemperatura {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        //declaração de variaveis
        double f, c;

        //Entrada de dados
        System.out.println("Qual é a temperatura aqui? ");
        f = leia.nextDouble();

        ///processamento
        c = (f - 32) / 1.8;

        //dados de saida
        System.out.println("A temperatura é: " + c);
    }
}
