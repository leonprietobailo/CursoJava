package main;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class writetxt {
	
	List<empleado> eList;
	String ruta = "C:\\Users\\leprieto\\Documents\\Curso Java\\CursoJava\\Ejercicio_19_AOP\\salida.txt";
	
	public void añadirLista(List<empleado> eList) {
		this.eList = eList;
	}
	
	public void genArchivo() {
		try {
			String contenido = "NOMBRE | APELLIDO | EDAD\n";
			for(empleado emp: this.eList) {
				contenido += emp.nombre + " ";
				contenido += emp.apellido + " ";
				contenido += emp.edad + "\n";
			}
			
			File archivo = new File(ruta);
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
