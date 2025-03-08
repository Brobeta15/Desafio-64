
package Lista_Desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio_54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] a = new int[5];
        int[] b = new int[8];
        List<Integer> c = new ArrayList<>();
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um numero para A: ");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < 8; i++) {
            System.out.println("Digite um numero para B: ");
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                
                if(a[i]==b[j] && !c.contains(a[i])){
                    c.add(a[i]);
                }
            }
        }
        for (int i = 0; i < c.size(); i++) {
            
            System.out.println(c.get(i));
        }
        sc.close();
    }
}
