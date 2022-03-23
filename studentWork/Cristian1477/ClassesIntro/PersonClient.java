 package ClassesIntro; 
import java.util.ArrayList;


public class PersonClient {
   public static void main(String[] args) {      
      Person jim = new Person();
      jim.name = "Jim";
      jim.age = 27;
      jim.pets = new String[] {"Moby"};
      jim.gender = "male";
      
      jim.printIntroduction();
      jim.printAge();
      jim.printPetCount();
      jim.haveBirthday();
      jim.printAge();
      jim.printGender();
      
      Person cristian = new Person();
      cristian.name = "Cristian";
      cristian.age = 17;
      cristian.pets = new String[] {"Jack"};
      cristian.gender = "male";


      
      System.out.println(" ");
      cristian.printIntroduction();
      cristian.printAge();
      cristian.printPetCount();
      cristian.haveBirthday();
      cristian.printAge();
      cristian.printGender();
      

      ArrayList <Person> students = new ArrayList<Person>();
       
      students.add(jim);
      students.add(cristian);
      // the person object representing you, and two more Person objects representing 
      // two of your classmates (ask them for the values each field should have)
      
      
      // Save the return value in a variable, then have that object print their introduction and age.
      getYoungestStudent(students);
   }
   
   // The method should iterate through the ArrayList to find the youngest Person it contains, and it should return that Person.
   // If there are multiple Person objects who are tied for the youngest, the method can return any of them.
   public static Person getYoungestStudent(ArrayList<Person> students){
      Person name = null;
      for(int i =0; i < students.size(); i++){
         if(students.get(i).age<students.get(i).age){
          name = students.get(i);
         }
   }
   return name;
}
   
}