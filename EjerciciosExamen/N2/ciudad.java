
public class ciudad {
	String nombre;
	float temperatura;
	String tareasRealizadas;

	public ciudad(String nombre, float temperatura) {
		this.nombre = nombre;
		this.temperatura = temperatura;

		switch (nombre) {
		case "Madrid":
			if (this.temperatura < 15) {
				this.tareasRealizadas = "Sembrado";
			} else {
				this.tareasRealizadas = "Producci�n";
			}
			break;
		case "Berlin":
			if (this.temperatura >= 20) {
				this.tareasRealizadas = "Producci�n";
			} else {
				this.tareasRealizadas = "Mantenimiento";
			}
			break;
		}

	}
}
