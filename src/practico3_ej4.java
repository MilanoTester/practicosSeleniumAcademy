import java.util.Scanner;

public class practico3_ej4 {
    public static void main (String args[]) {
        // Método que reciba dos números y retorne su suma.

        Scanner input = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        // Descripción del programa y pedir datos al usuario
        System.out.println("Dados 2 números, el programa calcula la suma de ambos:");
        System.out.println("Ingrese el primer número: ");
        num1 = input.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2 = input.nextInt();

        int suma = sumaN1N2(num1, num2);
        System.out.println("La suma de ambos números es: " + suma);

        System.out.println("Fin.");

    }

    public static int sumaN1N2 (int n1, int n2) {
        return n1+n2;
    }

}
