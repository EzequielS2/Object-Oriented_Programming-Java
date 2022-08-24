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

public class Moto extends Veiculo{
    
    private int cilindradas;
   
    public Moto(String nome, double tanque, double consumo, int qtPessoas, int cilindradas){   
        
        super(nome,  tanque,  consumo,  qtPessoas);
        
        this.cilindradas=cilindradas;
 
    }
    
    //getters & setters
    
    public int getCilindradas() { return cilindradas; }
    
    
    
    public void setCilindradas(int cilindradas){ this.cilindradas = cilindradas; }
   
    
    //Por padrão usa-se 'this' para que o nome do
    //argumento possa ser igual ao nome do atributo.
    //Este é um padrão do Java.
    //Significado: (idem para os outros setters)
    //esteObjeto.matricula = novaMatricula;
      
}
