package DSA;

class merge_sort
{
    static void conquer(int []arr, int left, int right, int mid)
    {
        int merged[]= new int[right-left+1];
        int x=0;
        int idx1=left;
        int idx2=mid+1;

        while(idx1<=mid && idx2<=right)
        {
            if(arr[idx1]<arr[idx2])
            {
                merged[x++]=arr[idx1++];
            }
            else
            {
                merged[x++]=arr[idx2++];
            }
        }

        while(idx1<=mid)
        {
            merged[x++]=arr[idx1++];
        }

        while(idx2<=right)
        {
            merged[x++]=arr[idx2++];
        }

        for(int i=0, j=left; i<merged.length;i++, j++)
        {
            arr[j]=merged[i];
        }

    }

    static void divide(int arr[], int left, int right)
    {
        if(left>=right)
        {
            return;
        }

        int mid= left+(right-left)/2;
        divide(arr, left, mid);
        divide(arr, mid+1, right);
        conquer(arr, left, right, mid);
    }
    public static void main(String args[])
    {
        int arr[]= {3,1,8,9,2,13,6,75,80};
        divide(arr, 0, arr.length-1);
        System.out.println("The array after merge sort is  : ");
        for(int x: arr)
        {
            System.out.print(x+" ");
        }

    }
}


// public static void divide(int arr[], int left, int right)
// {
//     if(left>=right)
//     {
//         return;
//     }

//     int mid=left+(right-left)/2;
//     divide(arr, left, mid);
//     divide(arr, mid+1,right);
//     conquer(arr, left, right, mid);
// }

// public static void conquer(int arr[], int left, int right, int mid)
// {
//     int merged[]= new int[right-left+1];
//     int index=0;
//     int idx1=left;
//     int idx2=mid+1;

//     while(idx1<=mid && idx2<=right)
//     {
//         if(arr[idx1]<arr[idx2])
//         {
//             merged[index++]=arr[idx1++];
//         }
//         else{
//             merged[index++]=arr[idx2++];
//         }
//     }

//     while(idx1<=mid)
//     {
//         merged[index++]=arr[idx1++];
//     }

//     while(idx2<=right)
//     {
//         merged[index++]=arr[idx2++];
//     }

//     for(int i=0, j=left;i<arr.length;i++,j++)
//     {
//         arr[j]=merged[i];
//     }
// }
