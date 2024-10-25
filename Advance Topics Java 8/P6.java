package ADVANCE_JAVA;

class Computer
{
    public void code()
    {

    }
}



class Desktop extends Computer
{
    public void code()
    {
        System.out.println("Code , Compile & Run : Faster.");
    }
}


class Laptop extends Computer
{
    public void code()
    {
        System.out.println("Code, Compile & Run .");
    }
}


class Developer
{
    public void DevApp(Computer C)
    {
        C.code();
    }
}

public class P6 
{
    public static void main(String args[])
    {
        Computer Desk = new Desktop();
        Computer Lap = new Laptop();
        Developer dev = new Developer();
        dev.DevApp(Desk);
        dev.DevApp(Lap);
    }
    
}
