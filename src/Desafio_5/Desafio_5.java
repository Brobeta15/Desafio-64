
package Lista_Desafio;

import java.util.Scanner;

public class Desafio_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o tempo gasto do percurso: ");
        double tempo = sc.nextDouble();
        
        System.out.println("Informe a sua velocidade media: ");
        double velocidade = sc.nextDouble();
        
        double distanciaPercorrida = tempo*velocidade;
        double litroGasto = distanciaPercorrida/12;
        
        System.out.println("A velocidade media foi: "+velocidade);
        System.out.println("O tempo gasto foi: "+tempo);
        System.out.println("A distancia percorrida foi: "+distanciaPercorrida);
        System.out.printf("A quantidade de litros gastos foi: %.2f \n",litroGasto);
        
        sc.close();
    }
}
