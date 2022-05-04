package exerestruturaderepeticao.exerestruturaderepeticao;

import java.util.Scanner;

public class exer6 {
    public static void main(String[] args) {
        /* Faça um programa para ler e escrever dados de uma turma de 5 alunos. O programa deve pedir dados como
nome, idade e sexo. O programa deve imprimir os dados do aluno mais velho. Use o laço DO-WHILE. */
        
        Scanner input = new Scanner(System.in);
        
        String nomeMaisVelho = "";
        String nome,sexo;
        String sexoMaisVelho = "";
        
        int idadeAlu, maisVelho = 0, i = 0;
                
        do{
            System.out.println("Nome: ");
            nome = input.next();
            System.out.println("Idade: ");
            idadeAlu = input.nextInt();
            System.out.println("Sexo: ");
            sexo = input.next();
            i = i + 1;
            
            if(idadeAlu > maisVelho){
                maisVelho = idadeAlu;
                nomeMaisVelho = nome;
                sexoMaisVelho = sexo;
                        
            }
          
        }while(i < 5);
        System.out.println("O aluno " + nomeMaisVelho + " é o mais velho " + maisVelho + " " + sexoMaisVelho + "\n");

    }                  
}  
