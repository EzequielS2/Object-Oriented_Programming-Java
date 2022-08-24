/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firma;

/**
 *
 * @author EZEQUIEL
 */
public class Tecnico extends Empregado {
    
    private String titulo;
    public Tecnico(String m, String n, double s, String t)
    { 
        super(m,n,s);
        
        this.titulo = t;
    }
    
    public Tecnico(String m, String n, String t)
    { 
        this(m,n,0, t); // Sobercarga
        
    }
    public Tecnico(String m, String n, double s)
    { 
        this(m,n,s, "Sr."); // Sobercarga
        
    }
    
    //getters & setters
    public String getTitulo(){ return titulo; }
    public void setTitulo(String titulo){ this.titulo = titulo; }
}
