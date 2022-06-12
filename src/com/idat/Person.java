package com.idat;

public class Person {

    private String name;
    private String hability;

    public Person(String name, String hability) {
        this.name = name;
        this.hability = hability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHability() {
        return hability;
    }

    public void setHability(String hability) {
        this.hability = hability;
    }

    @Override
    public String toString() {
        return "¡ "+ name + " es " + hability + " !";
    }
}
