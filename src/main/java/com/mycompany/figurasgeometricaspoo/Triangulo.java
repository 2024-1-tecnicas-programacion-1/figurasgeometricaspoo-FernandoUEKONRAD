package com.mycompany.figurasgeometricaspoo;

public class Triangulo extends FiguraGeometrica{
    
    double base, altura;

    public Triangulo() {
    }

    public Triangulo(double base, double altura, String nombreFig, String colorFig) {
        super(nombreFig, colorFig);
        this.base = base;
        this.altura = altura;
    }
    
    public double obtenerAreaT(){
        return (base*altura)/2;
    }
    
    public double obtenerPerimetroT(){
        double hipotenusa = Math.sqrt((base*base)+(altura*altura));
        return base+altura+hipotenusa;
    }
}
