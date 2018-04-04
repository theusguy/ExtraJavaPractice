
public class Tiger extends Animal implements SavageTraits{
	
	public Tiger() {
		super();
		name = "Tiger";
		count++;
	}
	
	public Tiger(String name) {
		this();
		try {
			setName(name);
		} catch (NameNotFoundException ex) {
			ex.printStackTrace();
		}
	}
	
	//Behavior
	public String makeSound() {
		return "Roar Roar";
	}
	
	public String eatPrey() {
		return "Roar Yum Roar! Prey is fully eaten";
	}
	
	public String invadeLand() {
		return "invades land";
	}

}
