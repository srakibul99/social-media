/*
 * Written by srakibul99
 */

public class Name {
	
	private String first;
	private	String last;
	
	public Name()
	{
	}
	
	public Name(String firstName, String lastName)
	{
		first = firstName;
		last = lastName;
	}
	
	public void setName (String firstName, String lastName) //Method to set name or to change name

	{
	first = firstName;
	last = lastName;
	}
	
	public String getName()
	{
		String name;
		name = first + " " + last;
		return name;
	}
	
	public void setFirst(String firstName)
	{
		first = firstName;
	}
	
	public String getFirst()
	{
		return first;
	}
	
	public void setLast(String lastName)
	{
		last = lastName;
	}
	
	public String getLast()
	{
		return last;
	}
	
	@Override
	public String toString()
	{
		return first + " " + last;
	}
} // end Name
