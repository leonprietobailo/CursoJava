import java.time.LocalDate;

public class vuelo {

	String nombre_vuelo;
	int cant_pasajeros;
	String tipo_pasaje;
	int valor_unitario;
	LocalDate fecha_vuelo;

	int valorFinalPorVuelo;
	int diasDeDiferencia;
	String segmentacion;

	public vuelo(String nombre_vuelo, int cant_pasajeros, String tipo_pasaje, int valor_unitario,
			LocalDate fecha_vuelo) {
		this.nombre_vuelo = nombre_vuelo;
		this.cant_pasajeros = cant_pasajeros;
		this.tipo_pasaje = tipo_pasaje;
		this.valor_unitario = valor_unitario;
		this.fecha_vuelo = fecha_vuelo;

		this.valorFinalPorVuelo = valor_unitario * cant_pasajeros;
		this.diasDeDiferencia = LocalDate.now().getYear() * 365 + LocalDate.now().getDayOfYear()
				- fecha_vuelo.getYear() * 365 - fecha_vuelo.getDayOfYear();

		if (tipo_pasaje.equals("ECONOMICO")) {
			if (valorFinalPorVuelo > 100) {
				this.segmentacion = "RENTABLE";
			} else {
				this.segmentacion = "NO RENTABLE";
			}
		} else {
			if (valorFinalPorVuelo > 1500) {
				this.segmentacion = "RENTABLE";
			} else {
				this.segmentacion = "NO RENTABLE";
			}
		}
	}

}
