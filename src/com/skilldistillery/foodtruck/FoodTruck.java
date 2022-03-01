package com.skilldistillery.foodtruck;

public class FoodTruck {

	  private int truckID;
	  private String foodName;
	  private String foodType;
	  private int truckRating;
	
	  public FoodTruck() {
	  }
	  
	  //Create fields for a unique numeric id, a food name , food type, and a numeric rating.
	  public FoodTruck(String foodName, String foodType, int truckRating) {
	    this.foodName = foodName;
	    this.foodType = foodType;
	    this.truckRating = truckRating;
	  }
	  

	  public int getTruckID() {
		return truckID;
	}

	public void setTruckID(int truckID) {
		this.truckID = truckID;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public int getTruckRating() {
		return truckRating;
	}

	public void setTruckRating(int truckRating) {
		this.truckRating = truckRating;
	}

	public String toString() {
		 String output = "Truck ID: " + truckID + ", Food Name: " + foodName + ", Food Type: " + foodType + ", Truck Rating: " + truckRating;
	    return output;
	  }

	  public void displayFoodTruck() {
	    String foodTruckData = this.toString();
	    System.out.println(foodTruckData);
	  }

}
