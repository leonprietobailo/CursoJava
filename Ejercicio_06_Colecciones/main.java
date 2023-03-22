import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class main {

  public static void main(String[] args) {

    Set<String> cSet = new HashSet<>();
    cSet.add("elemento1");
    cSet.add("elemento2");
    cSet.add("elemento3");
    cSet.add("elemento4");
    cSet.add("elemento5");
    cSet.add("elemento6");
    cSet.add("elemento7");
    cSet.add("elemento8");
    cSet.add("elemento9");
    cSet.add("elemento10");

    List<String> cList = new ArrayList<>();
    cList.add("elemento1");
    cList.add("elemento2");
    cList.add("elemento3");
    cList.add("elemento4");
    cList.add("elemento5");
    cList.add("elemento6");
    cList.add("elemento7");
    cList.add("elemento8");
    cList.add("elemento9");
    cList.add("elemento10");

    Map<String, Integer> cMap = new HashMap<>();
    cMap.put("elemento1", 1);
    cMap.put("elemento2", 2);
    cMap.put("elemento3", 3);
    cMap.put("elemento4", 4);
    cMap.put("elemento5", 5);
    cMap.put("elemento6", 6);
    cMap.put("elemento7", 7);
    cMap.put("elemento8", 8);
    cMap.put("elemento9", 9);
    cMap.put("elemento10", 10);


    System.out.println("El output de la colección Set es: ");
    System.out.println(cSet);
    System.out.println("El output de la colección List es: ");
    System.out.println(cList);
    System.out.println("El output de la colección Map es: ");
    System.out.println(cMap);

  }

}
