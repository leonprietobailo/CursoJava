import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class main {

  public static void main(String[] args) {
    try {
      URL url = new URL("https://v2.jokeapi.dev/joke/Programming?lang=es");
      HttpURLConnection con = (HttpURLConnection) url.openConnection();
      con.connect();

      int tiempoDeRespuesta = con.getResponseCode();
      if (tiempoDeRespuesta != 200) {
        throw new RuntimeException("HttpResponseCode " + tiempoDeRespuesta);
      } else {
        StringBuilder informacion = new StringBuilder();
        Scanner sc = new Scanner(url.openStream());
        while (sc.hasNext()) {
          informacion.append(sc.nextLine());
        }
        sc.close();
        System.out.println(informacion);
      }



    } catch (MalformedURLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }

}
