public class CarRentalApp {
	
	private String carGroup;
	private double ratePerDay;
	private int rentalDays;
	
	public CarRentalApp(String carGroup, double ratePerDay, int rentalDays) {
		
		this.carGroup = carGroup;
		this.ratePerDay = ratePerDay;
		this.rentalDays = rentalDays;
	}
	
	public String getCarGroup() {
		
		return carGroup;
	} 
	public double getRatePerDay () {
		
		return ratePerDay;
	} 
	public int getRentalDays() {
		
		return rentalDays;
	} 
	public double calculateRentalCost() {
		
		double rentalCost;
		double vat;
		
		rentalCost = ratePerDay * rentalDays;
		vat = rentalCost * 0.15;
		
		return rentalCost + vat;
	}
}