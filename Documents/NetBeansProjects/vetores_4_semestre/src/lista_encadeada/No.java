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
public class No {
   private No ant, prox;
   private int info;
   
   public No (No ant, No prox, int info){//metodo construtor que nao e o padrao
     this.ant = ant;
     this.prox = prox;
     this.info = info;
             
   }

    public No getAnt() {
        return ant;
    }

    public void setAnt(No ant) {
        this.ant = ant;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }
}
