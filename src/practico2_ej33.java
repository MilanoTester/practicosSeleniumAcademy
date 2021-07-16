import java.util.Scanner;

public class practico2_ej33 {
    public static void main (String args[]) {
        // Pedir el ingreso de números hasta que aparezca uno negativo, e indicar el promedio de todos los números ingresados

        Scanner input = new Scanner(System.in);
        int num=0;
        int contador=0;
        int suma=0;
        float prom=0;

        System.out.println("El programa muestra el promedio de los números ingresados por el usuario.");
        System.out.println("El programa finaliza al ingresar un número negativo.");


        while (num>=0) {
            System.out.println("Ingrese un número mayor o igual a cero:");
            num = input.nextInt();
            if (num>=0) {
                suma = suma + num; //El problema está acá, se está sumando el último numero negativo
                contador++;
            }
        }

        prom = suma/contador;
        System.out.println("La suma de los números ingresados es: " + suma);
        System.out.println("El promedio de los números válidos ingresados es: " + prom);
        System.out.println("Fin.");

    }

}
