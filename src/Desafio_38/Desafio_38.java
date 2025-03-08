
package Lista_Desafio;

import java.util.Scanner;

public class Desafio_38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double E = 0.0;
        double salario = 0.0;
        char encerrar = 'N';
        
        do{
            System.out.println("Informe o codigo do funcionario: ");
            int C = sc.nextInt();
        
            System.out.println("Informe o numero de horas trabalhadas: ");
            int N = sc.nextInt();
    
            if(N>50){
            
                E = (N-50)*20;
                salario = (N*10)-E;
            }
            else{
                E = 0.0;
                salario = N*10;
            }
            System.out.println("O salario total e "+(salario+E));
            System.out.println("Salario excedente: "+E);
        
            System.out.println("Deseja Encerrar o programa? ");
            encerrar = sc.next().toUpperCase().charAt(0);
            
        }while(encerrar=='N');
        
        sc.close();
    }
}
