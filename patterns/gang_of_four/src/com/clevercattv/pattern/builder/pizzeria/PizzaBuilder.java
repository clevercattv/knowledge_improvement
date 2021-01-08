package com.clevercattv.pattern.builder.pizzeria;

import com.clevercattv.pattern.builder.pizzeria.component.Banana;
import com.clevercattv.pattern.builder.pizzeria.component.Cheese;
import com.clevercattv.pattern.builder.pizzeria.component.Fish;
import com.clevercattv.pattern.builder.pizzeria.component.Sausage;

// builder generated by Intellij Idea (Refactor | Replace Constructor with Builder)
public class PizzaBuilder {
    private Sausage sausage;
    private Cheese cheese;
    private Fish fish;
    private Banana banana;

    public PizzaBuilder setSausage(Sausage sausage) {
        this.sausage = sausage;
        return this;
    }

    public PizzaBuilder setCheese(Cheese cheese) {
        this.cheese = cheese;
        return this;
    }

    public PizzaBuilder setFish(Fish fish) {
        this.fish = fish;
        return this;
    }

    public PizzaBuilder setBanana(Banana banana) {
        this.banana = banana;
        return this;
    }

    // As for me, that's bad idea name method createPizza.. build() sounds better
    public Pizza createPizza() {
        return new Pizza(sausage, cheese, fish, banana);
    }
}