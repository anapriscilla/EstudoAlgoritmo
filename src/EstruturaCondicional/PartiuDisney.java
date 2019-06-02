/*
 Dependendo da quantidade de dinheiro é possível ou não visitar a
 disney, a familia ou nem sair em viagem
 */
package EstruturaCondicional;

/**
 *
 * @author ana priscilla
 */
import java.util.Scanner;

public class PartiuDisney {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        //Declaração de Variaveis
        double dinheiro;

        //Entrada de Dados
        System.out.println("-----------------------------");
        System.out.println("---------- VIAGEM ----------");
        System.out.println("-----------------------------");
        System.out.print("Quanto de dinheiro você tem? ");
        dinheiro = leia.nextDouble();

        //Saída de Dados
        if (dinheiro >= 10000) {
            System.out.println("Partiu Disney");
            System.out.println("-----------------------------");
        } else if (dinheiro >= 5000 && dinheiro < 10000) {
            System.out.println("Visitar Família");
        } else {
            System.out.println("#chateado");

        }

    }
}
