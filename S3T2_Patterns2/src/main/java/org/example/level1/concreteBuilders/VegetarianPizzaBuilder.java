package org.example.level1.concreteBuilders;

import org.example.level1.builder.PizzaBuilder;
import org.example.level1.product.Pizza;

public class VegetarianPizzaBuilder implements PizzaBuilder {
    private final Pizza pizza = new Pizza();

    public void setSize(String size) {pizza.setSize(size);}
    public void setDough(String dough) {pizza.setDough(dough);}
    public void addToppings() {
        pizza.addTopping("Salsa de tomate");
        pizza.addTopping("Setas");
        pizza.addTopping("Berenjena");
        pizza.addTopping("Cebolla");
        pizza.addTopping("NoQueso");
    }
    public Pizza getPizza() {return pizza;}
}
