import java.util.Scanner;

public class practico2_ej13 {
    public static void main(String args[]) {
        // Pedir el ingreso de números hasta que se ingrese un 0.

        Scanner input = new Scanner(System.in);

        //Presentación del programa:
        System.out.println("Este programa permite el ingreso de números hasta que se ingrese el número cero (0).");
        int i = 1;

        while (i != 0) {
            System.out.println("Ingrese un número:");
            i = input.nextInt();
        }

        System.out.println("El programa ha finalizado, se ha ingresado el número cero (0).");
    }
}









