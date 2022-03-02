package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		
		int currentNumberOfTrucks = 0;
		Scanner sc = new Scanner(System.in);
		
		
		//Create an array to store up to 5 FoodTruck objects.
		FoodTruck foodTruckArray [ ] = new FoodTruck [5];
		
		for (int i = 0; i < foodTruckArray.length; i++) {
			
			currentNumberOfTrucks = i + 1;
			
			//Prompt the user to input the food name.
			System.out.println("Please enter the food name: ");
			String foodName = sc.next();
			
			if (foodName.equals("quit") || foodName.equals("Quit")) {
				break;
			}else {
				
				//Prompt the user to input the food type.
				System.out.println("Please enter the food type: ");
				String foodType = sc.next();
				
				//Prompt the user to input the rating for food trucks.
				System.out.println("Please rate this truck (choose between 1 to 5 - for 1 star to 5 star): ");
				int truckRating = sc.nextInt();
				
				if (truckRating > 5) {
					System.out.println("Please enter the correct numbr between 1 to 5: ");
					truckRating = sc.nextInt();
					
					sc.nextLine();
					//Set the FoodTruck object's fields to the user's input, and add them to the array.
					foodTruckArray [i] = new FoodTruck(foodName, foodType, truckRating);
				}else {
					
					sc.nextLine();
					//Set the FoodTruck object's fields to the user's input, and add them to the array.
					foodTruckArray [i] = new FoodTruck(foodName, foodType, truckRating);
				}
				
			}
				
			
			
		}
		//List of all existing food trucks.
		System.out.println("\n");
		System.out.println("List of all existing food trucks: \n");
		
		for (int i = 0; i < (currentNumberOfTrucks-1); i++) {
			
			String foodTruckData = foodTruckArray [i].toString();
			System.out.println(foodTruckData);
		
			
		}
		
		//System.out.println(currentNumberOfTrucks);


//
//	    //Have the foodTruck display themselves
//	    foodTruck1.displayFoodTruck();
//	    foodTruck2.displayFoodTruck();
//

	  }


}
