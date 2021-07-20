public class Libro {
    // Atributos
    private int isbn;
    private String titulo;
    private String autor;
    private int nroPaginas;
    private int IDENTIFICADOR;


    // Constructor sin parámetros
    public Libro() {
        this.isbn = 0000;
        this.titulo = "sin título";
        this.autor = "desconocido";
        this.nroPaginas = 0000;
    }

    // Constructor con 4 parámetros: ISBN, título, autor y Nro de páginas
    public Libro(int unIsbn, String unTitulo, String unAutor, int unNroPaginas) {
        this.isbn = unIsbn;
        this.titulo = unTitulo;
        this.autor = unAutor;
        this.nroPaginas = unNroPaginas;
    }


    // Métodos get
    public int getIsbn() {
        return this.isbn;
    }
    public String getTitulo() {
        return this.titulo;
    }
    public String getAutor() {
        return this.autor;
    }
    public int getNroPaginas() {
        return this.nroPaginas;
    }
    public int getIDENTIFICADOR() {
        return this.IDENTIFICADOR;
    }


    // Métodos set
    public void setIsbn(int unIsbn) {
        this.isbn = unIsbn;
    }
    public void setTitulo(String unTitulo) {
        this.titulo = unTitulo;
    }
    public void setAutor(String unAutor) {
        this.autor = unAutor;
    }
    public void setNroPaginas(int unNroPaginas) {
        this.nroPaginas = unNroPaginas;
    }


    // Método toString
    public String toString() {
        return "El libro '" + this.getTitulo() + "' con ISBN " + this.getIsbn() + ", creado por el autor " + this.getAutor() + ", tiene " + this.getNroPaginas() + " páginas.";
    }



}
