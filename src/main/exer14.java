package exerestruturaderepeticao.exerestruturaderepeticao;

import java.util.Scanner;

/**
 *
 * @author Barbara
 */
public class exer14 {
    public static void main(String[] args) {
        /* . Faça um programa que leia um número natural N e calcule a soma abaixo (lembre-se de que tanto as divisões
quanto o resultado devem ser decimais). Utilize o laço que lhe for mais conveniente. */
        
        Scanner input = new Scanner(System.in);
        
        int n;
        float resultadoDiv, total = 1, n2, divisao;
        System.out.println("Digite um número: ");
        n = input.nextInt();
         for(int i = 1; i < n; i++){
             divisao = i * n;
             n2 = 2 * n + 1;
             resultadoDiv = divisao / n2;
             total = total + resultadoDiv;
             }
         System.out.println("O resultado é: " + total);
         }
    }

