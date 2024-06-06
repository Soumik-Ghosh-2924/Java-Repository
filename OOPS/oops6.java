package OOPS;

class Account
{
	public String Name;
	String password;
	public String getPassword()
	{
		return this.password;
	}
	
	public void setPassword(String Pass)
	{
		this.password=Pass;
	}
}

public class oops6 
{
	public static void main(String args[])
	{
		Account a1= new Account();
		a1.setPassword("adgj");
		System.out.println(a1.getPassword());
	}

}
