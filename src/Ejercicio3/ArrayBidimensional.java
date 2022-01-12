package Ejercicio3;

public class ArrayBidimensional {
    public static void main(String[] args) {
        int arrayBidi [][]  = {
                {5,6,8,7},
                {55,60,85,75}

        };


        for (int i = 0; i < arrayBidi.length; i++) {
            System.out.println("Valor de i:" + i);

            for (int j=0; j < arrayBidi[1].length; j++) {
                System.out.println("Estoy en i =" + i + ", j = " + j);
                System.out.println(arrayBidi[i][j]);
            }
        }

    }
}
