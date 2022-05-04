package exerestruturaderepeticao.exerestruturaderepeticao;

import java.util.Scanner; 

/**
 *
 * @author Barbara
 */
public class exer12 {
    public static void main(String[] args) {
        /* Faça um programa que leia um número natural N e calcule a soma abaixo (lembre-se de que tanto as divisões
quanto o resultado devem ser decimais). Utilize o laço que lhe for mais conveniente. */
        
        Scanner input = new Scanner(System.in);
        
        float n, x = 0;
        System.out.println("Digite um número: ");
        n = input.nextInt();
        for(float i = 1; i <= n; i++){
            if (i == 1) {
                float var = i/n;
                x += var;
               
            }else{
            float conta = i / (n - i - 1);
            x += (float)conta;
                System.out.println(x);
        }
        
    }
        System.out.printf("A soma é de: %.3f",x);
}  
}