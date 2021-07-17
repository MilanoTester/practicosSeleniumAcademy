import java.util.Scanner;

public class practico3_ej24 {
    public static void main (String args[]) {
        // Método que retorne verdadero si el número recibido por parámetro es mayor a 18. De lo contrario, se debe retornar falso.

        Scanner input = new Scanner(System.in);
        int num;
        boolean mayorQue18;

        System.out.println("El programa determina si el número suministrado es mayor que 18.");
        System.out.println("Ingrese un número:");
        num = input.nextInt();
        mayorQue18 = nMayorQue18(num);
        System.out.println("La confirmación de que el número suministrado es mayor que 18 es: " + mayorQue18);
        System.out.println("Fin.");

    }

    public static boolean nMayorQue18 (int n) {
        if (n > 18) {
            return true;
        } else {
            return false;
        }

    }


}
