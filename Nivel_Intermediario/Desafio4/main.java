package Desafio4;

public class main {
    public static void main(String[] args) {

        //inicializando ninja básico
        ninjaBasico Naruto = new ninjaBasico("Naruto Uzumaki", 16,TipoHabilidade.NINJUTSU);
        Naruto.mostrarInformacoes();
        Naruto.executarHabilidade();
        System.out.println("=====================================================");

        // Ninja Avançada

        ninjaAvancado sasuke = new ninjaAvancado("Sasuke Uchiha",18,TipoHabilidade.NINJUTSU,TipoHabilidade.GENJUTSU);
        sasuke.mostrarInformacoes();;
        sasuke.executarHabilidade();
        sasuke.executarEspecialidade();

    }
}
