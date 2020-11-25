package builderPattern.car.builders;

import builderPattern.car.cars.CarType;
import builderPattern.car.components.Engine;
import builderPattern.car.components.GPSNavigator;
import builderPattern.car.components.Transmission;
import builderPattern.car.components.TripComputer;

public interface Builder {
    Builder setCarType(CarType carType);
    Builder setSeats(int seats);
    Builder setEngine(Engine engine);
    Builder setTransmission(Transmission transmission);
    Builder setTripComputer(TripComputer tripComputer);
    Builder setGPSNavigator(GPSNavigator gpsNavigator);
}
