import java.util.Scanner;

public class practico3_ej27 {
    public static void main (String args[]) {
        // Realizar un método llamado esPrimo que reciba un número, y retorne true si sólo si el número es primo
        // (es divisible entre sí, y la unidad).

        Scanner input = new Scanner(System.in);
        int num;
        boolean esPrimo;
        boolean esPrimo2;

        System.out.println("El programa determina si el número suministrado es primo.");
        System.out.println("Ingrese un número: ");
        num = input.nextInt();
        esPrimo = esPrimo(num);
        esPrimo2 = esPrimo2(num);
        System.out.println("Confirmación de que el número es primo (mi método): " + esPrimo);
        System.out.println("Confirmación de que el número es primo (método del profesor): " + esPrimo);
        System.out.println("Fin.");

    }

    public static boolean esPrimo (int n) {
        if ((n == 2) || (n == 3) || (n == 5)) {
            return true;
        } else if ((n > 1) && (n%2 != 0) && (n%3 != 0) && (n%5 != 0)) {
            return true;
        } else {
            return false;
        }
    }

    // Método alternativo (solución del profesor)
    public static boolean esPrimo2 (int n) {
        int contador = 0;
        for (int i=1; i <= n; i++) {
            if (n%i == 0) {
                contador++;
            }
        }
        if (contador == 2) {
            return true;
        } else {
            return false;
        }

    }




}
