package com.composicao.app;

import javax.swing.JOptionPane;

import com.composicao.models.Pessoa;
import com.composicao.models.Veiculo;
public class App {
    public static void main(String[] args) throws Exception {
        Pessoa motorista = new Pessoa();
        Veiculo carro = new Veiculo();

        // entrada de dados do motorista
        motorista.setNome(JOptionPane.showInputDialog("informe o nome do motorista:"));
        motorista.setCpf(JOptionPane.showInputDialog("informe o cpf do motorista:"));
        motorista.setTelefone(JOptionPane.showInputDialog("informe o telefone do motorista:"));
        
        // entrada de dados do veiculo
        carro.setMarca(JOptionPane.showInputDialog("informe a marca do carro"));
        carro.setModelo(JOptionPane.showInputDialog("informe o modelo do carro"));
        carro.setAno(JOptionPane.showInputDialog("informe o ano do carro"));
        carro.setCor(JOptionPane.showInputDialog("informe a cor do carro"));
        carro.setPlaca(JOptionPane.showInputDialog("informe a placa do carro"));

        carro.setPropietario(motorista);

        // saida de dados
        JOptionPane.showMessageDialog(
            null,
            "marca: " + carro.getMarca() +
            "\nModelo: " + carro.getModelo() +
            "\nAno: " + carro.getAno() +
            "\nCor: " + carro.getCor() +
            "\nPlaca: " + carro.getPlaca() +
            "\nDono do veiculo: " + carro.getPropietario().getNome() +
            "\nCpf do do dono do veiculo: " + carro.getPropietario().getCpf() +
            "nTelefone do dono do veiculo: " + carro.getPropietario().getTelefone() 

        );
    }
}
