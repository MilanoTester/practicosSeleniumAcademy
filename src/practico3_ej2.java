import java.util.Scanner;

public class practico3_ej2 {
    public  static void main (String args[]) {
        // Método que reciba un número entero e imprima en pantalla en caso de ser mayor a 20, “Es mayor a 20”.
        // De lo contrario, imprimir “No es mayor a 20”

        Scanner input = new Scanner(System.in);
        int num = 0;

        System.out.println("Ingrese un número: ");
        num = input.nextInt();

        nMayorQue20(num);
    }

    public static void nMayorQue20 (int n) {
        if (n > 20) {
            System.out.println("El número es mayor a 20.");
        } else {
            System.out.println("El número no es mayor a 20.");
        }
    }
}
