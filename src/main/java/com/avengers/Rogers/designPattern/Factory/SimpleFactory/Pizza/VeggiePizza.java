package com.avengers.Rogers.designPattern.Factory.SimpleFactory.Pizza;

import com.avengers.Rogers.designPattern.Factory.SimpleFactory.AbstractPizza.Pizza;

public class VeggiePizza extends Pizza {
    public VeggiePizza() {
        name = "Veggie AbstractPizza";
        dough = "Crust";
        sauce = "Marinara sauce";
        toppings.add("Shredded mozzarella");
        toppings.add("Grated parmesan");
        toppings.add("Diced onion");
        toppings.add("Sliced mushrooms");
        toppings.add("Sliced red pepper");
        toppings.add("Sliced black olives");
    }
}
