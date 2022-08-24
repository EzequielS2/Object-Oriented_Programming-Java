/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

/**
 *
 * @author EZEQUIEL
 */
public class Carro extends Veiculo{
    
    private double portas;
   
    public Carro(String nome, double tanque, double consumo, int qtPessoas, double portas){   
        
        super(nome, tanque, consumo, qtPessoas);
        this.portas=portas;
    
    }
    
    //getters & setters
    
    public double getPortas() { return portas; }
    
    
    
    public void setPortas(int portas){ this.portas = portas; }
   
    
    //Por padrão usa-se 'this' para que o nome do
    //argumento possa ser igual ao nome do atributo.
    //Este é um padrão do Java.
    //Significado: (idem para os outros setters)
    //esteObjeto.matricula = novaMatricula;
      
}

