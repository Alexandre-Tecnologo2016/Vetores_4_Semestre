/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Questao 3 da segunda aula de vetor.
Implemente a lógica para realização de saque em um caixa eletronico considerando
que o mesmo armazena cedulas de R$100,00, R$50,00 , R$20,00 , R$10,00 , R$5,00 , R$2,00 , R$1,00 e devem ser entregues
ao cliente o menor numero possivel de cedulas.
 */
package vetores_4_semestre;

import java.util.Scanner;

/**
 *
 * @author Alexandre Vale
 */
public class Questao_3_aula_2_Vetor {
     public static void main(String[] args) {  
        Scanner entrada = new Scanner(System.in);  
        System.out.println("Informe o valor do saque");  
        int saque = entrada.nextInt();  
        int cedulas[] = {100, 50, 20, 10, 5, 2, 1};  
        int[] aux = new int[7];  
        int a, b, c, d, e, f, g;  
  
        for (int i = 0; i < cedulas.length; i++) {  
            if (saque >= cedulas[i]) {  
                aux[i] = saque / cedulas[i];  
                saque = saque % cedulas[i];  
                if (saque >= cedulas[i]) {  
                    aux[i] = saque / cedulas[i];  
                    saque = saque % cedulas[i];                     
                }// fim do if interno  
            }// fim do if externo  
        }// fim do for  
        a = aux[0];  
        b = aux[1];  
        c = aux[2];  
        d = aux[3];  
        e = aux[4];  
        f = aux[5];
        g = aux[6];
       // p = aux[6];  
  
        System.out.printf("notas de 100 = %d\nnotas de 50 = %d\nnotas de 20 = %d\nnotas de 10 = %d\nnotas de 5 = %d\n"  
                + "notas de 2 = %d\nnotas de 1 = %d\n", a, b, c, d, e, f, g);  
    }  
}  