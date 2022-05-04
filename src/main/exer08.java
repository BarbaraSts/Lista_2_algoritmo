package exerestruturaderepeticao.exerestruturaderepeticao;

/**
 *
 * @author Barbara
 */
public class exr8 {
    public static void main(String[] args) {
        /* Calcular e mostrar a média aritmética dos números pares compreendidos entre 13 e 73. Utilize o laço que
lhe for mais conveniente. */
        
        int soma = 0, pares, media;
        for(int i = 13; i < 73; i++){
            pares = i % 2;
            if(pares == 0 ){
                pares = i;
                soma = soma + pares; 
        }
        }
            media = soma / 30;
            System.out.println("A média é = " + media);
    }
}
                                             // FEIITO //