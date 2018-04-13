package home;

public class homeework4 {
	public static int max (int[] a) {
		int max=a[0];
		for (int i=0 ;i<10;i++ ) {
			if (a[i]>max)
				max=a[i];
			
		}
		return max ;
	}
	public static void pram (int a,int b) {
		
		for (int i=0;i<a;i++)
			{for(int j=0;j<b;j++)
				System.out.print("+ ");
			System.out.println();
			}}
		
	public static int  slov (String s) {
		
		int n = s.split(" +").length;
		
		return n ;
	}	
		
	
 	public static void main(String[] args) {
		
		System.out.printf("%.1f", Math.PI);
		System.out.println();
		System.out.printf("%.2f", Math.PI);
		System.out.println();
		System.out.printf("%.3f", Math.PI);
		System.out.println();
		System.out.printf("%.4f", Math.PI);
		System.out.println();
		System.out.printf("%.5f", Math.PI);
		System.out.println();
		System.out.println("----------------------------------------------------------------");

		int[] mas1 = {1,2,3,44,5,6,7,8,9,10} ;
		int a = max(mas1);
		System.out.println(a);
		System.out.println("----------------------------------------------------------------");

		int q=10 ;
		int w=4 ;
		pram(q,w) ;
		System.out.println("----------------------------------------------------------------");
		System.out.println(slov("qsadasd    asdasdasd    asdasdasd     asdasdasdasdasd asdasd"));
		
		
	}

}
