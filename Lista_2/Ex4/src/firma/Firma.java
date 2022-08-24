/*
 Modificar o projeto Firma incluindo:
• Uma sobrecarga do construtor em Tecnico, sem o valor do salário (utilizar zero
como substituto);
• Outra sobrecarga do construtor em Tecnico, sem o valor do titulo (utilizar “Sr.”
como substituto).
 */
package firma;
import javax.swing.*;
import java.text.*;

/**
 *
 * @author EZEQUIEL
 */
public class Firma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int i;
        
        Empregado[] formas=new Empregado[4];
        
        formas[0]= new Tecnico("A1", "Marcos", 2000, "Dr.", 0);
        formas[1]= new Tecnico("A2", "Carlos", 2000);
        
        formas[2]= new Vendedor("C3", "Pedro", "Nenhum",900, 0.5);
        formas[3]= new Vendedor("C4", "Lisa", "Nenhum",1000, 0.2);
 
        NumberFormat moeda = NumberFormat.getCurrencyInstance();
        NumberFormat percentual = NumberFormat.getPercentInstance();
        
        for(i=0; i<4; i++){
        JOptionPane.showMessageDialog (null,"\n\nMatrícula: "+ formas[i].getMatricula() +"\nNome: " + formas[i].getNome() +
        "\nTítulo: "+formas[i].getTitulo()+        
        "\nSalário: " + moeda.format(formas[i].calc())+" (já incluída a comissão de: "+percentual.format(formas[i].getComissao())+")");   
        
        }
    }
    
}
