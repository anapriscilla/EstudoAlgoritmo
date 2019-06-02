/*
 Contar até 10 contador + positivo , crescente 0 até 10
 */
package EstruturaRepeticao;

/**
 *
 * @author ana priscilla
 */
public class Cont10Positivo {

    public static void main(String[] args) {

        //variaveis
        int contador;

        //contador inicializando em 0 para fazer a contagem
        contador = 0;

        /*
         O while se for traduzido para o português, significa "ENQUANTO",
         executada repetidamente uma unica instrução ou bloco delas.
         */
        while (contador <= 10) {
            System.out.println(contador);
            contador = contador + 1;
            /* A variavel contador vai contar através do valor
             que recebeu = 0 + 1 até chegar em 10 (conforme a condição indica)
             */
        }
    }
}
