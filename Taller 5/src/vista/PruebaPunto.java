package vista;

import modelo.Punto;

public class PruebaPunto {

    public static void main(String[] args) {

        Punto p0 = new Punto();
        System.out.println("Distancia 1: " + p0.calcularDistancia(20, 20));

        Punto p1 = new Punto();
        p1.setX(-5);
        p1.setY(3);
        System.out.println("Distancia 2: " + p1.calcularDistancia(20, 20));

        Punto p2 = new Punto(-5,3);
        Punto p = new Punto(20,20);
        System.out.println("Distancia 3: " + p2.calcularDistancia(p));
        
        Punto p3 = new Punto(3);
        System.out.println("Distancia 4: " + p3.calcularDistancia(20));
    }
}
