package mealprep;

import java.time.LocalDateTime;
import java.util.ArrayList;
import mealprep.Food;

class Meal{

  private final ArrayList<Food> mFoods = new ArrayList<>(); //ArrayList of Foods in the Food Class
  private final String mName;
  //private final DateTime mDateTime;

  Meal (String name) {
    this.mName = name;
    //this.mDateTime = LocalDateTime.now();
  }

  void addFood (Food food) {
    this.mFoods.add(food);
  }

  String getName () {
    return this.mName;
  }

  double getCalories (){
    double calories = 0;

    for(Food food : this.mFoods) {
      calories += food.getCalories(); //Uses the method from Food class getCalories()
    }

    return calories;
  }

  double getFat (){
    double fat = 0;

    for(Food food : this.mFoods) {
      fat += food.getFat(); //Uses the method from Food class
    }

    return fat;
  }

  double getCarbohydrates (){
    double carbohydrates = 0;

    for(Food food : this.mFoods) {
      carbohydrates += food.getCarbohydrates(); //Uses the method from Food class
    }

    return carbohydrates;
  }

  double getProtein (){
    double protein = 0;

    for(Food food : this.mFoods) {
      protein += food.getProtein(); //Uses the method from Food class
    }

    return protein;
  }

  /* DateTime getMealTime() {
    return System.out.printf("Date & Time: %s %n", this.mDateTime);
  } */

  void viewFoods(){
    if(this.mFoods.size() > 0) {
      for (Food food : this.mFoods){
        System.out.println(food.getName());
      }  
    } else {
      System.out.println("No food details in meal");
    }
  }

  boolean isComplete() {
    boolean fruit = false;
    boolean vegetables = false;
    boolean protein = false;
    boolean fat = false;

    for (Food food : this.mFoods) {
      switch (food.getCategory()) { //Uses the method from Food class
        case Fruit:
          fruit = true;
          break;
        case Vegetable:
          vegetables = true;
          break;  
        case Protein:
          protein = true;
          break;
        case Fat:
          fat = true;
          break;
      }
    }

    return fruit && vegetables && protein && fat;
  }
}