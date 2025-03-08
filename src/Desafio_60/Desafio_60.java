
package Lista_Desafio;

import java.util.Scanner;

public class Desafio_60{
    
    int x;
    int y;
    
    void Verifica_Quadrante(){
        
        if(x>0 && y>0){
            System.out.println("Quadrante 1");
        }
        else if(x<0 && y>0){
            System.out.println("Quadrante 2");
        }
        else if(x<0 && y<0){
            System.out.println("Quadrante 3");
        }
        else if(x>0 && y<0){
            System.out.println("Quadrante 4");
        }
        else{
            System.out.println("Ponto de origem do plano cartesiano");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Desafio_60 quadrante = new Desafio_60();
        
        System.out.println("Informe um valor para x:");
        quadrante.x = sc.nextInt();
        
        System.out.println("Informe um valor para y: ");
        quadrante.y = sc.nextInt();
        
        quadrante.Verifica_Quadrante();
        
        sc.close();
    }
}
