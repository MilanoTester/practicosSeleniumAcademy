import java.util.Scanner;

public class libreria {
    public static void main (String args[]) {
        // Crear una clase llamada Librería que contenga el main, y cree 2 objetos Libro (los valores que serán ingresados por el usuario) y
        // mostrarlos por pantalla.

        Scanner input = new Scanner(System.in);

        // Pedir datos al usuario y generar el Libro 1:
        System.out.println("El programa permite el registro de 2 libros nuevos.");
        System.out.println("Libro 1 - Ingrese el ISBN:");
        int unIsbn1 = input.nextInt();
        input.nextLine();

        System.out.println("Libro 1 - Ingrese el Título del libro:");
        String unTitulo1 = input.nextLine();

        System.out.println("Libro 1 - Ingrese el nombre del autor:");
        String unAutor1 = input.nextLine();

        System.out.println("Libro 1 - Ingrese el número de páginas:");
        int unNroPaginas1 = input.nextInt();
        input.nextLine();

        Libro libro1 = new Libro(unIsbn1, unTitulo1, unAutor1, unNroPaginas1);
        int idLibro1 = libro1.getIDENTIFICADOR();


        // Pedir datos al usuario y generar el Libro 2:
        System.out.println("Libro 2 - Ingrese el ISBN:");
        int unIsbn2 = input.nextInt();
        input.nextLine();

        System.out.println("Libro 2 - Ingrese el Título del libro:");
        String unTitulo2 = input.nextLine();

        System.out.println("Libro 2 - Ingrese el nombre del autor:");
        String unAutor2 = input.nextLine();

        System.out.println("Libro 2 - Ingrese el número de páginas:");
        int unNroPaginas2 = input.nextInt();
        input.nextLine();

        Libro libro2 = new Libro(unIsbn2, unTitulo2, unAutor2, unNroPaginas2);
        int idLibro2 = libro2.getIDENTIFICADOR();


        // Mostar libros registrados
        System.out.println("Estos son los libros registrados:");
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println("Fin.");

    }


}
