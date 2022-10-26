package Exercise06;

public class Plane {
	private String manufacture;
	private String model;
	private int maxNumberOfPassengers;
	private static int numberOfPlanes;

	public Plane(){
		numberOfPlanes++;
//		this.manufacture = null;
//		this.model = null;
//		this.maxNumberOfPassengers = 0;
//		this(null,null,0);
	}
	public Plane(String manufacture, String model, int maxNumberOfPassengers) {
		this.manufacture = manufacture;
		this.model = model;
		this.maxNumberOfPassengers = maxNumberOfPassengers;
		numberOfPlanes++;
	}

	public String getManufacture() {
		return manufacture;
	}
	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getMaxNumberOfPassengers() {
		return maxNumberOfPassengers;
	}
	public void setMaxNumberOfPassengers(int maxNumberOfPassengers) {
		if(maxNumberOfPassengers>0) {
			this.maxNumberOfPassengers = maxNumberOfPassengers;
		}
	}
	static int getNumberOfPlanes() {
		return numberOfPlanes;
	}
	public String toString() {
		return String.format("%d", numberOfPlanes);
	}
}
