package org.example.level1.concreteBuilder;

import org.example.level1.productBuilder.Pizza;

public class VegetarianPizzaBuilder {

    public Pizza build(String size, String dough) {
        return new Pizza.PizzaBuilder()
                .setSize(size)
                .setDough(dough)
                .addTopping("Salsa de tomate")
                .addTopping("Setas")
                .addTopping("Berenjena")
                .addTopping("Cebolla")
                .addTopping("NoQueso")
                .build();
    }
}
