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
public class Rectangle extends Shape
{ 
    public Rectangle (double w, double h)
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
        return (w*h);
    }
    
    public double total () //Perimetro
    { 
        return (2*(w+h));
    }
    private double w, h;
}