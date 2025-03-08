
package Lista_Desafio;

import java.util.Scanner;

public class Desafio_57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite uma frase palavra: ");
        String frase = sc.nextLine().toLowerCase();
        
        char[] quantidadeCaracter = new char[frase.length()];
        
        for (int i = 0; i < frase.length(); i++) {
            
            quantidadeCaracter[i] = frase.charAt(i);
        }              
        for (int i = 0; i < quantidadeCaracter.length; i++) {
            
            if(quantidadeCaracter[i]=='a' || quantidadeCaracter[i]=='e' || quantidadeCaracter[i]=='i' || quantidadeCaracter[i]=='o' || quantidadeCaracter[i]=='u'){
                
                System.out.println(quantidadeCaracter[i]);
            }
        }
        sc.close();
    }
}
