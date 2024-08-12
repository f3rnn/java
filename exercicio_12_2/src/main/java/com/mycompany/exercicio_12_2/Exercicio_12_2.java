/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_12_2;

/**
 *
 * @author aluno.den
 */
public class Exercicio_12_2 {

    public static void main(String[] args) {
        Processador processador = new Processador(4.3, "intel", "i3");
        Memoria memoria = new Memoria(8, 3333, "corsair", "ddr4");
        PlacaMae placamae = new PlacaMae("lga 1200", "msi", "a520m");
        DispositivoArmazenamento armazenamento = new DispositivoArmazenamento(256, "nvme", "kingston", "nv2");
        
        System.out.println("processador: " + processador.getModelo());
        System.out.println("memoria: " + memoria.getModelo());
        System.out.println("placa mae: " + placamae.getModelo());
        System.out.println("armazenamento: " + armazenamento.getModelo());
        
    }
}
