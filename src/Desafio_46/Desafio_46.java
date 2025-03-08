
import java.util.Scanner;


/*46) Dados dois vetores x e y, ambos com n elementos, determinar o produto escalar desses vetores. Ou seja, realizar
a soma de todos dos resultados da multiplicação de x[i] por y[i].
 */
public class Desafio_46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] x = new int[3];
        int[] y = new int[3];
        int soma = 0;
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Informe um numero para x: ");
            x[i] = sc.nextInt();
            
            System.out.println("Informe um numero par y: ");
            y[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            
            int multiplicacao = x[i]*y[i];
            
            soma+=multiplicacao;
        }
        System.out.println("O produto escalar dos vetores e: "+soma);
        
        sc.close();
    }
}
