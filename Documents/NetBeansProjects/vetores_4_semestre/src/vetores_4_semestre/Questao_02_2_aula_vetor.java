/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
questão 02 aula 02 de vetores.

Ler um conjunto de notas, cuja a quantidade seja determinada pelo usuario. calcule
a média de todas elas. exiba o conjunto das notas maiores do que a media calculada. em seguida, 
de forma agrupada, exiba um outro conjunto de notas menores que a media.
 */
package vetores_4_semestre;

import java.util.Scanner;

/**
 *
 * @author Alexandre Vale
 */
public class Questao_02_2_aula_vetor {
    public static void main(String[] args) {
     
        int x;
        double media=0, notas;
        System.out.println("Informe a quantidade de notas");
        x = new Scanner(System.in).nextInt();
        double vetor [] = new double[x];
        
        for (int i = 0; i < x; i++){
            System.out.println("Informe a "+(i+1)+ " nota");
            vetor[i]= new Scanner(System.in).nextInt();
        }
        for (int i = 0; i < x; i++){
            media = media + vetor [i];
        }
            media = media / x;
            System.out.println("A media é : " + media);
            String maior =""+ "notas acima da media  ";
            String menor =""+ "notas abaixo da media  ";
            for (int i = 0; i < x; i++){
                
            if (vetor [i]>media){
                maior = maior + vetor[i]+ " / ";
            }
            else{
                menor = menor + vetor[i]+ " / ";
            }
            }
            
                System.out.println(" "+ maior);
                System.out.println(" "+ menor);
        
    }
}