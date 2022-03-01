package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		//Create an array to store up to 5 FoodTruck objects.
		FoodTruck foodTruckArray [ ] = new FoodTruck [5];
		
		for (int i = 0; i < foodTruckArray.length; i++) {
			
			
			//Prompt the user to input the food name.
			System.out.println("Please enter the food name: ");
			String foodName = sc.next();
				
			//Prompt the user to input the food type.
			System.out.println("Please enter the food type: ");
			String foodType = sc.next();
				
			//Prompt the user to input the rating for gdfood trucks.
			System.out.println("Please rate this truck (choose between number 1 to number 5 - for one star to five star): ");
			int truckRating = sc.nextInt();
			
			//Set the FoodTruck object's fields to the user's input, and add them to the array.
			foodTruckArray [i] = new FoodTruck(foodName, foodType, truckRating);
			
		}

//
//        //Create an array to store FoodTruck objects.
//		FoodTruck foodTruck1 = new FoodTruck(0, foodName, foodType, truckRating);
//
//		FoodTruck foodTruck2 = new FoodTruck();
//	    foodTruck2.setTruckID(1);
//	    foodTruck2.setFoodName("Tacos");
//	    foodTruck2.setFoodType("TacoRific");
//	    foodTruck2.setTruckRating(5);
//
//	    //Have the foodTruck display themselves
//	    foodTruck1.displayFoodTruck();
//	    foodTruck2.displayFoodTruck();
//
//	    String foodTruck1Data = foodTruck1.toString();
//	    String foodTruck2Data = foodTruck2.toString();

//	    //Get the foodTruck' data and display that
//	    System.out.println("Food Truck 1 data: " + foodTruck1Data);
//	    System.out.println("Food Truck 2 data: " + foodTruck2Data);
	  }


}
