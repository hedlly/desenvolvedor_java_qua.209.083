package com.atividade_02app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
          // Criando o objeto Scanner para leitura de dados
        Scanner scanner = new Scanner(System.in);

        // Solicita os coeficientes da equação
        System.out.print("Digite o valor de a (coeficiente de x): ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor de b (constante): ");
        double b = scanner.nextDouble();

        // Verifica se o valor de a é zero (não seria uma equação do 1º grau)
        if (a == 0) {
            System.out.println("O valor de 'a' não pode ser zero em uma equação do 1º grau.");
        } else {
            // Calcula a solução da equação
            double x = -b / a;
            System.out.println("A solução da equação " + a + "x + " + b + " = 0 é x = " + x);
        }

        // Fecha o scanner
        scanner.close();
    }
}
