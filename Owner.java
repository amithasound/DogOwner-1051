public class Owner{
   public static void main (String [] args){
   Dog d1 = new Dog("Haru", 3, "Male", "Shiba Inu");
  // Dog d1 = new Dog("Perdita", 6, "Female", "Dalmation");

   d1.printInfo();
   System.out.println("");
   
   d1.setAge(4);
   
   d1.printInfo();
   System.out.println("");

   
   System.out.println("Status: " + d1.getStatus());
   
   d1.play();
   d1.feed();
   d1.play();
   


   }
}

