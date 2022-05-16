package ClassesIntro; 

public class Person {

   String name;
   int age;
   String[] pets;
   String gender;
   
   
   
   public void printIntroduction() {
      System.out.println("Hi, my name is " + name + ".");
   }
   
   public void printAge() {
      System.out.println("I am " + age + " years old.");
   }
   
   public void haveBirthday() {
      age++;
      System.out.println("I just had my birthday.");
   }
   
   public void printPetCount() {
      System.out.println("I have " + pets.length + " pets.");
   }
   public void printGender(){
      System.out.println("I am a " + gender);
   }
   
   
}