
package Lista_Desafio;

import java.util.Scanner;

/*63) Escreva um programa que verifique se um número é par ou ímpar através de um método chamado VERIFICA. O
método deverá receber um número inteiro ( n ) e deverá retornar a mensagem “PAR” ou “ÍMPAR”
*/
public class Desafio_63 {
    
    int n;
    
    void verificar(){
        
        if(n%2==0){
            System.out.println("Par");
        }
        else{
            System.out.println("Impar");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Desafio_63 num = new Desafio_63();
        
        System.out.println("Informe um numero: ");
        num.n = sc.nextInt();
        
        num.verificar();
        
        sc.close();
    } 
}
