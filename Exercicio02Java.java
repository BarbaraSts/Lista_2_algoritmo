package aula2;

import java.util.Scanner;
        
/**
 *
 * @author Barbara
 */
public class Exercicio2Java {
    
    public static void main(String[] args) {
        /*Fazer um algoritmo que lê dois números, a base e o expoente, e imprime a potência (base elevada ao
expoente). Dica: use a função matemática Math.pow(). Exemplo: 5 elevado ao cubo ficaria
Math.pow(5, 3). Você pode trocar esses números por variáveis.*/
        
        Scanner sc = new Scanner(System.in);
                System.out.println("Digite o valor da base: ");
                double a = sc.nextDouble();
                System.out.println("Digite o valor do expoente: ");
                double b = sc.nextDouble();
                
                System.out.println("Resultado: " + Math.pow(a, b));
                
    }
    
}
