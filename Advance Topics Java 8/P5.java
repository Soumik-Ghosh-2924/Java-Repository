package ADVANCE_JAVA;

interface a1{
    void show();
    void config();
}



class any implements a1
{
    public void show()
    {
        System.out.println("displaying show implementation");
    }

    public void config()
    {
        System.out.println("displaying config implementation");
    }

}

public class P5 {
    public static void main(String args[])
    {
        System.out.println();
        System.out.println();

        a1 X;
        X = new any();
        X.config();
        System.out.println();
        System.out.println();
        X.show();
    }
    
}
