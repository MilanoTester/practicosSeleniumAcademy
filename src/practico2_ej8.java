import java.util.Scanner;

public class practico2_ej8 {
    public static void main (String args[]) {
        //Pedir el ingreso de números hasta que aparezca uno negativo.

        Scanner input = new Scanner(System.in);

        //Instrucciones para el usuario.
        System.out.println("Ingrese un número. El programa finalizará al ingresar un número negativo.");

        int num = 0;

        while (num >= 0) {
            System.out.println("Ingrese un número:");
            num = input.nextInt();
        }

        System.out.println("Se ha ingresado un número negativo; el programa ha finalizado.");
    }
}
