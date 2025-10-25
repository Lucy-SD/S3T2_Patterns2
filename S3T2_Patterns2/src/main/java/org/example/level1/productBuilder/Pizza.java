package org.example.level1.productBuilder;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private final String size;
    private final String dough;
    private final List<String> toppings;

    Pizza(PizzaBuilder builder) {
        this.size = builder.size;
        this.dough = builder.dough;
        this.toppings = List.copyOf(builder.toppings);
    }

    public String toString() {
        return "-->\nTamaño: " + size + ".\nMasa: " + dough + ".\nToppings: " + toppings + ".\n";
    }

    public static class PizzaBuilder {
        private String size;
        private String dough;
        private List<String> toppings = new ArrayList<>();

        public PizzaBuilder setSize(String size) {
            this.size = size;
            return this;
        }
        public PizzaBuilder setDough(String dough) {
            this.dough = dough;
            return this;
        }
        public PizzaBuilder addTopping(String topping) {
            this.toppings.add(topping);
            return this;
        }

        public Pizza build() {
            if (size == null || dough == null) {
                throw new IllegalArgumentException("Tamaño y masa son obligatorios.");
            }
            return new Pizza(this);
        }
    }
}
