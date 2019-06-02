/*
 Converter Moeda / dinheiro
 */
package EstruturaRepeticao;

import java.util.Scanner;

/**
 *
 * @author ana priscilla
 */
public class ConversorMoedas {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        //variaveis
        double r, d, qtvezes = 0;
        int contador;
        contador = 1;
        //entrad de dados
        System.out.print("Quantas vezes você quer converter? ");
        qtvezes = leia.nextInt();
        while (contador <= qtvezes) {
            System.out.print("Qual o valor em R$: ");
            r = leia.nextDouble();
            d = r / 2.20;
            System.out.printf("O valor convertido é US$: %.2f \n", d);
            contador = contador + 1;
        }

    }

}
