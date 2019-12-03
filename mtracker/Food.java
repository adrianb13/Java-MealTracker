package mtracker;

public class Food {

  private String mName;
  private double mCalories;
  private double mFat;
  private double mCarbohydrates;
  private double mProtein;
  //private Category category

  Food(String name, double calories, double fat, double carbs, double protein){
    this.mName = name;
    this.mCalories = calcCalories(carbs, fat, protein);
    this.mFat = fat;
    this.mCarbohydrates = carbs;
    this.mProtein = protein;
  }

  String getName(){
    return this.mName;
  }
  double calcCalories(double fat, double carbs, double protein){
    return (9 * fat) + (4 * carbs) + (4 * protein);
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

  //ArrayList<Category> getCategories
  //void addCategory
}