
package Lista_Desafio;

import java.util.Scanner;

public class Desafio_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe a primeira nota: ");
        double n1 = sc.nextDouble();
        
        System.out.println("Informe a segunda nota: ");
        double n2 = sc.nextDouble();
        
        System.out.println("Informe a terceira nota: ");
        double n3 = sc.nextDouble();
        
        System.out.println("Informe a quarta nota: ");
        double n4 = sc.nextDouble();
        
        double media = (n1+n2+n3+n4)/4;
        
        if(media>=7){
            
            System.out.println("Aprovado! Media "+media);
        }
        else{
            System.out.println("Informe a nota de recuperação: ");
            double recuperacao = sc.nextDouble();
            
            media = (media + recuperacao)/2;
            
            if(media>=7){
                System.out.println("Aprovado na recuperacao. Media "+media);
            }
            else{
                System.out.println("Reprovado na recuperacao. Media "+media);
            }
            sc.close();
        }
    }
}
