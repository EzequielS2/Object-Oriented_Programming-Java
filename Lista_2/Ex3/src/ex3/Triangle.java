/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

/**
 *
 * @author EZEQUIEL
 */
public class Triangle extends Shape
{ 
    public Triangle (double w, double h)
    { 
        this.w = w; this.h = h;
    }

    public double getWidth ()
    { 
        return w;
    }

    public double getHeight ()
    { 
        return h;
    }
    
    public double area ()
    { 
        return ((w*h)/2.0);
    }
    
    public double total () //Perimetro
    { 
        return (3*(h));
    }
    private double w, h;
}
