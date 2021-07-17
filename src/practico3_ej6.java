import java.util.Scanner;

public class practico3_ej6 {
    public static void main (String args[]) {
        // Realizar un método que reciba dos números y retorne el mayor ambos.

        Scanner input = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        // Descripción del programa y pedir datos al usuario
        System.out.println("Dados 2 números, el programa identifica el mayor de ambos números:");
        System.out.println("Ingrese el primer número: ");
        num1 = input.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2 = input.nextInt();

        if (num1 == num2) {
            System.out.println("No hay número mayor, ambos números son iguales.");
        } else {
            int mayor = mayorN(num1, num2);
            System.out.println("El mayor número es: " +mayor);
        }

        System.out.println("Fin.");

    }

    public static int mayorN (int n1, int n2) {
        if (n1 > n2) {
            return n1;
        } else {
            return n2;
        }
    }

}
