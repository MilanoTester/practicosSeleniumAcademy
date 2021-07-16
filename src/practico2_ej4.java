import java.util.Scanner;

public class practico2_ej4 {
    public  static  void  main (String args []) {
        //Pedir el ingreso de un dato, e indicar si es menor o mayor a 0.

        Scanner input = new Scanner(System.in);
        int num = 0;

        System.out.println("Ingrese un número:");
        num = input.nextInt();

        if (num > 0) {
            System.out.println("El número es mayor que cero.");
        } else if (num < 0) {
            System.out.println("El número es menor que cero.");
        } else {
            System.out.println("El número es igual a cero.");
        }

        System.out.println("El programa ha finalizado.");

    }
}
