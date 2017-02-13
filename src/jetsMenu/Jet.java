package jetsMenu;

public class Jet {
	protected String make;
	protected String model;
	protected int price;
	protected int speed;
	protected int range;
	
	public Jet(String make, String model, int price, int speed, int range) {
		this.make = make;
		this.model = model;
		this.price = price;
		this.speed = speed;
		this.range = range;
}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("JetsMenu [make=");
		builder.append(make);
		builder.append(", model=");
		builder.append(model);
		builder.append(", price=");
		builder.append(price);
		builder.append(", speed=");
		builder.append(speed);
		builder.append(", range=");
		builder.append(range);
		builder.append("]");
		return builder.toString();
	}

	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	
	public String display (){
		return " ";
	}
	
}
