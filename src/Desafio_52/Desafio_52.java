
package Lista_Desafio;

import java.util.Scanner;

public class Desafio_52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] vetor = new int[100];
        int indice = 0;
        boolean sair = true;
        int contRepeticoes = 0;
        
        do {               
            System.out.println("Informe um numero: ");
            vetor[indice] = sc.nextInt();
            
            while(vetor[indice]<-1){
                System.out.println("Informe um numero positivo: ");
                vetor[indice] = sc.nextInt();
            }
            if(vetor[indice]==-1){
                sair = false;
            }
            
            indice++;
            
            if(indice==100){
                indice=0;
                if(sair==true){
                    for (int i = 0; i <= 97; i++) {
                        if(vetor[i]==1 && vetor[i+1]==3 && vetor[i+2]==4){
                            contRepeticoes++;
                        }
                    }
                    System.out.println("A seguencia 1, 3 e 4 apareceu "+contRepeticoes);
                }
            }
        } while(sair==true);
        
        sc.close();
    }
}
