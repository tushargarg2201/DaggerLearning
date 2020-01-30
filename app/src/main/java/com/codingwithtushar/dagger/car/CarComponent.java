package com.codingwithtushar.dagger.car;

import com.codingwithtushar.dagger.MainActivity;
import com.codingwithtushar.dagger.car.Car;

import dagger.Component;

@Component
public interface CarComponent {

     Car getCar();

     void inject(MainActivity mainActivity);
}
