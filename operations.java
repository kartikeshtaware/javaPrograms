import java.util.*;

class operations
{

   static int add(int a , int b)  // this is addition function
   {
      return a+b;  // addition function return value                  
   
   }
   
   static int sub(int a , int b)  // this is subtraction function
   {
      return a-b;      // subtraction function return value               
   
   }
   static int mul(int a , int b)  // this is multiplication function
   {
      return a*b;      // multiplication function return value               
   
   }
   static int div(int a , int b)  // this is division function
   {
      return a/b;      // division function return value               
   
   }
   public static void main(String args[])
   {
      System.out.println(add(20,30));   // addition function is called
      System.out.println(sub(30,20));   // subtraction function is called
      System.out.println(mul(30,20));   // multiplication function is called
      System.out.println(div(30,20));   // division function is called
   
   }

}
