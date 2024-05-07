package com.mycompany.figurasgeometricaspoo;

public class Rectangulo extends FiguraGeometrica{
    
    double ladoUno, ladoDos;

    public Rectangulo() {
    }

    public Rectangulo(double ladoUno, double ladoDos, String nombreFig, String colorFig) {
        super(nombreFig, colorFig);
        this.ladoUno = ladoUno;
        this.ladoDos = ladoDos;
    }
    
    public double obtenerAreaR(){
        return ladoUno*ladoDos;
    }
    
    public double obtenerPerimetroR(){
        return 2*(ladoUno+ladoDos);
    }
    
}
