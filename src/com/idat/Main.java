package com.idat;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //1. aplicación que le pedirá un nombre de usuario y luego una habilidad. Luego, el programa imprimirá "nombre es habilidad"
        Person p1 = new Person("Anibal Aron", "rapido");
        System.out.println("--------------------------------");
        System.out.println(p1.toString());

        //2. aplicación que solicite un número entero e imprima su segunda potencia (x al cuadrado)
        int a = 10;
        Square square = (int x) -> x * x;
        int answer = square.calculate(a);
        System.out.println("--------------------------------");
        System.out.println("Numero base\t\t\t: " + a);
        System.out.println("Potencia al cuadrado : " + answer);

        //3. aplicación que te pida el radio de un círculo. Luego imprime su circunferencia y su área.
        Circle2 c2 = new Circle2(3);
        c2.calculateCircunferencia();
        c2.calculateArea();
        System.out.println("--------------------------------");
        System.out.println(c2.toString());

        //4. clase que te permite generar automóviles con sus características, por ejemplo: (Mazda, 2008, KT (Modelo), 24L (Capacidad de Llenado), etc..)
        VanCar vanCar = new VanCar("Mazda", 2008, "KT","240L",100);
        System.out.println("--------------------------------");
        System.out.println(vanCar.toString());

        //5. función que compruebe que un nuevo sea par o impar.
        Scanner teclado = new Scanner(System.in);
        int n;
        System.out.println("--------------------------------");
        System.out.println("Por favor, ingrese el numero a evaluar: ");
        n = teclado.nextInt();
        if(n % 2 == 0){
            System.out.println(n + ", es par");
        } else {
            System.out.println(n + ", es impar");
        }

        //6. función que multiplique dos números decimales
        Multiplication multi = new Multiplication();
        double mult1 = multi.multiplicacion(1.5, 2.5);
        System.out.println("--------------------------------");
        System.out.println("(1.5 * 2.6) = " + mult1);

    }

}
