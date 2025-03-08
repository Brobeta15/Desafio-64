
package Lista_Desafio;

import java.util.Scanner;

public class Desafio_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe um numero: ");
        double n1 = sc.nextDouble();
        System.out.println("Informe um segundo numero: ");
        double n2 = sc.nextDouble();
        
        if (n1>n2){
            double diferenca = n1-n2;
            System.out.println("A diferenca e: "+diferenca);
        }
        else{
            double diferenca = n2-n1;
            System.out.println("A diferenca e: "+diferenca);
        }
        
        sc.close();
    }
}
