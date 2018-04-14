package HomeWork13;



public class Spam extends Thread{

    public void Spams(int msc[],String msg[]) throws InterruptedException {

            while (true) {

                for (int i = 0; i < msc.length; i++) {

                    int ms[];

                    String posts[];

                    ms = new int[msc.length];

                    posts = new String[msg.length];

                    ms[i] = msc[i];

                    posts[i] = msg[i];

                    Thread.sleep(ms[i]);

                    System.out.println(posts[i]);

                }

            }

    }
}
   
    class mThread extends Thread{

        @Override

        public void run(){

            int k[]={500,5000};

            String a[]={"hi","Ss"};

            Spam t1 = new Spam();

            try {

                t1.Spams(k, a);

            }catch (InterruptedException e){

                System.out.println("Программа завершена");

            }

        }

    }
    



class Tst1 {

    public void main(String[] args) {



        mThread myThread = new mThread();

        myThread.start();

//        try {

//            Thread.sleep(3000);

//        } catch (InterruptedException e) {

//            e.printStackTrace();

//        }

//        myThread.interrupt();

    }

}
