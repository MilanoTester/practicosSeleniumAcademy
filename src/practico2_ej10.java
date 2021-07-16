import kotlin.reflect.jvm.internal.impl.resolve.constants.UShortValue;

import java.nio.file.LinkPermission;
import java.util.Scanner;

public class practico2_ej10 {
    public static void main (String args[]) {
        //Programa Java que lea dos números y muestre los números entre ellos.

        Scanner input = new Scanner(System.in);

        //Instrucciones para el usuario
        System.out.println("El programa mostrará todos los números comprendidos entre un número 'A' y un número 'B'.");

        System.out.println("Ingrese el número 'A':");
        int numa = input.nextInt();

        System.out.println("Ingrese el número 'B':");
        int numb = input.nextInt();

        int num1 = 0;
        int num2 = 0;

        if (numa < numb) {
            num1 = numa;
            num2 = numb;
        } else if (numa > numb) {
            num2 = numa;
            num1 = numb;
        } else {
            System.out.println("Los números 'A' y 'B son iguales; no se puede realizar la consulta.");
        }

        for (int i = num1+1; i < num2; i++) {
            System.out.println(i);
        }

        System.out.println("El programa ha finalizado.");

    }
}
