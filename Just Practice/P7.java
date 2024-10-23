public class P7 
{
    public static void main(String args[])
    {
        StringBuffer sb = new StringBuffer("Soumik");
        System.out.println(sb.capacity());

        sb.append(" Ghosh");

          

        System.out.println(sb);

        // sb.insert(0, "Hi! ");

        sb.insert( 6, " the great ");
        System.out.println(sb);

        String s = sb.toString();
        System.out.println(s);
    }
    
}
