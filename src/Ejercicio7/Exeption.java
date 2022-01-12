package Ejercicio7;

public class Exeption {
    public static void main(String[] args) {
        try{
            divide (2,0);
        } catch (ArithmeticException e ) {
            System.out.println("Esto no puede hacerse");
        }

    }
    public static double divide(int Number1, int Number2) throws ArithmeticException {
        int  result = 0;
        try {
            result =  Number1 / Number2 ;
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        }

        return result;

    }
}
