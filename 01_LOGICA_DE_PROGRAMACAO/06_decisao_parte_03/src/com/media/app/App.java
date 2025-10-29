package com.media.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instancia a classe Scanner 
        Scanner leia = new Scanner(System.in);

        // delclaracao de variaveis
        String nome;
        double nota;

        // entradas de dados
        System.out.println("Informe o nome:");
        nome = leia.nextLine();
        System.out.println("informe a nota de 0 a 10:");
        nota = leia.nextDouble();

        // verifica se a nota é valida
        if (nota >= 0 && nota <= 10) {
            if (nota 
        }

        // fecha objeto leia 
        leia.close();

    }
    
}
