package ADVANCE_JAVA;


enum Status
{
    Running, Failed, Success, End;
}


public class P9
{
    public static void main(String[] args) {

        Status s = Status.Failed;

        switch (s) {
            case Running:
                System.out.println("hello");
                break;

            
            case Failed:
                System.out.println("hi");
                break;

            case Success:
                System.out.println("broke");
                break;
            

            case End:
                System.out.println("diminished");
                break;
            
            default:
                System.out.println("not an enum");
                break;
        }
    }
    
}

