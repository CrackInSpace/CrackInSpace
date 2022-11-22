public class MyClass {
    public static void main(String args[]) {
        Counter counter = new Counter();

        Thread t1 = new Thread(new Runnable() {
            public void run(){
                for(int i = 0; i < 10; i++){
                    counter.inc();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run(){
                for(int i = 0; i < 10; i++){
                    counter.dec();
                    //counter.inc();
                }
            }
        });

        try{
            t1.start();
            t2.start();
            t1.join();
            t2.join();
        } catch(Exception ex){
            System.out.println("OPPS");
        }


        System.out.println("Count = " + counter.getCount());
    }
}

class Counter{
    private int count = 0;

    public int getCount(){
        return this.count;
    }

//    public void inc(){
//        try{
//            Thread.sleep(250);
//        } catch(Exception ex){
//            System.out.println("OPPS");
//        }
//        this.count++;
//        System.out.println("In inc " + count +  " " + Thread.currentThread().getName());
//    }
    public synchronized void inc(){
        try{
            Thread.sleep(250);
        } catch(Exception ex){
            System.out.println("OPPS");
        }
        this.count++;
        System.out.println("In inc " + count +  " " + Thread.currentThread().getName());
    }

//    public  void dec(){
//        this.count--;
//        try{
//            Thread.sleep(250);
//        } catch(Exception ex){
//            System.out.println("OPPS");
//        }
//        System.out.println("In dec " + count +  " " + Thread.currentThread().getName());
//    }

    public synchronized void dec(){
        this.count--;
        try{
            Thread.sleep(250);
        } catch(Exception ex){
            System.out.println("OPPS");
        }
        System.out.println("In dec " + count +  " " + Thread.currentThread().getName());
    }
}