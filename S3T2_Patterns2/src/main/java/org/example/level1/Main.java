package org.example.level1;

import org.example.level1.director.PizzaMaster;
import org.example.level1.productBuilder.Pizza;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;


public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {
        
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8.name()));

        PizzaMaster pizzaiolo = new PizzaMaster();

        Pizza hawaiian = pizzaiolo.makeHawaiianPizza("XXL", "a la piedra");
        System.out.println("Pizza Hawaiiana " + hawaiian);

        Pizza vegetarian = pizzaiolo.makeVegetarianPizza("L", "al molde");
        System.out.println("Pizza Vegetariana " + vegetarian);

        Pizza custom = pizzaiolo.makeCustomPizza(
                "M", "integral",
                "Salsa blanca", "Queso de cabra", "Cebolla caramelizada", "Pollo", "Bacon"
        );
        System.out.println("Pizza Personalizada " + custom);
    }
}