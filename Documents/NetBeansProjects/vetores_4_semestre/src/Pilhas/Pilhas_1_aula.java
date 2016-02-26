/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
package Pilhas;

import javax.swing.JOptionPane;
import javax.swing.text.StyledEditorKit;

/**
 *
 * @author Alexandre Vale
 *//*
public class Pilhas_1_aula {
    elementoLista Lista[];
    int num_elementos = 0;
    
    public listaLinearSequencial (int tamanho){
        Lista = new ElementoLista [tamanho];
        Inicializar_Lista();
    }
    public void inicializar_Lista(){
        for (int i =0 ; i < Lista.length; i++)
            Lista [i] = new elementoLista();
    }
    public boolean iserir_Elemento (object elem, int posicao){
        if (!Lista_Cheia()){
            if (posicao >=0 && posicao < Lista.length){
                if (posicao > Tamanho_Lista())
                    posicao = Tamanho_Lista();
                
                // deslocar elementos da lista a direita
                for (int i = Tamanho_Lista(); i > posicao; i--){
                    
                    Lista[i].data = Lista[i-l].data;
                    
                    Lista[posicao].data = elem;
                    num_elementos++;
                    return true;
                }else{
                        JOptionPane.showInternalMessageDialog(null, "POSICAO INVALIDA \nElemento nao inserido na posicao : " + posicao +"Lista Linear Sequencial", 0 );
                        return false;
                }
            }
        }
    }
}
*/