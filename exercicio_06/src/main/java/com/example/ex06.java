package com.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class ex06 
{
    public static void main( String[] args )
    {
        Scanner teclado = new Scanner(System.in);

        System.out.println("crie um login: ");
        String login = teclado.next();

        System.out.println("crie uma senha: ");
        String senha = teclado.next();

        System.out.println("confirme o login: ");
        String loginTeste = teclado.next();

        System.out.println("confirme a senha");
        String senhaTeste = teclado.next();

        boolean resultadoLogin = login.equals(loginTeste);
        boolean resultadoSenha = senha.equals(senhaTeste);

        if (resultadoLogin && resultadoSenha) {
            System.out.println("boas vindas! usuário logado");
        } else {
            System.out.println("nome de ususário ou senha inválidos.");
        }
    }
}
