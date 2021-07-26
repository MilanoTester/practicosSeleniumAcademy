import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        // Crear lista de empleados
        ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();

        // Crear 1 Tester
        Empleado tester1 = new Tester("Juan", 95665454, 80000, false, true);
        listaEmpleados.add(tester1);

        // Crear 2 Developers
        Empleado dev1 = new Developer("Lucia", 2456789, 50000, "Java");
        listaEmpleados.add(dev1);
        Empleado dev2 = new Developer("Javier", 2878463, 55000, "Python");
        listaEmpleados.add(dev2);

        // Crear 1 Manager
        Empleado manager1 = new Manager("Maria", 2323464, 130000, "QA");
        listaEmpleados.add(manager1);

        // Imprimir lista de empleados
        imprimirListaEmpleados(listaEmpleados);

        System.out.println("Fin");
    }

    public static void imprimirListaEmpleados(ArrayList<Empleado> unaLista) {
        System.out.println("===== LISTA DE EMPLEADOS =====");
        for (Empleado e: unaLista) {
            System.out.println(e);
        }
    }

}
