/*
 Somador Númerico
 */
package EstruturaRepeticao;

import java.util.Scanner;

/**
 *
 * @author ana priscilla
 */
public class SomadorNumerico {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        //variaveis
        int cont, n, soma;

        //contador
        cont = 1;
        soma = 0;

        //dados de entrada
        while (cont <= 5) {
            System.out.print("Digite o " + cont + "º valor: ");
            n = leia.nextInt();
            soma = soma + n;
            cont = cont + 1;
        }

        System.out.println("A soma de todos os valores foi: " + soma);
    }
}
