package home;

import java.util.Scanner;



public class Homework3 {

	public static void main(String[] args) {
		System.out.println("Задание 1");
	    Scanner inp = new Scanner(System.in);
	      System.out.println("Введите любое число : ");
	      int input = inp.nextInt();
	      String s="*" ; 
	      for (int i =0 ; i<input*2-1; i++)
	      {
	    	  System.out.println(s);
	    	  if (i<input-1)
	    	     {s+="*";}
	    	  else 
	    		  {s = s.substring(0, s.length() - 1);}
	    	  
	      }
	      
	      System.out.println("--------------------------------------");
	      System.out.println("Задание 2");
	      System.out.println("Введите кол-во полос");
	      int i1 = inp.nextInt();//кол-во полос
	      System.out.println("Введите длинну полосы");
	      int i2 = inp.nextInt();//кол-во элементов в полосе
	      System.out.println("Введите высоту обоев");
	      int i3 = inp.nextInt();//высота обоев 
	      String ob="";
	      for (int i =0 ; i < i1 ; i++ )
	      {
	    	  if (i%2==0)
	    	     {for(int j= i ; j < i+i2 ; j++)
	    	    	 {
	    	    	    ob+="+";
	    	    	  }
	    	     }
	    	  else
	    	     {for(int j= i ; j < i+i2 ; j++)
    	    	 {
    	    	    ob+="*";
    	    	  }
	    		  
	    	  
	      }
	    	 
	      
	      

	}
	      for (int i=0 ;i<i3 ;i++)
	      System.out.println(ob);
	      System.out.println("---------------------------------------");
	      System.out.println("Задание 3");
	      int[] a = new int[10] ;
	      int[] b = new int[20] ;
	      for (int i =0 ;i<10 ;i++)
	      {
	    	  a[i]=(int) (Math.random()*(10+1))  ;
	      }
	      for (int i=0 ;i<20 ;i++)
	      {
	    	  if (i<10)
	    	    b[i]=a[i] ;
	    	  else
	    		b[i]=a[i-10]*2 ;  
	      }

 
	      for (int i = 0 ; i<10 ;i++)
	    	  System.out.print(a[i]+" ");
	      System.out.println();
	      for (int i = 0 ; i<20 ;i++)
	    	  System.out.print(b[i]+" ");
	      
	      System.out.println("---------------------------------------");
	      System.out.println("Задание 4");
	      System.out.println("Задайте размер массива");
	      int i4 = inp.nextInt();
	      int[][] mas = new int[100][100] ;
	      for (int i=0;i<i4;i++)
	       {for (int j=0 ;j<i4;j++)
	    	 // mas[i][j]=(int) (Math.random()*(10+1))  ;
	    	 mas[i][j]=i ; 
	        
	       } 
	      for (int i=0;i<i4;i++)
	       {for (int j=0 ;j<i4;j++)
	    	System.out.print(mas[i][j]+" ");
	        System.out.println();
	       }  
	      System.out.println("---------------------------------------");
	      System.out.println("90 градусов по часовой стрелке");

	       int[][] mas1=new int[100][100] ;
	      for (int i=0;i<i4;i++)
	       for (int j=0 ;j<i4;j++)
	         {mas1[j][i4-1-i]=mas[i][j];}
	      for (int i=0;i<i4;i++)
	       {for (int j=0 ;j<i4;j++)
	    	System.out.print(mas1[i][j]+" ");
	        System.out.println();
	       }  
	   
	      System.out.println("---------------------------------------");
	      System.out.println("180 градусов по часовой стрелки");
	       int[][] mas2=new int[100][100] ;
	      for (int i=0;i<i4;i++)
	       for (int j=0 ;j<i4;j++)
	         {mas2[j][i4-1-i]=mas1[i][j];}
	      for (int i=0;i<i4;i++)
	       {for (int j=0 ;j<i4;j++)
	    	System.out.print(mas2[i][j]+" ");
	        System.out.println();
	       }  
	      System.out.println("---------------------------------------");
	      System.out.println("270 градусов по часовой стрелки");
	       int[][] mas3=new int[100][100] ;
	      for (int i=0;i<i4;i++)
	       for (int j=0 ;j<i4;j++)
	         {mas3[j][i4-1-i]=mas2[i][j];}
	      for (int i=0;i<i4;i++)
	       {for (int j=0 ;j<i4;j++)
	    	System.out.print(mas3[i][j]+" ");
	        System.out.println();
	       }  
	      

}
}
