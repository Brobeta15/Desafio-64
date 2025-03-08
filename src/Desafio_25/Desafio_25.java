
package Lista_Desafio;

import java.util.Scanner;

public class Desafio_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe seu sexo (feminino ou masculino): ");
        String sexo = sc.nextLine().toUpperCase();
        
        char caracterSexo = sexo.charAt(0);
        
        double pesoIdeal = 0;
        
        if(caracterSexo=='M'){
            
            System.out.println("Informe sua altura ");
            double altura = sc.nextDouble();
            
            pesoIdeal= (72.7*altura)-44.7;
            
        }
        else if(caracterSexo=='F'){
            
            System.out.println("Informe sua altura: ");
            double altura = sc.nextDouble();
            
            pesoIdeal = (62.1*altura)-44.7;
            
        }
        else{
            
            System.out.println("Sexo invalido");
        }
        
        if(pesoIdeal!=0){
            System.out.println("Sua peso ideal: "+pesoIdeal);
        }
        sc.close();
    }
}
