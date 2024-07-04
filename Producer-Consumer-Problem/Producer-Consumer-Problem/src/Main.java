public class Main {
    public static void main(String[] args) {
        DataBus dataBus = new DataBus(10);
        Thread producer = new Thread(new Producer(dataBus),"Producer");
        Thread consumer1 = new Thread(new Consumer(dataBus),"Consumer1");

        Thread consumer2 = new Thread(new Consumer(dataBus),"Consumer2");
        Thread consumer3 = new Thread(new Consumer(dataBus),"Consumer3");
        Thread consumer4 = new Thread(new Consumer(dataBus),"Consumer4");
        Thread consumer5 = new Thread(new Consumer(dataBus),"Consumer5");
        producer.start();
        consumer1.start();
        consumer2.start();
        consumer3.start();
        consumer4.start();
        consumer5.start();


    }

}