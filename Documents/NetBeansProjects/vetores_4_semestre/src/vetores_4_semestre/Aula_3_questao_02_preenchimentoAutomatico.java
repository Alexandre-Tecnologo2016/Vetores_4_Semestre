/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetores_4_semestre;

/**
 *
 * @author Alexandre Vale
 */
public class Aula_3_questao_02_preenchimentoAutomatico {

    public static void main(String[] args) {
        int x[] = new int[50];
        int contador = 0;
        for (int i = 101; i > 151; i++) {
            x[contador] = 1;
            System.out.println(x[contador]);
            contador++;
        }
    }
}