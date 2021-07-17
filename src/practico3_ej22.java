import java.util.Scanner;

public class practico3_ej22 {
    public static void main (String args[]) {
        /* Método que reciba dos números y retorne verdadero si el primer número es mayor que el segundo.
           De lo contrario, retornar debe retornar falso. */

        Scanner input = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        boolean confirmacion;

        // Descripción del programa y pedir datos al usuario
        System.out.println("El programa confirma que un número N1 es mayor que N2.");
        System.out.println("Ingrese número N1: ");
        num1 = input.nextInt();
        System.out.println("Ingrese número N2: ");
        num2 = input.nextInt();

        confirmacion = n1Mayorn2(num1, num2);
        System.out.println("La confirmación de que N1 es mayor que N2 es: " + confirmacion);
        System.out.println("Fin.");
    }

    // Método n1 mayor que n2
    public static boolean n1Mayorn2 (int n1, int n2) {
        if (n1 > n2) {
            return true;
        } else {
            return false;
        }
    }


}
