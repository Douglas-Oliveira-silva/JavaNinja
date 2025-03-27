package Nivel_Basico.Arrays;

public class Array {
    public static void main(String[] args) {

    /*
    * nomeclatura especial
    * arrays sao tipos referencias
    * preciso dizer tamanho
    * */
        // String inicializa como null
        String[] ninja = new String[6];
        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Hinata Hyuga";
        ninja[4] = "Kakashi Hataki";
        System.out.println(ninja[5]);

        //redeclar ARRAY
        ninja = new String[7];
        ninja[0] = "Hashirama Senju";
        ninja[1] = "Tobirama Senju";
        ninja[2] = "Hiruzen Sarutobi";
        ninja[3] = "Minato Namikaze";
        ninja[4] = "Tasunade Senju";
        ninja[5] = "Kakashi Hatake";
        ninja[6] = "Uzumaki Naruto";
        System.out.println(ninja[2]);

        // for para fazer um loop no array
        for (int i = 0; i < 7; i++) {
            System.out.println(ninja[i]);
        }

        //array idade int
        // int inicializa como 0
        int[] idade = new int[2];
        idade[0] = 16;
        System.out.println(idade[1]);

        //array idade boolen
        //inicializa como false
        boolean[] verdadeiroOuFalso = new boolean[1];
        System.out.println(verdadeiroOuFalso[0]);

        // inicializa como 0.0
        double[] flutuante = new double[1];
        System.out.println(flutuante[0]);


    }
}
