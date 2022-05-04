package exerestruturaderepeticao.exerestruturaderepeticao;

import java.util.Scanner;

/**
 *
 * @author Barbara
 */
public class exer9 {
    public static void main(String[] args) {
        /* Escreva um programa para ler a quantidade de alunos existentes em uma turma. Depois disso, o programa
deve ler as notas de cada um destes alunos, calcular e mostrar na tela a média aritmética destas notas.
Utilize o laço WHILE. */
        
        Scanner input = new Scanner(System.in);
        
        double nota1, nota2, nota3, media = 0;
        int quantAluno = 0;
        System.out.println("Digite a quantidade de alunos: ");
        quantAluno = input.nextInt();
        
        while(quantAluno > 0){
            System.out.println("Digite a primeira nota: ");
            nota1 = input.nextDouble();
            System.out.println("Digite a segunda nota: ");
            nota2 = input.nextDouble();
            System.out.println("Digite a terceira nota: ");
            nota3 = input.nextDouble();
            
            media = (nota1 + nota2 + nota3) / 3;
            System.out.println("A média aritmética é: " + media);
            quantAluno = quantAluno - 1;
        }                  
    }    
}
                                       // FEITO //