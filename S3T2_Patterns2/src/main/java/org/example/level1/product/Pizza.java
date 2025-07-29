package org.example.level1.product;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String size;
    private String dough;
    private final List<String> toppings = new ArrayList<>();

    public void setSize(String size) {this.size = size;}
    public void setDough(String dough) {this.dough = dough;}
    public void addTopping(String topping) {toppings.add(topping);}

    public String toString(){
        return " -->\nTamaño: " + size + ".\nMasa: " + dough + ".\nToppings: " + toppings + ".\n";
    }
}
