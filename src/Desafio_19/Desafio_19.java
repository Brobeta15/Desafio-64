package Lista_Desafio;

import java.util.Scanner;

public class Desafio_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o primeiro lado do triangulo: ");
        double l1 = sc.nextDouble();
        
        System.out.println("Informe o segundo lado: ");
        double l2 = sc.nextDouble();
        
        System.out.println("Informe o terceiro lado: ");
        double l3 = sc.nextDouble();
        
        if(l1+l2>l3 && l1+l3>l2 && l2+l3>l1){
            
            if(l1==l2 && l2==l3){
                System.out.println("Triangulo Equilatero");
            }
            else if(l1==l2 || l1==l3 || l2==l3){
                System.out.println("Triangulo isosceles");
            }
            else{
                System.out.println("Triangulo escaleno");
            }
        }
        else{
            System.out.println("Os lado fornecidos nao caracterizam um triangulo");
        }
        sc.close();
    }
}
