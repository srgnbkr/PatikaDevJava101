package entities;

public class Ticket {
	private int distance;
	private int age;
	private int type;
	
	public Ticket(int distance, int age, int type) {
		super();
		this.distance = distance;
		this.age = age;
		this.type = type;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	};
	
	
	
	
	

}
