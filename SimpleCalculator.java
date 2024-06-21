import java.util.Scanner;

public class SimpleCalculator {
   public SimpleCalculator() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      boolean var9 = false;
      System.out.println("\nWelcome to Simple Calculator!");

      while(true) {
         while(!var9) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            int var10 = var1.nextInt();
            byte var8;
            switch (var10) {
               case 1:
                  var8 = 43;
                  break;
               case 2:
                  var8 = 45;
                  break;
               case 3:
                  var8 = 42;
                  break;
               case 4:
                  var8 = 47;
                  break;
               case 5:
                  var9 = true;
                  continue;
               default:
                  System.out.println("Invalid choice. Please enter a number from 1 to 5.");
                  continue;
            }

            System.out.print("Enter first number: ");
            double var2 = var1.nextDouble();
            System.out.print("Enter second number: ");
            double var4 = var1.nextDouble();
            double var6;
            switch (var8) {
               case 42:
                  var6 = multiply(var2, var4);
                  break;
               case 43:
                  var6 = add(var2, var4);
                  break;
               case 44:
               case 46:
               default:
                  System.out.println("Invalid operator.");
                  continue;
               case 45:
                  var6 = subtract(var2, var4);
                  break;
               case 47:
                  var6 = divide(var2, var4);
            }

            System.out.println("Result: " + var6);
         }

         System.out.println("\nThank you for using Simple Calculator!");
         var1.close();
         return;
      }
   }

   public static double add(double var0, double var2) {
      return var0 + var2;
   }

   public static double subtract(double var0, double var2) {
      return var0 - var2;
   }

   public static double multiply(double var0, double var2) {
      return var0 * var2;
   }

   public static double divide(double var0, double var2) {
      if (var2 != 0.0) {
         return var0 / var2;
      } else {
         System.out.println("Error: Division by zero.");
         return Double.NaN;
      }
   }
}

