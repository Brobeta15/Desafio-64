
package Lista_Desafio;

import java.util.Scanner;

public class Desafio_55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String frase;
        
        do {            
            System.out.println("Informe um frase: ");
            frase = sc.nextLine();
            
            if(frase.length()>50){
                System.out.println("Escreva uma frase menor!");
            }
        } while (frase.length()>50);
        
        System.out.println("\n");
        
        char[] caracterFrase = new char[frase.length()];
        
        int contEspacoBranco = 0;
        
        for (int i = 0; i < frase.length(); i++) {
            
            caracterFrase[i] = frase.charAt(i);
            
            if(caracterFrase[i] == ' '){
                contEspacoBranco++;
            }
            else{
                System.out.print(caracterFrase[i]);
            }
        }
        System.out.println("\nQuantidade de espaco em branco: "+contEspacoBranco);
        
        sc.close();
    }
}
