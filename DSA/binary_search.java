package DSA;
class binary_search 
{
    static int binary_s(int arr[], int target)
    {
        int left=0;
        int right=arr.length-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[mid]>target)
            {
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }
        }

        return -1;
    }


    public static void main(String args[])
    {
        int arr[]={3,1,8,9,2,13,6};
        int key=8;

        int index=binary_s(arr, key);
        if(index!=-1)
        {
            System.out.println("The key is present at index : " + index);
        }
        else
        {
            System.out.println("The key is not present in the array.");
        }        
    }
    
}
