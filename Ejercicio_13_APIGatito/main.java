import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

import org.json.JSONObject;

public class main {

	public static void main(String[] args) {

		try {
			parseJSON p = new parseJSON();
			URL url = new URL("https://api.thecatapi.com/v1/images/search");
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.connect();
			int tiempoDeRepuesta = con.getResponseCode();
			if (tiempoDeRepuesta != 200)
			{
				throw new RuntimeException("HttpResponseCode " + tiempoDeRepuesta);
			} else {
				StringBuilder informacion = new StringBuilder();
				Scanner sc = new Scanner(url.openStream());
				while (sc.hasNext()) {
					informacion.append(sc.nextLine());
				}
				sc.close();
				informacion.replace(0, 1, "");
				informacion.replace(informacion.capacity()-2, informacion.capacity()-1, "");
				p.setJSON(informacion.toString());
				URL urlImg = new URL((String) p.getObjectHashMap("url"));
				Image image = ImageIO.read(urlImg);
				ImageIcon imageIcon = new ImageIcon(image);
				JFrame jFrame = new JFrame();
				jFrame.setBackground(Color.blue);
				JLabel jLabel = new JLabel();
				jFrame.setLayout(new FlowLayout());
				jFrame.setSize((int) p.getObjectHashMap("width"), (int) p.getObjectHashMap("height"));
				jLabel.setIcon(imageIcon);
				jFrame.add(jLabel);
				jFrame.setIconImage(image);
				jFrame.setVisible(true);
				jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	static class parseJSON {
		private JSONObject jObject;
		private HashMap<String, Object> hm = new HashMap<>();

		public Object getObjectHashMap(String key) {
			return hm.get(key);
		}

		public void setJSON(String response) {
			jObject = new JSONObject(response);
			hm.put("url", (String) (jObject.getString("url")));
			hm.put("width", (jObject.getInt("width")));
			hm.put("height", (jObject.getInt("height")));
		}
	}

}
