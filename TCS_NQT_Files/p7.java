package TCS_NQT;
import java.util.*;
public class p7 
{

    static int sum(int arr[])
    {
        int sum=0;

        for(int x: arr)
        {
            sum+=x;
        }
        return sum;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("What's your array size ?");
        int size= sc.nextInt();
        int array[]= new int[size];
        

        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<size;i++)
        {
            array[i]=sc.nextInt();
        }

        int res= sum(array);

        System.out.println("The sum of the elements of java is : "+ res);
        sc.close();

    }
    
}



// class Treeenode 
// {
//     Treenode left;
//     treeNode right;
//     int data;

//     Treenode(int data)
//     {
//         this.data= data;
//         this.left=null;
//         this.right=null;
//     }
// }