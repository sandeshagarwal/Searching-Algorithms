public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		int arr[] = {1,10,10,10,20,20,40};
		int x = 10; //number to be find
		int length = arr.length;
		int low = 0;
		int high = length-1;
		int result = BinarySearch(arr,x,low,high);
		System.out.println("the position of "+x+" is "+result);
		
	}
	static int BinarySearch(int arr[],int x,int low,int high)
	{
	    
	    while (low <= high)
	    {
	        int mid =(low+(high))/2;
	       if(arr[mid] == x)
	        {
	            if(mid == 0 || arr[mid] != arr[mid-1])
	            {
	                return mid;
	            }
	            else
	                high = mid - 1;
	        }
	        if(arr[mid] < x)
	        {
	            low= mid+1;
	        }
	        else if(arr[mid] > x)
	        {
	            high = mid - 1;
	        }
	       // else{ // arr[mid] == x
	            
	       // }
	    }
	    return -1;
	}
}
