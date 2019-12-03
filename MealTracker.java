package mealprep;

import java.util.ArrayList;

class MealTracker {

  protected final ArrayList<Meal> mMeals = new ArrayList<>();
  protected final User mUser;

  MealTracker(User user) {
    this.mUser = user;
  }

  void addMeal (Meal meal) {
    this.mMeals.add(meal);
  }

  void viewMeals () {
    for (Meal meal : this.mMeals){
      System.out.println(meal.getName());
    }
  }

  int getMealCount () {
    return this.mMeals.size();
  }
  
  double getAdherence() {
    double count = 0;

    for (Meal meal : this.mMeals){
      if(meal.isComplete()){
        count += 1;
      }
    }

    return count/getMealCount() * 100;
  }

  boolean isOnTrack() {
    bool onTrack = false;
    
    if(this.getAdherence() >= this.mUser.getTargetAdherence()){
      onTrack = true;
    }

    return onTrack;
  }
}