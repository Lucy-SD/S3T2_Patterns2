package org.example.level1.builder;

import org.example.level1.product.Pizza;

public interface PizzaBuilder {
    void setSize(String size);
    void setDough(String dough);
    void addToppings();
    Pizza getPizza();
}
