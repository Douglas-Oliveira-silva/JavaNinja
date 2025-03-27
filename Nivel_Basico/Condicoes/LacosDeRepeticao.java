package Nivel_Basico.Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {

        /*
        * lacos de repeticao: repetir infinitamente ou ate voce atingir o parametro desejado
        * WHILE = FOR
        * */

        // while
        // while (condicao) {tudo aqui vai acontecer}

        int numeroDeClones = 0;
        int numeroMaxDeClones = 40;

        while (numeroDeClones <= numeroMaxDeClones) {
            numeroDeClones ++;
            System.out.println("O Naruto fez um clone das sombras " + numeroDeClones );
        }
        
        //FOR
        for (int i = 0; i <= numeroMaxDeClones ; i++) {
            System.out.println("O Naruto esta se clonando e já se clonou " + i);
            
        }



    }
}
