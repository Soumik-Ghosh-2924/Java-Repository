package DSA;
public class linearSearch 
{
    static int linear_s(int arr[], int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                return i;       
            }
        }

        return -1;
    }

    public static void main(String args[])
    {
        int arr[]={3,1,8,9,2,13,6};

        int target= 10;

        int index=linear_s(arr, target);

        System.out.println("The element is found at index : "+index);
    }

    
}
