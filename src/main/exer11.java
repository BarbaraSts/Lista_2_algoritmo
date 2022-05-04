package exerestruturaderepeticao.exerestruturaderepeticao;

import java.util.Scanner;

public class exer11 { 
    public static void main(String[] args) {
        /* Faça um programa que leia um número natural N e calcule a soma abaixo (lembre-se de que tanto as divisões
quanto o resultado devem ser decimais). Utilize o laço que lhe for mais conveniente. */
                
        Scanner grava = new Scanner(System.in);
        
        double s, aux = 0;
        int n;
        System.out.println("Digite um número: ");
        n = grava.nextInt();
        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                s = (double) 1 / i;
                aux = (double) aux - s;
            }else{
                s = (double) 1 / i;
                aux = (double) aux + s;
            }
            }
        System.out.println("" + aux);
        }       
    }
