
package listadeexercicio;

import java.util.Scanner;


public class ListadeExercicio {

   
    public static void main(String[] args) {
        
        int vet[] = new int[20];
        boolean status;
        int opcao = - 1;
        int inicio, fim;
        int busca;
        int aux;
        Scanner tec = new Scanner (System.in);
        while(opcao != 0){
           
            System.out.println("---- MENU ----");
            System.out.println("1 - Escrever");
            System.out.println("2 - Imprimir");
            System.out.println("3 - Buscar Valores");
            System.out.println("4 - Trocar");
            System.out.println("5 - Remover");
            System.out.println("0 - Sair");
        
        
        opcao = tec.nextInt();
        
        switch(opcao){
            
            case 1:
                System.out.println("Digite os numeros: ");
                for (int i = 0; i < vet.length; i++) {
                    vet[i] = tec.nextInt();
                }
                break;
            case 2:
                for (int i = 0; i < vet.length; i++) {
                     System.out.println("O valor da posicao ["+ i +"] eh: "+ vet[i]);
                }
                break;
            case 3:
                System.out.println("Digite o valor a ser buscado: ");
                busca = tec.nextInt();
                status = false;
                
                for (int i = 0; i < vet.length; i++) {
                    if(busca == vet[i]){
                        System.out.println("A posicao do valor "+ busca +" eh: "+ i);
                        status = true;
                    }                    
                }
                if(!status){
                    System.out.println("Valor nao encontrado!");
                }
                break;
            case 4:
                inicio = 0;
                fim = 19;
                
                for (int i = 0; i < vet.length; i++) {
                   if(inicio <= 10){
                        aux = vet[inicio];
                        vet[inicio] = vet[fim];
                        vet[fim] = aux;
                        inicio++;
                        fim--;
                   }
                }
            case 5:
                int s;
                System.out.println("Digite o valor a ser removido: ");
                s = tec.nextInt();
                status = false;
                
                for (int i = 0; i < vet.length; i++) {
                    if(s == vet[i]){
                        status = true;
                        for (int j = s; j < (vet.length-1); j++) {
                            vet[i] = vet[i+1];
                            
                        }
                    }                    
                }
                if(!status){
                    System.out.println("Valor nao encontrado!");
                }
                       
        }   
      }     
    }   
}
