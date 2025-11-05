package com.atividade_02.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // declaracao de variaveis
        double a;
        double b;
        double x;

        // entrada de dados 
        System.out.println("Informe o valor de 'a':");
        a = leia.nextDouble();
        System.out.println("informe o valor de 'b':");
        b = leia.nextDouble();

        // calcula e equação do 1º grau a*x + b = 0
        if (a != 0){
            x = -b/a;
            System.out.println("x = " + x);

        }
        else {
            System.out.println("nao exite raiz real.");
        
        }

        // saida de dados 
        System.out.println("null");



        // fecha objeto leia 
        leia.close();
    }
}
