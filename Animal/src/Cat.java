
public class Cat extends Animal implements Pet {
	
	public Cat() {
		super();
		name = "Cat";
		count++;
	}
	
	public Cat(String name) {
		this();
		try {
			setName(name);
		} catch (NameNotFoundException ex) {
			ex.printStackTrace();
		}
	}
	
	//Behavior
	public String drinkMilk() {
		return "Sip Sip! Drinking Milk";
	}
	
	public String makeSound() {
		return "Meow Meow";
	}
	
	public String beFriendly() {
		return name + " is now approaching you in a friendly manner!";
	}
	
	public String play(String object) {
		return name + " is playing with " + object;
	}

}
