package Hyewon;

public class Human implements Valuable {
	
	private final String name;
	private int age;
	
	public Human(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public double EstimateValue(int month){
		return Double.POSITIVE_INFINITY ;
	}
	
	public double EstimateValue(){
		return Double.POSITIVE_INFINITY ;
	}
	
	@Override
	public String toString(){
		return String.format("Human name : %s \n registered age : %d ", name, age);
	}
}
