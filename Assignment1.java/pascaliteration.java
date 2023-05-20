import java.util.Scanner;
public class pascaliteration {

	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);   
         int i, j, k, l, r;           
          int a[]=new int[30];     
         
         System.out.println("Enter the number of rows ");
         r=sc.nextInt();     
    
         
         for(i=0;i<r;i++)   
		 {
			for(k=r; k>i; k--)    
			{
				System.out.print(" ");
			}
            a[i] = 1;  
			for(j=0;j<=i;j++)    
			{
				 System.out.print(a[i]+ " ");    
                 a[i] = a[i] * (i - j) / (j + 1);  
			}
			System.out.println();   
		 }
        

	}

}
