/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetores_4_semestre;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexandre Vale
 */
public class Aula_3_questao_01_sala {

    public static void main(String[] args) {
        int x;
        int soma=0;
        double media;
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de notas que você deseja "));
        String nomes[] = new String[x];
        double notas[] = new double[x];
        for (int i = 0; i < x; i++) {
            System.out.println(" Digite o nome do aluno");
            nomes[i] = new Scanner(System.in).nextLine();
            System.out.println(" Digite a nota do aluno");
            notas[i] = new Scanner(System.in).nextInt();
        }
        media = soma / x;
        System.out.println("A media do aluno é " + media);
        for (int i = 0; i < x; i++) {
            if (notas[i] > media ){
                System.out.println("O aluno  "+nomes[i]);
                System.out.println("Notas acima da média  "+notas[i]);
            }
            //System.out.println(" O nome do aluno é " + "["+i+"]" + nomes[i]);
            //System.out.println(" e a sua nota é " + " ["+i+"]" + notas[i]);
        }

    }
}
