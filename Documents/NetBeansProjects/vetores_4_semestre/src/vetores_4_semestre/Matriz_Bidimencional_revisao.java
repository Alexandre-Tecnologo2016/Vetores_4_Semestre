/*Desenvolva um algoritmo que:
 armazene os valores reais digitados pelo usuário numa matriz de dimensões 2x3
 crie e armazene numa segunda matriz o dobro dos valores contidos na primeira matriz
 apresente na tela os elementos da matriz.
 */
package vetores_4_semestre;

import javax.swing.JOptionPane;

/**
 *
 * @author Alexandre Vale
 */
public class Matriz_Bidimencional_revisao {

    public static void main(String[] args) {
        int dobra;
        int y;
        int[][] x = new int[2][3];
        for (int i = 0; i <=1; i++) {
            for (int j = 0; j <=2; j++) {
                x[i][j] = Integer.parseInt(JOptionPane.showInputDialog("digite um nemero da linha " + i + " Digite o numero da coluna " + j));

            }
        }
        for (int i = 0; i <=1; i++) {
            for (int j = 0; j <=2; j++) {
                System.out.printf("Matriz A " + "[" +i + "]"+"["+j+"]" + " = " +x [i] [j] + " ");
            }
            System.out.println("");
        }
        for (int i = 0; i <=1; i++) {
            for (int j = 0; j <=2; j++) {
                x[i][j]=x[i][j]*2;
                //System.out.printf(" o numero da linha é " +y + ", ");
                System.out.printf("Matriz B " + "[" +i + "]"+"["+j+"]" + " = " +x [i] [j] + " ");

            }
            System.out.println(" ");
        }
    }
}
