
public class Example1 {
public static void main (String[]args){
    int num1 = 4;
    int num2 = 8;
    System.out.println(num1 + num2);
     System.out.println(num2 - num1);
      System.out.println(num1 * num2);
       System.out.println(num1 / num2);

       float celcius_temp = 12;
      float farenheit_temp = (celcius_temp * 9/5) + 32;
      System.out.println(farenheit_temp);

     String name = ("Noor");
     int age = 14;
     System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");

     boolean is_sunny = true;
     boolean is_weekend = true;
       System.out.println("The weather is sunny and it's the weekend.");

       String quote = "If you cannot do great things, do small things in a great way";
       String author = "Napoleon Hill";
      System.out.println("\"" + quote + "\"");
      System.out.println("- " + author);

      boolean is_java_fun = true; 
      
      if (is_java_fun) {
          System.out.println("Java is fun");

          String hometown = ("Canada");
          
          // b. Print a fact sheet about yourself using the variables.
          System.out.println("Personal Fact Sheet:");
          System.out.println("My name is " + name + ", I am " + age + " years old, and I am from " + hometown + ".");
}
}
}
