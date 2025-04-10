package Nivel_Intermediario.Queue;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Array
        String[] ninjasArray = new String[6];

        // List
        List<String> ninjaList = new ArrayList<>();

        // Stack
        Stack<String> ninjasStack = new Stack<>();

        // QUEUE // FILAS

        Queue<String> ninjasQueue = new LinkedList<>();
        ninjasQueue.add("Naruto Uzumaki");
        ninjasQueue.add("Sasuke");
        ninjasQueue.add("Sakura");
        ninjasQueue.add("Kakashi");
        ninjasQueue.add("Shikamaru");

        // MOSTRAR A FILA
        System.out.println("Ninjas na Fila: " + ninjasQueue);

        // Tirar um ninja da fila - atacando a head
        ninjasQueue.poll();
        System.out.println("Ninjas na fila depois do pool: " + ninjasQueue);

        // Como ver quem é o primeiroR
        System.out.println("Ninja no head: " + ninjasQueue.peek());

        //add a fila
        ninjasQueue.add("Hashirama Senju");
        ninjasQueue.add("Tobirama Senju");
        System.out.println("Ninjas na fila nova: " +  ninjasQueue);

        // Deletar o Tail - não dá !

        // esvaziar fila

        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();

        // verificar se está vazia
        if (ninjasQueue.isEmpty()){
            System.out.println("A Fila está vazia");
        } else {
            System.out.println("Ainda temos ninjas na fila");
        }












    }
}
