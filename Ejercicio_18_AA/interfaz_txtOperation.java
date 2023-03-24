import java.util.HashSet;
import java.util.Set;

public interface interfaz_txtOperation {

	Set<usuario> cSet = new HashSet<>();

	String ruta1 = "C:\\Users\\leprieto\\Documents\\Curso Java\\CursoJava\\Ejercicio_18_AA\\USUARIOS_1.txt";
	String ruta2 = "C:\\Users\\leprieto\\Documents\\Curso Java\\CursoJava\\Ejercicio_18_AA\\USUARIOS_2.txt";
	String ruta3 = "C:\\Users\\leprieto\\Documents\\Curso Java\\CursoJava\\Ejercicio_18_AA\\USUARIOS_3.txt";
	String rutaW = "C:\\Users\\leprieto\\Documents\\Curso Java\\CursoJava\\Ejercicio_18_AA\\salida.txt";

	void readTxt();

	void writeFile();
}
