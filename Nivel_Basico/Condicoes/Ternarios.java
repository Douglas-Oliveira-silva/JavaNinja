package Nivel_Basico.Condicoes;

public class Ternarios {
    public static void main(String[] args) {

        /*
        * Ternarios: Maneiras de reduzir o código
        * variavel = (condicao) ? ValorSeVerdadeiro : ValorSeFalso
        * */

        short numeroDeMissoes = 1;
        String nivelDoNinja = (numeroDeMissoes >= 10) ? "Esse ninja esta com mais de 10 missões" : "Esse ninja tem menos de 10 missoes";
        System.out.println(nivelDoNinja);

    }

}
