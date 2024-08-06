/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio_08;

/**
 *
 * @author aluno.den
 */
public class Livros {
    private String titulo;
    private String autor;
    private int paginas;
    private double preco;
    
    // construtor
    public Livros(String titulo, String autor, int paginas, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.preco = preco;
    }
    
    //acessos
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
}
