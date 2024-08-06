/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_08;

import java.util.HashSet;

/**
 *
 * @author aluno.den
 */
public class Exercicio_08 {

    public static void main(String[] args) {
        Livros livroUm = new Livros("Me Tira Daqui", "Eu", 10, 50.99);
        Livros livroDois = new Livros("Por Favor Eu Imploro", "Eu", 10, 49.99);
                
        System.out.println("titulo: " + livroUm.getTitulo());
        System.out.println("autor: " + livroUm.getAutor());
        System.out.println("paginas: " + livroUm.getPaginas());
        System.out.println("preco: " + livroUm.getPreco() + "\n");
        System.out.println("titulo: " + livroDois.getTitulo());
        System.out.println("autor: " + livroDois.getAutor());
        System.out.println("paginas: " + livroDois.getPaginas());
        System.out.println("preco: " + livroDois.getPreco());
    }
}
