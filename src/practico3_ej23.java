import java.util.Scanner;

public class practico3_ej23 {
    public static void main (String args[]) {
        // Dado un número, retorne verdadero si el número es menor a 0.

        Scanner input = new Scanner(System.in);
        int num = 0;
        boolean menorQueCero;

        // Descripción del programa y pedir dato al usuario
        System.out.println("El programa determina si un número es menor que cero.");
        System.out.println("Ingrese un número: ");
        num = input.nextInt();

        menorQueCero = esNegativo(num);
        if (menorQueCero == true) {
            System.out.println("El número ingresado SÍ es menor que cero.");
        } else {
            System.out.println("El número ingresado NO es menor que cero.");
        }
        System.out.println("Fin.");

    }

    public static boolean esNegativo (int n) {
        if (n < 0) {
            return true;
        } else {
            return false;
        }
    }

}
