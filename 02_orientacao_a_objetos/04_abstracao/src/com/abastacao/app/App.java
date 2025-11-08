package com.abastacao.app;

import java.util.Scanner;

import com.abstracao.models.Carro;
import com.abstracao.models.Moto;




public class App {
    public static void main(String[] args) throws Exception {
        // instancia objeto de entrada de dados
        Scanner leia = new Scanner(System.in);


        // instancia as classes
        Carro carro = new Carro();
        Moto moto = new Moto();

        // declaracao de variaveis
        String combustivel;

    

        // entrada de dados
        System.out.println("INFORME OS DADOS DO CARRO\n");
        System.out.println("informe o fabricante");
        carro.fabricante = leia.nextLine();
        System.out.println("informe o modelo");
        carro.modelo = leia.nextLine();
        System.out.println("informe o cor");
        carro.cor = leia.nextLine();
        System.out.println("informe o ano");
        carro.ano = leia.nextLine();
        System.out.println("informe o placa");
        carro.placa = leia.nextLine();

        // padrao de combustivel
        carro.motorFlex = false;
        carro.motorEletrico = false;
        carro.motorDiesel = false;
        carro.motorGasolina = false;
        carro.motorEtanol = false;

        // usuario informa o tipo de combustivel
        System.out.println("\nInforme o tipo de combustivel:\n");
        System.out.println("1 - galoslina");
        System.out.println("2 - etanol");
        System.out.println("3 - tanto Gasolina como Etnol");
        System.out.println("4 -Diesel");
        System.out.println("5 - Eletrico");
        combustivel = leia.nextLine();

        switch (combustivel) {
           case "1":
                carro.motorGasolina = true;
          case "2":
                carro.motorEtanol = true;
            case "3":
                carro.motorFlex = true;
                case "4":
                carro.motorDiesel = true;
                case "5":
                carro.motorEletrico = true;
                break;
                default:
                System.out.println("Motor inexixtente");
        
        }

        // entrada de dados da moto
        System.out.println("\nINFORME OS DADOS DA MOTO");
        System.out.println("informe o fabricante");
        moto.fabricante = leia.nextLine();
        System.out.println("informe o modelo");
        moto.modelo = leia.nextLine();
        System.out.println("informe o cor");
        moto.cor = leia.nextLine();
        System.out.println("informe o ano");
        moto.ano = leia.nextLine();
        System.out.println("informe o placa");
        moto.placa = leia.nextLine();

        // saida de dados 
        System.out.println("\nDADOS DO CARRO:\n");
        carro.exibirDados();
        System.out.println("\nDADOS DO MOTO:\n");
        moto.exibirDados();
        



        // fecha objeto leia
        leia.close();
      

    }
}
