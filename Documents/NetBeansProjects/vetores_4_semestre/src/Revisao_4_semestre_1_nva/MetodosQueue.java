/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Revisao_4_semestre_1_nva;

/**
 *
 * @author Alexandre Vale
 */
public class MetodosQueue {

    private int maxSize;
    private long[] array;
    private int inicio;
    private int nItens;
    private int ultimo;

    public MetodosQueue(int s) {
        maxSize = s;
        array = new long[maxSize];
        inicio = 0;
        ultimo = -1;
        nItens = 0;

    }

    public void inserir(long j) {
        if (ultimo == maxSize - 1) {
            ultimo = -1;
            array[ultimo] = j;
            nItens++;
        }
    }

    public void inserirfila(long valor) {
        if (ultimo < maxSize - 1) {
            array[ultimo] = valor;
            ultimo++;
        }
    }

    public void inserirFilaNova(long x) {
        if (nItens < maxSize - 1) {
            array[ultimo] = x;
            nItens++;
            ultimo = nItens;;
        }
    }

    public long remove() {
        long temp = array[inicio++];
        if (inicio == maxSize) {
            inicio = 0;
            nItens--;

        }
        return temp;
    }
}
