import java.util.Scanner;

public class practico2_ej5 {
    public static void main (String args[]) {
        //Pedir el ingreso de 3 números, indicar si hay números repetidos.

        Scanner input = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        //Instrucciones para el usuario:
        System.out.println("Ingrese 3 números, y el programa indicará si hay números repetidos.");

        System.out.println("Ingrese el primer número:");
        num1 = input.nextInt();

        System.out.println("Ingrese el segundo número:");
        num2 = input.nextInt();

        System.out.println("Ingrese el tercer número:");
        num3 = input.nextInt();

        if (num1 == num2)  {
            System.out.println("El número " + num1 + " está repetido.");
        } else if (num1 == num3) {
            System.out.println("El número " + num1 + " está repetido.");
        } else if (num2 == num3) {
            System.out.println("El número " + num2 + " está repetido.");
        } else {
            System.out.println("No hay números repetidos!");
        }

        System.out.println("El programa ha finalizado.");

    }

}
