package DAY_03_22.threadEx;

public class ThreadExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        t1.start(); // thread 실행
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<10; i++){
                    System.out.println("*************************************");
                    try { Thread.sleep(1000); } catch (InterruptedException e) { throw new RuntimeException(e); } // sleep을 사용할 경우 형식상 try~catch사용
                }
            }
        });
        t2.start();
        System.out.println("Hello");
        System.out.println(Thread.currentThread().getName()); // main도 하나의 Thread임을 알 수 있다.
        MyThread t3 = new MyThread();
        t3.start();
    }
}

class MyThread extends Thread{ // Runnable을 상속받아도 되지만, Thread를 상속받아도 된다.
    @Override
    public void run(){ // 오류가 안나는 걸로봐선 Thread도 run()메서드를 가지고 있다.
        // Runnable이 아닌 Thread가 실행시키는 run()
        System.out.println("1234567890");
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for(int i=0; i<10; i++){
            System.out.println("---------------------------------------");
            try { Thread.sleep(1000); } catch (InterruptedException e) { throw new RuntimeException(e); } // sleep을 사용할 경우 형식상 try~catch사용
        }
    }

}