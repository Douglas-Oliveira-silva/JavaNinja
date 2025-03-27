package Nivel_Basico.Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {

    public static void main(String[] args) {
        /*
         * Scanner = é um jeito de trazer o usuario para dentro da aplicação
         * objetivo: o usuario vai criar um ninja e vamos validar os dados
         * */

        // Abrir o Scanner
        Scanner caixaDeTexto = new Scanner(System.in);

        // Receber o nome do ninja
        System.out.print("Escreva o nome do Ninja: ");
        String nomeDoNinja = caixaDeTexto.nextLine();
        System.out.println("O nome do Ninja é: " + nomeDoNinja);

        // Receber a idade do ninja
        System.out.print("Escreva aqui a idade do seu ninja: ");
        int idadeDoNinja = caixaDeTexto.nextInt();
        System.out.println("Idade do ninja é: " + idadeDoNinja + " anos");

        if (idadeDoNinja >= 18){
            System.out.println("Este ninja ja é maior de idade e pode ir para missões fora da aldeia ");
        } else {
            System.out.println("Este ninja é muito novo ainda, precisa treinar mais antes de sair da vila");
        }



        // Fechar sempre o Scanner
        caixaDeTexto.close();

    }

}