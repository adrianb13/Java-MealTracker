package mtracker;

import java.util.ArrayList;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Food {

  private String mName;
  private double mCalories;
  private double mFat;
  private double mCarbohydrates;
  private double mProtein;
  private Category mCategory;
  private ArrayList<Category> mCategories = new ArrayList<>();

  Food(String name, double fat, double carbs, double protein, Category category){
    this.mName = name;
    this.mCalories = calcCalories(carbs, fat, protein);
    this.mFat = fat;
    this.mCarbohydrates = carbs;
    this.mProtein = protein;
    this.mCategory = category;
  }

  String getName(){
    return this.mName;
  }
  double calcCalories(double fat, double carbs, double protein){
    double total = (9 * fat) + (4 * carbs) + (4 * protein);
    if(total > 0){
      return round(total, 1);
    } else {
      return 0;
    }
  }
  double getCalories(){
    return this.mCalories;
  }
  double getFat(){
    return this.mFat;
  }
  double getCarbohydrates(){
    return this.mCarbohydrates;
  }
  double getProtein(){
    return this.mProtein;
  }
  Category getCategory(){
    return this.mCategory;
  }

  void addCategory(Category category) {
    this.mCategories.add(category);
  }

  public static double round(double n, int decimalPlaces) {
    if(n > 0){
      BigDecimal instance = new BigDecimal(Double.toString(n)); //User STRING CONSTRUCTOR
      instance = instance.setScale(decimalPlaces, RoundingMode.HALF_UP);
      return instance.doubleValue(); //Make sure to return DOUBLE VALUE
    } else {
      throw new IllegalArgumentException();
    }
  }
}