package FirstActivity;

public class Students extends Person implements Human {

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


    @Override
    public void firstLanguage(String language) {
        System.out.println("My first language is " + language);

    }

    @Override
    public void hasAPet(boolean hasAPet, String pet) {
        if (hasAPet) {
            System.out.println("I have a pet, it's a " + pet);
        } else {
            System.out.println("No, I don't have a pet");
        }
    }

    @Override
    public void hasAHobby(boolean hasAHobby, String hobby) {
        if (hasAHobby) {
            System.out.println("I have a hobby - " + hobby);
        } else {
            System.out.println("I don't really have a hobby");
        }

    }
}
