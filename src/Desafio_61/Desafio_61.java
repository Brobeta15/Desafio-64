
package lista_desafio;

import java.util.Scanner;

public class Desafio_61 {

    double salario;
    double percentualReajuste;
    
    double reajustarSalario(){
        
        double valorReajuste = (salario*percentualReajuste)/100;
        return (valorReajuste+salario);
    } 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Desafio_61 salarioAtual = new Desafio_61();
        
        System.out.println("Informe o seu salario atual: ");
        salarioAtual.salario = sc.nextDouble();
        
        System.out.println("Informe o percentual de reajuste do seu salario: ");
        salarioAtual.percentualReajuste = sc.nextDouble();
        
        System.out.println("O valor do salario reajustado sera: "+salarioAtual.reajustarSalario());
        
        sc.close();
    } 
}

