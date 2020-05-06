import java.util.*;
public class Main{
static int BinarySearch(int arr[],int n,int x,int l,int r){
if(l<=r)
{
  int mid = (l+r)/2;
  if(arr[mid] == x){
  return mid;
  }
  if(arr[mid] <= x){
  l = mid+1;
  return BinarySearch(arr,n,x,l,r);}
  
  r = mid-1;
  return BinarySearch(arr,n,x,l,r);
 }
 return -1;
}
public static void main(String args[]){
int arr[] = {1,2,3,4,5};
int n = arr.length;
int l = 0; //Starting point of search
int r = n-1; //ending point of the search
int x = 5; // element which needs to be searched
int res = BinarySearch(arr,n,x,l,r);
if(res == -1)
  System.out.println("The element is not found in the array");
else
  System.out.println("The element " +x+" is found at position "+res+" in the array");
  }
}
  
