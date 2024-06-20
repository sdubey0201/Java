public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Thread userThread = new Thread(() ->{
            {
                for (int i = 0; i < 10 ; i++) {
                    System.out.println("This is user thread "+Thread.currentThread().getName()+ " Index "+i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        Thread daemonThread = new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.println("This is daemon thread "+Thread.currentThread().getName()+" index :"+i);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        });
        daemonThread.setDaemon(true);
        userThread.start();
        daemonThread.start();
    }


}