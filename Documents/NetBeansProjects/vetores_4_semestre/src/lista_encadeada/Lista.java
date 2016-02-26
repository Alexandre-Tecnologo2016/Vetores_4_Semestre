/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_encadeada;

/**
 *
 * @author Alexandre Vale
 */
public class Lista {
    private String nome;
    private Lista proximo;
    int tamanho;
    
    public Lista(){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Lista getProximo() {
        return proximo;
    }

    public void setProximo(Lista proximo) {
        this.proximo = proximo;
    }
}
