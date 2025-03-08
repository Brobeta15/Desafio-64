
package Lista_Desafio;

import java.util.Scanner;

public class Desafio_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int contador = 100;
        
        while(contador<200){
            
            int par = contador%2;
            
            if(par!=0){
                System.out.println(contador);
            }
            
            contador++;
        }
        sc.close();
    }
}
