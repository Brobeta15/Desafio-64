
package lista_desafio;

import java.util.Scanner;

public class Desafio_62 {
    
    double calcularArea(double base, double altura){
        
        return (base*altura)/2;
    }
    double calcularHipotenusa(double base, double altura){
        
        double raizQuadrada =(base*base)+(altura*altura);
        
        return Math.sqrt(raizQuadrada);
    }   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Desafio_62 hipotenusa = new Desafio_62();
        
        System.out.println("Informe a base do triangulo retangulo");
        double base = sc.nextDouble();
        
        System.out.println("Informe a altura do triangulo retangulo");
        double altura = sc.nextDouble();
        
        System.out.println("A area do trianglu retangulo e: "+hipotenusa.calcularArea(base, altura));
        
        System.out.println("A hipotenusa do triangulo retangulo e: "+hipotenusa.calcularHipotenusa(base, altura));
        
        sc.close();
    }
}
