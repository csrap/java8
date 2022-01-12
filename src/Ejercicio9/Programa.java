package Ejercicio9;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        try {
            int n, sum = 0;

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter how many number you want sum");
            n = sc.nextInt();
            int a[] = new int[n];
            System.out.println("enter the" + n + "numbers");
            for (int i = 0; i < n; i++) {
                System.out.println("enter number " + (i + 1) + ": ");
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                sum += a[i];
            }
            System.out.println("sum of " + n + " numbers is =" + sum);

        } catch (Exception e) {
            System.out.println("El número tiene que ser un entero:" + e.getClass());


        }
    }

    }


