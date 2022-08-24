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
public class Veiculo{
    
    private String nome;
    private double tanque, consumo;
    private int qtPessoas;
   
    
    
    
    public Veiculo(String nome, double tanque, double consumo, int qtPessoas){   
        
        this.nome=nome;
        this.tanque=tanque;
        this.consumo=consumo;
        this.qtPessoas=qtPessoas;
 
    }
    
    
    
    
    //getters & setters
    public String getNome() { return nome; }
    public double getTanque() { return tanque; }
    public double getConsumo() { return consumo; }
    public int getQtPessoas() { return qtPessoas; }
    
    
    public void setNome(String nome){ this.nome = nome; }
    public void setTanque(double tanque){ this.tanque = tanque; }
    public void setConsumo(double consumo){ this.consumo = consumo; }
    public void setQtPessoas(int qtPessoas){ this.qtPessoas = qtPessoas; }
    
    //Por padrão usa-se 'this' para que o nome do
    //argumento possa ser igual ao nome do atributo.
    //Este é um padrão do Java.
    //Significado: (idem para os outros setters)
    //esteObjeto.matricula = novaMatricula;
    
    public double Autonomia(){return consumo*tanque;}
    public double Gasto(double pr){return consumo*pr;}
    public double GastoPorPessoa(double pr){return (Gasto(pr)/qtPessoas);}
    
    
    
}





