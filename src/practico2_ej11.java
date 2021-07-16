import java.util.Scanner;

public class practico2_ej11 {
    public static void main (String args[]) {
        //Programa que lea 6 números e indique en pantalla si son positivos o negativos y pares o impares.

        Scanner input = new Scanner(System.in);

        //Instrucciones para el usuario.
        System.out.println("Ingrese 6 números distintos de cero; el programa determinará si son positivos o negativos y pares o impares.");

        int num = 1;
        String condicion1 = "";
        String condicion2 = "";

        /*if (num == 0) {
            System.out.println("El número ingresado es cero; no se puede realizar la consulta.");}*/

        for (int i = 1; i <= 6; i++) {
            System.out.println("Ingrese un número:");
            num = input.nextInt();

            //Si el número ingresado es cero el programa avisa que no puede realizar la consulta y queda a la espera de que se ingrese otro número
            if (num == 0) {
                System.out.println("El número ingresado es cero; no se puede realizar la consulta.");
            } else {
                //Validación de si el número es positivo o negativo
                if (num > 0) {
                    condicion1 = "positivo";
                } else {
                    condicion1 = "negativo";
                }
                //Validación de si el número es par o impar
                if (num % 2 == 0) {
                    condicion2 = " y par.";
                } else if (num % 2 != 0) {
                    condicion2 = " e impar.";
                }

                //Se muestra un mensaje con el resultado de la consulta
                System.out.println("El número " + num + " es " + condicion1 + condicion2);
            }
        }

        System.out.println("El programa ha finalizado.");
    }
}
