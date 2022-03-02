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
				System.out.println("Please rate this truck (choose between 1 (for 1 star) to 5 (for 5 stars)): ");
				double truckRating = sc.nextInt();
				
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
		System.out.println("List of all existing food trucks: ");
		System.out.println("=================================");
		for (int i = 0; i < (currentNumberOfTrucks-1); i++) {
			
			String foodTruckData = foodTruckArray [i].toString();
			System.out.println(foodTruckData);	
		}
		
		//See the average rating of food trucks.
		System.out.println("\n");
		System.out.println("Your average rating of food trucks: ");
		System.out.println("===================================");
		double average = 0;
		int num = 0;
		for (int i = 0; i < (currentNumberOfTrucks-1); i++) {
			average += foodTruckArray [i].getTruckRating();
			num = num + 1;
		}
		double averageRatings = average / num;
		System.out.println(averageRatings);
		
		//Display the highest-rated food truck.
		System.out.println("\n");
		System.out.println("Your highest-rated food truck: ");
		System.out.println("==============================");
		double highestRated = foodTruckArray [0].getTruckRating();
		num = 0;
		for (int i = 0; i < (currentNumberOfTrucks-1); i++) {
			if ((foodTruckArray[i].getTruckRating()) > highestRated) {
				highestRated = foodTruckArray [i].getTruckRating();
				num = i;
			}
		}
		System.out.println(highestRated + " star rated " +  foodTruckArray [num].getFoodType() + " truck." );
		
		
		


//
//	    //Have the foodTruck display themselves
//	    foodTruck1.displayFoodTruck();
//	    foodTruck2.displayFoodTruck();
//

	  }


}
