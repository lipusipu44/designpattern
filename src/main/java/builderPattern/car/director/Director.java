package builderPattern.car.director;

import builderPattern.car.builders.Builder;
import builderPattern.car.cars.CarType;
import builderPattern.car.components.Engine;
import builderPattern.car.components.GPSNavigator;
import builderPattern.car.components.Transmission;
import builderPattern.car.components.TripComputer;

public class Director {


    public void constructSportsCar(Builder builder){
        builder.setCarType(CarType.SPORTS_CAR).setSeats(2).setEngine(new Engine(3.0,0))
                .setTransmission(Transmission.SEMI_AUTOMATIC).setGPSNavigator(new GPSNavigator())
                .setTripComputer(new TripComputer());

    }


}
