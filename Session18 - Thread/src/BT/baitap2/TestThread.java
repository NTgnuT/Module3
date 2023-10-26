package BT.baitap2;

public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        Thread threadOdd = new OddThread();
        Thread threadEven = new EvenThread();

        System.out.println("Số lẻ ");
        threadEven.start();
        threadEven.join();

        System.out.println("Số chẵn ");
        threadOdd.start();
        threadOdd.join();


    }
}
