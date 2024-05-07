
package com.mycompany.figurasgeometricaspoo;

import java.util.Scanner;


public class Main {
    public static void main(String[]ars){
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese el nombre a la figura");
        String nombre = sc.next();
        System.out.println("Ingrese el color a la figura");
        String color = sc.next();
        int op;
        do{
        System.out.println("Seleccione alguna figura");
        System.out.println("1. Circulo");
        System.out.println("2. Rectángulo");
        System.out.println("3. Triángulo");
        System.out.println("Pulse 0 para salir");
        op = sc.nextInt();
            switch (op){
                    case 1:
                         System.out.println("Ingrese el radio del círculo");
                         double radio = sc.nextDouble();
                         Circulo cir = new Circulo (radio, nombre, color);
                         double areaCir = cir.obtenerAreaC();
                         double perimetroCir = cir.obtenerPerimetroC();
                         System.out.println("Área del circulo: " +areaCir);
                         System.out.println("Perimetro del circulo: " +perimetroCir);
                         System.out.println("El color del circulo es: "+color+ " y el nombre es: "+nombre);
                         break;
                    case 2:
                         System.out.println("Ingrese el lado 1 del rectángulo");
                         double altura = sc.nextDouble();
                         System.out.println("Ingrese el lado 2 del rectángulo");
                         double base = sc.nextDouble();
                         Rectangulo rec = new Rectangulo(altura, base, nombre, color);
                         double areaRec = rec.obtenerAreaR();
                         double perimetroRec = rec.obtenerPerimetroR();
                         System.out.println("El área del rectangulo: " +areaRec);
                         System.out.println("El perimetro del rectangulo: "+perimetroRec);
                         System.out.println("El color del rectangulo es: "+color+ " y el nombre es: "+nombre);
                         break;
                    case 3:
                         System.out.println("Ingrese el valor de la base del triángulo");
                         double baseT = sc.nextDouble();
                         System.out.println("Ingrese el valor de la altura del triángulo");
                         double alturaT = sc.nextDouble();
                         Triangulo tri = new Triangulo (baseT, alturaT, nombre, color);
                         double areaTri = tri.obtenerAreaT();
                         double perimetroTri = tri.obtenerPerimetroT();
                         System.out.println("El área del triángulo: " +areaTri);
                         System.out.println("El perimetro del triángulo: " +perimetroTri);
                         System.out.println("El color del triángulo es: "+color+ " y el nombre es: "+nombre);
                         break;
            }
        }while (op !=0);
        System.out.println("***GRACIAS***");
    }
}