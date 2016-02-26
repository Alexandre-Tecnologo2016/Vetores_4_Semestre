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
public class Lista_dupla_encadeada {

    private No inicio;
    private No fim;

    public Lista_dupla_encadeada() {//metodo construtor com o parametro de inicialização
        inicializa();
    }

    public void inicializa() {
        inicio = null;
        fim = null;
    }

    public void insereNoFim(int info) {//metodo de inserção no fim da lista com parametro de retorno
        No caixa = new No(inicio, null, info);//objeto do tipo caixa que é do tipo da classe No
        if (inicio == null) {
            inicio = fim = caixa;
        } else {
            fim.setProx(caixa);
            fim = caixa;
        }
    }

    public void insereNoInicio(int info) {
        No caixa = new No(null, inicio, info);
        if (inicio == null) {
            inicio = fim = caixa;
        } else {
            fim.setProx(caixa);
            fim = caixa;
        }
    }

    public void exibeLista() {
        No aux;
        aux = inicio;
        while (aux != null) {
            System.out.println(aux.getInfo());
            aux = aux.getProx();
        }
    }

    public No Busca(int elemento) {
        No p = inicio;
        while ((p != null) && (p.getInfo() != elemento)) {
            p = p.getProx();
        }
        if ((p != null) && (p.getInfo() == elemento)) {
            return p;
        } else {
            return null;
        }

    }

    public void removeLista(int elemento) {
        No pos;
        pos = Busca(elemento);
        if (pos != null) {// se existe No a ser deletado
            if (inicio != fim) {//se existe pelo menos um nó na lista
                if (pos == inicio) {//se o nó esta no inicio
                    inicio = pos.getProx();
                    pos.getProx().setAnt(null);
                } else if (pos == fim) {
                    fim = pos.getAnt();
                    pos.getAnt().setProx(null);
                } else {
                    pos.getAnt().setProx(pos.getProx());
                    pos.getProx().setAnt(pos.getAnt());
                }
                pos.setAnt(null);
                pos.setProx(null);
            }
            else{
                inicio=null;
                fim=null;
            }
        }
        else
            System.out.println("Elemento não encontrado");
    }
}
