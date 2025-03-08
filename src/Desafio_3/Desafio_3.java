
package Lista_Desafio;

import java.util.Scanner;

public class Desafio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe seu nome: ");
        String nome = sc.nextLine();
        
        System.out.println("Informe o codigo da peca: ");
        double codigo = sc.nextDouble();
        
        System.out.println("Informe o preco da peca: ");
        double preco = sc.nextDouble();
        
        System.out.println("Informe quantas quantidades foram vendidas: ");
        int quantidade = sc.nextInt();
        
        double totalVenda = preco*quantidade;
        double comissao = (totalVenda*5)/100;
        
        System.out.println(nome+", a comissao da peca "+codigo+" e "+comissao);
        
        sc.close();
    }
}
