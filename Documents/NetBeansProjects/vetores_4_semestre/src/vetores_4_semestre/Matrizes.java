/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 1[ aula de matrizes e vetore bidimencionais.
 */
package vetores_4_semestre;

import javax.swing.JOptionPane;

/**
 *
 * @author Alexandre Vale
 */
public class Matrizes {

    public static void main(String[] args) {

        String[][] quartos = new String[5][10];//criação da matriz com 5 linhas e 10 colunas
        for (int andar = 0; andar < 5; andar++) {//andar significa linha
            for (int quarto = 0; quarto < 10; quarto++) {//quarto significa a coluna
                quartos[andar][quarto] = "livre";
            }
        }

        while (true) {
            String op = JOptionPane.showInputDialog("escolha uma opção: " + "\n1 - Imprimir Lista de quartos" + "\n2 - Definir ocupação" + "\n3 - Sair");

            if (op.equals("1")) {
                for (int andar = 0; andar < 5; andar++) {
                    for (int quarto = 0; quarto < 10; quarto++) {
                        System.out.println("\nAndar: " + (andar + 1) + "\nQuartos: " + (quarto + 1) + "\n" + quartos[andar][quarto]);
                    }
                }
            } else if (op.equals("2")) {
                
                int numeroAndar = Integer.parseInt(JOptionPane.showInputDialog("Forneça o Andar: "));
                if(numeroAndar>5){
                    //op=true;parei aqui de fazer essa bosta 
                }
                int numeroQuarto = Integer.parseInt(JOptionPane.showInputDialog(" Forneça o quarto: "));
                numeroAndar--;
                numeroQuarto--;
                String ocupacao = JOptionPane.showInputDialog("escolha uma opção: "
                        + "\n1-definir como ocupado " + "\n2 - definir como livre ");

                if (ocupacao.equals("1")) {
                    quartos[numeroAndar][numeroQuarto] = "ocupado";

                } else {
                    quartos[numeroAndar][numeroQuarto] = "livre";
                }
            } else if (op.equals("3")) {
                break;
            }
        }
        System.exit(0);
    }
}
