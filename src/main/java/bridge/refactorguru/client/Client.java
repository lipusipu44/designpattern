package bridge.refactorguru.client;

import bridge.refactorguru.devices.Device;
import bridge.refactorguru.devices.Radio;
import bridge.refactorguru.devices.Tv;
import bridge.refactorguru.remotes.AdvancedRemote;
import bridge.refactorguru.remotes.BasicRemote;
import bridge.refactorguru.remotes.Remote;

public class Client {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device){
        System.out.println("Testing with Basic Remote");
        Remote remote=new BasicRemote(device);
        remote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();

    }
}
