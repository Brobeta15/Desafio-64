
package Lista_Desafio;

import java.util.Scanner;

public class Desafio_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe a sua idade em anos: ");
        int ano = sc.nextInt();
        
        System.out.println("Informe os meses: ");
        int mes = sc.nextInt();
        
        System.out.println("Informe os dias: ");
        int dia = sc.nextInt();
        
        int idadeDia = ano*365;
        int mesDia = mes*30;
        
        System.out.println("A sua idade em dia sera: "+(idadeDia+mesDia+dia));
        
        sc.close();
    }    
}
