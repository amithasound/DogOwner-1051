public class Dog{
//Attributes
 final String name;
 final String breed;
 final String gender; 
 private int age; 
 String status = "Hungry"; 

   public Dog(String name, int age, String gender, String breed){
   this.name = name; 
   this.age = age; 
   this.gender = gender; 
   this.breed = breed;
   }



   public void setAge(int age){
    this.age = age;
   }
   
   public String getStatus(){
    return status;
   }


   public void printInfo(){
   System.out.println("Here is the information for " + name);
   System.out.println(name + " is a " + breed); 
   System.out.println(gender.equals("Female") ? "She is " + age + " years old" : "He is " + age + " years old");
  
   }
   
   public void play(){
    
      if(status.equalsIgnoreCase("Hungry")){
      System.out.println(name + " is hungry, refuses to play.");
      }else{
      System.out.println(name + " is full of energy, let's play.");
      }
   
   }
   
   public void feed(){
      status = "not hungry";
      System.out.println(name + " has been feed. ");
   }
   
   
}