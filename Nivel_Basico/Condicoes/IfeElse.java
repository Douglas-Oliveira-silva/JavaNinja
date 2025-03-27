package Nivel_Basico.Condicoes;

public class IfeElse {
    public static void main(String[] args) {

        /*
        * IF e ELSE - Condições
        * Objetivo: Pasar o ninja de nivel de acordo com o numero de missoes
        * */

        String nome = "Naruto Uzumaki";
        String rank;
        int idade = 19;
        boolean hokage = false;
        short numeroDeMissoes = 20;


        //se(condicao) {faca isso}
        if (numeroDeMissoes == 10 && idade > 15){
            System.out.println("Rank: Chunnin");
        } else if (numeroDeMissoes >= 20 && idade > 18) {
            System.out.println("Rank: Jounin");
        } else {
            System.out.println("Rank: Gennin");
        }
    }
}
