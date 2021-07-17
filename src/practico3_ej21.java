import java.util.Scanner;

public class practico3_ej21 {
    public static void main (String args[]) {
        // Realizar un método llamado calcularPromedio, que solicite el ingreso de números hasta que se ingrese 0, y que calcule el promedio
        // de los mismos. Se debe utilizar el método ingresarNumero realizado previamente.

        Scanner input = new Scanner(System.in);
        float num = 0;
        float calcularPromedio = 0;

        System.out.println("El programa calcula el promedio de los valores ingresados. Presione cero para finalizar.");
        num = ingresarNumero();
        calcularPromedio = calcularPromedio(num);
        System.out.println("El resultado es: " + calcularPromedio);
        System.out.println("El programa ha finalizado.");
    }

    public static float ingresarNumero() {
        float numero = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        numero = input.nextFloat();
        return numero;
    }

    public static float calcularPromedio (float num) {
        float promedio = 0;
        if (num !=0) {
            float suma = num;
            int contador = 1;
            while (num != 0) {
                num = ingresarNumero();
                suma = suma + num;
                contador++;
            }
            promedio = suma / (contador - 1);
            return promedio;
        } else{
            return promedio;
        }
    }
}
