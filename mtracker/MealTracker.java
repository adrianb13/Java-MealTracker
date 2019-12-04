package mtracker;

import java.util.ArrayList;

public class MealTracker {

  private ArrayList<Meal> mMeals = new ArrayList<>();
  private User mUser;

  MealTracker(User user){
    this.mUser = user;
  }

  void addMeal(Meal meal){
    this.mMeals.add(meal);

    System.out.print(String.format("%s was added to your tracker.", meal.getName()));
    System.out.println();
  }

  void viewMeals(){
    System.out.println("List of meals:");
    for (Meal meal : this.mMeals) {
      System.out.println(meal.getName());
    }
  }
}