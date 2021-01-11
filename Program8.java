public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
	int x = 99;
	int res = SqRoot(x);
	System.out.println("The SqRoot of "+x+" is "+res);
	}
	static int SqRoot(int x)
	{
	    int low = 0;
	    int high = x;
	    int res = 0;
	    while(low <= high)
	    {
	        int mid = (low+(high - low)/2);
	        int mSqr = mid*mid;
	    if(mSqr > x)
	    {
	        high = mid - 1;
	    }
	    else{
	        low = mid+1;
	        res = mid;
	    }
	    }
	    return res;
	}
}
