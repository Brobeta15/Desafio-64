
package Lista_Desafio;

import java.util.Scanner;

public class Desafio_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o valor de A : ");
        int A = sc.nextInt();     
        System.out.println("Informe o valor de B : ");
        int B = sc.nextInt();
        
        int ATrocado=B;
        int BTrocado=A;
        
        System.out.println("Valor de A: "+ATrocado);
        System.out.println("Valor de B: "+BTrocado);
                
        sc.close();
    }
}
