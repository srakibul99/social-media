/*
 * Written by srakibul99
 */

public class ProfileManager {
	private final AList<Profile> allProfiles;
	
	public ProfileManager()
	{
		allProfiles = new AList<>();
	}
	
	public void addProfile(Profile user)
	{
		allProfiles.add(user);
	}
	
	public void removeProfile(Profile user)
	{
		if (allProfiles.contains(user))
		{
			for(int i = 0; i < allProfiles.getLength(); i++)
			{
				if(allProfiles.getEntry(i+1).toString().equals(user.toString()))
					allProfiles.remove(i+1);
			} // end for
		} // end if
	}
	
	public void searchUser(Profile user)
	{
		String output = "";
		for(int i = 0; i < allProfiles.getLength(); i++)
		{
			if(allProfiles.getEntry(i+1).toString().equals(user.toString()))
			{
				output = "";
				user.display();
			}
			else
				output = "No such user";
		}
		System.out.println(output);
	}
	
	public void createFriendship(Profile a, Profile b)
	{
		a.addFriend(b);
		b.addFriend(a);
	}
	
	public void endFriendship(Profile a, Profile b)
	{
		a.removeFriend(b);
		b.removeFriend(a);
	}
}
