package exerestruturaderepeticao.exerestruturaderepeticao;

import java.util.Scanner;

/**
 *
 * @author Barbara
 */
public class exer18 {
    public static void main(String[] args) {
        /* A seguinte sequência de números 0, 1, 1, 2, 3, 5, 8, 13, 21... é conhecida como série de Fibonacci. Nessa
sequência, cada número, depois dos 2 primeiros, é igual à soma dos 2 anteriores. Escreva um algoritmo que
leia um inteiro N (onde N < 46) e mostre os N primeiros números dessa série. Utilize o laço que lhe for mais
conveniente. */
        
        Scanner input = new Scanner(System.in);
        
        
        int nInteir0, x, y = 0, z = 1;
        System.out.println("Digite um número: ");
        nInteir0 = input.nextInt();
        
        for(int i = 1; i < nInteir0; i++){
            if(i == nInteir0){
                System.out.println(y);
            }else{
                System.out.println("" + y);
                x = y + z;
                y = z;
                z = x;
            }
        }
    }
}
                                                            // FEITO //