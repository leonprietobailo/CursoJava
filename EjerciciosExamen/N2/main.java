import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

public class main {

	public static void main(String[] args) {
		String APIMad = "https://api.open-meteo.com/v1/forecast?latitude=40.42&longitude=-3.70&hourly=temperature_2m&forecast_days=1";
		String APIBer = "https://api.open-meteo.com/v1/forecast?latitude=52.52&longitude=13.41&hourly=temperature_2m&forecast_days=1";

		try {
			parseJSON p1 = new parseJSON();
			parseJSON p2 = new parseJSON();

			int hora_actual = LocalDateTime.now().getHour();

			URL urlMad = new URL(APIMad);
			URL urlBer = new URL(APIBer);

			HttpURLConnection con1 = (HttpURLConnection) urlMad.openConnection();
			HttpURLConnection con2 = (HttpURLConnection) urlBer.openConnection();

			con1.connect();
			con2.connect();

			StringBuilder informacion1 = new StringBuilder();
			StringBuilder informacion2 = new StringBuilder();

			int tiempoDeRespuesta1 = con1.getResponseCode();
			int tiempoDeRespuesta2 = con2.getResponseCode();

			if (tiempoDeRespuesta1 != 200 || tiempoDeRespuesta2 != 200) {
				throw new RuntimeException("HttpResponseCode1 " + tiempoDeRespuesta1 + "\n" + "HttpResponseCode2 "
						+ tiempoDeRespuesta2 + "\n");
			} else {

				Scanner sc1 = new Scanner(urlMad.openStream());
				while (sc1.hasNext()) {
					informacion1.append(sc1.nextLine());
				}
				sc1.close();

				Scanner sc2 = new Scanner(urlBer.openStream());
				while (sc2.hasNext()) {
					informacion2.append(sc2.nextLine());
				}
				sc2.close();

				JSONObject objeto1 = new JSONObject(informacion1.toString());
				JSONObject objeto2 = new JSONObject(informacion1.toString());

				p1.setJSON(informacion1.toString());
				p2.setJSON(informacion2.toString());

//		        p1.setJSON(objeto1.getJSONObject(0).toString());
//				p2.setJSON(objeto2.getJSONObject(0).toString());
//				
				float temp_mad = Float.parseFloat(p1.getObjectHashMap("temperature" + hora_actual));
				float temp_ber = Float.parseFloat(p2.getObjectHashMap("temperature" + hora_actual));

				ciudad mad = new ciudad("Madrid", temp_mad);
				ciudad ber = new ciudad("Berlin", temp_ber);

				System.out.println("En la ciudad de: " + mad.nombre + "Hacen: " + mad.temperatura
						+ "ºC. Por lo tanto se llevan a cabo tareas de: " + mad.tareasRealizadas);
				System.out.println("En la ciudad de: " + ber.nombre + "Hacen: " + ber.temperatura
						+ "ºC. Por lo tanto se llevan a cabo tareas de: " + ber.tareasRealizadas);

			}

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	static class parseJSON {
		private JSONObject jObject;
		private HashMap<String, String> hm = new HashMap<>();

		public String getObjectHashMap(String key) {
			return hm.get(key);
		}

		public void setJSON(String response) {
			jObject = new JSONObject(response);
			for (int i = 0; i <= 23; i++) {
				hm.put("temperature" + i,
						jObject.getJSONObject("hourly").getJSONArray("temperature_2m").get(i).toString());
			}
		}
	}
}
