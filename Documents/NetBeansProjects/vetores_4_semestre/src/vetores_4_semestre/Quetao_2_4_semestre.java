/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
2 – QUESTÃO
	- Desenvolva um programa em java que perceba 10 nummeros do teclado, armazene em um array e exiba em ordem inversa de entrada:
# Entrada : 5 , 65 , 73 , 97 , 55 , 66 , 32 , 12 , 1 , 33
# Saída : 33 , 1 , 12 , 32 , 66 , 55 , 97 , 73 , 65 , 5

 */
package vetores_4_semestre;

import javax.swing.JOptionPane;

/**
 *
 * @author Alexandre Vale
 */
public class Quetao_2_4_semestre {
    public static void main(String[] args) {
        String retorno;
        int soma = 0;
        double  media = 0;

        int vet[] = new int[5];
        for (int i = 0;i<vet.length; i++) {
            retorno = JOptionPane.showInputDialog("Insira um valor");
            vet[i] = Integer.parseInt(retorno);
            System.out.println("Os valores inseridos no vet["+i+"]" + " é = "  + vet[i]);
        }
        for(int i = 4; i>=0; i--){
            //System.out.println("vet[i]");
            System.out.println("Os valores inseridos no vet["+i+"]" + " é = "  + vet[i]);
        }
    }
}
     /*   for(int i = 0; i<vet.length; i++){
            soma += vet[i];//ou soma = soma + vet[i];
        }
        for(int i = 0; i<vet.length; i++){
            media = soma / 10;
            
        }
        //System.out.println("Os valores inseridos no vet["+i+"]" + " é = "  + vet[i]);
        //System.out.println("A soma dos elementos é " + soma);
        //System.out.println("A média dos elementos é " + media);
    }
}
*/