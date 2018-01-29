package com.avengers.Rogers.DesignPattern.Factory.SimpleFactory.Pizza;

import com.avengers.Rogers.DesignPattern.Factory.SimpleFactory.AbstractPizza.Pizza;

public class ClamPizza extends Pizza {
    public ClamPizza() {
        name = "Clam AbstractPizza";
        dough = "Thin crust";
        sauce = "White garlic sauce";
        toppings.add("Clams");
        toppings.add("Grated parmesan cheese");
    }
}