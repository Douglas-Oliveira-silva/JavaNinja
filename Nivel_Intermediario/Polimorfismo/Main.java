package Nivel_Intermediario.Polimorfismo;

public class Main {
    public static void main(String[] args) {


        // obj ninja nao da pra ser criado.

        //obj uzumaki
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Aldeia da Folha";
        naruto.idade = 16;
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();

        //obj uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Aldeia da Folha";
        sasuke.idade = 17;
        sasuke.habilidadeEspecial();

        //obj Uchiha 2
        Uchiha Itachi = new Uchiha("Itachi Uchiha", "Akatsuki",27);
        Itachi.habilidadeEspecial();

    }
}
