package exerestruturaderepeticao.exerestruturaderepeticao;

import java.util.Scanner;

public class exer21 {
    public static void main(String[] args) {
        /* Na matemática, um número perfeito é um número inteiro para o qual a soma de todos os seus divisores
positivos próprios (excluindo ele mesmo) é igual ao próprio número. Por exemplo o número 6 é perfeito,
pois 1+2+3 é igual a 6. Sua tarefa é escrever um programa que imprima se um determinado número é
perfeito ou não. Utilize o laço que lhe for mais conveniente. */             
        
        Scanner input = new Scanner(System.in);
        
        int numeroPer, numeroNP, soma;
        System.out.println("Digite a quantidade de vezes que deseja repetir, \n"
                + "Em seguida digite o número: " );
        numeroPer = input.nextInt();
        
        for(int i = 0; i < numeroPer; i++) {
            
        	soma = 0;
        	numeroNP = input.nextInt();
        	for(int x = 1; x < numeroNP; x++) {
                if(numeroNP % x == 0) soma += x;
        	}
        	if (soma == numeroNP){ 
                    System.out.println(numeroNP + " é perfeito");
                }
        	else System.out.println(numeroNP + " não é perfeito");
        }  
    }
}    
