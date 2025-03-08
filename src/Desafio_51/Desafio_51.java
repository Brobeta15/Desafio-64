
package Lista_Desafio;

import java.util.Scanner;

public class Desafio_51 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe quantos alunos voce deseja calcular a media: ");
        int n = sc.nextInt();
        
        Double[] medias = new Double[n];
        int contAcima7 = 0;
        int contAcima5 = 0;
        
        for (int i = 0; i < n; i++) {
            
            System.out.println("Informe a primeira nota: ");
            double n1 = sc.nextDouble();
            
            System.out.println("Informe a segunda nota: ");
            double n2 = sc.nextDouble();
            
            medias[i] = (n1+n2)/2;
            
            if(medias[i]>7){
                contAcima7++;
            }
            else if(medias[i]>5){
                contAcima5++;
            }
        }
        System.out.println(contAcima7+" alunos tiram notas acima de 7");
        
        if(contAcima5==0){
            System.out.println("Não há nenhum aluno com nota acima de 5");
        }
        else{
            System.out.println(contAcima5+" alunos tiram notas acima de 5 e abaixo de 7");
        }
        sc.close();
    }
}
