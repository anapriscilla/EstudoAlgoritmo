/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstruturaRepeticao;

import java.util.Scanner;

/**
 *
 * @author ana priscilla
 */
public class Cont10 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        //variaveis
        int contador, valor;

        //
        contador = 0;
        System.out.print("Quer contar até quanto?");
        valor = leia.nextInt();

        while (contador <= valor) {
            System.out.println(contador);
            contador = contador + 1;
        }
        System.out.println("Terminei de contar");
    }
}
