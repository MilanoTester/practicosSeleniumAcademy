import java.util.ArrayList;

public class ArrayListUtils {

    // Imprimir lista Enteros
    public static void imprimirListaEnteros(ArrayList<Integer> listaEnteros) {
        System.out.println("Estos son los datos contenidos en el registro:");
        for (Integer num: listaEnteros) {
            System.out.println(num);
        }
    }

    // Imprimir lista Float
    public static void imprimirListaFloat(ArrayList<Float> listaFloat) {
        System.out.println("Estos son los datos contenidos en el registro:");
        for (Float num: listaFloat) {
            System.out.println(num);
        }
    }

    // Imprimir lista Double
    public static void imprimirListaDouble(ArrayList<Double> listaDouble) {
        System.out.println("Estos son los datos contenidos en el registro:");
        for (Double num: listaDouble) {
            System.out.println(num);
        }
    }

    // Imprimir lista String
    public static void imprimirListaString(ArrayList<String> listaString) {
        System.out.println("Estos son los datos contenidos en el registro:");
        for (String num: listaString) {
            System.out.println(num);
        }
    }

    public static void imprimirListaEmpleados(ArrayList<Empleado> unaLista) {
        System.out.println("===== LISTA DE EMPLEADOS =====");
        for (Empleado e: unaLista) {
            System.out.println(e);
        }
    }


}
