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
public class Aplicacao {
    Lista_dupla_encadeada lista;
    public Aplicacao (){
        lista = new Lista_dupla_encadeada();
    }
    public void executa(){
        for (int i=1;i<=5;i++){
        lista.insereNoFim(i);
        System.out.println("Lista inserindo no final");
        lista.exibeLista();
        lista.insereNoInicio(50);
        lista.insereNoInicio(40);
        lista.insereNoInicio(30);
        lista.exibeLista();
    }
    }
    public static void main (String[]args){
        Aplicacao a = new Aplicacao();
        a.executa();
    }
}
