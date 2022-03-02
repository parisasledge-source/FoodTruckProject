package com.skilldistillery.foodtruck;

public class FoodTruck {

	  private static int numericId = 1;
	  private int truckID;
	  private String foodTruckName;
	  private String foodType;
	  private double truckRating;
	  private double average;
	
	  public FoodTruck() {
	  }
	  
	  //Create fields for a unique numeric id, a food truck name , food type, and a numeric rating.
	  public FoodTruck(String foodTruckName, String foodType, double truckRating) {
	    this.foodTruckName = foodTruckName;
	    this.foodType = foodType;
	    this.truckRating = truckRating;
	    numericId = numericId++;
	    this.truckID = numericId;
	  }
	  
	  //All getters and setters
	  public int getTruckID() {
		return truckID;
	}

	public void setTruckID(int truckID) {
		this.truckID = truckID;
	}

	public String getFoodTruckName() {
		return foodTruckName;
	}

	public void setFoodTruckName(String foodTruckName) {
		this.foodTruckName = foodTruckName;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public double getTruckRating() {
		return truckRating;
	}

	public void setTruckRating(int truckRating) {
		this.truckRating = truckRating;
	}

	public String toString() {
		 String output = "Truck ID: " + numericId + ", Food Truck Name: " + foodTruckName 
				 + ", Food Type: " + foodType + ", Truck Rating: " + truckRating;
	    return output;
	  }
	//average rating of food trucks
	public FoodTruck(double average) {
		this.average = average;
	}

}
