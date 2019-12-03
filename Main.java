package mealprep;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
  
  private static final Scanner scanner = new Scanner(System.in);

  private static ArrayList<User> mUsers = new ArrayList<>();
  private static Meal meal = new Meal();
  private static MealTracker meals = new MealTracker();
  private static Food food = new Food();

  private static String confirm(String message) {
    String confirmation = "";

    System.out.print(String.format("%s (Y/N) ", message));

    if (scanner.hasNext()) {
      confirmation = scanner.next();
    }

    return confirmation;
  }

  private static void getNext(HashMap<String, String> user, String key) {
    System.out.print(String.format("Please enter your %s", key));

    if (scanner.hasNextLine()) {
      user.put(key, scanner.nextLine());
    }
  }

  private static User createUser () {
    HashMap<String, String> proxy = new HashMap<>();
    String[] keys = {"first name", "last name", "email", "age", "adherence goal"};

    for (String key : keys) {
      getNext(proxy, key);
    }

    HashMap<String, Double> target = new HashMap<>();
    String[] keys2 = {"adherence goal"};

    for (String key2 : keys2) {
      getNext(target, key2);
    }

    return new User(proxy, target);
  }

  private static Food promptFood() {

    System.out.print("Please enter the food name.");
    if (scanner.hasNextLine()) {
      String name = scanner.nextLine();
    }
    System.out.print("Please enter the calories amount.");
    if (scanner.hasNextLine()) {
      double calories = Double.parseDouble(scanner.nextLine());
    }
    System.out.print("Please enter the fat amount.");
    if (scanner.hasNextLine()) {
      double fat = Double.parseDouble(scanner.nextLine());
    }
    System.out.print("Please enter the carbs amount.");
    if (scanner.hasNextLine()) {
      double carbohydrates = Double.parseDouble(scanner.nextLine());
    }
    System.out.print("Please enter the protein amount.");
    if (scanner.hasNextLine()) {
      double protein = Double.parseDouble(scanner.nextLine());
    }
    System.out.print("Please enter a category: Fruit, Vegetable, Protein, Fat, Beverage, Other.");
    if (scanner.hasNextLine()) {
      String cat = scanner.nextLine();
      String categoryName = "Other";
      
      switch(cat.toUpperCase()){
        case "FRUIT":
          categoryName = "Fruit";
          break;
        case "VEGETABLE":
          categoryName = "Vegetable";
          break;
        case "PROTEIN": 
          categoryName = "Protein";
          break;
        case "FAT": 
          categoryName = "Fat";
          break;
        case "BEVERAGE":
          categoryName = "Beverage";
          break;
        default: 
          categoryName = "Other";
      }
    }

    return Food(name, calories, fat, carbohydrates, protein, category);
  }

  public static void main (String[] args) {

    while(true) {
      String confirmation = confirm("Do you have an existing account?");

      if(!confirmation.equalsIgnoreCase("Y")) {
        
        User user = createUser();
        user.userDetails();
      
        confirmation = confirm("Is this correct?");

        if(!confirmation.equalsIgnoreCase("Y")){
          System.out.println("Try reentering your information.");
          continue;
        } else {
          mUsers.add(user);
          break;
        }
      } else {
        

        break;
      }
    }

    while(true){
      Food food = promptFood();
      food.viewFood();
      
      String confirmation = confirm("Is this correct?");

      if(!confirmation.equalsIgnoreCase("Y")){
        System.out.println("Try reentering your information.");
        continue;
      } else {
        meal.addFood(food);
        confirmation = confirm("Is there another food?");
        
        if(confirmation.equalsIgnoreCase("Y")){
          scanner.nextLine();
          continue;
        } else {
          meal.viewFoods();
          meals.addMeal(meal);
          System.out.println();
          System.out.println(String.format("Is this a complete meal: %s", meal.isComplete()));
          System.out.println();
          break;
        }
      }
    }
    
    System.out.println(String.format("Are you on target: %n", meals.getAdherence()));
  }
}