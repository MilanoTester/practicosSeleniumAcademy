import java.util.Scanner;

public class practico3_ej7 {
    public static void main (String args[]) {
        // Ejercicios combinados 7 y 8:
        // 7) Crear un método que reciba un número entero n, y muestre en pantalla la suma desde 1 hasta ese número n.
        //    Ej. Si n es 4, se debe mostrar en pantalla 10.
        // 8) Crear un método que retorne verdadero si y sólo si el número es par, de lo contrario, debe retornar falso.

        Scanner input = new Scanner(System.in);
        int num = 0;
        int suma = 0;
        boolean esPar;

        // Descripción del programa y pedir datos al usuario
        System.out.println("El programa calcula la suma desde 1 hasta un número ingresado por el usuario.");
        System.out.println("También se indica si el número ingresado por el usuario es par.");
        System.out.println("Ingrese un número:");
        num = input.nextInt();

        // 7 Suma hasta el número
        suma = sumaHastaN(num);
        System.out.println("El resultado es: " + suma);

        // 8 Verifica si el número es par
        esPar = nPar(num);
        if (esPar == true) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número no es par.");
        }
        System.out.println("Fin.");
    }

    // 7 Suma hasta el número
    public static int sumaHastaN (int n) {
        int suma = 0;
        for (int i=1; i<=n; i++) {
            suma = suma + i;
        }
        return suma;
    }

    // 8 Verifica si el número es par
    public static boolean nPar (int n) {
        if (n%2 == 0) {
            return true;
        } else {
            return false;
        }
    }


}
