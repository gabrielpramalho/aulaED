
package aulaed;

import java.util.Scanner;


public class AulaED {

 
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    
        
        int mat[][] = new int [5][5];
        int somaLinha4;
        int somaColuna2;
        int diagonalPrincipal;
        int diagonalSecundaria;
        int somaTudo;
        
        somaLinha4 = 0;
        somaColuna2 = 0;
        diagonalPrincipal = 0;
        diagonalSecundaria = 0;
        somaTudo = 0;
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                mat[i][j] = teclado.nextInt();
                somaLinha4 += mat[4][j];
                somaTudo += mat[i][j];
                
                if(i + j == 4){
                    diagonalSecundaria += mat[i][j];
                }
                
            }
            somaColuna2 += mat[i][2];
            diagonalPrincipal += mat[i][i];
        }
        
        System.out.println("---RESULTADOS------");
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println("");
        }
        
        System.out.println("Soma da Linha 4 = "+ somaLinha4);
        System.out.println("Soma da Coluna 2 = "+ somaColuna2);
        System.out.println("Soma da diagonal principal = "+ diagonalPrincipal);
        System.out.println("Soma da diagonal secundaria = "+ diagonalSecundaria);
         System.out.println("Soma de todos os elementos = "+ somaTudo);
        
    }
    
}
