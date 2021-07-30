import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {
    public static void main(String args[]) {
        String unNombre = "";
        int unTelefono = 000;
        float unSueldo = 0.0f;
        boolean esManual = false;
        boolean esAutomatizador = false;
        String unLenguaje = "";
        String unArea = "";
        int opcionMenu = 100;

        Scanner input = new Scanner(System.in);
        ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
        JavaUtils.mensajeBienvenida();

        while (opcionMenu != 0) {
            opcionMenu = 100;
            while ((opcionMenu < 0) || (opcionMenu > 4)) {
                System.out.println("==== MENU INGRESO DE DATOS - Seleccione una opción ====");
                System.out.println("1 - Ver lista de empleados");
                System.out.println("2 - Ingrese un nuevo Tester");
                System.out.println("3 - Ingrese un nuevo Desarrollador");
                System.out.println("4 - Ingrese un nuevo Manager");
                System.out.println("0 - Salir del programa");
                opcionMenu = input.nextInt();
            }

            if (opcionMenu == 0) {
                System.out.println("Saliendo del programa...");

            } else if (opcionMenu == 1) {
                if (listaEmpleados.isEmpty()) {
                    System.out.println("No hay registros para mostrar.");
                } else {
                    ArrayListUtils.imprimirListaEmpleados(listaEmpleados);
                }

            } else {
                unNombre = JavaUtils.ingresarString("Ingrese un nombre");
                unTelefono = JavaUtils.ingresarInteger("Ingrese un teléfono:");
                unSueldo = JavaUtils.ingresarFloat("Ingrese un sueldo:");

                if (opcionMenu == 2) {
                    esManual = JavaUtils.ingresarBooleano("El Tester es Manual? Ingrese (s)i ó (n)o para continuar:");
                    esAutomatizador = JavaUtils.ingresarBooleano("El Tester es Automatizador? Ingrese (s)i ó (n)o para continuar:");

                    Empleado nuevoTester = new Tester(unNombre, unTelefono, unSueldo, esManual, esAutomatizador);
                    listaEmpleados.add(nuevoTester);

                } else if (opcionMenu == 3) {
                    unLenguaje = JavaUtils.ingresarString("Ingrese el lenguaje de trabajo:");

                    Empleado nuevoDeveloper = new Developer(unNombre, unTelefono, unSueldo, unLenguaje);
                    listaEmpleados.add(nuevoDeveloper);

                } else if (opcionMenu == 4) {
                    unArea = JavaUtils.ingresarString("Ingrese el área asignada al Manager:");

                    Empleado nuevoManager = new Manager(unNombre, unTelefono, unSueldo, unArea);
                    listaEmpleados.add(nuevoManager);
                }
            }
        }

        JavaUtils.mensajeFin();
    }


}
