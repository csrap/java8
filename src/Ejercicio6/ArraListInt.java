package Ejercicio6;

import java.util.ArrayList;
import java.util.Random;

public class ArraListInt {
    public static void main(String[] args) {

// Añadimos 10 Elementos en el ArrayList

        int[] ids = {1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> values = new ArrayList<>();

// Recorremos la array con los elementos
        for (int id: ids) {
            values.add(id);
        }
        System.out.println(values);

        values.removeIf(n -> (n % 2 == 0));

        System.out.println(values);


        }


    }

