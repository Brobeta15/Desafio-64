package Lista_Desafio;

import java.util.Scanner;

public class Desafio_41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe sua idade: ");
        int idade = sc.nextInt();
        
        if(idade>=5 && idade<=7){
            
            System.out.println("Infantil A");
        }
        else if(idade>=8 && idade<=11){
            
            System.out.println("Infantil B");
        }
        else if(idade>=12 && idade<=13){
            
            System.out.println("Juvenil A");
        }
        else if(idade>=14 && idade<=17){
            
            System.out.println("Juvenil B");
        }
        else if(idade>=18){
            
            System.out.println("Adultos");
        }
        else{
            
            System.out.println("Idade inavalida");
        }
        sc.close();
    }
}
