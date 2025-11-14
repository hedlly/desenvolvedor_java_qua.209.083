package com.bank.app;

import javax.swing.JOptionPane;


import com.bank.models.conta;

public class App {
    public static void main(String[] args) throws Exception {
    conta cc = new conta(null, null, "1234-5", "12345-6", 0.0);
    
    String[] opcaoes = {
        "Consultar dados",
        "Depositar",
        "Sacar",
        "Sair",

    };
    Object opcao;

    cc.setTitular(JOptionPane.showInputDialog("Informe o nome do titular da conta:"));
    cc.setCpf(JOptionPane.showInputDialog("Informe o CPF do titular da conta:"));
    
}
}

