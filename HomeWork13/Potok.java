package HomeWork13;


public class Potok {

    public static void main(String[] args) {

        MyThread myThread = new MyThread();

        myThread.start();

        try {

            Thread.sleep(5000);

        }catch (InterruptedException x) { }

        myThread.interrupt();

//        System.out.println("Начало второго потока: ");

//        System.out.println("   ");

//        MyRunnable myRunnable = new MyRunnable();

//        Thread myThread2 = new Thread(myRunnable);

//        myThread2.start();

//        try {

//            Thread.sleep(5000);

//        } catch (InterruptedException x) { }

//        myThread2.interrupt();

    }

}



