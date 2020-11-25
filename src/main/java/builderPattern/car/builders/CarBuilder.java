package builderPattern.car.builders;

import builderPattern.car.cars.Car;
import builderPattern.car.cars.CarType;
import builderPattern.car.components.Engine;
import builderPattern.car.components.GPSNavigator;
import builderPattern.car.components.Transmission;
import builderPattern.car.components.TripComputer;

public class CarBuilder implements Builder{

    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;


    @Override
    public Builder setCarType(CarType carType) {
        this.type=carType;
        return this;
    }

    @Override
    public Builder setSeats(int seats) {
        this.seats=seats;
        return this;
    }

    @Override
    public Builder setEngine(Engine engine) {
        this.engine=engine;
        return this;
    }

    @Override
    public Builder setTransmission(Transmission transmission) {
        this.transmission=transmission;
        return this;
    }

    @Override
    public Builder setTripComputer(TripComputer tripComputer) {
        this.tripComputer=tripComputer;
        return this;
    }

    @Override
    public Builder setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator=gpsNavigator;
        return this;
    }

    public Car getResult(){
        return new Car(type,seats,engine,transmission,tripComputer,gpsNavigator);
    }
}
