/*
 Somador Númerico mais o adicional de mostrar o maior número digitado
 */
package EstruturaRepeticao;

import java.util.Scanner;

/**
 *
 * @author ana priscilla
 */
public class SomadorNumericoAdicional {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        //variaveis

        int n;
        int menor;
        int cont = 1;
        int soma = 0;
        int maior = 0;

        //dados de entrada
        while (cont <= 5) {
            System.out.print("Digite o " + cont + "º valor: ");
            n = leia.nextInt();
            soma = soma + n;
            if (n > maior) {
                maior = n;
            }
            cont = cont + 1;
        }

        System.out.println("A soma de todos os valores foi: " + soma);
        System.out.println("O maior número digitado foi: " + maior);
    }
}
