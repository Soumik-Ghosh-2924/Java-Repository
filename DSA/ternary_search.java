package DSA;
public class ternary_search 
{
    static int ternary_s(int arr[], int target, int left, int right)
    {
        while(left<=right)
        {
            int mid1=left+(right-left)/3;
            int mid2=right-(right-left)/3;

            if(arr[mid1]==target)
            {
                return mid1;
            }

            if(arr[mid2]==target)
            {
                return mid2;
            }

            if(arr[mid1]>target)
            {
                return ternary_s(arr, target, left,mid1-1);
            }
            else if(target>arr[mid2])
            {
                return ternary_s(arr, target, mid2+1, right);
            }
            else
            {
                return ternary_s(arr,target, mid1+1, mid2-1);
            }
        }

        return -1;
    }


    public static void main(String args[])
    {
        int arr[]={3,1,8,9,2,13,6};
        int target=8;
        int index = ternary_s(arr, target, 0, arr.length-1);

        System.out.println("index ->" +index);

    }
    
}
