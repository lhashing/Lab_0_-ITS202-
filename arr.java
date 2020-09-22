import java.util.Arrays;
public class arr
{
	public static void main(String args[])
	{
		int[] arr; 
      	arr = new int[3]; 
      	arr[0] = 1;
      	arr[1] = 2;
      	arr[2] = 3;

      	int[] a; 
      	a=Arrays.copyOf(arr, arr.length+1);
      	a[3]=4;
      

      	for (int i = 0; i < a.length; i++) 
        	System.out.println(a[i]);  
	}
}