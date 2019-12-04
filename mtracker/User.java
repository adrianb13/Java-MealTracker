package mtracker;

public class User {
  private String mFirstName;
  private String mLastName;
  private String mEmail;
  private String mAge;
  private double mTarget;

  User(String firstName, String lastName, String email, String age, double target){
    this.mFirstName = firstName;
    this.mLastName = lastName;
    this.mEmail = email;
    this.mAge = age;
    this.mTarget = target;
  }

  String getFirstName(){
    return this.mFirstName;
  }  
  String getLastName(){
    return this.mLastName;
  }
  String getEmail(){
    return this.mEmail;
  }
  String getAge(){
    return this.mAge;
  }
  Double getTarget(){
    return this.mTarget;
  }

  void getUserInfo(){
    System.out.println(String.format("User's full name is: %s %s ", this.mFirstName, this.mLastName));
    System.out.println(String.format("User's email is: %s ", this.mEmail));
    System.out.println(String.format("User's age is %s ", this.mAge));
    System.out.println(String.format("User's goal for complete meals is %s%%", this.mTarget));
    System.out.println();
  }
}