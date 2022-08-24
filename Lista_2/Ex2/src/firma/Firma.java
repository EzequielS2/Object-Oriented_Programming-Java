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
        
        Empregado e = new Empregado("E1","João",100);
        Vendedor v = new Vendedor("V1","Pedro",500,0.2);
        Tecnico t = new Tecnico("T1","José",2000,"Dr. ");
 
        NumberFormat moeda = NumberFormat.getCurrencyInstance();
        NumberFormat percentual = NumberFormat.getPercentInstance();
        
        JOptionPane.showMessageDialog (null,"Matrícula: " + e.getMatricula() +"\nNome: " + e.getNome() +
        "\nSalário: " + moeda.format(e.calc())+"\n\nMatrícula: "+ v.getMatricula() +"\nNome: " + v.getNome() +
        "\nSalário: " + moeda.format(v.calc())+" (já incluída a comissão de: "+percentual.format(v.getComissao())+")"+
        "\n\nMatrícula: "+ t.getMatricula() +"\nNome: " + t.getNome() + "\nTítulo: "+t.getTitulo()+"\nSalário: " +
        moeda.format(t.calc()));
    }
    
}
