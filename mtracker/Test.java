package mtracker;

class Test {
  public static void main(String[] args) {
    User user = new User("Adrian", "Briones", "adrianb13@yahoo.com", "35", 80);
    user.getUserInfo();

    MealTracker meals = new MealTracker(user);
    Meal meal = new Meal("Lunch");

    System.out.println(String.format("%s is the new meal to be entered.", meal.getName().toUpperCase()));
    System.out.println();

    Category category = Category.Protein;
    Category category2 = Category.Fruit;
    Category category3 = Category.Vegetable;

    Food food = new Food("Meat", 11.8, 0.0, 26.1, category);
    Food food2 = new Food("Orange", 0.2, 16.8, 1.7, category2);
    Food food3 = new Food("Spinach", 0.1, 0.1, 0.9, category3);

    System.out.println(food.getName());
    System.out.println(food.getCalories());
    System.out.println(food.getFat());
    System.out.println(food.getCarbohydrates());
    System.out.println(food.getProtein());
    System.out.println(food.getCategory());
    System.out.println();

    System.out.println(food2.getName());
    System.out.println(food2.getCalories());
    System.out.println(food2.getFat());
    System.out.println(food2.getCarbohydrates());
    System.out.println(food2.getProtein());
    System.out.println(food2.getCategory());
    System.out.println();

    System.out.println(food3.getName());
    System.out.println(food3.getCalories());
    System.out.println(food3.getFat());
    System.out.println(food3.getCarbohydrates());
    System.out.println(food3.getProtein());
    System.out.println(food3.getCategory());
    System.out.println();

    
    meal.addFood(food);
    meal.addFood(food2);
    meal.addFood(food3);
    System.out.println();
    meal.viewFoods(); // List of food items
    System.out.println();

    System.out.printf("Total calories are %s. \n", meal.getCalories());
    System.out.printf("Total fat is %s. \n", meal.getFat());
    System.out.printf("Total carbs are %s. \n",meal.getCarbohydrates());
    System.out.printf("Total protein is %s. \n",meal.getProtein());
    System.out.printf("Was this a complete meal?: %s \n",meal.isComplete());
    System.out.println();

    meals.addMeal(meal);
    System.out.println();

    System.out.printf("%s's ", user.getFirstName());
    meals.viewMeals();
  }  
}