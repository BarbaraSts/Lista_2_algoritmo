package exerestruturaderepeticao.exerestruturaderepeticao;

import java.util.Scanner;

/**
 *
 * @author Barbara
 */
public class exer20 {
    public static void main(String[] args) {
        /* Escreva um programa capaz de ler o saldo inicial de uma conta bancária e um número indeterminado de
operações de depósito e saque.
O usuário deve digitar “1” para realizar um depósito, “2” para realizar um saque. 
        Após digitar o código da operação, o usuário deve digitar o valor. As operações devem continuar sendo
realizadas até que o usuário digite o código de operação “3”.
Ao digitar “3”, o programa deve ser encerrado e o saldo final da conta deve ser impresso com as seguintes
mensagens: CONTA ZERADA (caso o saldo final seja 0), CONTA ESTOURADA (se o saldo for negativo) ou
CONTA PREFERENCIAL (se o saldo for positivo).
Utilize o laço DO-WHILE. */
        
        Scanner input = new Scanner(System.in);
        
        int menu = 0;
        double saldoInicial = 0, saque, deposito;
        System.out.println("Digite o saldo inicial da conta: ");
        saldoInicial = input.nextDouble();
        do{ 
            System.out.println("Menu: \n 1 - Deposito \n 2 - Saque \n 3 - Sair");
            menu = input.nextInt();
            
            switch(menu){
                case 1: 
                    System.out.println("Digite o valor de depósito: ");
                    deposito = input.nextDouble();
                    saldoInicial = saldoInicial + deposito;
                    System.out.println("Novo saldo: " + saldoInicial);
                    break;
                
                case 2: 
                    System.out.println("Digite o valor do saque: ");
                    saque = input.nextDouble();
                    saldoInicial = saldoInicial - saque;
                    System.out.println("Novo saldo: " + saldoInicial);
                    break;
                    
                case 3:
                    System.out.println("Sistema encerrado.");
                    if(saldoInicial == 0){
                        System.out.println("Conta Zerada. \n Saldo: " + saldoInicial);
                                               
                    }else if(saldoInicial < 0){
                        System.out.println("Conta Estourada. \n Saldo: " + saldoInicial);
                    }else if(saldoInicial > 0){
                        System.out.println("Conta Preferencial. \n Saldo: " + saldoInicial);
                    }
                        break;
            }
        }while(menu != 3);       
    }    
}
                                                  // FEITO //