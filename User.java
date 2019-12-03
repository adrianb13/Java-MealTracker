package mealprep;

import java.util.HashMap;

class User {
  protected final String mFirstName;
  protected final String mLastName;
  protected final String mEmail;
  protected final String mAge;
  protected final double mGoal;
  
  User(String firstName, String lastName, String email, String age, double target) {
      this.mFirstName = firstName;
      this.mLastName = lastName;
      this.mEmail = email;
      this.mAge = age;
      this.mTargetAdherence = target;
  }
  String getFirstName() {
    return this.mFirstName;
  }
  String getLastName() {
    return this.mLastName;
  }
  String getEmail() {
    return this.mEmail;
  }
  String getAge() {
    return this.mAge;
  }
  double getTargetAdherence() {
    return this.mTargetAdherence;
  }
  void userDetails() {
    System.out.println(
        String.format("Your name is %s %s.", this.mFirstName, this.mLastName)
    );
    System.out.println(
        String.format("Your email is %s.", this.mEmail)
    );
    System.out.println(
        String.format("Your age is %s.", this.mAge)
    );
    System.out.println(
        String.format("Your target goal is %s.", this.mGoal)
    );
  }
}