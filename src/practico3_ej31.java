import java.util.Scanner;

public class practico3_ej31 {
    public static void main (String args[]) {
        // Dado un número, un máximo y un mínimo (recibidos por parámetro), retorne verdadero si el numero está dentro del máximo y el mínimo.
        // Si el número se encuentra dentro del máx y mín, el programa debe mostrar  “El número es válido”. Si no, se debe retornar “El número
        // está fuera de rango.”

        Scanner input = new Scanner(System.in);
        int num = 0;
        int rangoMin = 0;
        int rangoMax = 0;
        int rangoMaxAux = 0;
        boolean enRango;

        System.out.println("El programa determina si un número está adentro de un rango.");
        System.out.println("Ingrese el número de interés:");
        num = input.nextInt();
        System.out.println("Ingrese un extremo del rango:");
        rangoMin = input.nextInt();
        System.out.println("Ingrese el otro extremo del rango:");
        rangoMax = input.nextInt();

        // Reordenar los extremos del rango en caso de que el usuario no los ingrese correctamente
        rangoMaxAux = rangoMax;
        if (rangoMin > rangoMax) {
            rangoMax = rangoMin;
            rangoMin = rangoMaxAux;
        }
        System.out.println("El intervalo es: (" + rangoMin + ", " + rangoMax + ").");

        enRango = enRango(num, rangoMin, rangoMax);
        if (enRango == true) {
            System.out.println("El número " + num + " es válido.");
        } else {
            System.out.println("El número " + num + " está fuera de rango.");
        }

        System.out.println("Fin.");
    }

    public static boolean enRango (int num, int rangoMin, int rangoMax) {
        if ((num >= rangoMin) && (num <= rangoMax)) {
            return true;
        } else {
            return false;
        }

    }




}
