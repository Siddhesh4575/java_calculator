import java.util.*;
class First {
   public static void main(String args[]) {
      Scanner Sc=new Scanner(System.in);
      int months = Sc.nextInt();

      if(months == 1) {
         System.out.println("Its January");
      }
      if(months == 2) {
         System.out.println("Its Febuary");
      }
      if(months == 3) {
         System.out.println("Its March");
      }
      if(months == 4) {
         System.out.println("Its April");
      }
      if(months == 5) {
         System.out.println("Its May");
      }
      if(months == 6) {
         System.out.println("June");
      }
      if(months == 7) {
         System.out.println("July");
      }
      if(months == 8) {
         System.out.println("Its Augest");
      }
      if(months == 9) {
         System.out.println("Its September");
      }
      if(months == 10) {
         System.out.println("October");
      }
      if(months == 11) {
         System.out.println("Its November");
      }
      if(months == 12) {
         System.out.println("Its December");
      }
      else  {
         System.out.println("Error Please input valid number");
      }
   }
}