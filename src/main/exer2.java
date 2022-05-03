package exerestruturaderepeticao.exerestruturaderepeticao;

import java.util.Scanner;

/**
 *
 * @author Barbara
 */
public class exer2 {
    public static void main(String[] args) {
        /* Faça um programa que leia um número N do usuário, some todos os números inteiros de 1 a N, e mostre o
resultado obtido. Use o laço WHILE */
        
        Scanner input = new Scanner(System.in);
        
        int numeroN, soma = 0, i = 0;
        System.out.printf("Digite um número até 100: \n");
            numeroN = input.nextInt();
                                  
        while(i < numeroN){
            i++;
            soma = soma + i;
       }     
            System.out.println("O resultado é de: " + soma);                 
    }
    
}
                                      // FEITO //