package org.example.level1.director;

import org.example.level1.concreteBuilder.HawaiianPizzaBuilder;
import org.example.level1.concreteBuilder.VegetarianPizzaBuilder;
import org.example.level1.productBuilder.Pizza;

public class PizzaMaster {

    public Pizza makeHawaiianPizza(String size, String dough){
        return new HawaiianPizzaBuilder().build(size, dough);
    }

    public Pizza makeVegetarianPizza(String size, String dough) {
        return new VegetarianPizzaBuilder().build(size, dough);
    }

    public Pizza makeCustomPizza(String size, String dough, String... toppings) {
        Pizza.PizzaBuilder builder = new Pizza.PizzaBuilder()
                .setSize(size)
                .setDough(dough);

        for (String topping : toppings) {
            builder.addTopping(topping);
        }

        return builder.build();
    }

}
