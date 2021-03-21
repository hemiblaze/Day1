public class ClientChat {
	public static void main(String[] args) {
		ChatMediator chatMediator = new ChatMediator();
		
		IUser pavi = new BasicUser(chatMediator, "Pavi");
		IUser thara = new PremiumUser(chatMediator, "Thara");
		
		chatMediator.addUser(pavi);
		chatMediator.addUser(thara);
		chatMediator.addUser(new BasicUser(chatMediator, "John"));
		chatMediator.addUser(new PremiumUser(chatMediator, "Xyz"));
		
		thara.SendMessage("Hello");
	}

}