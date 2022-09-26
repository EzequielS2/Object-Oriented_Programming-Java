package veterinario;


/**
 *
 * @author EZEQUIEL
 */

public class Animal {

    //atributos
    private String diagnostico;
    private int dias;
    
    //getters & setters
    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diag) {
        this.diagnostico = diag;
    }

    public Animal(String diag) {
        this.diagnostico = diag;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int d) {
        this.dias = d;
    }

    public Animal(String diag, int d) {
        this.diagnostico = diag;
        this.dias = d;
    }

    
}

    

