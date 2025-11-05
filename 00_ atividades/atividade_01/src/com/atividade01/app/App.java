package com.atividade01.app;

import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {
         // instancia o Scanner
         // Cria um objeto Scanner para ler entradas do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita os dados do usuário
        System.out.println("Digite o nome:");
        String nome = scanner.nextLine();
        
        System.out.println("Digite a data de nascimento (dd/mm/aaaa):");
        String dataNascimento = scanner.nextLine();
        
        System.out.println("Digite o CPF:");
        String cpf = scanner.nextLine();
        
        System.out.println("Digite o e-mail:");
        String email = scanner.nextLine();
        
        System.out.println("Digite o telefone:");
        String telefone = scanner.nextLine();
        
        // Exibe os dados inseridos
        System.out.println("\n--- Dados Cadastrados ---");
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("CPF: " + cpf);
        System.out.println("E-mail: " + email);
        System.out.println("Telefone: " + telefone);
        
        // Fecha o scanner
        scanner.close();

       
    }
}
