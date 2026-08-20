package com.DSAPrograms;

public class CarArchitectureUsingConstroctor {


		String make;        // Toyota, Honda, etc.
	    String model;       // Camry, Civic, etc.
	    int year;           // Manufacturing year
	    String color;       // Car color
	    double price;       // Price
	    String fuelType;    // Petrol, Diesel, Electric
	    int mileage;        // Distance traveled
	    String transmission; // Manual or Automatic
	    String brand;
	    int horsepower;
	    double engineSize;
	    int numberOfDoors;
	    int seatingCapacity;
	    String registrationNumber;
	    String ownerName;
	    String insuranceProvider;
	    boolean isElectric;
	    double batteryCapacity;
	    double fuelTankCapacity;
	    double topSpeed;
	    double weight;
	    String countryOfOrigin;
		public CarArchitectureUsingConstroctor() {
			
			String make;        // Toyota, Honda, etc.
		    String model;       // Camry, Civic, etc.
		    int year;    
		    
		    
		}
		
		CarArchitectureUsingConstroctor(String make,        // Toyota, Honda, etc.
			    String model,     // Camry, Civic, etc.
			    int year,       // Manufacturing year
			    String color,     // Car color
			    double price  ,   // Price
			    String fuelType,    // Petrol, Diesel, Electric
			    int mileage   ){
			
			this.make=make;
			this.model=model;
			this.year=year;
			this.color=color;
			this.price=price;
			this.fuelType=fuelType;
			this.mileage=mileage;
			
		}
		CarArchitectureUsingConstroctor( String transmission, // Manual or Automatic
	    String brand,
	    int horsepower,
	    double engineSize,
	    int numberOfDoors,
	    int seatingCapacity){
			
			this.transmission=transmission;
			this.brand=brand;
			this.horsepower=horsepower;
			this.engineSize=engineSize;
			this.numberOfDoors=numberOfDoors;
			this.seatingCapacity=seatingCapacity;
			
		}
	void showSpecifications() {
		System.out.println("the product is build by :"+make);
		System.out.println("the product is model by :"+model);
		System.out.println("the product is year by :"+year);
		System.out.println("**************************************************************************************");

	}
	void showhalfSpecifications() {
		System.out.println("the car  is having by make :"+make);
		System.out.println("the car  is having by  model ::"+model);
		System.out.println("the car  is having by year ::"+year);
		System.out.println("the car  is having by color :"+color);
		System.out.println("the car  is having by price ::"+price);
		System.out.println("the car  is having by fuelType ::"+fuelType);
		System.out.println("the car  is having by mileage :"+mileage);
		System.out.println("**************************************************************************************");

	}
	void showMiddleSpecifications() {
		System.out.println("the car  is having by transmission ::"+transmission);
		System.out.println("the car  is having by brand ::"+brand);
		System.out.println("the car  is having by horsepower :"+horsepower);
		System.out.println("the car  is having by engineSize ::"+engineSize);
		System.out.println("the car  is having by numberOfDoors ::"+numberOfDoors);
		System.out.println("the car  is having by seatingCapacity :"+seatingCapacity);
		System.out.println("**************************************************************************************");

	}
	void showMiddleLastSpecifications() {
		System.out.println("the car  is having by registrationNumber ::"+registrationNumber);
		System.out.println("the car  is having by ownerName ::"+ownerName);
		System.out.println("the car  is having by insuranceProvider ::"+insuranceProvider);
		System.out.println("the car  is having by isElectric :"+isElectric);
		System.out.println("**************************************************************************************");
	}


	void showMiddleLastTwoSpecifications() {
		System.out.println("the car  is having by batteryCapacity ::"+batteryCapacity);
		System.out.println("the car  is having by fuelTankCapacity ::"+fuelTankCapacity);
		System.out.println("the car  is having by topSpeed :"+topSpeed);
		System.out.println("**************************************************************************************");
	}

	void showMiddleLastOneSpecifications() {
		System.out.println("the car  is having by weight ::"+weight);
		System.out.println("the car  is having by countryOfOrigin :"+countryOfOrigin);
		System.out.println("**************************************************************************************");
	}

	public CarArchitectureUsingConstroctor(String registrationNumber,
	    String ownerName,
	    String insuranceProvider,
	    boolean isElectric) {
		
		this.registrationNumber=registrationNumber;
		this.ownerName=ownerName;
		this.insuranceProvider=insuranceProvider;
		this.isElectric=isElectric;

	}

	public CarArchitectureUsingConstroctor(    double batteryCapacity,
	double fuelTankCapacity,
	double topSpeed) {
		this.batteryCapacity=batteryCapacity;
		this.fuelTankCapacity=fuelTankCapacity;
		this.topSpeed=topSpeed;

	}

	public CarArchitectureUsingConstroctor(   double weight,
	String countryOfOrigin) {
		this.weight=weight;
		this.countryOfOrigin=countryOfOrigin;
		
		
	}
		public static void main(String[] args) {
			CarArchitectureUsingConstroctor z=new CarArchitectureUsingConstroctor();
			z.showSpecifications();
			CarArchitectureUsingConstroctor z1=new CarArchitectureUsingConstroctor("Hyundai","eon",2024,"red",450000.0,"Diesel",17);
			z1.showSpecifications();
	z1.showhalfSpecifications();
	CarArchitectureUsingConstroctor z2=new CarArchitectureUsingConstroctor("good","Hyundai",220,198,5,6);
	z1.showhalfSpecifications();
	z2.showMiddleSpecifications();
	CarArchitectureUsingConstroctor z3=new CarArchitectureUsingConstroctor("Maldsniue123y43yz","sanjeev","Tcs+ion+",false);
	z3.showMiddleLastSpecifications();

	CarArchitectureUsingConstroctor z4=new CarArchitectureUsingConstroctor(22.56,22.3,89.0);
	z4.showMiddleLastSpecifications();
	CarArchitectureUsingConstroctor z5=new CarArchitectureUsingConstroctor(559,"Mod24");
	z5.showMiddleLastOneSpecifications();}}

			
			

			
		
		
		
		
		
		
		
		
		
		



















