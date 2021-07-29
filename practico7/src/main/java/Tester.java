public class Tester extends Empleado {

    // Atributos
    private boolean testerManual;
    private boolean testerAutomatizador;

    // Constructor con 2 parámetros: testerManual y testerAutomatizador
    public Tester(String unNombre, int unTelefono, float unSueldo, boolean esManual, boolean esAutomatizador) {
        super(unNombre, unTelefono, unSueldo);
        this.testerManual = esManual;
        this.testerAutomatizador = esAutomatizador;
        if (esAutomatizador == true) {
            this.testerManual = true;
        }
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
        String retorno = super.toString();
        if (this.getTesterManual() == true) {
            retorno += " Es tester manual.";
        } else {
            retorno += " NO es tester manual.";
        }
        if (this.getTesterAutomatizador() == true) {
            retorno += " Es tester automatizador.";
        } else {
            retorno += " NO es tester automatizador.";
        }
        return retorno;
    }

}
