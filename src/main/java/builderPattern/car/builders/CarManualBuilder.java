package builderPattern.car.builders;

import builderPattern.car.cars.CarType;
import builderPattern.car.cars.Manual;
import builderPattern.car.components.Engine;
import builderPattern.car.components.GPSNavigator;
import builderPattern.car.components.Transmission;
import builderPattern.car.components.TripComputer;

public class CarManualBuilder implements Builder{
    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public Builder setCarType(CarType carType) {
        this.carType = carType;
        return this;
    }

    @Override
    public Builder setSeats(int seats) {
        this.seats = seats;
        return this;
    }

    @Override
    public Builder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public Builder setTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    @Override
    public Builder setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
        return this;
    }
    @Override
    public Builder setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
        return this;
    }

    public Manual getResult(){
        return new Manual(carType,seats,engine,transmission,tripComputer,gpsNavigator);
    }
}
