public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		int arr[] = {1,10,20,20,20,20,40};
		int x = 20; //number to be find
		int length = arr.length;
		int low = 0;
		int high = length-1;
		int result = BinarySearch(arr,x,low,high);
		System.out.println("the position of "+x+" is "+result);
		
	}
	static int BinarySearch(int arr[],int x,int low,int high)
	{
	    int mid =(low+(high))/2;
	    if(low > high)
	    {
	        return -1;
	    }
	   // if(arr[mid] == x){
	   //     return mid;
	   // }
	    else if(arr[mid] < x)
	    {
	        return BinarySearch(arr,x,mid+1,high);
	    }
	    else if(arr[mid] > x)
	    {
	        return BinarySearch(arr,x,low,mid-1);
	    }
	    else{ // arr[mid] == x
	        if(mid ==0 ||arr[mid] != arr[mid-1])
	            return mid;
	        else
	            return BinarySearch(arr,x,low,mid-1);
	    }
	}
}
