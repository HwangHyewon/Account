package Hyewon;

public class Car implements Valuable {
	
	private final String name;
	private double price;
	
	public Car(String name, double price){
		this.name = name;
		this.price = price;
	}
	
	public double EstimateValue(int month){
		double value;
		value = price*(0.8);
		value = value *Math.pow (0.99, month);
		return value;
	}
	
	@Override
	public String toString(){
		return String.format("car name : %s \n initial price : %.2f ", name, price);
	}
}
