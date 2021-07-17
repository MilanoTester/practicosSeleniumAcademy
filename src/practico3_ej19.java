import java.util.Scanner;

public class practico3_ej19 {
    public static void main (String args[]) {
        // Crear un método llamado valorAbsoluto, que reciba un número y retorne el valor absoluto del mismo.
        // Ej. si se recibe un -4, el método debe retornar 4.

        Scanner input = new Scanner(System.in);
        int num = 0;
        int valorAbsoluto = 0;

        System.out.println("El programa calcula el valor absoluto de un número.");
        System.out.println("Ingrese un número:");
        num = input.nextInt();
        valorAbsoluto = valorAbsoluto(num);
        System.out.println("El resultado es: " + valorAbsoluto);
        System.out.println("Fin.");
    }

    public static int valorAbsoluto (int num) {
        if (num >= 0) {
            return num;
        } else {
            return num * -1;
        }


    }


}
