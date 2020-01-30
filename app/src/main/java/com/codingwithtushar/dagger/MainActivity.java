package com.codingwithtushar.dagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.codingwithtushar.dagger.car.Car;
import com.codingwithtushar.dagger.car.CarComponent;
import com.codingwithtushar.dagger.car.DaggerCarComponent;

import javax.inject.Inject;

import dagger.Component;
import dagger.internal.DaggerCollections;

public class MainActivity extends AppCompatActivity {

     @Inject Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CarComponent component = DaggerCarComponent.create();
        //Car car = component.getCar();
        component.inject(this);
        car.drive();
    }
}
