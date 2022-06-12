package com.idat;

public class VanCar extends Car{

    public int SizeHeight;

    public VanCar(String name, int year, String model, String fillingCapacity,int startHeight) {
        super(name, year, model, fillingCapacity);
        this.SizeHeight=startHeight;
    }

    public void setHeight(int newValue) {
        SizeHeight = newValue;
    }

    @Override
    public String toString() {
        return "Carro " + "Marca\t\t\t: " + name + "\nAño\t\t\t\t\t: " + year + "\nModelo\t\t\t\t: " + model + "\nCapacidad de llenado: " + fillingCapacity + "\nAltura Maxima\t\t: " + SizeHeight + "cm.";
    }
}
