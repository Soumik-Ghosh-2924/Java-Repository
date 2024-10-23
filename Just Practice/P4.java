public class P4 
{
    public static void main(String args[])
    {
        int darray[][]= new int [3][4];

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                darray[i][j]=(int)(Math.random()*100);
            }
        }

        System.out.println("The elements of the array are : ");

        // for(int i=0;i<3;i++)
        // {
        //     for(int j=0;j<4;j++)
        //     {
        //         System.out.print(darray[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        //advanced way of writing the for loop
        for(int x[] : darray)
        {
            for(int m : x)
            {
                System.out.print(m+" ");
            }
            System.out.println();
        }
    }
    
}
