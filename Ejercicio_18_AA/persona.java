import java.time.LocalDate;

class persona {
	int edad;
	String nombre;
	LocalDate fechaNacimiento;

	public persona(String nombreI, LocalDate fechaNacimientoI) {
		nombre = nombreI;
		fechaNacimiento = fechaNacimientoI;
		edad = (int) Math.floor((double) (LocalDate.now().getYear() * 365 + LocalDate.now().getDayOfYear()
				- fechaNacimientoI.getYear() * 365 - fechaNacimientoI.getDayOfYear()) / 365.0);
	}
}