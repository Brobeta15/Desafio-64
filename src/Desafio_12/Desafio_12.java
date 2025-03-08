
package Lista_Desafio;

import java.util.Scanner;

public class Desafio_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o um valor: ");
        int X = sc.nextInt();
        
        if (X>=0){
            System.out.println("E maior ou igual a zero.");
        }
        else{
            System.out.println("E menor que zero");
        }
        
        sc.close();
    }
}
