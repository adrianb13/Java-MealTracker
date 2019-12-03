package mealprep;

import java.lang.Math;
import java.util.ArrayList;

class Food {

  private final String mName;
  private final double mCalories;
  private final double mFat;
  private final double mCarbohydrates;
  private final double mProtein;
  private final Category mCategory;
  private final ArrayList<Category> mCategories = new ArrayList<>();

  Food (String name, double calories, double fat, double carbohydrates, double protein, Category category) {
    this.mName = name;
    this.mCalories = calorieCalculator(fat, carbohydrates, protein);
    this.mFat = fat;
    this.mCarbohydrates = carbohydrates;
    this.mProtein = protein;
    this.mCategory = category;
  }

  private static double calorieCalculator(double fat, double carbohydrates, double protein){
    return (9 * fat) + (4 * carbohydrates) + (4 * protein);
  }

  double getCalories () {
    return this.mCalories;
  }
  double getFat () {
    return this.mFat;
  }
  double getCarbohydrates () {
    return this.mCarbohydrates;
  }
  double getProtein () {
    return this.mProtein;
  }
  Category getCategory () {
    return this.mCategory;
  }
  String getName () {
    return this.mName;
  }
  void addCategory (Category category) {
    this.mCategories.add(category);
  }

  void viewFood() {
    System.out.println(
        String.format("The food is %s.", this.getName())
    );
    System.out.println(
        String.format("It has %s calories.", this.getCalories())
    );
    System.out.println(
        String.format("It has %s fat.", this.getFat())
    );
    System.out.println(
        String.format("It has %s carbs.", this.getCarbohydrates())
    );
    System.out.println(
        String.format("It has %s protein.", this.getProtein())
    );
  }
}