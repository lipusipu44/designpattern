package builderPattern.car.client;

import builderPattern.car.builders.Builder;
import builderPattern.car.builders.CarBuilder;
import builderPattern.car.builders.CarManualBuilder;
import builderPattern.car.director.Director;

public class Client {

    public static void main(String[] args) {
        Director director=new Director();
        CarBuilder carBuilder=new CarBuilder();
        director.constructSportsCar(carBuilder);
        System.out.println(carBuilder.getResult().getCarType());
        System.out.println("**********************************************");
        CarManualBuilder carManualBuilder=new CarManualBuilder();
        director.constructSportsCar(carManualBuilder);
        System.out.println(carManualBuilder.getResult().print());

    }
}
