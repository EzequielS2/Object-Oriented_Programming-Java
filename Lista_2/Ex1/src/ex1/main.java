/*
Criar um sistema que forneça a autonomia (relação consumo * capacidade
do tanque de combustível) de veículos como motos e automóveis (usar dois tipos de
motos e dois tipos de carros). O sistema deve também calcular, a partir de uma distância
fornecida via JoptionPane (valor em Km), o gasto utilizando cada um dos quatro
veículos do sistema, dado que o preço da gasolina é R$ 2,60 por litro. Mostre também
quanto é o custo por passageiro para cada veículo. Utilize métodos construtores.
 */

package ex1;
import javax.swing.*;
import java.text.*;
import javax.swing.JOptionPane;

/**
 *
 * @author EZEQUIEL
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String mat1, mat2, mat3, mat4;
        
        double PRECO=2.60;
        
        mat1 = JOptionPane.showInputDialog("Informe o consumo em kilometros da Kawasaki: ");
        Moto mot1 = new Moto("Kawasaki,", 20.1, Double.parseDouble(mat1), 2, 500);
        
        mat2 = JOptionPane.showInputDialog("Informe o consumo em kilometros da Honda : ");
        Moto mot2 = new Moto("Honda", 30.5, Double.parseDouble(mat2), 2, 125);
        
        mat3 = JOptionPane.showInputDialog("Informe o consumo em kilometros do carro Gol: ");
        Carro car1 = new Carro("Gol", 50, Double.parseDouble(mat3), 4, 4);
        
        mat4 = JOptionPane.showInputDialog("Informe o consumo em kilometros do carro Ferrari: ");
        Carro car2 = new Carro("Ferrari", 40, Double.parseDouble(mat4), 4, 4);
       
        JOptionPane.showMessageDialog (null,"Moto: " + mot1.getNome() +"\nTanque: " + mot1.getTanque() +
        "\nConsumo: "+ mot1.getConsumo()+" Km" +"\nPessoas: "+ mot1.getQtPessoas()+"\nCilindradas: "+
        mot1.getCilindradas()+"\nAutonomia: "+mot1.Autonomia()+"\nGasto: "+ 
        mot1.Gasto(PRECO)+"\nGasto por pessoa: "+mot1.GastoPorPessoa(PRECO)+"\n\n"+
                
        "Moto: " + mot2.getNome() +"\nTanque: " + mot2.getTanque() +
        "\nConsumo: "+ mot2.getConsumo()+" Km" +"\nPessoas: "+ mot2.getQtPessoas()+"\nCilindradas: "+
        mot2.getCilindradas()+"\nAutonomia: "+mot2.Autonomia()+"\nGasto: "+ 
        mot2.Gasto(PRECO)+"\nGasto por pessoa: "+mot2.GastoPorPessoa(PRECO)+"\n\n"+
                
        "Carro: " + car1.getNome() +"\nTanque: " + car1.getTanque() +
        "\nConsumo: "+ car1.getConsumo()+" Km" +"\nPessoas: "+ car1.getQtPessoas()+"\nCilindradas: "+
        car1.getPortas()+"\nAutonomia: "+car1.Autonomia()+"\nGasto: "+ 
        car1.Gasto(PRECO)+"\nGasto por pessoa: "+car1.GastoPorPessoa(PRECO)+"\n\n"+
                
        "Carro: " + car2.getNome() +"\nTanque: " + car2.getTanque() +
        "\nConsumo: "+ car2.getConsumo()+" Km" +"\nPessoas: "+ car2.getQtPessoas()+"\nCilindradas: "+
        car2.getPortas()+"\nAutonomia: "+car2.Autonomia()+"\nGasto: "+ 
        car2.Gasto(PRECO)+"\nGasto por pessoa: "+car2.GastoPorPessoa(PRECO));
        
        
        
    }
    
}
