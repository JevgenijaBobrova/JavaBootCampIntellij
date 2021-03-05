public class Students extends Person {

   String schoolName;

   public Students(){

   }

   public Students (String schoolName, String name, int age){
       this.schoolName = schoolName;
       this.name = name;
       this.age = age;
   }


    public void introduceStudent(){
        System.out.println("My name is " + name + " and I am " + age + " years old. I study in university " + schoolName);
    }


}
