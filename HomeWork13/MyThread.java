package HomeWork13;

class MyThread extends Thread {

    @Override

    public void run() {

            try {

                work2();

            } catch (InterruptedException e) {

                System.out.println("Программа завершена");

            }

        }

    public void work2() throws InterruptedException{

        while(true){

            Thread.sleep(500);

            Thread.currentThread().setName("MJ");

            System.out.println(Thread.currentThread().getName());

        }

    }

}

//class MyRunnable implements Runnable{

//@Override

//    public void run(){

//    try{

//        work();

//    } catch (InterruptedException e) {

//        System.out.println("Программа завершена");

//        return;

//    }

//}

//public void work() throws InterruptedException{

//        while(true){

//            Thread.sleep(500);

//            Thread.currentThread().setName("R2D2");

//            System.out.println(Thread.currentThread().getName());

//        }

//}

//}
