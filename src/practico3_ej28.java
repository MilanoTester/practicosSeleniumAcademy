import java.util.Scanner;

public class practico3_ej28 {
    public static void main (String args[]) {
        // Realizar un método que reciba dos números enteros y retorne verdadero si la suma es mayor a 100.
        // De lo contrario, debe retornar falso.

        Scanner input = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        boolean sumaMayor100;
        System.out.println("El programa confirma si la suma de dos números es mayor que 100.");
        System.out.println("Ingrese el primer número: ");
        num1 = input.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2 = input.nextInt();
        sumaMayor100 = sumaMayor100(num1, num2);
        System.out.println("Confirmacion de que la suma es mayor que 100: " + sumaMayor100);
        System.out.println("Fin.");

    }

    public static boolean sumaMayor100 (int n1, int n2) {
        int suma = n1 + n2;
        if (suma > 100) {
            return true;
        } else {
            return false;
        }


    }

}
