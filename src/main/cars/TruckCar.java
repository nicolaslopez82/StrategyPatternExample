package main.cars;

import main.interfaces.ICar;
import org.springframework.stereotype.Component;

/**
 * Created by Nicolas on 9/9/2016.
 */

@Component("truck")
public class TruckCar implements ICar {

    @Override
    public void carType() {
        System.out.printf("I am a main Truck Car.");
    }
}
