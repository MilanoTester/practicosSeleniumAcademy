import java.util.Scanner;

public class practico2_ej3 {
    public static void main (String args[]) {
    //Pedir el ingreso de 3 números y mostrar la suma de ellos.

        //Declarando variables
        Scanner input = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int suma = 0;

        //Instrucciones para el usuario
        System.out.println("Suministre tres números para calcular la suma de ellos...");

        //Guardando los 3 números:
        System.out.println("Ingrese el primer número:");
        num1 = input.nextInt();
        System.out.println("Ingrese el segundo número:");
        num2 = input.nextInt();
        System.out.println("Ingrese el tercer número:");
        num3 = input.nextInt();

        //Cálculo de suma:
        suma = num1 + num2 + num3;

        //Mostrar resultado:
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El programa ha finalizado");

    }


}
