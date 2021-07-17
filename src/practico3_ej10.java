import java.util.Scanner;

public class practico3_ej10 {
    public static void main (String args[]) {
        // Crear un método que reciba el alto y ancho de un paralelogramo tipo, y retorne su area.

        Scanner input = new Scanner(System.in);
        float base;
        float altura;
        float area;

        // Descripción del programa y pedir datos al usuario
        System.out.println("El programa calcula el área de un paralelogramo, conociendo su base y su altura.");
        System.out.println("Ingrese la base: ");
        base = input.nextFloat();
        System.out.println("Ingrese la altura: ");
        altura = input.nextFloat();

        // Hacer cálculo y mostrar resultados
        area = areaParalelogramo(base, altura);
        System.out.println("El área calculada es: " + area);
        System.out.println("Fin.");

    }

    public static float areaParalelogramo (float nbase, float naltura) {
        return nbase * naltura;
    }

}
