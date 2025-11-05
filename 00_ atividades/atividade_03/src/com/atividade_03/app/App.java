package com.atividade_03.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       // instancia scanner
       Scanner leia = new Scanner(System.in);

       // declaracao de variaveis
       String nome;
       String resultado;
       double peso;
       double altura;
       double imc;
       
       // entrada de dados
       System.out.println("informe o nome");
       nome = leia.nextLine();
       System.out.println("informe o peso em kg");
       peso = leia.nextDouble();
       System.out.println("informe altura em metros");
       altura = leia.nextDouble();

       //calcular imc
       imc = peso/Math.pow(altura,2);

       // exibe o imc na tela 
       System.out.println(nome + ", seu IMC é "+  String.format("%.2f", imc) + ".");

       // exibe o diagnostico
       resultado =  (imc < 18.5) ? " está abaixo do peso" :
        (imc < 25) ? " está no peso ideal" :
        (imc <30) ? " esá acima do peso" :
        (imc < 32) ? " está obeso " :
        (imc <40) ? " esta com obedide nivel 2" :
        " está com obsidade morbita" ;

        // exibe resultado 
        System.out.println(nome + resultado + ".");

       




       // fecha objeto leia
       leia.close();
    }
}

