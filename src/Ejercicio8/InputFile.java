package Ejercicio8;

import java.io.*;

import static java.lang.System.in;

public class InputFile {
    public static void main(String[] args) {
        try {
            InputStream file  = new FileInputStream("/etc/passwd");

            byte []datos = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream("prueba.txt");
            out.write(datos);
            out.close();


        }catch (FileNotFoundException e ) {
            System.out.println("Error en el programa " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
