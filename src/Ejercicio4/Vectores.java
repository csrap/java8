package Ejercicio4;

import java.util.Vector;

public class Vectores {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);


        vector.remove(1);
        vector.remove(2);

        System.out.println("Valor vector: " + vector );


    // Las desventaja, o más bien problema que podemos tener
        // a la hora de utilizar un Vector con la capacidad por defecto
        //si tuviesemos 1000 elementos, debemos de tomar en cuenta en costo
        //por copia cuando este se rebase en la dimensión del array  y se cree una array nueva, ya que
        //al tener una array subyacente nuestra apliación se puede
        // colocar mas lenta
    }
}
