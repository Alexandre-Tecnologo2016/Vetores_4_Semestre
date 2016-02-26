/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_simplesmente_encadeada;

/**
 *
 * @author Alexandre Vale
 */
public class AlunoLista {

    int quantidadeEmentos;
    Aluno primeiro, ultimo;

    public AlunoLista() {
        this.quantidadeEmentos = 0;
        this.primeiro = null;
        this.ultimo = null;
    }

    public void iserirNoComeco(int nota) {
        if (quantidadeEmentos == 0) {//lista vazia
            Aluno novo = new Aluno();
            novo.setNota(nota);
            novo.setProximo(primeiro);
            this.primeiro = novo;
            this.quantidadeEmentos+=1;
            
        } else {
            Aluno novo2 = new Aluno();
            novo2.setNota(nota);
            novo2.setProximo(primeiro);
            this.primeiro = novo2;
        }

    }

    public void imprimir() {
        if (this.quantidadeEmentos == 0) {
            System.out.println("[ ]");
        } else {
             Aluno aux = this.primeiro;
            for (int i = 0; i < this.quantidadeEmentos - 1; i++) {
            System.out.print("[");
           
            
                System.out.println("o que esta imprimindo no for");
                System.out.print(aux.getNota() + " , "+i);
                aux = aux.getProximo();
            }
            System.out.print(aux.getNota() + "]");
            System.out.println("o que esta imprimindo aqui");
        }
    }
}
