
package Lista_Desafio;

import java.util.Scanner;

public class Desafio_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe um numero: ");
        int n1 = sc.nextInt();
        
        System.out.println("Informe um segundo numero: ");
        int n2 = sc.nextInt();
        
        if (n1==n2){
            System.out.println("Iguais");
         }
        else if(n1>n2){
            System.out.println("Nao iguais."+" O maior: "+n1+". O menor: "+n2);
        }
        else{
            System.out.println("Nao iguais."+" O maior: "+n2+". O menor: "+n1);
        }
        
        sc.close();
  }
}
