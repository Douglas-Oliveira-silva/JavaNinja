package Nivel_Intermediario.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        // Array
        // Sao estaticos e tem ref de memoria
        String [] ninjasArray = new String [3];
        ninjasArray[0] = "Naruto Uzumaki";

        // Listas
        // sao dinamicas e tamanho aumenta e diminui conforme precisa
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki");

        // Stack
        // o ultimo elemento que entrou sera o primeiro a sair
        /*push() - colocar elemento na pilha
        * pop() - tirar elemento da pilha
        * peek() - verificar qual proximo elemento da pilha
        * size() - verificar o tamanho da pilha quantidade de elementos*/
        Stack<String> ninjaStack = new Stack<>();
        ninjaStack.add("Naruto Uzumaki");
        ninjaStack.add("Sasuke Uchiha");
        ninjaStack.add("Sakura Haruno");
        System.out.println("Minha stack atual: " + ninjaStack);
        ninjaStack.pop();
        System.out.println("Minha stack atualizada com pop: " + ninjaStack);
        ninjaStack.peek();
        System.out.println("Minha stack com o proximo elemento do topo: " + ninjaStack.peek());
        System.out.println("Tamanho da stack: " +  ninjaStack.size() + " elementos");

    }

}
