package ADVANCE_JAVA;


enum Status1
{
    Running, Failed, Success, End;
}


public class P8 
{
    public static void main(String[] args) {

        Status1 s = Status1.Failed;

        if(s == Status1.Failed)
        {
            System.out.println("All Ok");
        }
        else if (s== Status1.Running)
        {
            System.out.println("Fine .");
        }
        else if(s== Status1.Success)
        {
            System.out.println("okay");
        }
        else{
            System.out.println("living");
        }
    }
    
}
