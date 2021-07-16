import java.util.Scanner;

public class practico2_ej6 {
    public static void main (String args[]) {
        //Pedir el ingreso de 3 números, indicar si hay números repetidos utilizando sólo un IF.

        Scanner input = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        //Instrucciones para el usuario:
        System.out.println("Ingrese 3 números, y el programa indicará si hay números repetidos:");

        System.out.println("Ingrese el primer número:");
        num1 = input.nextInt();

        System.out.println("Ingrese el segundo número:");
        num2 = input.nextInt();

        System.out.println("Ingrese el tercer número");
        num3 = input.nextInt();

        //Usando sólo un IF sólo se puede decir que hay números repetidos, no se puede decir cuál es el número repetido.
        if ((num1 == num2) || (num1 == num3) || (num2 == num3)) {
            System.out.println("Hay números repetidos.");
        } else {
            System.out.println("No hay números repetidos!");
        }

    }

}
