/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetores_4_semestre;

import javax.swing.JOptionPane;

/**
 *
 * @author Alexandre Vale
 */
public class Vetor_Aula_29_09_2015 {

    public static void main(String[] args) {
        int n2;
        int[] n1 = new int[10];
        for (int i = 0; i <= n1.length; i++) {
            n1[i] = Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));

        }
        n2 = Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));
        System.out.println("numeros menor que " + n2);
        for (int i = 0; i <= n1.length; i++) {
            if ((n1[i] < n2) || (n1[i] > n2)) {
                System.out.println(" " + n1[i]);
            }
        }
    }
}
