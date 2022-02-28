package com.skilldistillery.foodtruck;


public class FoodTruckApp {

	public static void main(String[] args) {
		
        //Create an array to store FoodTruck objects.
		FoodTruck foodTruck1 = new FoodTruck(0, "Falafel", "Mediterranean Medic", 3);

		FoodTruck foodTruck2 = new FoodTruck();
	    foodTruck2.setTruckID(1);
	    foodTruck2.setFoodName("Tacos");
	    foodTruck2.setFoodType("TacoRific");
	    foodTruck2.setTruckRating(5);

	    //Have the foodTruck display themselves
	    foodTruck1.displayFoodTruck();
	    foodTruck2.displayFoodTruck();

	    String foodTruck1Data = foodTruck1.toString();
	    String foodTruck2Data = foodTruck2.toString();

	    //Get the foodTruck' data and display that
	    System.out.println("Food Truck 1 data: " + foodTruck1Data);
	    System.out.println("Food Truck 2 data: " + foodTruck2Data);
	  }


}
