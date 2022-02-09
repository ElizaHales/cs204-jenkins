import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Welcome to the calculator!");
    System.out.println("Please enter a command:");

    Calculator calculator = new Calculator();
    Scanner inputObj = new Scanner(System.in);  // Create a Scanner object
    String commandName = inputObj.next();
    System.out.println("command name: " + commandName);
    int firstArg = Integer.parseInt(inputObj.next());
    System.out.println("firstArg: " + firstArg);
    int secondArg = 0;
    if (inputObj.hasNext()) {
      secondArg = Integer.parseInt(inputObj.next());
      System.out.println("secondArg: " + secondArg);
    }

    if (commandName.equals("add")) {
      System.out.println(calculator.add(firstArg, secondArg));
    } else if (commandName == "subtract") {
      System.out.println(calculator.subtract(firstArg, secondArg));
    } else if (commandName == "multiply") {
      System.out.println(calculator.multiply(firstArg, secondArg));
    } else if (commandName == "divide") {
      System.out.println(calculator.divide(firstArg, secondArg));
    } else if (commandName == "fibonacci") {
      System.out.println(calculator.fibonacciNumberFinder(firstArg));
    } else if (commandName == "binary") {
      String binaryNumber = calculator.intToBinaryNumber(firstArg);
      System.out.println(binaryNumber);
    }
  }
}
