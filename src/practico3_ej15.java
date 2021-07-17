import java.util.Scanner;

public class practico3_ej15 {
    public static void main (String args[]) {
        // Crear un método que retorne la suma de los números pares entre 1 y n, siendo n un parámetro.

        Scanner input = new Scanner(System.in);
        int n = 0;
        int sumaPares = 0;

        System.out.println("El programa calcula la suma de los números pares entre 1 y n, siendo n un parámetro ingresado por el usuario.");
        System.out.println("Ingrese el parámetro n:");
        n = input.nextInt();
        sumaPares = sumaPares(n);
        System.out.println("El resultado de la suma de los números pares es: " + sumaPares);
        System.out.println("Fin.");
    }

    public static int sumaPares (int n) {
        int suma = 0;
        for (int i=1; i <= n; i++) {
            if (i%2 == 0) {
                suma = suma +i;
            }
        }
        return suma;
    }



}
