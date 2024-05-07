package com.mycompany.figurasgeometricaspoo;

public class Circulo extends FiguraGeometrica{
    
    double radio;

    public Circulo() {
    }

    public Circulo(double radio, String nombreFig, String colorFig) {
        super(nombreFig, colorFig);
        this.radio = radio;
    }
    
    public double obtenerAreaC(){
        return 3.1416*(radio*radio);
    }
    
    public double obtenerPerimetroC(){
        return 3.1416*(radio*2);
    }
    
}
