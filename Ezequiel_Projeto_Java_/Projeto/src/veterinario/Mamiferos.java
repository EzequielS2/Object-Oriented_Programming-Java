package veterinario;


/**
 *
 * @author EZEQUIEL
 */
public abstract class Mamiferos extends Animal{

    public Mamiferos(String diag, int di) {
        super(diag, di);
    }

    @Override
    public abstract String toString();
    public abstract double total();
    
}
