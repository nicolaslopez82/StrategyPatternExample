package main.stores;

import main.cars.SedanCar;
import main.cars.TruckCar;
import main.cars.VanCar;
import main.interfaces.ICar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by Nicolas on 9/9/2016.
 */

@Component
public class Store {

    @Autowired
    @Qualifier("van")
    private ICar iCar;


    public Store() {}

    public void showYourFuckingTypeCar(String type){

        switch (type){

            case "van":
                iCar = new VanCar();
                break;

            case "sedan":
                iCar = new SedanCar();
                break;

            case "truck":
                iCar = new TruckCar();
                break;
        }

        if(iCar instanceof VanCar){iCar.carType();}
        if(iCar instanceof SedanCar ){iCar.carType();}
        if(iCar instanceof TruckCar){iCar.carType();}
    }
}
