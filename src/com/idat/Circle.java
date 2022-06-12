package com.idat;

public class Circle {

    public int radio;

    public Circle(int radio) {
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circle{" + "radio=" + radio + '}';
    }
}
