package mtracker;

import java.util.ArrayList;
import java.math.BigDecimal;
import java.math.RoundingMode;

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
    calories = Food.round(calories, 1);
    return calories;
  }

  double getFat(){
    double fat = 0;

    for(Food food : this.mFoods){
      fat += food.getFat();
    }
    fat = Food.round(fat, 1);
    return fat;
  }

  double getCarbohydrates(){
    double carbs = 0;

    for(Food food : this.mFoods){
      carbs += food.getCarbohydrates();
    }
    carbs = Food.round(carbs, 1);
    return carbs;
  }

  double getProtein(){
    double protein = 0;

    for(Food food : this.mFoods){
      protein += food.getProtein();
    }
    protein = Food.round(protein, 1);
    return protein;
  }

  void viewFoods(){
    System.out.println("List of food items:");
    for(Food food : this.mFoods){
      System.out.println(food.getName());
    }
  }

  void addFood(Food food){
    this.mFoods.add(food);

    System.out.println(String.format("%s is added to %s", food.getName(), this.mName));
  }

  boolean isComplete() {
    boolean fruit = false;
    boolean vegetables = false;
    boolean protein = false;
    boolean other = true;

    for (Food food : this.mFoods) {
      switch (food.getCategory()) {
        case Fruit:
          fruit = true;
          break;
        case Vegetable:
          vegetables = true;
          break;
        case Protein:
          protein = true;
          break;
        default: 
          other = true;
          break;
      }
    }
    
    return fruit && vegetables && protein && other;
  }
}