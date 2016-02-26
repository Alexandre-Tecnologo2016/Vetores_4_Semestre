/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Revisao_4_semestre_1_nva;

import javax.swing.JOptionPane;

/**
 *
 * questão 01 Desenvolva um programa para demostrar um exemplo de uma fila de
 * espera de um consultório médico. # o programa deve permitir 1 - inserir um
 * paciente na fila de espera; 2 - chamar o paciente para ser atendido; 3 -
 * verificar se a fila está cjeia ou vazia; 4 - verificar o próximo paciente a
 * ser atendido; 5 - informar quantos pacientes existem na fila de espera;
 *
 * @author Alexandre Vale
 */
public class Consultorio {

    private int CodPaciente;
    private String nomePaciente;

    public int getCodPaciente() {
        return CodPaciente;
    }

    public void setCodPaciente(int CodPaciente) {
        this.CodPaciente = CodPaciente;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;

    }

    public void displayConsultorio() {
        JOptionPane.showInternalMessageDialog(null, "código do paciente : " +CodPaciente);
    }
}
