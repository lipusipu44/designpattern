package abstractFactory.udemy;

public interface Instance {
    void storageAttach(Storage storage);

    enum Size{SMALL,MICRO,LARGE};

    void start();
    void stop();
    void run();

}
