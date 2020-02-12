import java.util.*;
import java.util.concurrent.TimeUnit;
class lab2
{
	void bubbleSort(int arr[], int n) 
{ 
   int i, j,swap; 
   for (i = 0; i < n-1; i++)       
  {
      for (j = 0; j < n-i-1; j++)  
         {  if (arr[j] > arr[j+1]) 
             { swap=arr[j];
              arr[j]=arr[j+1];
              arr[j+1]=swap;
              }
          }
         }
         System.out.println("Array in sorted order:");
         for(i=0;i<n;i++)
         System.out.print(arr[i]+"  ");
         System.out.println();
             
} 
public static void main(String args[])throws InterruptedException
{
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of array");
	int l=sc.nextInt();
	int a[]=new int[l];
	System.out.println("Enter array elements");
	for(int i=0;i<l;i++)
	a[i]=sc.nextInt();
	lab2 ob=new lab2();
	long startTime = System.nanoTime();
	ob.bubbleSort(a,l);
	long endTime = System.nanoTime();
	long timeElapsed = endTime - startTime;
	
	System.out.println("Execution time in milliseconds : " + timeElapsed / 1000000);
	
}
}
