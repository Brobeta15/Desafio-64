
package Lista_Desafio;
        
import java.util.Scanner;

public class Desafio_53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantas voltas foram dadas: ");
        int n = sc.nextInt();
        
        int[] tempos = new int[n];
        int soma = 0;
        int volta = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.println("Informe o tempo da "+(i+1)+" corrida: ");
            tempos[i] = sc.nextInt();
            soma+=tempos[i];
        }
        int menorTempo = tempos[0];
        
        for (int i = 0; i < n; i++) {
            if(tempos[i]<menorTempo){
                menorTempo = tempos[i];
                volta = i;
            }
        }
        System.out.println("O melhore tempo foi: "+menorTempo);
        System.out.println("A volta que ocorreu o melhor tempo: "+(volta+1));
        System.out.println("O tempo medio das corridas foi: "+soma/n);
          
        sc.close();
    }
}
