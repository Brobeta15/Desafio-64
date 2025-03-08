package Lista_Desafio;

import java.util.Scanner;

public class Desafio_44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char sair = 'N';
        double altura = 0.0;
        double pesoIdeal = 0.0;
        double pesoAtual = 0.0;
        double IMC = 0.0;
        double fahrenheit = 0.0;
        double celsius = 0.0;
        
        do{
            System.out.println("Escolha o que deseja ");
            System.out.println("1 – Conversão de Graus Celsius em Graus Fahrenheit;");
            System.out.println("2 – Conversão de Graus Fahrenheit em Graus Celsius;");
            System.out.println("3 – Peso ideal do homem;");
            System.out.println("4 – Peso ideal da mulher;");
            int opcao = sc.nextInt();
        
            switch (opcao) {
                case 1:
                    System.out.println("Informe o graus em celsius: ");   
                    celsius = sc.nextDouble(); 
                       
                    fahrenheit = (celsius/5)*9+32;
                    
                    System.out.println("A conversao para farenheit e: "+fahrenheit);
                    
                    break;
                case 2:
                 
                    System.out.println("Informe o graus em fahrenheit: ");   
                    fahrenheit = sc.nextDouble();   
                    
                    celsius = (fahrenheit-32)*5/9;
                    
                    System.out.println("A conversao para celcius e: "+celsius);
                    
                    break;
                case 3:
                    
                    System.out.println("Informe sua altura: ");
                    altura = sc.nextDouble();
                    
                    System.out.println("Informe seu peso atual: ");
                    pesoAtual = sc.nextDouble();
                    
                    pesoIdeal = (72.7*altura)-58;
                    System.out.println("Seu peso ideal e: "+pesoIdeal);
                    
                    IMC = pesoAtual/(altura*altura);
                    
                    if(IMC>24.9){
                        
                        System.out.println("Voce está acima do peso. Seu IMC e: "+IMC);
                    }
                    else if(IMC<18.5){
                        
                        System.out.println("Voce está abaixo do peso. Seu IMC e: "+IMC);
                    }
                    else{
                        System.out.println("Voce esta no seu Peso normal");
                    }
                    
                    break;
                case 4:            
                    System.out.println("Informe sua altura: ");
                    altura = sc.nextDouble();
                    
                    System.out.println("Informe seu peso atual: ");
                    pesoAtual = sc.nextDouble();
                    
                    pesoIdeal = (62.1*altura)-44.7;
                    System.out.println("Seu peso ideal e: "+pesoIdeal);
                    
                    IMC = pesoAtual/(altura*altura);
                    
                    if(IMC>24.9){
                        
                        System.out.println("Voce está acima do peso. Seu IMC e: "+IMC);
                    }
                    else if(IMC<18.5){
                        
                        System.out.println("Voce está abaixo do peso. Seu IMC e: "+IMC);
                    }
                    else{
                        System.out.println("Voce esta no seu Peso normal");
                    }
                    
                    break;
                default: System.out.println("Opcao invalida");
                    throw new AssertionError();
            }
            System.out.println("\n");
            System.out.println("Voce deseja encerrar o programa (sim ou nao): ");
            sair = sc.next().toUpperCase().charAt(0);
            
        }while(sair=='N');
        
        sc.close();
    }
}
