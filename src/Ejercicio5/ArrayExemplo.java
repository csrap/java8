package Ejercicio5;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayExemplo {
    public static void main(String[] args) {
        ArrayList<String> lista  = new ArrayList<String>();

        lista.add("Elemento A");
        lista.add("Elemento B");
        lista.add("Elemento C");
        lista.add("Elemento D");

        String array[] = new String[lista.size()];
        for (int i = 0 ; i < lista.size(); i++){
            array[i] = lista.get(i);
        }

        for (String elemento: array) {
            System.out.println("ELementos es: " + elemento );
        }

        LinkedList<String> copiaLista = new LinkedList<String>(lista);
        System.out.println(copiaLista);
        System.out.println(copiaLista.size());

        String array2[] = new String[copiaLista.size()];
        for (int j = 0 ; j < copiaLista.size(); j++){
            array2[j] = copiaLista.get(j);
        }

        for (String elemento: array2) {
            System.out.println("ELementos es: " + elemento );
        }
    }
}
