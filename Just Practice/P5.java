public class P5 
{
    public static void main(String args[])
    {
        int nums[][]= new int[3][];
        nums[0]= new int[3];
        nums[1]= new int[4];
        nums[2]= new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums[i].length;j++)
            {
                nums[i][j]=(int)(Math.random()*10);
            }
        }


        System.out.println("Here is a jagged array for us : ");
        System.out.println();


        for(int x[] : nums)
        {
            for(int a : x)
            {
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
    
}
