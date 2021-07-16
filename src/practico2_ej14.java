import java.util.Scanner;

public class practico2_ej14 {
    public static void main (String args[]) {
        // Pedir el ingreso de números hasta que se ingrese un 0. Mostrar la suma de ellos.

        Scanner input = new Scanner(System.in);

        //Presentación del programa:
        System.out.println("Este programa calcula la suma de los números ingresados por el usuario.");
        System.out.println("Ingrese cero (0) para finalizar el programa.");

        int i = 1;
        int suma = 0;

        while (i != 0) {
            System.out.println("Ingrese un número:");
            i = input.nextInt();

            if (i != 0) {
                suma = suma + i;
            }
        }

        System.out.println("La suma de los números ingresados es: " + suma);
        System.out.println("El programa ha finalizado.");
    }
}
