package Nivel_Intermediario.Desafio6;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        // Iniciar uma linkedlist com 7 ninjas
        LinkedList<Ninja> ListaDeNinjas = new LinkedList<>();

        // Adicionar ninja na lista linkedlist
        ListaDeNinjas.add(new Ninja("Naruto Uzumaki",18,"Konoha"));
        ListaDeNinjas.add(new Ninja("Sasuke Uchiha",18,"Konoha"));
        ListaDeNinjas.add(new Ninja("Sakura Haruno",17,"Konoha"));
        ListaDeNinjas.add(new Ninja("Hatake Kakashi",31,"Konoha"));
        ListaDeNinjas.add(new Ninja("Gaara",17,"Areia"));
        ListaDeNinjas.add(new Ninja("Shikamaru Nara",17,"Konoha"));
        ListaDeNinjas.add(new Ninja("Temari",18,"Areia"));

        // listar os ninjas
        System.out.println("--------------------Lista de Ninjas--------------------");
        // complexidade do algoritmo o(n)
        for (Ninja ninja : ListaDeNinjas){
            System.out.println(ninja);
        }

        // Adicionar o ninja no inicio da lista
        System.out.println("--------------------Adicionando novo Ninja--------------------");
        ListaDeNinjas.addFirst(new Ninja("Boruto Uzumaki",9,"Konoha"));
        System.out.println(ListaDeNinjas);

        // remover o ninja no inicio da list
        System.out.println("--------------------Removendo primeiro Ninja--------------------");
        Ninja removido = ListaDeNinjas.removeFirst();
        System.out.println("Ninja removido" + removido);

        // Listas novamente
        System.out.println("--------------------Mudanças--------------------");
        for (Ninja ListaDeNinjasAtualizada : ListaDeNinjas){
            System.out.println("Lista de Ninjas depois das mudanças " + ListaDeNinjasAtualizada);
        }


        // procurar um ninja por indice
        System.out.println("--------------------procurar por indice--------------------");
         Ninja terceiroNinja = ListaDeNinjas.get(3);
        System.out.println("Terceiro Ninja = " + terceiroNinja);

    }
}
