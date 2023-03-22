import java.util.Scanner;


public class Math_Class implements Operacionesaritmeticas {
  Scanner reader = new Scanner(System.in);

  @Override
  public void resultado(int a, int b, String op) {

    int res = 0;

    switch (op) {
      case "+":
        res = a + b;
        break;
      case "-":
        res = a - b;
        break;
      case "*":
        res = a * b;
        break;
      case "/":
        while (b == 0) {
          System.out.print("Enter second number (must be different than 0): ");
          b = reader.nextInt();
        }
        reader.close();
        res = a / b;
        break;
    }
    System.out.println("El resultado es: " + res);
  }

  @Override
  public int pedirNumero() {
    System.out.print("Introduce un numero: ");
    int n = reader.nextInt();
    return n;
  }

  @Override
  public String pedirOperador() {
    System.out.print("Introduce un operador: ");
    String n = reader.next();
    return n;
  }
}
