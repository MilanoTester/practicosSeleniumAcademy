import java.util.Scanner;

public class practico2_ej15 {
    public static void main (String args[]) {
        // Pedir el ingreso de números hasta que se ingrese un 0. Mostrar el promedio de ellos.

        Scanner input = new Scanner(System.in);

        //Presentación del programa:
        System.out.println("Este programa calcula la suma y el promedio de los números ingresados por el usuario.");
        System.out.println("Ingrese cero (0) para finalizar el programa.");

        int i = 1;
        int suma = 0;
        int n = 0;
        float promedio = 0;

        while (i != 0) {
            System.out.println("Ingrese un número:");
            i = input.nextInt();

            if (i != 0) {
                suma = suma + i;
                n++;
            }
        }

        promedio = suma/n;
        System.out.println("La suma de los números ingresados es: " + suma);
        System.out.println("El promedio de los números ingresados es " + promedio);
        System.out.println("El programa ha finalizado.");

    }
}
