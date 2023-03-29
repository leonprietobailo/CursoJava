import java.time.LocalDate;

public class aerolinea extends vuelo {

	String nombre;

	public aerolinea(String nombre, String nombre_vuelo, int cant_pasajeros, String tipo_pasaje, int valor_unitario,
			LocalDate fecha_vuelo) {
		super(nombre_vuelo, cant_pasajeros, tipo_pasaje, valor_unitario, fecha_vuelo);
		this.nombre = nombre;
	}
}
