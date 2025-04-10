package Nivel_Intermediario.ArrayxListxStack_Resumao;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        // Arrays
        System.out.println("------------ ARRAY ------------");
        String[] nomeNinjaArray = new String[4];
        nomeNinjaArray[0] = "Naruto Uzumaki";
        nomeNinjaArray[1] = "Sasuke Uchiha";
        nomeNinjaArray[2] = "Sakura Haruno";
        nomeNinjaArray[3] = "Hinata Hyuga";
        // System.out.println("nomeNinjaArray = " + nomeNinjaArray);
        // System.out.println("nomeNinjaArray[0] = " + nomeNinjaArray[0]);
        for (int i = 0; i < nomeNinjaArray.length; i++) {
            System.out.println(nomeNinjaArray[i]);
        }


        // Lista é um pouco mais lenta em comparação com Array
        System.out.println("------------ LISTA ------------");
        List<String> nomeNinjaList = new ArrayList<>();
        nomeNinjaList.add("Naruto Uzumaki");
        nomeNinjaList.add("Sasuke Uchiha");
        nomeNinjaList.add("Sakura Haruno");
        System.out.println(nomeNinjaList);

        //
        System.out.println("------------ STACKS ------------");
        Stack<String> nomeNinjaStack = new Stack<>();
        nomeNinjaStack.push("Naruto Uzumaki");
        nomeNinjaStack.push("SasukeUchiha");
        nomeNinjaStack.push("Sakura Haruno");
        System.out.println("nomeNinjaStack = " + nomeNinjaStack);
        System.out.println("Tirar da pilha: " + nomeNinjaStack.pop());


    }
}

/*Array
• São Estáticos;
• Tem tamanhos pré-determinados;
• Se há um espaço de referência que não é utilizado, o retorno ao chamarmos sout é null.


List
• Array com poderes.
• Métodos que auxiliam na agilidade do código.
• É mais lenta em comparação com Array.
• São dinâmicas.


Stack
• Pilhas.
• Ultimo elemento que colocamos, sempre será o primeiro a sair,
• Principais elementos: PUSH, POP e PEEK(mostra o próximo elemento sem remover)
• Utilizamos quando queremos ORDENAÇÃO (ex. cavalo degustando uma borboleta + histórico do navegador)
    o ultimo elemento que entrou sera o primeiro a sair
         push() - colocar elemento na pilha
         pop() - tirar elemento da pilha
         peek() - verificar qual proximo elemento da pilha
         size() - verificar o tamanho da pilha quantidade de elementos*/