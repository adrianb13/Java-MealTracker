# MealTrackerJava

This is a Personal Meal Tracker/Calculator Console App.

The app is written in Java.

******** Description *********

It will track a FOOD item you consume. Each food item requires the fat, carbs, and protein content (in grams) of each item type you consume. It also requires that you enter a category each item may fall in (i.e. Fruit, Vegetable, Protein, Other). Using the info given, it will also calculate the estimated calories you have consumed.

Each FOOD item will be part of a MEAL you consume. Once you've eaten your meal, you will enter all the different FOOD items as part of the meal. It will then calculate the total amount of calories, fat, carbs, and protein content of your meal.  It will also determine if you possibly ate a complete balance meal.  This would have meant you ate a protein, fruit, and vegetable as part of your meal.

As an example: (I'll call it "Small Lunch")
  Beef (3.5oz 10% fat) - This has 11.8g fat, 0g carbs, 26.1g protein. This is my PROTEIN.
  Orange (200g: lg orange) - This has 0.2g fat, 23.6g carbs, 1.8g protein. This is my FRUIT.
  Spinach (3.5oz 100g) - This is 0.4g fat, 3.6g carbs. 2.9g protein. This is my VEGETABLE.
  
After entering the needed info, the app would tell me the following:
  Total calories are 417.6.
  Total fat is 12.4.
  Total carbs are 27.2.
  Total protein is 30.8.
  Was this a complete meal?: true **(Because I had a Protein, Fruit, and Vegetable)**

The MEAL will then be added to my list of meals in my MEALTRACKER as "Small Lunch."

This MEALTRACKER will be attached me to as a USER. You will enter your First & Last Name, Email, Age, and Target Goal of the percent of complete meals you want to accomplish.

The app is still being put together with many features that can be expanding on.

******** TO TEST THE APP ********

-You would just clone the directory. 
-Assuming you are already in your console, just move to the root of the directory. 
-Move into the "mtracker" folder where all the files are "housed".
-Just to make sure run the following in console:     javac *.java
     (This will just make sure the files are compiled.)
-Then run the following:      ./run.sh
     (This will run the Test.java file)
-Assuming you have not changed any of the information in the Test.java file. You should see the same output at described above in the description.

