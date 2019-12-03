package mtracker;

import java.util.ArrayList;

public class Meal {
  private String mName;
  private ArrayList<Food> mFoods = new ArrayList<>();

  Meal(String name){
    this.mName = name;
  }

  String getName(){
    return this.mName;
  }

  double getCalories(){
    double calories = 0;

    for(Food food : this.mFoods){
      calories += food.getCalories();
    }
    return calories;
  }

  double getFat(){
    double fat = 0;

    for(Food food : this.mFoods){
      fat += food.getFat();
    }
    return fat;
  }

  double getCarbohydrates(){
    double carbs = 0;

    for(Food food : this.mFoods){
      carbs += food.getCarbohydrates();
    }
    return carbs;
  }

  double getProtein(){
    double protein = 0;

    for(Food food : this.mFoods){
      protein += food.getProtein();
    }
    return protein;
  }

  void viewFoods(){
    for(Food food : this.mFoods){
      System.out.println(food.getName());
    }
  }

  void addFood(Food food){
    this.mFoods.add(food);

    System.out.println(String.format("%s is added to %s", food.getName(), this.mName));
  }
}