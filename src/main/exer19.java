package exerestruturaderepeticao.exerestruturaderepeticao;

import java.util.Scanner;

/**
 *
 * @author Barbara
 */
public class exer19 {
    public static void main(String[] args) {
        /* Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente
deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta
é o valor 2002. Utilize o laço que lhe for mais conveniente. */
        
        Scanner input = new Scanner(System.in);
        
        int senha;
        do {            
            System.out.println("Digite a senha: ");
            senha = input.nextInt();
        if(senha == 2002){
            System.out.println("Acesso Permitido!");
        }else{
            System.out.println("Senha Invalida!");
        }    
        }while(senha != 2002);
    }   
}
                                              // FEITO //