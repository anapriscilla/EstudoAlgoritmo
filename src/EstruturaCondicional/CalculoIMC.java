/*
 Calculo do Indice de Massa Corporal
 */
package EstruturaCondicional;

/**
 *
 * @author ana priscilla
 */
import java.util.Scanner;

public class CalculoIMC {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        //declaração de variaveis
        double m, a, imc;
        //entrada de dados
        System.out.print("Massa (Kg): ");
        m = leia.nextDouble();
        System.out.print("Altura (m): ");
        a = leia.nextDouble();
        //processamento
        imc = m / (a * a);
        System.out.printf("IMC: %.2f\n", imc);
        if (imc < 16) {
            System.out.println("Muito Abaixo do Peso");
        } else if (imc >= 17 && imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Peso ideal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Sobrepeso");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("Obesidade");
        } else if (imc >= 35 && imc < 40) {
            System.out.println("Obesidade Severa");
        } else {
            System.out.println("Obesidade Morbida");
        }

    }
}
