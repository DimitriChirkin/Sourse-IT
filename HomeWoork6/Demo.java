package HomeWoork6;

import java.util.Arrays;
import java.util.Scanner;

import java.util.stream.Stream ;

public class Demo {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in) ;
		
		Swit[] S = new Swit[5] ;
		
		S[0] = new Swit ("�������" , 1 , 1);
	    
		S[1] = new FereroRoshen ("��������" , 2 , 2,"������");
		
		S[2] = new Chokolet ("�������" , 3 , 3,"�����");
		
		S[3] = new Candi ("��������" , 4 , 4,"������");
		
		S[4] = new Jvachka ("�������" , 5 , 5,"������");

        
        System.out.println("��������:");
        
        for (int i=0 ; i<S.length ; i++ )
        
        	System.out.println(i+1+"."+S[i].getName());
	
        
        int ves1=0 ;
        
        Swit[] S1 = new Swit[3] ;
	 
        System.out.println ("������ ��� ������� ����� �� �����:") ;
	 
        for(int i=0 ;i< 3; i++) {
		
        	int j =in.nextInt() ;
		 
        	S1[i]=S[j] ;
		 
        	System.out.println(S[j-1].getName()) ;
		 
        	ves1 = ves1 + S[j-1].getVes() ;
		 
	 }
	 System.out.println("����� ��� = "+ves1) ;
	 
	 Stream<Swit> streamSwit = Stream.of(S1);
	 
	 

     System.out.println(" ���������� �� ���� ");

  

     streamSwit

             .sorted((sweet1, sweet2) -> {

             if(sweet1 != null && sweet2 != null)

                 return sweet1.getVes() - sweet2.getVes();

             else return 0;

             })



             .forEach(i ->  {

                 if(i != null)

                     System.out.println(i.getName() +

                     " - �����: " + i.getVes());

              				}); 
             
	}}
	
