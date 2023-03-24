import java.time.LocalDate;

class usuario extends persona {

	int antiguedad;
	String segmento;
	String status;

	public usuario(String nombreI, LocalDate fechaNacimientoI, LocalDate fechaRegistro, LocalDate fechaLogin,
			int productosComprados) {
		super(nombreI, fechaNacimientoI);

		antiguedad = (int) Math.floor((double) (LocalDate.now().getYear() * 365 + LocalDate.now().getDayOfYear()
				- fechaRegistro.getYear() * 365 - fechaRegistro.getDayOfYear()) / 365.0);

		int inactividad = (int) Math.floor((double) (LocalDate.now().getYear() * 365 + LocalDate.now().getDayOfYear()
				- fechaLogin.getYear() * 365 - fechaLogin.getDayOfYear()) / 365.0);
		if (productosComprados <= 5) {
			segmento = "Standard User";
		} else if (productosComprados <= 10) {
			segmento = "Affiliate";
		} else {
			segmento = "Premium";
		}

		if (inactividad >= 2) {
			status = "Inactivos";
		} else {
			status = "Activos";
		}

	}

}
