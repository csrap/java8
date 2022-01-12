package Ejercicio1;

public class Reverse {
    public static void main(String[] args) {
        String stringReverse = "hola mundo";
        System.out.println(stringReverse);
        StringBuilder back = new StringBuilder();
        for (int i = (stringReverse.length() - 1); i >= 0; i--){
            back.append(stringReverse.charAt(i));
        }
        System.out.println(back);
    }
}


