public class Tester extends Empleado {

    // Atributos
    private boolean testerManual;
    private boolean testerAutomatizador;

    // Constructor con 2 parámetros: testerManual y testerAutomatizador
    public Tester(boolean esManual, boolean esAutomatizador) {
        this.testerManual = esManual;
        this.testerAutomatizador = esAutomatizador;
    }

    // Métodos get
    public boolean getTesterManual() {
        return this.testerManual;
    }
    public boolean getTesterAutomatizador() {
        return this.testerAutomatizador;
    }

    // Métodos set
    public void setTesterManual(boolean esManual) {
        this.testerManual = esManual;
    }
    public void setTestesAutomatizador(boolean esAutomatizador) {
        this.testerAutomatizador = esAutomatizador;
    }

    // Método toString
    public String toString() {
        String retorno = "";
        if (this.getTesterManual() == true) {
            retorno = " es Manual.";
        } else {
            retorno = " NO es Manual.";
        }
        if (this.getTesterAutomatizador() == true) {
            retorno += " Es Automatizador.";
        } else {
            retorno += " NO es Automatizador.";
        }
        return retorno;
    }

}
