

import java.util.Scanner;


public class CalculadoraJava {

  public static void main(String[] args) {

    Scanner reader = new Scanner(System.in);
    System.out.print("Enter first number: ");

    int v1 = reader.nextInt();
    System.out.print("Enter second number: ");

    int v2 = reader.nextInt();

    System.out.print("Enter operator: ");
    String operador = reader.next();
    int res = 0;

    switch (operador) {
      case "+":
        res = v1 + v2;
        break;
      case "-":
        res = v1 - v2;
        break;
      case "*":
        res = v1 * v2;
        break;
      case "/":
        while (v2 == 0) {
          System.out.print("Enter second number (must be different than 0): ");
          v2 = reader.nextInt();
        }
        res = v1 / v2;
        break;
    }

    System.out.print("El resultado es: " + res);


  }

}
