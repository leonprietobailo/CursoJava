import java.util.ArrayList;
import java.util.List;

public interface txt_op {

	String rutaIn = "C:\\Users\\leprieto\\Documents\\Curso Java\\CursoJava\\ExamenFinal\\txt_vuelos.txt";
	String rutaOut = "C:\\Users\\leprieto\\Documents\\Curso Java\\CursoJava\\ExamenFinal\\salida.txt";
	List<aerolinea> aList = new ArrayList<>();

	public void read_txt();

	public void write_txt();

}
