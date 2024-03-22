package DAY_03_22.threadEx.threadSafeOver;

public class StopFlagExample {
    public static void main(String[] args) throws InterruptedException {
        PrintThread1 printThread = new PrintThread1();
        printThread.start();

        Thread.sleep(1000);

        printThread.setStop(true);
    }
}
