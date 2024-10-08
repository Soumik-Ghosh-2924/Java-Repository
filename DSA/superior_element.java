package DSA;
class superior_element
{
    static int find_superior(int arr[])
    {
        int ans=0;
        int superior=Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]>superior)
            {
                ans++;
                superior=arr[i];
            }
        }
        return ans;
    }

    public static void main(String args[])
    {
        int arr[]= {3,1,8,9,2,13,6};

        int result=find_superior(arr);

        System.out.println("There are " + result + " no of superior elements in the array.");

    }
}