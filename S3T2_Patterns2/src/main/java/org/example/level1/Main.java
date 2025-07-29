package org.example.level1;

import org.example.level1.builder.PizzaBuilder;
import org.example.level1.concreteBuilders.HawaiianPizzaBuilder;
import org.example.level1.concreteBuilders.VegetarianPizzaBuilder;
import org.example.level1.director.PizzaMaster;
import org.example.level1.product.Pizza;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;


public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {
        
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8.name()));

        PizzaMaster pizzaiolo = new PizzaMaster();

        PizzaBuilder hawaiianBuilder = new HawaiianPizzaBuilder();
        Pizza hawaiian = pizzaiolo.makePizza(hawaiianBuilder, "XXL", "a la piedra");

        System.out.println("Pizza Hawaiiana " + hawaiian);

        PizzaBuilder vegetarianBuilder = new VegetarianPizzaBuilder();
        Pizza vegetarian = pizzaiolo.makePizza(vegetarianBuilder, "L", "al molde");

        System.out.println("Pizza Vegetariana " + vegetarian);
    }
}