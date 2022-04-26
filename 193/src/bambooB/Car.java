package bambooB;

public class Car {
	
	public String carPlateNo;
	public double mileage;
	
	public Car(String carPlateNo, double mileage) {
		this.carPlateNo = carPlateNo;
		this.mileage = mileage;
	}

	public void printDetails(String name) {
		System.out.println(name+ carPlateNo + mileage);
	}
	
	public void printDetails() {
		
	}
}
