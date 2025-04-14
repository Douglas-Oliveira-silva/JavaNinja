package Nivel_Intermediario.HashSet_TreeSet;

import java.util.*;

public class main {
    public static void main(String[] args) {

        // 3 implementaçoes collections
        // HASHSET
       /* List<String> ninjas = new ArrayList<>();
        ninjas.add("Naruto Uzumaki");
        ninjas.add("Sasuke Uchiha");
        ninjas.add("Sakura Haruno");
        ninjas.add("Naruto Uzumaki");
        System.out.println("ninjas = " + ninjas);

        // Set 99% das vezes será utilizado quando vocë quiser ignorar nomes repetidos na sua array ou list/ Set nao tem ordenação
        Set<String> ninjasSet = new HashSet<>();
        ninjasSet.addAll(ninjas);
        ninjasSet.remove("Sakura Haruno");
        System.out.println("ninjaSet = " + ninjasSet);*/

        /* TREESET
        List<String> ninjas = new ArrayList<>();
        ninjas.add("Naruto Uzumaki");
        ninjas.add("Sasuke Uchiha");
        ninjas.add("Sakura Haruno");
        ninjas.add("Naruto Uzumaki");
        ninjas.add("Danzo");
        ninjas.add("Kakashi Hatake");
        ninjas.add("Boruto Uzumaki");
        System.out.println("ninjas = " + ninjas);

        // hashset é para usar quando vc quer nomes sem duplicados, porém em ordens lógica (alfabetica, numerica)
        Set<String> ninjasSet = new TreeSet<>();
        ninjasSet.addAll(ninjas);
        ninjasSet.remove("Sakura Haruno");
        System.out.println("ninjaTreeSet = " + ninjasSet);
*/
        // LinkedHashSet ira criar na mesma sequencia digitada
        List<String> ninjas = new ArrayList<>();
        ninjas.add("Senju Tsunade");
        ninjas.add("Sasuke Uchiha");
        ninjas.add("Sakura Haruno");
        ninjas.add("Naruto Uzumaki");
        ninjas.add("Danzo");
        ninjas.add("Kakashi Hatake");
        ninjas.add("Boruto Uzumaki");
        System.out.println("ninjas = " + ninjas);

        // hashset é para usar quando vc quer nomes sem duplicados, porém em ordens lógica (alfabetica, numerica)
        Set<String> ninjasSet = new LinkedHashSet<>();
        ninjasSet.addAll(ninjas);
        ninjasSet.remove("Sakura Haruno");
        System.out.println("ninjaHashSet = " + ninjasSet);


    }
}
