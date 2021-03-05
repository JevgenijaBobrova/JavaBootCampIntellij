public class Students extends Person {

   String schoolName;

   public Students(){

   }

   public Students (String schoolName, String name, int age){
       this.schoolName = schoolName;
       this.name = name;
       this.age = age;
   }


    public String introduceStudent(){
        return "My name is " + name + " and I am " + age + " years old. I study in university " + schoolName;
    }


}
