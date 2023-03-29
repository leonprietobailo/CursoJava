import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

public class writer implements txt_op {

	public void read_txt() {
		try {
			File archivo = new File(rutaIn);
			FileReader fr = new FileReader(archivo);
			BufferedReader obj = new BufferedReader(fr);
			obj.readLine();
			String caracteres = obj.readLine();

			while (caracteres != null) {
				String[] splitted = caracteres.split(" ");
				aerolinea a = new aerolinea("Iberia", splitted[0], Integer.parseInt(splitted[1]), splitted[2],
						Integer.parseInt(splitted[3]),
						LocalDate.of(Integer.parseInt(splitted[4].split("/")[2]),
								Integer.parseInt(splitted[4].split("/")[1]),
								Integer.parseInt(splitted[4].split("/")[0])));
				aList.add(a);
				caracteres = obj.readLine();
			}
			fr.close();
			obj.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void write_txt() {
		try {
			Formatter fmt = new Formatter();
			fmt.format("%15s %15s %15s %15s %15s %15s %15s %15s %15s\n", "AEROLINEA", "NOMBRE_VUELO", "CANT_PASAJEROS",
					"TIPO_PASAJE", "VALOR_UNITARIO", "FECHA_VUELO", "VALOR_FINAL", "DIAS_DIFERENCIA", "SEGMENTACION");
			int montoTotal = 0;
			for (aerolinea a : aList) {
				fmt.format("%15s %15s %15s %15s %15s %15s %15s %15s %15s\n", a.nombre, a.nombre_vuelo, a.cant_pasajeros,
						a.tipo_pasaje, a.valor_unitario, a.fecha_vuelo, a.valorFinalPorVuelo, a.diasDeDiferencia,
						a.segmentacion);
				montoTotal += a.valorFinalPorVuelo;
			}

			String contenido = fmt.toString() + "\nEl monto total es: " + montoTotal;

			File archivo = new File(rutaOut);
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
