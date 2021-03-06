package FirstActivity;

public class Students extends Person {

   String schoolName;

   public Students(){

   }

   public Students (String schoolName, String firstName, String secondName, int age){
       this.schoolName = schoolName;
       this.firstName = firstName;
       this.secondName = secondName;
       this.age = age;
   }


    public String introduceStudent(){
        return "My name is " + firstName + " " + secondName + " and I am " + age + " years old. I study in university " + schoolName;
    }


}
