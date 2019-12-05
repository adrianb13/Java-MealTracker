package mtracker;

import java.util.Scanner;

import mtracker.Category;

import java.util.Date;
import java.time.LocalDate;
import java.text.SimpleDateFormat;

public class Main {
  
  private static Scanner input = new Scanner(System.in);
  private static User user;
  private static Meal meal;
  private static Food food;
  private static Category category;
  
  //Reusable confirmation string to save user prompt answer.
  private static String confirm(String message) {
    String confirmation = "";

    System.out.print(String.format("%s (Y/N) ", message));
    if (input.hasNext()) {
      confirmation = input.next();
    }
    return confirmation;
  }

  //Creates user info
  private static User createUser(){
    String firstName = "";
    String lastName = "";
    String email = "";
    String age = "";
    double target = 0;

    while(true) {
      System.out.print("\nPlease enter your first name: ");
      if (input.hasNextLine()){
        firstName = input.nextLine();
      }

      System.out.print("Please enter your last name: ");
      if (input.hasNextLine()){
        lastName = input.nextLine();
      }

      System.out.print("Please enter your email: ");
      if (input.hasNextLine()){
        email = input.nextLine();
      }

      System.out.print("Please enter your age: ");
      if (input.hasNextLine()){
        age = input.nextLine();
      }

      System.out.print("Please enter your target complete meal percentage goal: ");
      if (input.hasNextLine()){
        target = Double.parseDouble(input.nextLine());
      }

      System.out.printf("\nFirst Name: %s\n", firstName);
      System.out.printf("Last Name: %s\n", lastName);
      System.out.printf("Email: %s\n", email);
      System.out.printf("Age: %s\n", age);
      System.out.printf("Goal: %s%%\n", target);
      System.out.println();

      String confirmation = confirm("Is this correct? ");
      input.nextLine();

      if(!confirmation.equalsIgnoreCase("Y")){
        System.out.println("Try reentering your information.");
        continue;
      } else {
        user = new User(firstName, lastName, email, age, target);
        break;
      }
    }
    
    return user;
  }

  private static Meal nameMeal() {
    String mealName = "";

    Date date = new Date();  
    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
    String strDate = formatter.format(date);  

    while(true){
      System.out.print("What is the name of this meal? ");
        if (input.hasNextLine()){
          mealName = input.nextLine();
        }

      System.out.printf("\nMeal: %s\n", mealName);
      System.out.printf("Today's date: %s\n", strDate);
      System.out.println();

      String confirmation = confirm("Is this correct? ");
      input.nextLine();

      if(!confirmation.equalsIgnoreCase("Y")){
        System.out.println("Please rename your meal.");
        System.out.println();
        continue;
      } else {
        
        mealName = mealName + " " + strDate;
        
        meal = new Meal(mealName);
        break;
      }
    }
    
    return meal;
  }

  private static Category findCategory(String userCat){
    Category userCategory;
    
    switch(userCat.toUpperCase()){
      case "FRUIT":
        userCategory = Category.Fruit;
        break;
      case "VEGETABLE":
        userCategory = Category.Vegetable;
        break;
      case "PROTEIN":
        userCategory = Category.Protein;
        break;
      default:
        userCategory = Category.Other;
    }
    System.out.println(userCategory);
    return userCategory;
  }

  private static Food createFood(){
    //String name, double fat, double carbs, double protein, Category category
    String name = "";
    double fat = 0;
    double carbs = 0;
    double protein = 0;
    String userCat = "";

    while(true) {
      System.out.print("\nPlease enter the food name: ");
      if (input.hasNextLine()){
        name = input.nextLine();
      }

      System.out.print("Please enter the fat amount in grams (Ex: 25.5): ");
      if (input.hasNextLine()){
        fat = Double.parseDouble(input.nextLine());
      }

      System.out.print("Please enter the carbs amount in grams: ");
      if (input.hasNextLine()){
        carbs = Double.parseDouble(input.nextLine());
      }

      System.out.print("Please enter the protein amount in grams: ");
      if (input.hasNextLine()){
        protein = Double.parseDouble(input.nextLine());
      }

      System.out.print("Please choose a category - FRUIT, VEGETABLE, PROTEIN, OTHER: ");
      if (input.hasNextLine()){
        userCat = input.nextLine();
        category = findCategory(userCat);
      }

      System.out.printf("\nName: %s\n", name);
      System.out.printf("Fat: %sg\n", fat);
      System.out.printf("Carbs: %sg\n", carbs);
      System.out.printf("Protein: %sg\n", protein);
      System.out.printf("Category: %s\n", category);
      System.out.println();

      String confirmation = confirm("Is this correct? ");
      input.nextLine();

      //Info not correct
      if(!confirmation.equalsIgnoreCase("Y")){
        System.out.println("Try reentering your information.");
        continue;
      //Info is corrent
      } else {
        food = new Food(name, fat, carbs, protein, category);
        meal.addFood(food);
        
        //Another item to add to meal?
        System.out.println();
        confirmation = confirm("Do you have another food item to enter for this meal? ");
        input.nextLine();

        //Yes add another, go back through loop
        if(confirmation.equalsIgnoreCase("Y")){
          continue;
        //No, break loop, meal is done
        } else {
          System.out.println();
          System.out.println("--------------------------------------------------");
          meal.viewFoods();
          meal.viewMeal();
          break;
        } 
      }
    }
    return food;    
  }

  public static void main(String[] args) {
    
    //Create User Profile
    createUser();
    System.out.printf("\n%s, your info has been added.\n\n", user.getFirstName());
    
    //Creates Tracker for User
    MealTracker meals = new MealTracker(user);

    //Name Meal to add to personal tracker
    nameMeal();
    System.out.println();
    System.out.printf("%s, your Meal has been named: %s.\n", user.getFirstName(), meal.getName());

    //Create Food Item(s) for a meal
    createFood();

    //Adds Meal to tracker
    meals.addMeal(meal);
    System.out.println();
    
    //Shows User's List of Meals
    System.out.printf("%s's ", user.getFirstName());
    meals.viewMeals();

    //Shows User's Adherence to their goal
    System.out.println("**************************************************");
    System.out.printf("This is your 'complete meal' percentage: %s%% \n", meals.getAdherence());
    if(meals.isOnTrack()){
      System.out.println("You are ON TRACK with your goal. :)");
    } else {
      System.out.println("You are NOT ON TRACK with your goal. :(");
    }
    System.out.println("**************************************************");
  }
}