/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Revisao_4_semestre_1_nva;

import java.util.Scanner;

/**
 *
 * @author Alexandre Vale
 */
public class Menu_Consultorio {

    public static void main(String[] args) {

        // public static void Menu() {
        MetodosQueue obj = new MetodosQueue(10);
        boolean teste = true; 
        int opcao;
        while (teste) {
        //while ((opcao >=1 )||(opcao >=5)) {
           
            System.out.println("Digite 1 para inserir um paciente na fila ");
            System.out.println("Digite 2 para chamar o paciente a ser atendido ");
            System.out.println("Digite 3 para verificar se a fila está cheia ou vazia ");
            System.out.println("Digite 4 para verificar o próximo paciente a ser atendido ");
            System.out.println("Digite 5 para informar quantos pacientes existem na fila de espera ");
            System.out.println("Digite 0 para sair do sistema ");

            System.out.println("Digite a opção desejada ");
            opcao = new Scanner(System.in).nextInt();

            //  public void teste_menu(int opcao) {
            if (opcao == 1) {
                System.out.println("Voce escolheu a opção 1 inserir paciente na fila");
            }
            if (opcao == 2) {
                System.out.println("Você escolheu a opção 2 para chamar o paciente a ser atendido");
            }
            if (opcao == 3) {
                System.out.println("Você escolheu a opção 3 para verificar se a fila esta cheia ou vazia");
            }
            if (opcao == 4) {
                System.out.println("Você escolheu a opção 4 para verificar o proximo paciente ser atendido");
            }
            if (opcao == 5) {
                System.out.println("Voce escolheu a opcao 5 para saber quantos pacientes tem na fila");
            }
            if (opcao == 0){
                teste = false;
                System.out.println("Sistema finalizado");
            } else {
                System.out.println("opção invalida");
            }
        }
    }
}
