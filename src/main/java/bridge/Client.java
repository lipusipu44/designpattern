package bridge;

public class Client {

    public static void main(String[] args) {
        FifoCollection<Integer> fifoCollection=new Queue<>(new SinglyLinkedList<Integer>());
        fifoCollection.offer(10);
        fifoCollection.offer(20);
        fifoCollection.offer(30);

        System.out.println(fifoCollection.poll());
        System.out.println(fifoCollection.poll());
        System.out.println(fifoCollection.poll());
    }
}
