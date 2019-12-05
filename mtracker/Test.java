/* package mtracker;

class Test {
  public static void main(String[] args) {
    //User info for User class
    User user = new User("New", "User", "email@yahoo.com", "30", 80);
    user.getUserInfo();

    //Attaches User to MealTracker class
    MealTracker meals = new MealTracker(user);

    //Meal to be entered in the MealTracker
    Meal meal = new Meal("Lunch");

    System.out.println(String.format("%s is the new meal to be entered.", meal.getName().toUpperCase()));
    System.out.println();

    //Categories from Category class = predetermined for testing
    Category category = Category.Protein;
    Category category2 = Category.Fruit;
    Category category3 = Category.Vegetable;

    //Food items created in the Food class
    Food food = new Food("Meat", 11.8, 0.0, 26.1, category);
    Food food2 = new Food("Orange", 0.2, 23.6, 1.8, category2);
    Food food3 = new Food("Spinach", 0.4, 3.6, 2.9, category3);

    //Meat Details
    System.out.println(food.getName());
    System.out.println(food.getCalories());
    System.out.println(food.getFat());
    System.out.println(food.getCarbohydrates());
    System.out.println(food.getProtein());
    System.out.println(food.getCategory());
    System.out.println();

    //Orange Details
    System.out.println(food2.getName());
    System.out.println(food2.getCalories());
    System.out.println(food2.getFat());
    System.out.println(food2.getCarbohydrates());
    System.out.println(food2.getProtein());
    System.out.println(food2.getCategory());
    System.out.println();

    //Spinach Details
    System.out.println(food3.getName());
    System.out.println(food3.getCalories());
    System.out.println(food3.getFat());
    System.out.println(food3.getCarbohydrates());
    System.out.println(food3.getProtein());
    System.out.println(food3.getCategory());
    System.out.println();

    //Food items added to current meal of "Lunch"
    meal.addFood(food);
    meal.addFood(food2);
    meal.addFood(food3);
    System.out.println();
    meal.viewFoods(); // List of food items
    System.out.println();

    //Meal details for all food consumed during meal
    System.out.printf("Total calories are %s. \n", meal.getCalories());
    System.out.printf("Total fat is %s. \n", meal.getFat());
    System.out.printf("Total carbs are %s. \n",meal.getCarbohydrates());
    System.out.printf("Total protein is %s. \n",meal.getProtein());
    System.out.printf("Was this a complete meal?: %s \n",meal.isComplete());
    System.out.println();

    //Adds meal to the MealTracker
    meals.addMeal(meal);
    System.out.println();

    //Shows User's List of Meals
    System.out.printf("%s's ", user.getFirstName());
    meals.viewMeals();
    System.out.println();

    //Shows User's Adherence to their goal
    System.out.printf("This is your 'complete meal' percentage: %s%% \n", meals.getAdherence());
    if(meals.isOnTrack()){
      System.out.println("You are ON TRACK with your goal.");
    } else {
      System.out.println("You are NOT ON TRACK with your goal.");
    }
  }  
} */