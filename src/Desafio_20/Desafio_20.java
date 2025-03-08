
package Lista_Desafio;

import java.util.Scanner;

public class Desafio_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe um valor: ");
        int v1 = sc.nextInt();
        
        System.out.println("Informe um segundo valor: ");
        int v2 = sc.nextInt();
        
        System.out.println("Informe um terceiro valor: ");
        int v3 = sc.nextInt();
     
        while(v1==0 || v2==0 || v3==0){
            
            System.out.println("Informe valores diferentes de 0\n");
                
            System.out.println("Informe um valor: ");
            v1 = sc.nextInt();
        
            System.out.println("Informe um segundo valor: ");
            v2 = sc.nextInt();
        
            System.out.println("Informe um terceiro valor: ");
            v3 = sc.nextInt();
        }
        int maior = 0;
        int menor = 0;
        if((v1>v2 && v1>v3) && (v2<v3)){
            maior = v1;
            menor = v2;
        }
        else if((v1>v2 && v1>v3) && (v3<v2)){
            maior = v1;
            menor = v3;
        }
        else if((v2>v1 && v2>v3) && (v1<v3)){
            maior = v2;
            menor = v1;
        }
        else if((v2>v1 && v2>v3) && (v3<v1)){
            maior = v2;
            menor = v3;
        }
        else if((v3>v2 && v3>v1) && (v1<v2)){
            maior = v3;
            menor = v1;
        }
        else{
            maior = v3;
            menor = v2;
        }
        System.out.println("Multiplicacao entre o maior valor e o menor: "+(maior*menor));
        System.out.println("O maior valor dividido pelo menor: "+maior/menor);
        
        sc.close();
    }
}
