import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONObject;

public class main {

  public static void main(String[] args) {
    try {
    	URL url1 = new URL("https://rickandmortyapi.com/api/character");
    	URL url2 = new URL("https://rickandmortyapi.com/api/location");
    	URL url3 = new URL("https://rickandmortyapi.com/api/episode");
    	
    	HttpURLConnection con1 = (HttpURLConnection) url1.openConnection();
    	HttpURLConnection con2 = (HttpURLConnection) url2.openConnection();
    	HttpURLConnection con3 = (HttpURLConnection) url3.openConnection();
    	
    	con1.connect();
    	con2.connect();
    	con3.connect();
    	
    	StringBuilder informacion = new StringBuilder();
    	
    	int tiempoDeRespuesta1 = con1.getResponseCode();
    	int tiempoDeRespuesta2 = con2.getResponseCode();
    	int tiempoDeRespuesta3 = con3.getResponseCode();
    	
    	    	
    	if (tiempoDeRespuesta1 != 200 || tiempoDeRespuesta2 != 200 || tiempoDeRespuesta3 != 200) {
	        throw new RuntimeException("HttpResponseCode1 " + tiempoDeRespuesta1 +"\n" +
	        		"HttpResponseCode2 " + tiempoDeRespuesta2 +"\n" +
	        		"HttpResponseCode3 " + tiempoDeRespuesta3 +"\n");
	        } 
    	else {
	        
	        Scanner sc1 = new Scanner(url1.openStream());
	        while (sc1.hasNext()) {
	        	informacion.append(sc1.nextLine());
	        }
	        sc1.close();
	        
	        Scanner sc2 = new Scanner(url2.openStream());
	        while (sc2.hasNext()) {
	        	informacion.append(sc2.nextLine());
	        }
	        sc2.close();
	        
	        Scanner sc3 = new Scanner(url3.openStream());
	        while (sc3.hasNext()) {
	        	informacion.append(sc3.nextLine());
	        }
	        sc3.close();
	        System.out.println(informacion);
    	}
	
	    } catch (MalformedURLException e) {
	      e.printStackTrace();
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	
	  }
	
	}
