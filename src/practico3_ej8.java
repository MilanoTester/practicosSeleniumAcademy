import java.util.Scanner;

public class practico3_ej8 {
    public static void main (String args[]) {
        // Crear un método que retorne verdadero si y sólo si el número es par, de lo contrario, debe retornar falso.

        Scanner input = new Scanner(System.in);
        int num = 0;
        int suma = 0;
        boolean esPar;

        // Descripción del programa y pedir datos al usuario
        System.out.println("El programa indica si el número ingresado por el usuario es par.");
        System.out.println("Ingrese un número:");
        num = input.nextInt();

        esPar = nPar(num);
        if (esPar == true) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número no es par.");
        }
        System.out.println("Fin.");
    }

    public static boolean nPar (int n) {
        if (n%2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
