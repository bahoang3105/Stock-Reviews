package entity;
public class Stock {

	private String getName; 
	private double getercentChange; 
	
	public Stock(String name, double percentChange) {
		setName(name);
		setPercentChange(percentChange);
	}

	public String getName() {
		return getName;
	}

	public void setName(String name) {
		this.getName = name;
	}

	public double getPercentChange() {
		return getercentChange;
	}

	public void setPercentChange(double percentChange) {
		this.getercentChange = percentChange;
	}
	
	public Stock() {
		
	}
}
