import java.util.Scanner;

public class practico2_ej12 {
    public static void main (String args[]) {
        //Pedir el ingreso de 4 números y retornar su suma en valor absoluto.

        Scanner input = new Scanner(System.in);

        //Instrucciones para el usuario
        System.out.println("El programa muestra el valor absoluto de la suma de 4 números ingresados por el usuario.");

        int num = 0;
        int suma = 0;
        int suma_abs = 0;

        for (int i=1; i<=4; i++) {
            System.out.println("Ingrese un número:");
            num = input.nextInt();
            suma = suma + num;
        }

        //Se calcula el valor absoluto de la suma
        suma_abs = Math.abs(suma);

        System.out.println("El valor absoluto de la suma de los números es " + suma_abs);
        System.out.println("El programa ha finalizado.");

    }
}

