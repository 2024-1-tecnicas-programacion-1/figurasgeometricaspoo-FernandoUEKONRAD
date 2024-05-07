package com.mycompany.figurasgeometricaspoo;

public class FiguraGeometrica {
    
    private String nombreFig;
    private String colorFig;
    
    public FiguraGeometrica(){
    }

    public FiguraGeometrica(String nombreFig, String colorFig) {
        this.nombreFig = nombreFig;
        this.colorFig = colorFig;
    }

    public String getNombreFig() {
        return nombreFig;
    }

    public void setNombreFig(String nombreFig) {
        this.nombreFig = nombreFig;
    }

    public String getColorFig() {
        return colorFig;
    }

    public void setColorFig(String colorFig) {
        this.colorFig = colorFig;
    }  
}
