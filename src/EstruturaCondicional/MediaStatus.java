/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstruturaCondicional;

/**
 *
 * @author ana priscilla
 */
import java.util.Scanner;

public class MediaStatus {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        //Declaração de Variaveis
        double n1, n2, media;

        //Dados de Entrada
        System.out.println("------------------");
        System.out.println("ESCOLA APRENDIZ");
        System.out.println("------------------");
        System.out.print("Primeira nota: ");
        n1 = leia.nextDouble();
        System.out.print("Segunda nota: ");
        n2 = leia.nextDouble();

        //Processamento
        media = (n1 + n2) / 2;

        //Dados de Saída
        //Condicional Aninhada - if/else aninhados
        if (media >= 7) {
            System.out.println("------------------");
            System.out.println("Média: " + media);
            System.out.println("Aluno Aprovado");
            System.out.println("------------------");
        } else if (media >= 5 && media < 7) {
            System.out.println("Aluno em Recuperação");
            System.out.println("------------------");
        } else {
            System.out.println("Aluno Reprovado");
            System.out.println("------------------");
        }
    }
}
