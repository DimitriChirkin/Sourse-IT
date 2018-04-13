package HW8;

import java.util.Scanner;

public class Demo {

	    public static int  []A = { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
	    public static String []R = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"}; 
	    public static String ArabicToRom(int num){
	        int i = 12;
	        String result = "";
	        while (num > 0){
	        for (int j = 0 ; j<13 ;j++)
	        {	i=12 ;
	        	i-=j;
	            if (i >= 0 && A[i] <= num ){
	                result += R[i];
	                num -= A[i];
	                break ;
	            }
	        }}
	        return result;}
	    
	    
//	    static int RomenToArabic (String str)
//	    {
//	    	int x=0 ;
//	    	while (str!="")
//	    	{
//	   
//	    char s = str.toCharArray()[str.length() - 1];
//
//	    char s1 = str.toCharArray()[str.length() - 1];
//	    String st = String.valueOf(s) ;
//	    String st1 = String.valueOf(s1) ;
//	    String str1=st+st1 ;
//	    for (int j = 0 ; j<13 ;j++)
//	    {
//	    	if (str1==R[j])
//	    	x+=A[j];
//	    	
//	    }
//	    if(str!=null || str.length()!=0)
//    	{ 
//    		str= str.substring(0, str.length()-1); 
//    	} 
//    else
//    {break; }
//	    if(str!=null || str.length()!=0)
//    	{ 
//    		str= str.substring(0, str.length()-1); 
//    	} 
//    else
//    {break; }
//	    }
//	    return  x ;
//	
//	    }
//	    

	    
	    public static void main(String[] args) {
	        System.out.print("Введите число от 1 до 1000: ");
	        Scanner scan = new Scanner(System.in);
	        int number = scan.nextInt();
//	
//	        System.out.println(RomenToArabic (st) );
	        String romanNumber = ArabicToRom(number);
	        System.out.println("В римском исчилении: " + romanNumber);
	    }
	}
