package week1.day1;

public class Bike {

	public static void main(String[] args) {
				
		Car CarObj = new Car();
		CarObj.applyBreak();
		CarObj.soundHorn();
		
		Bike BikeObj= new Bike();
		BikeObj.applyBreak();
		BikeObj.soundHorn();
		
	}

public void applyBreak() {
		
		System.out.println("Bike Brake Applied");
	}
	
	public void soundHorn() {
        
		System.out.println("Bike Horn");
	}
}
