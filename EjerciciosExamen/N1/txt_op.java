import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;

public class txt_op {

	String entrada = "C:\\Users\\leprieto\\Documents\\Curso Java\\CursoJava\\EjerciciosExamen\\N1\\entrada.txt";
	String salida = "C:\\Users\\leprieto\\Documents\\Curso Java\\CursoJava\\EjerciciosExamen\\N1\\";
	Set<articulo> cSet = new HashSet<>();
		
	

	public void read_txt() {

		try {
			File archivo = new File(entrada);
			FileReader fr = new FileReader(archivo);
			BufferedReader obj = new BufferedReader(fr);
			String caracteres = obj.readLine();

			while (caracteres != null) {
				String[] temp = caracteres.split(" ");

				switch (temp[0]) {
				case "Remera":
					articulo r1 = new remera(Integer.parseInt(temp[1]), Integer.parseInt(temp[2]),
							LocalDate.of(Integer.parseInt(temp[3].split("/")[2]),
									Integer.parseInt(temp[3].split("/")[1]), Integer.parseInt(temp[3].split("/")[0])));
					cSet.add(r1);
					break;
				case "Vestido":
					articulo v1 = new vestido(Integer.parseInt(temp[1]), Integer.parseInt(temp[2]),
							LocalDate.of(Integer.parseInt(temp[3].split("/")[2]),
									Integer.parseInt(temp[3].split("/")[1]), Integer.parseInt(temp[3].split("/")[0])));
					cSet.add(v1);
					break;
				case "Camisa":
					articulo c1 = new camisa(Integer.parseInt(temp[1]), Integer.parseInt(temp[2]),
							LocalDate.of(Integer.parseInt(temp[3].split("/")[2]),
									Integer.parseInt(temp[3].split("/")[1]), Integer.parseInt(temp[3].split("/")[0])));
					cSet.add(c1);
					break;
				case "Pantalon":
					articulo p1 = new pantalon(Integer.parseInt(temp[1]), Integer.parseInt(temp[2]),
							LocalDate.of(Integer.parseInt(temp[3].split("/")[2]),
									Integer.parseInt(temp[3].split("/")[1]), Integer.parseInt(temp[3].split("/")[0])));
					cSet.add(p1);
					break;
				case "Sweater":
					articulo s1 = new sweater(Integer.parseInt(temp[1]), Integer.parseInt(temp[2]),
							LocalDate.of(Integer.parseInt(temp[3].split("/")[2]),
									Integer.parseInt(temp[3].split("/")[1]), Integer.parseInt(temp[3].split("/")[0])));
					cSet.add(s1);
					break;
				
					
				}
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

			LocalDate fecha = LocalDate.now();
			DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd_MM_YYYY");
			String fechaFormateada = fecha.format(dateTimeFormatter);
			String rutaCompleta = salida + "info_articulos_" + fechaFormateada + ".txt";

			String contenido = "TIPO | CANTIDAD VENDIDA | PRECIO FINAL | PRECIO UNITARIO | DIAS ULT.COMPRA | ULTIMA COMPRA\n";

			float precioPromedio = 0;
			int cantidadVentas = 0;
			for (articulo a1 : cSet) {
				contenido += a1.get_tipo() + " ";
				contenido += a1.get_cantidadVendida() + " ";
				contenido += a1.get_precioFinal() + " ";
				contenido += a1.get_precio() + " ";
				contenido += a1.get_diasUltimaCompra() + " ";
				contenido += a1.get_ultimaCompra() + "\n";
				precioPromedio += a1.get_precioFinal();
				cantidadVentas += a1.get_cantidadVendida();
			}
			precioPromedio /= cSet.size();
			contenido += "\n";
			contenido += "Promedio de venta (Con IVA): " + precioPromedio +"\n";
			contenido += "Numero de ventas: " + cantidadVentas + "\n";
			

			File archivo = new File(rutaCompleta);
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
