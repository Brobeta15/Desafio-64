
package Lista_Desafio;

import java.util.Scanner;

public class Desafio_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe um numero: ");
        int n1 = sc.nextInt();
        System.out.println("Informe um segundo numero: ");
        int n2 = sc.nextInt();
        System.out.println("Informe um terceiro numero: ");
        int n3 = sc.nextInt();
        
        if (n1<n2 && n1<n3 && n2>n3){
            System.out.println("Ordem descrecente: "+n2+" , "+n3+" , "+n1);
        }
        else if (n2<n1 && n2<n3 && n1>n3){
            System.out.println("Ordem descrecente: "+n1+" , "+n3+" , "+n2);
        }
        else if(n3<n1 && n3<n2 && n2>n1){
            System.out.println("Ordem descrecente: "+n2+" , "+n1+" , "+n3);
        }
        else if (n3<n1 && n3<n2 && n1>n2){
            System.out.println("Ordem descrecente: "+n1+" , "+n2+" , "+n3);
        }
        else if (n1<n2 && n1<n3 && n3>n2){
            System.out.println("Ordem descrecente: "+n3+" , "+n2+" , "+n1);
        }    
        sc.close();
    }
}
