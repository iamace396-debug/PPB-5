import java.util.Scanner;
public class TestCarRentalApp {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the group type (Hatch, Sedan, SUV, Van): ");
		String carGroup = input.next();
		
		System.out.print("Enter the rate per day: ");
		double ratePerDay = input.nextDouble();
		
		System.out.print("Enter duration for the rentals: ");
		int rentalDays = input.nextInt();
		
		CarRentalApp rental = new CarRentalApp(carGroup,ratePerDay,rentalDays);
		
		System.out.println("\nCar Model: " + rental.getCarGroup());
		System.out.println("Rate Per Day: R" + rental.getRatePerDay());
		System.out.println("Number of Days Rented: " + rental.getRentalDays());
		System.out.println("Total Rental Cost: R" + rental.calculateRentalCost());
	}
}