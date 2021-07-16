import java.util.Scanner;

public class practico2_ej7 {
    public static void main (String args[]) {
        //Pedir el ingreso de 3 números e indicar si NO hay repetidos, es decir, si son todos diferentes.

        Scanner input = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        //Intrucciones del programa:
        System.out.println("Introduzca 3 números; el programa indicará si son diferentes entre sí.");

        System.out.println("Introduzca el primer número:");
        num1 = input.nextInt();

        System.out.println("Introduzca el segundo número");
        num2 = input.nextInt();

        System.out.println("Introduzca el tercer número:");
        num3 = input.nextInt();

        if ((num1 != num2) && (num1 != num3) && (num2 != num3)) {
            System.out.println("No hay números repetidos!");
        } else {
            System.out.println("Sí hay números repetidos.");
        }

        System.out.println("El programa ha finalizado.");
    }
}
