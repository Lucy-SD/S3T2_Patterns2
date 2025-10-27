package org.example.level1.concreteBuilder;

import org.example.level1.productBuilder.Pizza;

public class HawaiianPizzaBuilder extends Pizza.PizzaBuilder {

    public HawaiianPizzaBuilder(String size, String dough) {
        this.setSize(size)
                .setDough(dough)
                .addTopping("Salsa de tomate")
                .addTopping("Jamón")
                .addTopping("Mozzarella")
                .addTopping("Piña");
    }
}
