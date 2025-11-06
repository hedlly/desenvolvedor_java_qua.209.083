package com.heranca.app;


import com.heranca.models.PessoaFisica;
import com.heranca.models.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        PessoaFisica usuario = new PessoaFisica();
        PessoaJuridica empresa = new PessoaJuridica();

        usuario.email = "alex@gmail.com";
        usuario.telefone = "(61) 99466-6537";
        usuario.nome = "Hedlly";
        usuario.cpf = "02012552196";
        usuario.idade = 40;

        empresa.razaoSocial = "Alex LTDA";
        empresa.nomeFantasia = "Cyber";
        empresa.cnpj = "55.076.551/0001-01";
        empresa.email = "joao@cyber";
        empresa.telefone = "(61) 99466-6537";

        System.out.println("E-mail = do usuario: " + usuario.email);
        System.out.println("nome = do usuario: " + usuario.nome);
        System.out.println("telefone" +  usuario.telefone);
        System.out.println("cpf do usuario: " +  usuario.cpf);
        System.out.println("idade do usuario: " +  usuario.idade + "anos.");


        System.out.println("Razao Social da empresa: " + empresa.razaoSocial);
        System.out.println("nome da da empresa: " + empresa.nomeFantasia);
        System.out.println("Cnpj da empresa: " + empresa.cnpj);
        System.out.println("email da empresa: " + empresa.email);
        System.out.println("telefone da empresa: " + empresa.telefone);

    }
}
