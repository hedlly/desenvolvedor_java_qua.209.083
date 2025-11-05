package com.atividade_04.app;

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       // instancia clase Scanner
       Scanner leia = new Scanner(System.in);

       // declacarao de variaveis
       String[] salas = new String[5];
       String nome;
       String sala;
       String filme = "";
       int idade;
       int idadeMinima = 0;

       // inicializar o array
       salas [0] = "a roda quadrada";
       salas [1] = "a volta dos que nao foram";
       salas [2] = "poeria em alto mar";
       salas [3] = "as tranças do rei careca";
       salas [4] = "a vingança do peixe frito";

       // entradas de dados do usuario
       System.out.println("informe o nome");
       nome = leia.nextLine();
       System.out.println("informe a idade");
       idade = leia.nextInt();

       // limpeza de buffer
       leia.nextLine();

       // loop 
       do {
        // menu
        System.out.println("sala 1 - " + salas[0] + " - livre");
        System.out.println("sala 2 - " + salas[1] + " - 12 anos");
        System.out.println("sala 3 - " + salas[2] + " - l4 anos");
        System.out.println("sala 4 - " + salas[3] + " - 16 anos");
        System.out.println("sala 5 - " + salas[4] + " - 18 anos");
        System.out.println(" informe a sala desejada");
        sala = leia.nextLine();

        switch (sala) {
            case "1":
            filme = salas[0];
            idadeMinima = 0;
               break;
            case "2":
            filme = salas [1];
            idadeMinima = 12;
               break;
            case "3":
            filme = salas [2];
            idadeMinima = 14;
               break;
            case "4":
            filme = salas [3];
            idadeMinima = 16;
               break;
            case "5":
            filme = salas [4];
            idadeMinima = 18;
              break;
            default:
            System.out.println("sala inexistente.");
        
        }

        // verificacao da idade
        if (idade >= idadeMinima) {
            System.out.println("filme escolhido: " + filme);
            System.out.println("tenha um bom filma, " + nome);
            System.out.println("a");

        }
        else {
            System.out.println("entrada nao permitida.");
            System.out.println("favor escolher outro filme.");
            System.out.println("0");
        }
       } while (idade  < idadeMinima);
       

       // fecha objeto
       leia.close();
    }
}
