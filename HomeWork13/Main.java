package HomeWork13;


import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
	 long startTime = System.currentTimeMillis();
     System.out.println("Для завершения программы введите слово stop");

     Thread thr = new MyThread();
     thr.start();

     Scanner scanner = new Scanner(System.in);

     try {

         while (true) {
             String s = scanner.nextLine();
             long timeSpent = System.currentTimeMillis() - startTime ;
             if (timeSpent > 1) {
                 thr.stop();
                 break;
             }
         }
     } catch (Exception e) {
         e.printStackTrace();
     }
 }
}
