package abstractFactory.udemy;

public class AwsInstance implements Instance {

    public AwsInstance(Size size) {
        System.out.println("Initializing the AWS Instance:" + size);
    }

    @Override
    public void start() {
        System.out.println("Starting AWS Instance");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the AWS Instance");
    }

    @Override
    public void run() {
        System.out.println("Running the AWS Instance");
    }

    @Override
    public void storageAttach(Storage storage) {
        System.out.println("Storage attached for AWS");
    }
}
