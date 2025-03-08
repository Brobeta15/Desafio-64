package Lista_Desafio;

import java.util.Scanner;

public class Desafio_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe um numero inteiro: ");
        int codigo = sc.nextInt();
        
        switch (codigo) {
            case 1:
                System.out.println("Um");
                break;
            case 2:
                System.out.println("Dois");    
                break;
            case 3:
                System.out.println("Tres");
                break;
            default:
                System.out.println("Codigo invalido");
                throw new AssertionError();
        }
        sc.close();
        }
    }

