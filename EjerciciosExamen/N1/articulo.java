import java.time.LocalDate;

public interface articulo {
		
	public int precioUnitario();
	public int get_cantidadVendida();
	public LocalDate get_ultimaCompra();
	public float get_precioFinal();
	public int get_diasUltimaCompra();
	public String get_tipo();
	public int get_precioFinalUnidad();
	public int get_precio();

}
