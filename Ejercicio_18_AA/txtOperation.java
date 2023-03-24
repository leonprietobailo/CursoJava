import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

class txtOperation implements interfaz_txtOperation {

	public void readTxt() {
		try {

			File archivo1 = new File(ruta1);
			FileReader fr1 = new FileReader(archivo1);
			BufferedReader obj1 = new BufferedReader(fr1);
			obj1.readLine(); // Saltamos primera linea
			String caracteres1 = obj1.readLine();

			File archivo2 = new File(ruta2);
			FileReader fr2 = new FileReader(archivo2);
			BufferedReader obj2 = new BufferedReader(fr2);
			obj2.readLine(); // Saltamos primera linea
			String caracteres2 = obj2.readLine();

			File archivo3 = new File(ruta3);
			FileReader fr3 = new FileReader(archivo3);
			BufferedReader obj3 = new BufferedReader(fr3);
			obj3.readLine(); // Saltamos primera linea
			String caracteres3 = obj3.readLine();

			Set<String> cSetUsuarios = new HashSet<>();

			for (int i = 0; caracteres1 != null; i++) {
				cSetUsuarios.add(caracteres1);
				caracteres1 = obj1.readLine();
			}
			for (int i = 0; caracteres2 != null; i++) {
				cSetUsuarios.add(caracteres2);
				caracteres2 = obj2.readLine();
			}
			for (int i = 0; caracteres3 != null; i++) {
				cSetUsuarios.add(caracteres3);
				caracteres3 = obj3.readLine();
			}

			for (String st : cSetUsuarios) {
				String[] st2 = st.split(" ");
				String nombre = st2[0];
				String hola = (st2[1].split("/")[0]);
				LocalDate fn = LocalDate.of(Integer.parseInt(st2[1].split("/")[2]),
						Integer.parseInt(st2[1].split("/")[1]), Integer.parseInt(st2[1].split("/")[0]));
				LocalDate fr = LocalDate.of(Integer.parseInt(st2[2].split("/")[2]),
						Integer.parseInt(st2[2].split("/")[1]), Integer.parseInt(st2[2].split("/")[0]));
				LocalDate fl = LocalDate.of(Integer.parseInt(st2[3].split("/")[2]),
						Integer.parseInt(st2[3].split("/")[1]), Integer.parseInt(st2[3].split("/")[0]));
				int cantidadCompras = Integer.parseInt(st2[4]);
				String pais = st2[5];
				usuario usr = new usuario(st2[0], fn, fr, fl, cantidadCompras);
				cSet.add(usr);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void writeFile() {
		try {
			String contenido = "NOMBRE | Fecha Nacimiento | Antiguedad | Segmento | Status | Edad\n";

			File archivo = new File(rutaW);
			if (!archivo.exists()) {
				archivo.createNewFile();
			}

			for (usuario usr : cSet) {
				contenido += usr.nombre + " " + usr.fechaNacimiento + " " + usr.antiguedad + " " + usr.segmento + " "
						+ usr.status + " " + usr.edad + "\n";
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
