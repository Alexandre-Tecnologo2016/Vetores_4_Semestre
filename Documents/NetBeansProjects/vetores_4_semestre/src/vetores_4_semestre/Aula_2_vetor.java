/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 2ª aula de vetores.
 Ler 4 nomes e notas de uma turma, calcular e exibir a média das notas da turma e em seguida exibir a 
 relação de nomes cuja nota é superior a esta media.
 */
package vetores_4_semestre;

import javax.swing.JOptionPane;

/**
 *
 * @author Alexandre Vale
 */
public class Aula_2_vetor {

    public static void main(String[] args) {
        //String nome_aluno;
        //double nota_aluno;
        String[] nomes = new String[4];
        double[] notas = new double[4];
        double soma = 0, media;

        for (int i = 0; i < 4; i++) {
            nomes[i] = JOptionPane.showInputDialog("insira nome");
            notas[i] = Integer.parseInt(JOptionPane.showInputDialog("insira nota"));

            soma = notas[i] + soma;
        }

        media = soma / 4;

        for (int i = 0; i < 4; i++) {
            if (notas[i] > media) {
                System.out.println("Os valores inseridos nomes [" + i + "]" + " é = " + nomes[i]);
                System.out.println("Os valores inseridos notas [" + i + "]" + " é = " + notas[i]);
                System.out.println("A media totol é = " + media);

            }
        }
    }
}