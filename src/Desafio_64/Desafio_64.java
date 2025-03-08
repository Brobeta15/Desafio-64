
package lista_desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio_64 {
    
    List<Integer> vetor = new ArrayList<>();
    
    void carregarVetor(int nAdicionar){
        vetor.add(nAdicionar);
    }
    void listarVetor(){
        
        for (Integer listaVetor : vetor) {
            System.out.print(listaVetor+" ");
        }
    }
    void exibirPares(){
        
        for (Integer listaVetor : vetor) {
            
            if(listaVetor%2==0){
                System.out.print(listaVetor+" ");
            }
        }
    }
    void exibirImpares(){
        
        for (Integer listaVetor : vetor) {
            
            if(listaVetor%2!=0){
                System.out.print(listaVetor+" ");
            }
        }
    }
    int exibirPosicaoImpar(){

        int cont = 0;
        
        for (int i = 0; i <vetor.size(); i++) {
            
            if(i%2!=0 && vetor.get(i)%2==0){
                cont++;
            }
        }
        return cont;
    }
    int exibirPosicaoPar(){
        
        int cont = 0;
        
        for (int i = 0; i <vetor.size(); i++) {
            
            if(i%2==0 && vetor.get(i)%2!=0){
                cont++;
            }
        }
        return cont;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Desafio_64 execucao = new Desafio_64();
        
        int opcao;
        
        do{
            System.out.println("\n=====Informe sua opcao=====");
            System.out.println("1 - Carregar vetor");
            System.out.println("2 - Listar vetor");
            System.out.println("3 - Listar numeros pares");
            System.out.println("4 - Listar numeros impares");
            System.out.println("5 - quantidade de numeros pares em posicoes impares");
            System.out.println("6 - quantidade de numeros impares em posicoes pares");
            System.out.println("7 - sair");
            opcao = sc.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("Informe o numero que deseja adicionar: ");
                    int nAdicionar = sc.nextInt();
                    
                    execucao.carregarVetor(nAdicionar);
                    break;
                case 2:
                    execucao.listarVetor();
                    break;
                case 3:
                    execucao.exibirPares();
                    break;
                case 4:
                    execucao.exibirImpares();
                    break;
                case 5:
                    System.out.println("A quantidade de numeros pares em posicoes impares: "+execucao.exibirPosicaoImpar());
                    break;
                case 6:
                    System.out.println("A quantidade de numeros impares em posicoes pares: "+execucao.exibirPosicaoPar());
                    break;
                case 7:
                    System.out.println("===== Volte sempre! =====");
                    break;
                default:
                    System.out.println("Opcao invelida! Tente novamente");;
            }
        }while(opcao!=7);
        
        sc.close();
    }
}
