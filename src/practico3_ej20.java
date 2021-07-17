import java.util.Scanner;

public class practico3_ej20 {
    public static void main(String args[]) {
        // Realizar 4 métodos que reciba dos parámetros cada uno y retornen un número float.
        // Los métodos tendrán los siguientes nombres: calcularSuma, calcularResta, calcularDivision, calcularMutiplicacion.

        Scanner input = new Scanner(System.in);
        float num1 = 0;
        float num2 = 0;
        float calcularSuma = 0;
        float calcularResta = 0;
        float calcularMultiplicacion = 0;
        float calcularDivision = 0;

        System.out.println("El programa calcula la suma, resta, multiplicación y división de dos números dados.");
        System.out.println("Ingrese el primer número: ");
        num1 = input.nextFloat();
        System.out.println("Ingrese el segundo número: ");
        num2 = input.nextFloat();

        calcularSuma = calcularSuma(num1, num2);
        System.out.println("Resultado de suma: " + calcularSuma);

        calcularResta = calcularResta(num1, num2);
        System.out.println("Resultado de resta: " + calcularResta);

        calcularMultiplicacion = calcularMultiplicacion(num1, num2);
        System.out.println("Resultado de multiplicación: " + calcularMultiplicacion);

        if (num2 == 0) {
            System.out.println("Resultado de division: error, no se puede dividir entre cero.");
        } else {
            calcularDivision = calcularDivision(num1, num2);
            System.out.println("Resultado de división " + num1 + " / " + num2 + " : " + calcularDivision);
        }

        System.out.println("Fin.");

    }

    public static float calcularSuma(float num1, float num2) {
        return num1 + num2;
    }

    public static float calcularResta(float num1, float num2) {
        return num1 - num2;
    }

    public static float calcularMultiplicacion(float num1, float num2) {
        return num1 * num2;
    }

    public static float calcularDivision(float num1, float num2) {
        return num1 / num2;
    }
}
