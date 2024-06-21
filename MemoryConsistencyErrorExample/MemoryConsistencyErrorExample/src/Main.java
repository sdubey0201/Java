public class Main {
    private static  boolean flag = false;
    public static void main(String[] args) {
        Thread t = new Thread(()->{
            while (!flag){

            }
            System.out.println("Hello world3");
            while (flag){

            }
            System.out.println("Hello world4");

        });
        t.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hello world1");
        flag = true;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hello world2");
        flag = false;

    }
}