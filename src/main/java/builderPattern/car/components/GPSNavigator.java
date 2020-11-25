package builderPattern.car.components;

public class GPSNavigator {

    private String route;

    public GPSNavigator(String route) {
        this.route = route;
    }

    public GPSNavigator() {
        this.route="A 205, SVS Palms1, Chinapanahalli Main Road, Bangalore";
    }

    public String getRoute() {
        return route;
    }
}
