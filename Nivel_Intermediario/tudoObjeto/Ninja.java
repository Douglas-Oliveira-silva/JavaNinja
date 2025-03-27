package Nivel_Intermediario.tudoObjeto;

public class Ninja {
    String nome;
    String aldeia;
    int idade;

    // Criar um método publico personalizado
    /*
    * O metodo VOID nao retorna valor nenhum!
    * */
    public void SharinganAtivado(){
        System.out.println("O Sharigan Ativou!");
    }

    /*
    * O metodo string tem que retornar uma string
    * */
    public String euSouUmNinja(){
        return "Oi, Eu Sou um Ninja";
    }

    // Metodo int tem que retornar INT
    public int anosParaSeTornarHokage(int idadeMinimaParaSerHokage) {
        return idadeMinimaParaSerHokage - idade;
    }
}
