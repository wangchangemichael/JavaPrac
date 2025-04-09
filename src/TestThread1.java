public class TestThread1 extends Thread {
    public void run(){
        System.out.println(getName()+ "is running");

    }

    public void newthread(){
        Runnable runnable = new MyThread();
        Thread thread = new Thread(runnable,"Fischer Thread");
        thread.start();
    }
    public static void main(String[] args) {
        TestThread1 t1 = new TestThread1();
        t1.start();
        t1.newthread();
        Thread t2 = new Thread("Fischer Thread"){
            @Override
            public void run() {
                System.out.println(getName()+ " is running");
            }
        };
        t2.start();
    }

    class MyThread implements Runnable{
        public void run(){
            System.out.println("this is running");
        }
    }



}

