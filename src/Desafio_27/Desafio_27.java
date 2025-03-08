
package Lista_Desafio;

import java.util.Scanner;

public class Desafio_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe quantos numeros devem ser processados: ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            
            System.out.println("Informe um numero para ser fatorado: ");
            int fatorial = sc.nextInt();
            
            int multiplicador = fatorial-1;
            
            while(multiplicador>0){
                
                int resultado = fatorial*multiplicador;
                
                System.out.println(fatorial+" x "+multiplicador+" = "+resultado);
                
                fatorial=resultado;
                multiplicador-=1;
            }
        }
        sc.close();
    }
}
