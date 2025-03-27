package Nivel_Basico.Condicoes;

import java.util.Scanner;

public class EstudoSwitchCase {

    public static void main(String[] args) {
        /*
         * SwitchCases: Servem para gerar casos especificos
         * objetivo: Pedir para o usuario escolher entre os ninjas
         * SwitchCase
         * */

        // Pedir para o usuario
        Scanner scanner = new Scanner(System.in);

        // Mostrar opçoes para o usuario
        System.out.println("Escolha um personagem: ");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");

        // Pedir para o usuario escolher uma opção
        int escolhaDoUsuario = scanner.nextInt();
        System.out.println("Voce digitou o numero: " + escolhaDoUsuario);

        // Reacao ao escolher um personagem

        switch (escolhaDoUsuario) {
            case 1:
                System.out.println("O Usuario escolheu Naruto Uzumaki, o próximo Hokage!");
                break;
            case 2:
                System.out.println("O usuario escolheu Sasuke Uchiha, o ninja mais revoltado!");

            case 3:
                System.out.println("O usuario escolheu Sakura Haruno, a personagem feminina mais legal!");
                break;
            default:
                System.out.println("Você não digitou nenhuma resposta válida, tente novamente.");
        }



        // Fechando Scanner
        scanner.close();
    }
}
