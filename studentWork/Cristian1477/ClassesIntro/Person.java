package ClassesIntro; 

public class Person {

   String name;
   int age;
   String[] pets;
   String gender;
   // TODO (step 3): add another field to the Person class here.
   
   
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
   
   // TODO (step 4): add another method which prints something related to the field you added in step 1
   
}