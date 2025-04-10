package Nivel_Intermediario.ArrayPoderoso;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Array
        // sao estaticos, nao alteram de tamanho
        // precisa inserir valor

        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto";
        ninjasArray[1] = "Sasuke";
        ninjasArray[2] = "Sakura";

        for (int i = 0; i < ninjasArray.length; i++) {
            System.out.println("Array: " + ninjasArray[i]);
        }

        // listas
        // um array com superpoderes , ele aumenta e diminui automaticamente e não lida com memoria

        List<String>ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki");
        ninjasList.add("Sasuke Uchiha");
        ninjasList.add("Sakura Haruno");
        ninjasList.add("Kakashi Hatake");

        // adicionar na lista
        System.out.println("ninjaList: " + ninjasList);

        // remover da lista
        ninjasList.remove("Kakashi Hatake");
        System.out.println("ninjaList: " + ninjasList);

        // trocar elementos
        ninjasList.set(2,"Hinata Hyuga");
        System.out.println("novo ninja cadastrado" + ninjasList);

        //ver o tamanho da lista
        System.out.println("Tamanho da lista:" + ninjasList.size());

    }

}
