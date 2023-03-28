import java.time.LocalDate;

public class pantalon implements articulo {
	String tipo = "pantalon";
	int precioUnitario;
	int cantidadVendida;
	LocalDate ultimaCompra;
	float precioFinal;
	int diasUltimaCompra;
	int precioFinalUnidad;
	
	public pantalon(int precioUnitario, int cantidadVendida, LocalDate ultimaCompra) {
		this.precioUnitario = precioUnitario;
		this.cantidadVendida = cantidadVendida;
		this.ultimaCompra = ultimaCompra;
		this.precioFinal = (float) (this.precioUnitario * 1.21);
		this.diasUltimaCompra = LocalDate.now().getDayOfYear() + LocalDate.now().getYear()*365 - ultimaCompra.getDayOfYear() - ultimaCompra.getYear()*365;
		this.precioFinalUnidad = this.precioUnitario * this.cantidadVendida;
	}
	
	@Override
	public int precioUnitario() {
		return this.precioUnitario;
	}

	@Override
	public int get_cantidadVendida() {
		return this.cantidadVendida;
	}

	@Override
	public LocalDate get_ultimaCompra() {
		return this.ultimaCompra;
	}

	@Override
	public float get_precioFinal() {
		return this.precioFinal;
	}

	@Override
	public int get_diasUltimaCompra() {
		return this.diasUltimaCompra;
	}
	
	public String get_tipo() {
		return this.tipo;
	}
	
	@Override
	public int get_precioFinalUnidad() {
		return this.precioFinalUnidad;
	}
	
	public int get_precio() {
		return this.precioUnitario;
	}
}
