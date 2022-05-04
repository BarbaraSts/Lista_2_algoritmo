package exerestruturaderepeticao.exerestruturaderepeticao;

public class exer7 {
    public static void main(String[] args) {
       /* Escreva um programa que imprima todos os múltiplos de 7 menores que 200. Use o laço WHILE */
             
       int multiplos, i = 0;
       System.out.println("Os múltiplos são:");
       
       while(i < 200){ 
           multiplos = i * 7;  
           i = i + 1;
                 
       if(multiplos < 200){
            System.out.println("" + multiplos);       
         }       
      }
   }
}
