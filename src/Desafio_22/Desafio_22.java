
package Lista_Desafio;

import java.util.Scanner;

public class Desafio_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe um numero: ");
        double n = sc.nextDouble();
        
        if (n>0){
            double A = n;
            System.out.println("O valor de A e: "+n);
        }
        else if (n<0){
            double B = n;
            System.out.println("O valor de B: "+n);
        }
        else{
            System.out.println("0 E UM NUMERO NEUTRO");
        }
        sc.close();
    }
}
