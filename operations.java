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
   static int mod(int a , int b)  // this is modulus function
   {
      return a%b;      // modulus function return value               
   
   }
    static int square(int a)  // this is square function
   {
      return a*a;      // square function return value               
   
   }
   static int cube(int a)  // this is cube function
   {
      return a*a*a;      // cube function return value               
   
   }
   static int fuctorial(int a)  // this is fuctorial function
   {
   
      int fact = 1;
      int c = a;
      for(int i =c; i <=1 ; i--)
      {
        fact = fact*i;
        
      
      }
      return fact;  // fuctorial function return value      
                  
   
   }
   public static void main(String args[])
   {
      System.out.println(add(20,30));   // addition function is called
      System.out.println(sub(30,20));   // subtraction function is called
      System.out.println(mul(30,20));   // multiplication function is called
      System.out.println(div(30,20));   // division function is called
      System.out.println(mod(30,2));   // modulus function is called
      System.out.println(square(3));   // square function is called
      System.out.println(cube(3));   // cube function is called
      System.out.println(fuctorial(3));   // fuctorial function is called
      
   
   }

}
