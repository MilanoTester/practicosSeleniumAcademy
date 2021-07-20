public class Producto {
    // Atributos
    private String nombre;
    private int codigo;
    private boolean importado;
    private String nroLote;
    private static int NROPRODUCTO;

    // Constructor sin parámetros
    public Producto() {
        this.nombre = "desconocido";
        this.codigo = 0;
        this.importado = false;
        this.nroLote = "desconocido";
        NROPRODUCTO++;
    }

    // Constructor con 1 parámetro: nombre
    public Producto(String unNombre) {
        this.nombre = unNombre;
        this.codigo = 0;
        this.importado = false;
        this.nroLote = "desconocido";
        NROPRODUCTO++;
    }

    // Constructor con 2 parámetros: nombre y código
    public Producto(String unNombre, int unCodigo) {
        this.nombre = unNombre;
        this.codigo = unCodigo;
        this.importado = false;
        this.nroLote = "desconocido";
        NROPRODUCTO++;
    }

    // Constructor con 3 parámetros: nombre, código e importado
    public Producto(String unNombre, int unCodigo, boolean esImportado) {
        this.nombre = unNombre;
        this.codigo = unCodigo;
        this.importado = esImportado;
        this.nroLote = "desconocido";
        NROPRODUCTO++;
    }

    // Constructor con 4 parámetros: nombre, código, importado y nro de lote
    public Producto(String unNombre, int unCodigo, boolean esImportado, String unLote) {
        this.nombre = unNombre;
        this.codigo = unCodigo;
        this.importado = esImportado;
        this.nroLote = unLote;
        NROPRODUCTO++;
    }

    // Métodos get
    public String getNombre() {
        return this.nombre;
    }
    public int getCodigo() {
        return this.codigo;
    }
    public boolean getImportado() {
        return this.importado;
    }
    public String getNroLote() {
        return this.nroLote;
    }
    public int getNROPRODUCTO() {
        return this.NROPRODUCTO;
    }

    // Métodos set
    public void setNombre(String unNombre) {
        this.nombre = unNombre;
    }
    public void setCodigo(int unCodigo) {
        this.codigo = unCodigo;
    }
    public void setImportado(boolean esImportado) {
        this.importado = esImportado;
    }
    public void setNroLote(String unLote) {
        this.nroLote = unLote;
    }

    // Método para determinar si un

    // Método toString
    public String toString() {
        boolean esImportado = this.getImportado();
        if (esImportado == true) {
            return "Producto " + this.getNombre() + ", código " + this.getCodigo() + ", Nro de lote " + this.getNroLote() + ". Producto importado.";
        } else {
            return "Producto " + this.getNombre() + ", código " + this.getCodigo() + ", Nro de lote " + this.getNroLote() + ". Producto nacional.";
        }
    }

}
