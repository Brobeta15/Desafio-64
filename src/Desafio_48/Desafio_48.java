
package Lista_Desafio;

import java.util.Scanner;

public class Desafio_48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] nomes = new String[20];
        int[] idades = new int[20];
        
        for (int i = 0; i < 20; i++) {
            System.out.println("Informe o nome da candidata: ");
            nomes[i] = sc.nextLine();
            
            System.out.println("Informe a idade dela: ");
            idades[i] = sc.nextInt();
            
            sc.nextLine();
        }
        System.out.println("Nomes das candidas aptas: ");
        for (int i = 0; i < 20; i++) {
            if(idades[i]>=18 && idades[i]<=20){
                
                System.out.println("- "+nomes[i]);
            } 
        }
        sc.close();
    }
}
