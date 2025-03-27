package Nivel_Basico.TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        /* Tudo que for digitado aqui dentro com o comando PSVm ou MAIN vai ser compilado pelo java*/

        /* Dados nao primitivos: String, Array, Class, Enum
        *  Obejtivo: Criar um ninja, e atribuir metodos a ele.
        * */

        String nome = "Naruto Uzumaki";
        String nomeUpperCase = nome.toUpperCase(); // ToUppercase vai colocar tudo em CAPSLOCK

        System.out.println("Este texto está em CAPSLOCK " + nomeUpperCase);
        System.out.println("Este texto não está em CAPSLOCK " + nome);

        String Aldeia = "Aldeia da Folha";
        String AldeiaLowerCase = Aldeia.toLowerCase(); //toLowerCase vai colocar tudo em caixa baixa/minusculo

        System.out.println(AldeiaLowerCase);
        System.out.println(Aldeia);
    }
}
