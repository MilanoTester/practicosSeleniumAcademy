import java.util.Scanner;

public class practico3_ej26 {
    public static void main (String args[]) {
        // Realizar un método que retorne verdadero si el número recibido por parámetro es impar y mayor a 20

        Scanner input = new Scanner(System.in);
        int num;
        boolean imparMayorQue20;

        System.out.println("El programa determina si el número suministrado es impar y mayor que 20.");
        System.out.println("Ingrese un número: ");
        num = input.nextInt();
        imparMayorQue20 = nImparMayorQue20(num);
        System.out.println("La confirmación de que el número es impar y mayor que 20 es: " + imparMayorQue20);
        System.out.println("Fin.");

    }

    public static boolean nImparMayorQue20 (int n) {
        if ((n > 20) && (n%2 != 0)) {
            return true;
        } else {
            return false;
        }

    }

}
