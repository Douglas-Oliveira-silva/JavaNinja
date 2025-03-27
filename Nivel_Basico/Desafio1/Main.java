public class Main {

    public static void main(String[] args) {

        // Ninja 1
        String nomeNinja1 = "Naruto Uzumaki";
        int idade = 17;
        String missao = "Encontrar o bandido";
        String statusDaMissao = "Em andamento";
        char nivelDaMissao = 'S';

        // Verificar nivel da missão e idade do ninja
        if (idade < 15){
            if (nivelDaMissao == 'C' || nivelDaMissao == 'D'){
                statusDaMissao = "Concluida";
            } else {
                statusDaMissao = "Não concluida, idade insuficiente";
            }
        } else {
            statusDaMissao = "Missão Concluida";
        }

        // Ninja 2
        String nomeNinja2 = "Sasuke Uchiha";
        int idade2 = 12;
        String missao2 = "Reconhecimento da aldeia";
        String statusDaMissao2 = "Em andamento";
        char nivelDaMissao2 = 'S';

        // Verificar nivel da missão e idade do ninja 2
        if (idade2 < 15) {
            if (nivelDaMissao2 == 'C' || nivelDaMissao2 == 'D') {
                statusDaMissao2 = "Missão concluida";
             } else {
                statusDaMissao2 = "Missão não concluida, você é muito novo";
            }
            } else {
            statusDaMissao2 = "Missão concluida, você é maior de idade";
        }

        // Ninja 3
        String nomeNinja3 = "Sakura Haruno";
        int idade3 = 16;
        String missao3 = "Curar Feridos da guerra";
        String statusDaMissao3 = "Em andamento";
        char nivelDaMissao3 = 'D';

        System.out.println("------------------------------");

        System.out.println("Nome do Ninja: " + nomeNinja1);
        System.out.println("Idade do Ninja: " + idade);
        System.out.println("Missão do Ninja: " + missao);
        System.out.println("Status da Missão: " + statusDaMissao);
        System.out.println("Nível da Missão: " + nivelDaMissao);

        System.out.println("------------------------------");

        System.out.println("Nome do Ninja: " + nomeNinja2);
        System.out.println("Idade do Ninja: " + idade2);
        System.out.println("Missão do Ninja: " + missao2);
        System.out.println("Status da Missão: " + statusDaMissao2);
        System.out.println("Nível da Missão: " + nivelDaMissao2);

        System.out.println("------------------------------");

        System.out.println("Nome do Ninja: " + nomeNinja3);
        System.out.println("Idade do Ninja: " + idade3);
        System.out.println("Missão do Ninja: " + missao3);
        System.out.println("Status da Missão: " + statusDaMissao3);
        System.out.println("Nível da Missão: " + nivelDaMissao3);

        System.out.println("------------------------------");

    }
}
