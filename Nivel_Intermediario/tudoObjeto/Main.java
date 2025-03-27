package Nivel_Intermediario.tudoObjeto;

public class Main {
    public static void main(String[] args) {

        //Criar o ninja Naruto - Naruto é um Objeto
        Ninja Naruto = new Ninja();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da Folha";
        Naruto.idade = 17;

        // Criar ninja Sasuke Uchiha - sasuke é um OBJETO
        Ninja Sasuke = new Ninja();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da Folha";
        Sasuke.idade = 18;

        // Aplicando Metodos aos meus objetos
        Sasuke.SharinganAtivado();
        String chamandoMetodo = Sasuke.euSouUmNinja();
        System.out.println(chamandoMetodo);

      int quantoTempoFalta =  Sasuke.anosParaSeTornarHokage(30);
        System.out.println("Voce tem: " + Sasuke.idade + " anos, entao falta no minimo: " + quantoTempoFalta + " anos para se tornar Hokage");
        // Criar Sakura Haruno
        Ninja Sakura = new Ninja();
        Sakura.nome = "Sakura Haruno";
        Sakura.aldeia = "Aldeira da Folha";
        Sakura.idade = 18;




    }
}
