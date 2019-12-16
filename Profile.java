/*
 * Written by srakibul99
 */

public class Profile {
	
	private String profilePic;
	private Name userName;
	private String status;
	private AList<Profile> friends;
	
	public Profile()
	{
		profilePic = "";
		userName = new Name("", "");
		status = "";
		friends = new AList<>();
	}
	
	public String getProfilePic()
	{
		return profilePic;
	}
	
	public void setProfilePic(String newPic)
	{
		profilePic = newPic;
	}
	
	public Name getName()
	{
		return userName;
	}
	
	public void setName(String first, String last)
	{
		userName.setName(first, last);
	}
	
	public void getName(Name name)
	{
		userName.setName(name.getFirst(), name.getLast());
	}
	
	public void setStatus(String stat)
	{
		status = stat;
	}
	
	public String getStatus()
	{
		return status;
	}
	
	public AList<Profile> getFriends()
	{
		return friends;
	}
	
	public void addFriend(Profile friend)
	{
		friends.add(friend);
	}
	
	public void removeFriend(Profile friend)
	{
		if (friends.contains(friend))
		{
			for(int i = 0; i < friends.getLength(); i++)
			{
				friends.remove(i+1);	
				
			} // end for
		} // end if
	}
	
	public String allInfo()
	{
		String ans = "Name: " + userName.getFirst() + " " + userName.getLast() + "\n";
		ans = ans + "Status: " + status + "\n";
		ans = ans + "Picture: " + profilePic + "\n";
		ans = ans + "Number of friends: " + friends.getLength() + "\n";
		ans = ans + "Friends: \n";
		if(friends.getLength() == 0)
			ans = ans + "No friends";
		else
		{
			for(int i = 0; i < friends.getLength(); i++)
			{
				ans = ans + friends.getEntry(i+1).toString() + "\n";
			} // end for
		} // end else
		return ans;
	}
	
	public void display()
	{
		String result = allInfo();
		System.out.println(result + "\n------------------");
	}
	
	@Override
	public String toString()
	{
		return userName + " ";
	}

} // end Profile
