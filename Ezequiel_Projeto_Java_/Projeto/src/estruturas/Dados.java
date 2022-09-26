
package estruturas;

import veterinario.Cachorro;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author EZEQUIEL
 */



public class Dados{

    int i;
    private ArrayList lista;
    
    public Dados() {
        lista = new ArrayList();
    }
 
    
    public void insereCadastro(Cachorro ca) {
        lista.add(ca);
    }

    public String listarTodos() {
        StringBuilder sb = new StringBuilder();
        Cachorro ca;
        Iterator i = lista.iterator();
        while (i.hasNext()) {
            ca = (Cachorro) i.next();
            sb.append(ca);
            sb.append("\n");
        }
        return sb.toString();
    }

    public ArrayList getCadastro() {
        return lista;
    }
    public void setCadastro(ArrayList cad) {
        this.lista = cad;
    }
}
