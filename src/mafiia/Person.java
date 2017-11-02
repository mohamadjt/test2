package mafiia;
import java.util.Random;

public class Person {
	private String name;
	private int ID =1;
	private boolean state=true;
	
	public Person(String name, int iD, boolean state) {
		super();
		this.name = name;
		ID = iD;
		this.state = state;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public boolean getState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}
	
	public int select() {
		
		Random rand = new Random();
		int i = rand.nextInt(9);
		
		return i;
		
	}
	
}
