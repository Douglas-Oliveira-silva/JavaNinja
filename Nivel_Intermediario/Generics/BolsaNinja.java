package Nivel_Intermediario.Generics;

import java.util.ArrayList;
import java.util.List;

public class BolsaNinja<T> {

    // Inicializar nosso Array
    private List<T> ferramentas;

    // Colocar ferramentas no nosso array
    public void adicionarFerramenta(T ferramenta){
        ferramentas.add(ferramenta);
    }

    // Mostrar nossa lista de ferramentas
    public void mostrarFerramenta(){
        for (T ferramenta: ferramentas) {
            System.out.println(ferramenta);
        }
    }

    // construtor
    public BolsaNinja(){
        this.ferramentas = new ArrayList<>();
    }

}
