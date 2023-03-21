import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class main {

  public static void main(String[] args) {

    Scanner reader = new Scanner(System.in);

    List<String> cList = new ArrayList<>();
    System.out.println("Introduzca el nombre del primer supermercado: ");
    cList.add(reader.next());
    System.out.println("Introduzca el nombre del segundo supermercado: ");
    cList.add(reader.next());
    System.out.println("Introduzca el nombre del tercer supermercado: ");
    cList.add(reader.next());


    Set<String> cSet = new HashSet<>();

    System.out.println("Introduzca el primer Documento de Identidad Nacional:");
    cSet.add(reader.next());
    System.out.println("Introduzca el segundo Documento de Identidad Nacional:");
    cSet.add(reader.next());
    System.out.println("Introduzca el tercer Documento de Identidad Nacional:");
    cSet.add(reader.next());

    Map<String, Integer> cMap = new HashMap<>();
    System.out.println(
        "Introduzca el primer Nombre de Usuario, pulse intro y añada el ID correspondiente:");
    cMap.put(reader.next(), reader.nextInt());
    System.out.println(
        "Introduzca el segundo Nombre de Usuario, pulse intro y añada el ID correspondiente:");
    cMap.put(reader.next(), reader.nextInt());
    System.out.println(
        "Introduzca el tercer Nombre de Usuario, pulse intro y añada el ID correspondiente:");
    cMap.put(reader.next(), reader.nextInt());



    System.out.println("El output de la colección List es: ");
    System.out.println(cList);

    System.out.println("El output de la colección Set es: ");
    System.out.println(cSet);

    System.out.println("El output de la colección Map es: ");
    System.out.println(cMap);

  }

}
