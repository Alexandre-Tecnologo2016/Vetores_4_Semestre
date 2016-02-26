/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 1 – Questão
 - Desenvolva um programa em java que obedeça os seguintes passos;
 # Crie um array unidimensional com 10 elementos;
 # Insira valores numéricos em cada uma das posições;
 # Exiba todos os valores armazenados no array;
 # Exiba a soma de todos os elementos;
 # Exiba a média de todos os elementos do array;

 */
package vetores_4_semestre;

import javax.swing.JOptionPane;

/**
 *
 * @author Alexandre Vale
 */
public class Vetores_4_semestre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String retorno;
        int soma = 0;
        double  media = 0;

        int vet[] = new int[10];
        for (int i = 0; i < vet.length; i++) {
            retorno = JOptionPane.showInputDialog("Insira um valor");
            vet[i] = Integer.parseInt(retorno);
            System.out.println("Os valores inseridos no vet["+i+"]" + " é = "  + vet[i]);
        }
        for(int i = 0; i<vet.length; i++){
            System.out.println("vet[i]");
        }
        for(int i = 0; i<vet.length; i++){
            soma += vet[i];//ou soma = soma + vet[i];
        }
        for(int i = 0; i<vet.length; i++){
            media = soma / 10;
            
        }
        
        System.out.println("A soma dos elementos é " + soma);
        System.out.println("A média dos elementos é " + media);
    }
}