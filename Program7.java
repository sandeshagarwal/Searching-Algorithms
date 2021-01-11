public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		int arr[] = {0,0,1,1};
		int x = 1; //number to be find
		int length = arr.length;
		int low = 0;
		int high = length-1;
		//int loccur = LastOccur(arr,x,low,high);
		int foccur = FirstOccur(arr,x,low,high);
		if(foccur == -1){
		    System.out.println("the occurances of "+x+" are -1");
		}
		else{
		int result = length - foccur;
		System.out.println("the occurances of "+x+" are "+result);
		}
	}

	static int FirstOccur(int arr[],int x,int low,int high)
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
