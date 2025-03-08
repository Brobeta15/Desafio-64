
package Lista_Desafio;

import java.util.Scanner;

public class Desafio_59 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        char[] letras = new char[2];
        
        System.out.println("Escreva cada letra em ordema alfabetica. Ex: B e D.");
        
        
        System.out.println("Informe a primeira letra: ");
        String letra = sc.nextLine().toUpperCase();
        letras[0] = letra.charAt(0);
        
        System.out.println("Informe a segunda letra: ");
        letra = sc.nextLine().toUpperCase();
        letras[1] = letra.charAt(0);
        
        if(letras[0]>letras[1]){
            System.out.println("As letras não estao em ordem alfabetica!");
        }
        else{
            int distanciaLetra = (letras[1]-letras[0])-1;
            System.out.println("A distancia entra a letra "+letras[0]+" e "+letras[1]+" e: "+distanciaLetra);
        }
        sc.close();   
    }
}
