import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Welcome to the calculator!");
    System.out.println("Please enter a command:");

    Scanner inputObj=new Scanner(System.in);
    while (inputObj.hasNext()) {
      Calculator calculator=new Calculator();
      String commandName=inputObj.next();
      System.out.println("command name: " + commandName);
      int firstArg=Integer.parseInt(inputObj.next());
      System.out.println("firstArg: " + firstArg);
      int secondArg=0;
      if (inputObj.hasNext()) {
        secondArg=Integer.parseInt(inputObj.next());
        System.out.println("secondArg: " + secondArg);
      }

      if (commandName.equals("add")) {
        System.out.println(calculator.add(firstArg, secondArg));
      } else if (commandName.equals("subtract")) {
        System.out.println(calculator.subtract(firstArg, secondArg));
      } else if (commandName.equals("multiply")) {
        System.out.println(calculator.multiply(firstArg, secondArg));
      } else if (commandName.equals("divide")) {
        System.out.println(calculator.divide(firstArg, secondArg));
      } else if (commandName.equals("fibonacci")) {
        System.out.println(calculator.fibonacciNumberFinder(firstArg));
      } else if (commandName.equals("binary")) {
        System.out.println(calculator.intToBinaryNumber(firstArg));
      }
    }
  }
}
