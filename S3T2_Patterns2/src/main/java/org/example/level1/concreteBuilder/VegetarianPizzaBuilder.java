package org.example.level1.concreteBuilder;

import org.example.level1.productBuilder.Pizza;

public class VegetarianPizzaBuilder extends Pizza.PizzaBuilder {

    public VegetarianPizzaBuilder(String size, String dough) {
        this.setSize(size)
                .setDough(dough)
                .addTopping("Salsa de tomate")
                .addTopping("Setas")
                .addTopping("Berenjena")
                .addTopping("Cebolla")
                .addTopping("NoQueso");
    }
}
