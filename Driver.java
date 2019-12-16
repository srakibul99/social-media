/**
 * Final part 1
 * @author srakibul99
 * 4/1/19
 *
 */
public class Driver {
	public static void main(String[] args)
	{
		int v = 5;
		SocialNetwork graph = new SocialNetwork();
		System.out.println("Welcome to notfacebook.com!");
		System.out.println("Part 1 using Array list");
		System.out.println("------------------");
		ProfileManager network = new ProfileManager();
		Profile Harry = new Profile();
		Harry.setProfilePic("someurl");
		Harry.setName("Harry", "Potter");
		Harry.setStatus("Hello World");
		Profile Ron = new Profile();
		Ron.setProfilePic("someurl2");
		Ron.setName("Ronald", "Weasley");
		Ron.setStatus("Hello friends, I'm Ron");
		Profile Hermione = new Profile();
		Hermione.setProfilePic("someurl3");
		Hermione.setName("Hermione", "Granger");
		Hermione.setStatus("Feeling happy!");
		Profile Voldy = new Profile();
		Voldy.setProfilePic("someurl4");
		Voldy.setName("Tom", "Riddle");
		Voldy.setStatus("Angsty");
		network.addProfile(Harry);
		network.addProfile(Ron);
		network.addProfile(Hermione);
		network.addProfile(Voldy);
		System.out.println("Currently our users have no friends. \n");
		Harry.display();
		Ron.display();
		Hermione.display();
		Voldy.display();
		System.out.println("Harry, Ron, Hermione, and Tom add each other as friends: \n");
		network.createFriendship(Harry, Ron);
		network.createFriendship(Harry, Hermione);
		network.createFriendship(Hermione, Ron);
		network.createFriendship(Harry, Voldy);
		network.createFriendship(Voldy, Ron);
		network.createFriendship(Hermione, Voldy);
		Harry.display();
		Ron.display();
		Hermione.display();
		Voldy.display();
		System.out.println("Tom Riddle becomes evil and changes his name to Lord Voldemort"
				+ " and changes his profile picture to something evil. \n");
		Voldy.setName("Lord", "Voldemort");
		Voldy.setProfilePic("evil url");
		System.out.println("Harry decides to search up his \"friend\" Tom and sees how he's changed: \n");
		network.searchUser(Voldy);
		System.out.println("Harry, Ron and Hermione unfriend Voldemort: \n");
		network.endFriendship(Harry, Voldy);
		network.endFriendship(Voldy, Ron);
		network.endFriendship(Hermione, Voldy);
		Voldy.display();
		System.out.println("Voldemort leaves notfacebook.com. "
				+ "\nWhen Harry tries to search for Voldemort again, he sees:");
		network.removeProfile(Voldy);
		network.searchUser(Voldy);
		
		graph.addEdge(Harry, Voldy);
		graph.printfriends(Harry);
	}
}
