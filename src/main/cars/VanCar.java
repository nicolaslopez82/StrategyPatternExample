package main.cars;

import org.springframework.stereotype.Component;

import main.interfaces.ICar;

/**
 * Created by Nicolas on 9/9/2016.
 */

@Component("van")
public class VanCar implements ICar {

    @Override
    public void carType() {
        System.out.println("I am a main Van Car.");
    }
}
