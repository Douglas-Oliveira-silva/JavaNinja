package Nivel_Basico.Desafio2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //Entrada de dados
        Scanner scanner = new Scanner(System.in);

        //Fazer o Array
        int NUMERO_MAX = 10;
        String[] ninjas = new String[NUMERO_MAX];

        //contadores
        int ninjasCadastrados = 0;
        int opcao = 0;

        while (opcao != 4) {

            // MENU
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    if (ninjasCadastrados < NUMERO_MAX){
                        System.out.println("Digite o nome do ninja para cadastro: ");
                        String nomeNinja = scanner.nextLine();
                        ninjas[ninjasCadastrados] = nomeNinja;
                        ninjasCadastrados ++;
                        System.out.println("Ninja cadastrado com sucesso!");
                    } else {
                        System.out.println("A lista de ninjas está cheia!");
                    } break;
                case 2:
                    if (ninjasCadastrados == 0){
                        System.out.println("Nenhum ninja encontrado.");
                    } else {
                        System.out.println("=========== Lista de Ninjas ===========");
                        for (int i = 0; i < ninjas.length ; i++) {
                            System.out.println(ninjas[i]);
                        }break;
                    }
                case 3:
                    System.out.println("Estamos terminando o programa...Aguarde");
                    break;

                default:
                    System.out.println("Esta opção não é válida");
                    break;
        }

        }




        //Fechando scanner
        scanner.close();
    }
}
