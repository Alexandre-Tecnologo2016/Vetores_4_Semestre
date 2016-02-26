/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste_vetor;

import javax.swing.JOptionPane;

/**
 *
 * @author Alexandre Vale
 */
public class Teste_revisao_vetor {

    public static void main(String[] args) {
        int x;
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor"));
        int[] vetor = new int[x];
        for (int i = 0; i <= vetor.length; i++) {

            System.out.println("posição " + "[" + i + "] = " + i);

        }
    }
}
