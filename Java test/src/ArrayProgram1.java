
import java.util.*;

public class ArrayProgram1 {

    public static void main(String[] args) {
    	System.out.println("Enter the count of array");
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	
    	int[] a=new int[n];
    	
       for(int i=0;i<n;i++)
       {
    	   
    	   a[i]=sc.nextInt();
    	  
       }
       
       System.out.println("Entered array values are-");
       for(int i=0;i<n;i++)
       {
    	   System.out.println(a[i]);    	  
       }
      
       int sum=0;
       System.out.println("Sum of all the array values are- ");
       for(int i=0;i<n;i++)
       {
    	   
    	   sum=sum+a[i];
    	  
       }
       System.out.print(sum);
    	
       int max=a[0];
       
       for(int i=0;i<n;i++)
       {
    	     if(a[i]>max)
    	     {
    	    	 max=a[i];
    	     }
       }
       System.out.println("Max array value is "+max);
       
       int min=a[0];
       for(int i=0;i<n;i++)
       {
    	     if(a[i]<min)
    	     {
    	    	 min=a[i];
    	     }
       }
       System.out.println("Min array value is "+min);
       
       System.out.println("Sorted Array : ");
       int temp=0;
       for(int i=0;i<n;i++)
       {
    	   for(int j=i+1;j<n;j++)
    	   {
    		   if(a[i]>a[j])
    		   {
    			   temp=a[i];
    			   a[i]=a[j];
    			   a[j]=temp;
    					   
    		   }
    	   }
    	   System.out.println(a[i]);
    	   
       }
       
      
       System.out.println("Duplicate array values are -");
       for(int i=0;i<n;i++)
       {
    	   for(int j=i+1;j<n;j++)
    	   {
    		   if (a[i] == a[j])
    		   {
    	         System.out.print(a[i]);
    		   }
    	   }
       }
       
       
       
       
    }
    
}