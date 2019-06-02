/*
 Criança Esperança
 */
package EstruturaCondicional;

import java.util.Scanner;

/**
 *
 * @author ana priscilla
 */
public class CriancaEsperanca {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //variaveis
        int d;
        double valor = 0;
        System.out.println("----------------------------------");
        System.out.println("       CRIANÇA ESPERANÇA       ");
        System.out.println("----------------------------------");
        System.out.println("Escolha uma Opção e \nFAÇA UMA CRIANÇA FELIZ!");
        System.out.println("[1] para doar R$10 ");
        System.out.println("[2] para doar R$25 ");
        System.out.println("[3] para doar R$50 ");
        System.out.println("[4] para doar outros valores ");
        System.out.println("[5] para cancelar ");
        System.out.print("Digite a OPÇÃO desejada: ");
        d = input.nextInt();
        switch (d) {
            case 1:
                valor = 10;
                break;
            case 2:
                valor = 25;
                break;
            case 3:
                valor = 50;
                break;
            case 4:
                System.out.print("Qual o valor da doação? R$: ");
                valor = input.nextInt();
                break;
            case 5:
                valor = 0;
                System.out.println("Sua Doação foi CANCELADA!");
                break;
            default:
                System.out.println("Opção não encontrada!");
        }
        System.out.println("----------------------------------");
        System.out.println("SUA DOAÇÃO FOI DE R$: " + valor);
        System.out.println("MUITO OBRIGADO POR AJUDAR");
        System.out.println("----------------------------------");

    }
}
