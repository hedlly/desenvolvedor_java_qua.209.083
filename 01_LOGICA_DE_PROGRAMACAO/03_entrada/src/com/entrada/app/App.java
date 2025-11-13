

import java.util.Scanner;
public class App {

    public static void main(String[] args) throws Exception {
    //    instancia do objeto leia
        java.util.Scanner leia = new Scanner (System.in);
        
        // declaracao de variaveis
        String nome;
        String email;
        String idade;
        double altura;

        // entrada de dados
        System.out.println("informe seu nome:");
        nome = leia.nextLine();
        System.out.println("informe sua idade:");
        idade = leia.nextLine();
        System.out.println( "informe sua altura em metros:");
        altura = leia.nextLine();
        System.out.println("informe seu email:");
        email = leia.nextLine();

        // saida de dados 
        System.out.println("Mome: " +nome);
        System.out.println("Idade: " +idade);
        System.out.println("altura: " +altura);

        // limpexa de buffer
       leia.nextLine();
    
      

    }
        
}
