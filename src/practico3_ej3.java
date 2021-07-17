import java.util.Scanner;

public class practico3_ej3 {
    public static void main (String args[]) {
        // Ejercicios combinados 3, 4 y 6:
        // 3) Método que reciba dos enteros y retorne la multiplicación de la misma.
        // 4) Método que reciba dos números y retorne su suma.
        // 6) Realizar un método que reciba dos números y retorne el mayor ambos.

        Scanner input = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        // Descripción del programa y pedir datos al usuario
        System.out.println("Dados 2 números, el programa identifica el mayor de ambos números, también calcula la suma y multiplicación de los números:");
        System.out.println("Ingrese el primer número: ");
        num1 = input.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2 = input.nextInt();

        // 3) Multiplicación
        int multiplicacion = multiplicaN1N2(num1, num2);
        System.out.println("La multiplicación de ambos números es: " + multiplicacion);

        //4) Suma
        int suma = sumaN1N2(num1, num2);
        System.out.println("La suma de ambos números es: " + suma);

        // 6) Número mayor
        if (num1 == num2) {
            System.out.println("No hay número mayor, ambos números son iguales.");
        } else {
            int mayor = mayorN(num1, num2);
            System.out.println("El mayor número es: " +mayor);
        }

        System.out.println("Fin.");

    }

    // 3) Método que reciba dos enteros y retorne la multiplicación de la misma.
    public static int multiplicaN1N2 (int n1, int n2) {
        return n1*n2;
    }

    // 4) Método que reciba dos números y retorne su suma.
    public static int sumaN1N2 (int n1, int n2) {
        return n1+n2;
    }

    // 6) Realizar un método que reciba dos números y retorne el mayor ambos.
    public static int mayorN (int n1, int n2) {
        if (n1 > n2) {
            return n1;
        } else {
            return n2;
        }

    }

}
