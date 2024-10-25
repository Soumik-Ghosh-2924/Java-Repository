package ADVANCE_JAVA;

enum Status
{
    Running, Failed, Pending, Success;  //All these are objects of class Status.
}



public class P7  
{
    public static void main(String[] args) 
    {
        
        Status s1 = Status.Running;
        Status s2 = Status.Success;
        System.out.println(s1 + " " + s2);


        System.out.println(s2.ordinal());

        for(Status s : Status.values()) //values() method returns an array
        {
            System.out.println(s);
        }
    }

    
}
