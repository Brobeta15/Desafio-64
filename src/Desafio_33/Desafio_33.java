
package Lista_Desafio;

import java.util.Scanner;

public class Desafio_33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int contador = 0;
        double soma = 0;
        
        while(contador<5){
            
            System.out.println("Informe a metricula do aluno: ");
            int matricula = sc.nextInt();
                       
            System.out.println("Informe a nota do aluna na prova: ");
            double nota = sc.nextDouble();
            
            if(nota>=0){
               
                soma=soma+nota;
                contador++;
            }
            else{
                System.out.println("Nota invalida");
            }
        }
        System.out.println("\n");
        System.out.println("A media de notas da prova foi: "+soma/contador);
        
        sc.close();
    }
}
