package com.codingwithtushar.dagger.car;

public class Car {
    Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        engine.drive();
    }
}
