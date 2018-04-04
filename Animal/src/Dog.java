
public class Dog extends Animal {
	
	public Dog() {
		super();
		name = "Dog";
		count++;
	}
	
	public Dog(String name) {
		this();
		try {
			setName(name);
		} catch (NameNotFoundException ex) {
			ex.printStackTrace();
		}
	}
	
	//Behavior
	public String chewBone() {
		return "Chewing Bone";
	}
	public String makeSound() {
		return "Ruff Ruff";
	}
	public String beFriendly() {
		return name + " is now approaching you in a friendly manner!";
	}
	
	public String play(String object) {
		return name + " is playing with " + object;
	}

}
