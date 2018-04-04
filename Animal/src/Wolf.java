
public class Wolf extends Animal implements SavageTraits {
	
	public Wolf() {
		super();
		this.name = "Wolf";
		count++;
	}
	
	public Wolf(String name) {
		this();
		try {
			setName(name);
		} catch (NameNotFoundException ex) {
			ex.printStackTrace();
		}
	}
	//Behavior
	public String makeSound() {
		return "Howl Howl";
	}
	
	public String eatPrey() {
		return "Roar Yum Roar! Prey is fully eaten";
	}
	
	public String invadeLand() {
		return name + "invades land";
	}
}
