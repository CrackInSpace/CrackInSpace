public class TestVolatile extends Thread{
    volatile boolean keepRunning = true;//volatile помечает переменную для общей кучи, а не локальной
//    boolean keepRunning = true;


    @Override
    public void run() {
        long counter = 0;
        while (keepRunning){
            counter++;
        }

        System.out.println("Thread terminated " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        TestVolatile testVolatile = new TestVolatile();
        testVolatile.start();
        Thread.sleep(1000);
        System.out.println("Main stopped sleeping");
        testVolatile.keepRunning = false;
        testVolatile.join();
        System.out.println("keepRunning st to " + testVolatile.keepRunning);
    }
}
