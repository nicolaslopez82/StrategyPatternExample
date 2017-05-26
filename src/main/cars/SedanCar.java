package main.cars;

import main.interfaces.ICar;
import org.springframework.stereotype.Component;

/**
 * Created by Nicolas on 9/9/2016.
 */

@Component("sedan")
public class SedanCar implements ICar {

    @Override
    public void carType() {
        System.out.println("I am a main Sedan Car.");
    }
}
