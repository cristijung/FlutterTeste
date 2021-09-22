//adicionando dados no arraylist
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class MArrayList1 {
    public static void main(String[] args) {

        String e1 = "Verde";
        String e2 = "Preto";
        String e3 = "Roxo";
        String e4 = "Vermelho";
        String e5 = "Azul";


        ArrayList<String> elementos = new ArrayList<>();
        elementos.add(e1);
        elementos.add(e2);
        elementos.add(e3);   
        elementos.add(e4);
        elementos.add(e5);     

        System.out.println(elementos);

        //comando para remover
        //nome do arraylist + comando + índice    
        elementos.remove(0);
        System.out.println(elementos);

        //consultando valores pelo índice
        String verElemento = elementos.get(0);
        System.out.println("O elemento no índice zero é?  " + verElemento);

        //ordenando os elementos
        Collections.sort(elementos);
        System.out.println("Depois de ordenado:");
        System.out.println(elementos);


    }
}
