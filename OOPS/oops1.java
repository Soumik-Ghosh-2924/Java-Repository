class pen
{
    String color;
    String type;

    public void write()
    {
        System.out.println("The function writes.");
    }

    public void printColor()
    {
        System.out.println(this.color);
    }

}

public class oops1 
{
    public static void main(String[] args) {
        pen p1 =new pen();
        pen p2 = new pen();
        p1.color="Red";
        p1.type="ball-point";
        p1.write();
        p2.color="white";

        System.out.println(p1.color +" is the colour of the pen and it is of "+p1.type+" type.");
        System.out.println(p2.color);
    }

    
}
