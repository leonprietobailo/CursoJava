package Ejercicio_04;

import java.util.Scanner;

public class main {

  public static void main(String[] args) {

    Scanner reader = new Scanner(System.in);
    int num;
    Boolean found = false;
    int[] numero = {(int) (Math.random() * 100 + 1), (int) (Math.random() * 100 + 1),
        (int) (Math.random() * 100 + 1)};


    System.out.println("Introduce el primer n�mero: ");
    num = reader.nextInt();

    for (int i = 0; i < numero.length; i++) {

      if (numero[i] == num) {
        found = true;
        break;
      }
    }

    if (!found) {
      System.out.println("Introduce el segundo n�mero: ");
      num = reader.nextInt();

      for (int i = 0; i < numero.length; i++) {

        if (numero[i] == num) {
          found = true;
          break;
        }
      }
    }

    if (!found) {
      System.out.println("Introduce el tercer n�mero: ");
      num = reader.nextInt();

      for (int i = 0; i < numero.length; i++) {

        if (numero[i] == num) {
          found = true;
          break;
        }
      }
    }

    if (found) {
      System.out.print("Felicidades! El n�mero es: ");
      System.out.println(num);
    } else {
      System.out.println("Te equivocaste de numero :(");
    }


  }

}
