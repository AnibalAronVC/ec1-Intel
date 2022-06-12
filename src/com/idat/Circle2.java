package com.idat;

public class Circle2 extends Circle {

    public double circunferencia = 0;
    public double area = 0;
    public double pi = 3.1416;

    public Circle2(int radio) {
        super(radio);
    }

    public double calculateCircunferencia(){
        circunferencia = radio * pi * 2;
        return circunferencia;
    }

    public void calculateArea(){
        area = pi  * (radio * radio);
    }

    @Override
    public String toString() {
        return "Radio del Circulo: " + radio + "\nCircunferencia\t: " + circunferencia + "\nArea\t\t\t: " + area ;
    }
}
