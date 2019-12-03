package mtracker;

class Test {
  public static void main(String[] args) {
    Food food = new Food("Meat", 10, 10, 10, 10);
    Food food2 = new Food("Orange", 5, 5, 5, 5);

    System.out.println(food.getName());
    System.out.println(food.getCalories());
    System.out.println(food.getFat());
    System.out.println(food.getCarbohydrates());
    System.out.println(food.getProtein());
    System.out.println();

    System.out.println(food2.getName());
    System.out.println(food2.getCalories());
    System.out.println(food2.getFat());
    System.out.println(food2.getCarbohydrates());
    System.out.println(food2.getProtein());
    System.out.println();

    Meal meal = new Meal("Lunch");
    meal.addFood(food);
    meal.addFood(food2);
    System.out.println();
    System.out.println(meal.getName());
    System.out.println(meal.getCalories());
    System.out.println(meal.getFat());
    System.out.println(meal.getCarbohydrates());
    System.out.println(meal.getProtein());
    meal.viewFoods();
  }  
}