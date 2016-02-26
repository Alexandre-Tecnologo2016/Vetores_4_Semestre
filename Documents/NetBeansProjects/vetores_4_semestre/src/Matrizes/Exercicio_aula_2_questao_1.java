/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matrizes;

import java.util.Scanner;

/**
 *
 * @author Alexandre Vale
 */
public class Exercicio_aula_2_questao_1 {

    public static void main(String[] args) {
        int numeros[][] = new int[3][3];
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print("Digite o valor do " + "[" + i + "]" + "[" + j + "] = ");
                numeros[i][j] = new Scanner(System.in).nextInt();
            }
            //System.out.println("\t");
        }
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print("os valores de " + "["+i+"]"+"["+j+"] = "+ numeros[i][j]+" \t ");
            }
            System.out.println("\n");
        }
    }
}