package exerestruturaderepeticao.exerestruturaderepeticao;

import java.util.Scanner;

/**
 *
 * @author Barbara
 */
public class exer16 {
    public static void main(String[] args) {
        /* Leia um valor inteiro N. Este valor será a quantidade de valores que serão lidos em seguida do usuário.
Para cada valor lido, mostre uma mensagem em português dizendo se este valor lido é par (PAR), ímpar
(ÍMPAR), positivo (POSITIVO) ou negativo (NEGATIVO). No caso do valor ser igual a zero (0), seu programa
deverá imprimir apenas NULO. Utilize o laço DO-WHILE. */
        
        Scanner input = new Scanner(System.in);
        
        int valorN, i = 0;
         System.out.println("Digite a quatidade de repetição: ");
            i = input.nextInt();
        do{
            System.out.println("Digite um valor: ");
            valorN = input.nextInt();
                       
            if(valorN % 2 == 0){
                System.out.println("PAR");
            }else{
                System.out.println("ÍMPAR"); 
            }
            if(valorN > 0){
                System.out.println("O VALOR LIDO É POSITIVO");
            }else if(valorN < 0){
                System.out.println("O VALOR LIDO É NEGATIVO");
            }else if(valorN == 0){
                System.out.println("NULO");
            }
        i--;
        }while(i > 0);      
      }
}                      
                                                // FEITO //        