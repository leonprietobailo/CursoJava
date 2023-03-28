import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class txt_op {

	String ruta = "C:\\Users\\leprieto\\Documents\\Curso Java\\CursoJava\\EjerciciosExamen\\N3\\input.txt";
	List<Float> years = new ArrayList<Float>();
	List<Float> gains = new ArrayList<Float>();

	List<Float> gains_2 = new ArrayList<>();
	List<String> filmNames = new ArrayList<>();

	TreeMap<Long, String> topFilms_sorted;

	public void read_txt() {
		List<String[]> cList = new ArrayList<>();
		try {
			File archivo = new File(ruta);
			FileReader fr = new FileReader(archivo);
			BufferedReader obj = new BufferedReader(fr);
			String caracteres = obj.readLine();

			while (caracteres != null) {
				cList.add(caracteres.split("\t"));
				caracteres = obj.readLine();
			}
			fr.close();
			obj.close();

			float total;
			for (int i = 2009; i <= 2022; i++) {
				total = 0;
				for (int s = 0; s < cList.size(); s++) {
					if (Integer.parseInt(cList.get(s)[7]) == i) {
						total += Float.parseFloat(cList.get(s)[2]);
					}

				}
				if (total != 0) {
					years.add((float) i);
					gains.add(total);
				}
			}

			Map<Long, String> topFilms = new HashMap<>();

			for (int i = 0; i < cList.size(); i++) {
				filmNames.add(cList.get(i)[1]);
				gains_2.add(Float.parseFloat(cList.get(i)[2]));
			}
		}

		catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void write_txt() {
		try {
			String ruta = "C:\\Users\\leprieto\\Documents\\Curso Java\\CursoJava\\EjerciciosExamen\\N3\\output.txt";

			String contenido = "Ganancias agrupadas por año:\n";

			for (int i = 0; i < years.size(); i++) {
				contenido += years.get(i) + "\t";
				contenido += gains.get(i) + "\n";

			}

			contenido += "\n";
			List<Float> gains_backup = new ArrayList<>(gains_2);
			Collections.sort(gains_backup);
			contenido += "El TOP 3 de peliculas con mas recaudación es:\n";
			contenido += filmNames.get(gains_2.indexOf(gains_backup.get(gains_backup.size() - 1))) + "\n";
			contenido += filmNames.get(gains_2.indexOf(gains_backup.get(gains_backup.size() - 2))) + "\n";
			contenido += filmNames.get(gains_2.indexOf(gains_backup.get(gains_backup.size() - 3))) + "\n";

			contenido += "\n";

			contenido += "El año que mas dinero se recaudó fue el año: "
					+ years.get(gains.indexOf(Collections.max(gains))) + "\n";

			contenido += "\n";

			contenido += "La lista de películas ordenadas alfabeticamente es: " + "\n";
			Collections.sort(filmNames);
			for (int i = 0; i < filmNames.size(); i++) {
				contenido += filmNames.get(i) + "\n";
			}

			File archivo = new File(ruta);
			if (!archivo.exists()) {
				archivo.createNewFile();
			}
			FileWriter fw = new FileWriter(archivo);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(contenido);
			bw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
