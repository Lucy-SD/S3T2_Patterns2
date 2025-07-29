package org.example.level1.concreteBuilders;

import org.example.level1.builder.PizzaBuilder;
import org.example.level1.product.Pizza;

public class HawaiianPizzaBuilder implements PizzaBuilder {
    private final Pizza pizza = new Pizza();

    public void setSize(String size) {pizza.setSize(size);}
    public void setDough(String dough) {pizza.setDough(dough);}
    public void addToppings() {
        pizza.addTopping("Salsa de tomate");
        pizza.addTopping("Jamón");
        pizza.addTopping("Mozzarella");
        pizza.addTopping("Piña");
    }
    public Pizza getPizza() {return pizza;}
}
