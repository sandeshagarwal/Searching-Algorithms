import java.util.*;
public class Main{
    static int search(int arr[],int n,int x,int l,int r)
    {        
        while(l<=r)
        {                       // we can also write mid as mid = l + (r - l) / 2 and this more better
            int mid = (l+r)/2; // This should be updated in the while loop otherwise the loop will not work it will go into infinite loop
            if(arr[mid] == x)
                return mid;
            else if(arr[mid]<x){
                l = mid +1;
                //System.out.println("hi");}
            else
                r = mid -1;
        }
        return -1;
    }
    public static void main (String[] args) {
        int arr[] ={1,2,3,4,5};
        int n = arr.length;
        int x = 5;
        int l = 0;
        int r = n-1;
        int res = search(arr,n,x,l,r);
        System.out.println("The element "+x+" is found at position "+res);
    }
}
