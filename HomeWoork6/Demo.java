package HomeWoork6;

import java.util.Arrays;
import java.util.Scanner;

import java.util.stream.Stream ;

public class Demo {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in) ;
		
		Swit[] S = new Swit[5] ;
		
		S[0] = new Swit ("Трюфели" , 1 , 1);
	    
		S[1] = new FereroRoshen ("Сосульки" , 2 , 2,"Золотіе");
		
		S[2] = new Chokolet ("Шеколад" , 3 , 3,"Белый");
		
		S[3] = new Candi ("Сосульки" , 4 , 4,"Мятные");
		
		S[4] = new Jvachka ("Желешки" , 5 , 5,"Мятная");

        
        System.out.println("Сладости:");
        
        for (int i=0 ; i<S.length ; i++ )
        
        	System.out.println(i+1+"."+S[i].getName());
	
        
        int ves1=0 ;
        
        Swit[] S1 = new Swit[3] ;
	 
        System.out.println ("Выбери три конфеты введя их номер:") ;
	 
        for(int i=0 ;i< 3; i++) {
		
        	int j =in.nextInt() ;
		 
        	S1[i]=S[j] ;
		 
        	System.out.println(S[j-1].getName()) ;
		 
        	ves1 = ves1 + S[j-1].getVes() ;
		 
	 }
	 System.out.println("Общий вес = "+ves1) ;
	 
	 Stream<Swit> streamSwit = Stream.of(S1);
	 
	 

     System.out.println(" Сортировка по весу ");

  

     streamSwit

             .sorted((sweet1, sweet2) -> {

             if(sweet1 != null && sweet2 != null)

                 return sweet1.getVes() - sweet2.getVes();

             else return 0;

             })



             .forEach(i ->  {

                 if(i != null)

                     System.out.println(i.getName() +

                     " - весит: " + i.getVes());

              				}); 
             
	}}
	
