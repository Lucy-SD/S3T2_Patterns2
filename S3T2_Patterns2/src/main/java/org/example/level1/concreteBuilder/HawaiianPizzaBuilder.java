package org.example.level1.concreteBuilder;

import org.example.level1.productBuilder.Pizza;

public class HawaiianPizzaBuilder {

    public Pizza build(String size, String dough) {
        return new Pizza.PizzaBuilder()
                .setSize(size)
                .setDough(dough)
                .addTopping("Salsa de tomate")
                .addTopping("Jamón")
                .addTopping("Mozzarella")
                .addTopping("Piña")
                .build();
    }
}
