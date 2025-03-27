package Nivel_Intermediario.Hokages;

public class main {
    public static void main(String[] args) {

        Hokages Hashirama = new Hokages(45);
        System.out.println(Hashirama.idade);

        Hokages Tobirama = new Hokages("Tobirama Senju");
        System.out.println(Tobirama.nome);

        Hokages Minato = new Hokages("Minato Namikaze",32,false);
        System.out.println(Minato.nome);
    }
}
