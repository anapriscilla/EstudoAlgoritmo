/*
 Necessário mostrar o nome da escola, a primeira nota,
 segunda nota, impriir a média e o aproveitamento.
 A entre 10 e 9, B entre 8.9 e 8, C entre 7.9 e 7, D entre 6.9 e 6,
 E entre 5.9 e 5, F abaixo de 5.
 */
package EstruturaCondicional;

import java.util.Scanner;

/**
 *
 * @author ana priscilla
 */
public class AproveitAluno {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        //variaveis
        double n1, n2, media, aprov = 0;
        //título
        System.out.println("------------------------------");
        System.out.println("     ESCOLA VIVER FELIZ      ");
        System.out.println("------------------------------");
        //entrada de dados
        System.out.print("Primeira nota: ");
        n1 = leia.nextDouble();
        System.out.print("Segunda nota: ");
        n2 = leia.nextDouble();
        //processamento
        System.out.println("------------------------------");
        media = (n1 + n2) / 2;
        System.out.println("MÉDIA: " + media);
        //saída de dados
        if (media >= 9) {
            System.out.println("APROVEITAMENTO: A");
        } else if ((media <= 8.9) && (media >= 8)) {
            System.out.println("APROVEITAMENTO: B");
        } else if ((media <= 7.9) && (media >= 7)) {
            System.out.println("APROVEITAMENTO: C");
        } else if ((media <= 6.9) && (media >= 6)) {
            System.out.println("APROVEITAMENTO: D");
        } else if ((media <= 5.9) && (media >= 5)) {
            System.out.println("APROVEITAMENTO: E");
        } else {
            System.out.println("APROVEITAMENTO: F (ABAIXO DA MÉDIA)");
        }
    }
}
