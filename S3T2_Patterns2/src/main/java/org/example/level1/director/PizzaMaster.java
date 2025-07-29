package org.example.level1.director;

import org.example.level1.builder.PizzaBuilder;
import org.example.level1.product.Pizza;

public class PizzaMaster {
    public Pizza makePizza(PizzaBuilder builder, String size, String dough){
        builder.setSize(size);
        builder.setDough(dough);
        builder.addToppings();
        return builder.getPizza();
    }
}
