package exerestruturaderepeticao.exerestruturaderepeticao;

import java.util.Scanner;

/**
 *
 * @author Barbara
 */
public class exer3 {
    public static void main(String[] args) {
        /* Escreva um programa que leia um conjunto de 10 números inteiros positivos. Seu programa deve determinar
e imprimir o maior deles. Use o laço FOR */
        
        Scanner input = new Scanner(System.in);
        
        int conjuntoNum, soma = 0, sequencia = 1;       
        for(int i = 0; i < 10; i++){
        System.out.println("Digite o " + sequencia + "º número: ");
        conjuntoNum = input.nextInt();
            sequencia++;
        if(conjuntoNum > soma){
            soma = conjuntoNum;
        }
        System.out.println("O valor maior é: " + soma);
      }
   }
}
                                             // FEITO //