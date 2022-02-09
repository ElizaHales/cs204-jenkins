import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner inputObj=new Scanner(System.in);
    System.out.println("Welcome to the calculator!");
    System.out.println("Please enter a command:");

    while (inputObj.hasNext()) {
      Calculator calculator=new Calculator();
      String commandName=inputObj.next();
      int firstArg=Integer.parseInt(inputObj.next());
      if (commandName.equals("add") || commandName.equals("subtract") || commandName.equals("multiply") || commandName.equals("divide")) {
        int secondArg = Integer.parseInt(inputObj.next());
        if (commandName.equals("add")) {
          System.out.println(calculator.add(firstArg, secondArg));
        } else if (commandName.equals("subtract")) {
          System.out.println(calculator.subtract(firstArg, secondArg));
        } else if (commandName.equals("multiply")) {
          System.out.println(calculator.multiply(firstArg, secondArg));
        } else if (commandName.equals("divide")) {
          System.out.println(calculator.divide(firstArg, secondArg));
        }
      } else {
        if (commandName.equals("fibonacci")) {
          System.out.println(calculator.fibonacciNumberFinder(firstArg));
        } else if (commandName.equals("binary")) {
          System.out.println(calculator.intToBinaryNumber(firstArg));
        }
      }
    }
  }
}
