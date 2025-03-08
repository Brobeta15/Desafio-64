package Desafio_40;

import java.util.Scanner;

/*A Secretaria de Meio Ambiente que controla o índice de poluição mantém 03 grupos de indústrias que são altamente poluentes do meio ambiente.
O índice de poluição aceitável varia de 0,05 até 0,25. Se o índice sobe para 0,3 as indústrias do 1o grupo são intimadas a suspenderem suas atividades,
se o índice crescer para 0,4 as industrias do 1o e 2o grupo são intimadas a suspenderem suas atividades, se o índice atingir 0,5 todos os grupos devem
ser notificados a paralisarem suas atividades. Faça um programa que leia o índice de poluição medido e emita a notificação adequada aos 
diferentes grupos de empresas. O algoritmo só deve parar de rodar quando o usuário responder "S" na seguinte pergunta, "Deseja encerrar o programa?".
 */
public class Desafio_40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char caracterResposta = 'N';
        
        do{     
            System.out.println("Informe o indice de poluicao atual:");
            float indicePoluicao = sc.nextFloat();
            
            sc.nextLine();

            if(indicePoluicao>=0.5){
                System.out.println("Todos os grupos devem paralizar as atividades!\n");
            }
            else if(indicePoluicao>=0.4){
                System.out.println("Grupos 1 e 2 suspenderem atividades!\n");
            }
            else if(indicePoluicao>=0.3){
                System.out.println("Grupo 1 suspender atividades!\n");
            }
            else if(indicePoluicao>0.25 && indicePoluicao<0.3){
                System.out.println("Em alerta, indice de poluicao subindo!\n");
            }
            else{
                System.out.println("Indice aceitavel\n");
            }
            
            System.out.println("Deseja encerrar o programa?");
            String resposta = sc.nextLine().trim().toUpperCase();
            caracterResposta = resposta.charAt(0);
            
            if(caracterResposta=='S'){
                System.out.println("Programa finalizado! Volte sempre\n");
                
                break; 
            }
        } while (caracterResposta=='N');
        
        sc.close();
    }
}
