import java.util.Scanner;

public class practico3_ej29 {
    public static void main (String args[]) {
        // Realizar un método llamado esMayor que reciba un número, y retorne verdadero si el número es mayor a 0,
        // de lo contrario, se debe retornar falso. Luego, solicitar al usuario que ingrese un número; si es positivo
        // se debe imprimir: “El número es positivo”, de lo contrario, “El número es negativo” (Se debe utilizar el método realizado anteriormente).

        Scanner input = new Scanner(System.in);
        int num = 0;
        boolean esMayor;
        System.out.println("El programa determina si un número distinto de cero es positivo.");

        while (num == 0) {
            System.out.println("Ingrese un número distinto de cero: ");
            num = input.nextInt();
        }

        esMayor = esMayor(num);

        if (esMayor == true) {
            System.out.println("El número es positivo.");
        } else {
            System.out.println("El número es negativo.");
        }

        System.out.println("Fin.");

    }

    public static boolean esMayor (int n) {
        if (n > 0) {
            return true;
        } else {
            return false;
        }

    }



}
