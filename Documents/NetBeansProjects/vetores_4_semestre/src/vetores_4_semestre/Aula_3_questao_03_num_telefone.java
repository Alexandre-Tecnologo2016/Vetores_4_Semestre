/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 questao 03 da aula 03 dia 12/08/2015
 Faça um programa de consulta de telefoes a partir de umm nome informado por uma chave de dados:
 leia nomes de pessoas com seus respectivos telefones, sendo a quantidade determinada pelo o usuario
 em seguida pergunte ao usuario qual o o nome que ele deseja consultar o telefone após  sua resposta,
 exiba o telefone da pessoa procurda.
 */
package vetores_4_semestre;

import java.util.Scanner;

/**
 *
 * @author Alexandre Vale
 */
public class Aula_3_questao_03_num_telefone {

    public static void main(String[] args) {
        int i;
        System.out.println("Quantas pessoas serão cadastrada? ");
        i = new Scanner(System.in).nextInt();
        int tel[] = new int[i];
        String nome[] = new String[i];
        for (int x = 0; x < i; x++) {
            System.out.println("cadastre a pessoa numero " + (1 + x));
            nome[x] = new Scanner(System.in).next();
            System.out.println("Cadastre o telefone da pessoa numero" + (1 + x));
            tel[x] = new Scanner(System.in).nextInt();
        }
        String buscarnome;
        System.out.println("Digite o nome do cliente");
        buscarnome = new Scanner(System.in).next();
        boolean inexistente = true;
        for (int x = 0; x < 1; x++) {
            if (buscarnome.equals(nome[x])) {
                System.out.println("" + nome[x]);
                System.out.println("" + tel[x]);
                inexistente = false;
            }
        }
        if (inexistente) {
            System.out.println(" Nome inexistente ");
        }
    }
}
