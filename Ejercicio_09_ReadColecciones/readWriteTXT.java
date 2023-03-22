import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class readWriteTXT implements readWriteTXT_interface {



  String ruta =
      "C:\\Users\\leprieto\\Documents\\Curso Java\\CursoJava\\Ejercicio_09\\TXTNombres.txt";

  public void readTxtAndPrint() {
    Set<String> cSet = new HashSet<>();
    try {
      File archivo = new File(ruta);
      FileReader fr = new FileReader(archivo);
      BufferedReader obj = new BufferedReader(fr);
      String caracteres = obj.readLine();

      while (caracteres != null) {
        cSet.add(caracteres);
        caracteres = obj.readLine();
      }
      fr.close();
      obj.close();

      for (String st : cSet) {
        System.out.println(st);
      }

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

