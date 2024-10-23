class Computer 
{
    public void play_music()
    {
        System.out.println("Play some good music.");
    }

    public void run_games()
    {
        System.out.println("I can play games.");
    }

    public String getmeapen(int price)
    {
        if(price>40)
        {
            return "Here's your pen";
        }
        
        return "no pen for you";
    }

}



public class P2 
{
    public static void main(String args[])
    {
        Computer c= new Computer();
        c.play_music();
        String pen= c.getmeapen(100);
        System.out.println(pen);
    }
    
}
