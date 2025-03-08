package Lista_Desafio;

import java.util.Scanner;

public class Desafio_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite 0 para sair");
        System.out.println("Informe uma tabuada: ");
        int tabuada = sc.nextInt();
        
        int multiplicador = 1;
        
        while(tabuada!=0){
            
            if(multiplicador<=10){
                System.out.println(tabuada+" x "+multiplicador+" = "+tabuada*multiplicador);
            
                multiplicador++;
            }
            else{
                multiplicador = 1;    
            
                System.out.println("Digite uma tabuada: ");
                tabuada = sc.nextInt();
            }
        }
        sc.close();
    }
}
