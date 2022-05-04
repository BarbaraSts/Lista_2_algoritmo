package exerestruturaderepeticao.exerestruturaderepeticao;

import java.util.Scanner;

public class exer15 {
    public static void main(String[] args) {
        /* Faça um programa que leia um número inteiro N maior do que zero e calcule o fatorial desse número.
Fatorial de N é representado por N! e calculado da seguinte maneira:
Utilize o laço que lhe for mais conveniente. */
        
        Scanner input = new Scanner(System.in);
        
        int numeroIn, fatorial = 1, i = 1;
        System.out.println("Digite um número: ");
        numeroIn = input.nextInt();
      
        while(i <= numeroIn){
            fatorial = fatorial * i;
            i++;
        }
        System.out.printf("%d! = %d", numeroIn, fatorial);
    }
}
