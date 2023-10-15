package Array;

public class DuplicateElement 
{
public static void main(String[] args)
{
   int []a= {1,2,3,5,2,5,4,6,1,9};
   System.out.println("it is duplicate element :");

   for(int i=0; i<a.length; i++)
   {
	   for(int j=i; j<a.length; j++)
	   {
		   if( a[i]==a[j]&& i!=j)
{
	System.out.println(a[j]);
}
	   }
   }
}
}
