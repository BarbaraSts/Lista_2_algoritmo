package exerestruturaderepeticao.exerestruturaderepeticao;

import java.util.Scanner;

/**
 *
 * @author Barbara
 */
public class exer17 {
    public static void main(String[] args) {
        /* Ler um número inteiro N e calcular e imprimir todos os seus divisores. Exemplo: para o número 6, temos os
seguintes divisores 1, 2, 3, 6. Utilize o laço que lhe for mais conveniente. */
        
        Scanner input = new Scanner(System.in);
        int numeroN = 0, i;
        System.out.println("Digite um número: ");
            numeroN = input.nextInt();
        for(i = 1; i <= numeroN; i++){
            if(numeroN % i == 0){
                System.out.println("Os divisores de " + numeroN + " é " + i);
            }
        }
    }   
}
                                             // FEITO //