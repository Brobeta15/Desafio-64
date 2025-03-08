
package Lista_Desafio;

import java.util.Scanner;

public class Desafio_45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] n = new int[5];
        
        for (int i = 0; i < 5; i++) {
            
            System.out.println("Informe um numero: ");
            n[i] = sc.nextInt();
            
        }
        for (int i=4; i>=0; i--) {
            
            System.out.println(n[i]);
            
        }
    }        
}
