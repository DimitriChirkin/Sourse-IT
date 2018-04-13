package home;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class homework2 {
	public static void  main (String[] args)
	{

		System.out.println("Задание 1");
	  Scanner inp = new Scanner(System.in);
      System.out.println("Введите любое число : ");
      int input = inp.nextInt();
      int [] b =new int[100];
      
      int i=0 ;
      while (input > 0 ) 
      {
    	 b [i] = input % 10 ;
    	 input=input/10 ; 
    	 i++;
      } 
      int c ;
      System.out.println("Это число горизонтально : ");
      for(c=i-1 ;c>=0;c-- )
      {
    	  System.out.println(b[c]);
    	  
      }
      
      //задание 2
      System.out.println("---------------------------------------------- \n Задание 2");
      System.out.println("Введите три стороны треугольника : ");
      float a1 = inp.nextFloat() ;
      float a2 = inp.nextFloat() ;
      float a3 = inp.nextFloat() ;
      float s ;
      float s1 ;
      float p ;
      p=(a1+a2+a3)/2 ;
      s1 = p*(p-a1)*(p-a2)*(p-a3) ;
      s= (float)Math.pow(s1, 0.5)  ;
      System.out.println("Площадь данного треугольника ="+s);
      
      
      //Задание 3
      System.out.println("---------------------------------------------- \n Задание 3");
      System.out.println("Введите радиус окружности");
      
      float radius = inp.nextFloat() ;
      float pl ;
      pl =(float)Math.PI * (float)Math.pow(radius, 2) ;

      System.out.print("Площадь окружности = ");
      System.out.printf("%8.2f" , pl) ;
      
      
      

     	
	}
	
}
