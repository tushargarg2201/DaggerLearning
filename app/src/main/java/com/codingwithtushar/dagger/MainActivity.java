package com.codingwithtushar.dagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.codingwithtushar.dagger.car.Car;
import com.codingwithtushar.dagger.car.Engine;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Engine engine = new Engine();
        Car car = new Car(engine);
        car.drive();
    }
}
