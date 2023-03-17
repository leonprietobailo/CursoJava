package Ejercicio_03;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class genArchivo implements interfaceGenArchivos {

  @Override
  public void generarArchivo(empleado[] empleados) {
    try {
      String ruta = "C:\\Users\\leprieto\\Documents\\Curso Java\\CursoJava\\Ejercicio_03\\";


      LocalDate fecha = LocalDate.now();
      DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd_MM_YYYY");
      String fechaFormateada = fecha.format(dateTimeFormatter);
      String rutaCompleta = ruta + "info_empleados_" + fechaFormateada;


      String contenido = "NOMBRE APELLIDO LOCALIDAD POSICION SUELDO\n";

      for (int i = 0; i < empleados.length; i++) {
        contenido += empleados[i].nombre + " ";
        contenido += empleados[i].apellido + " ";
        contenido += empleados[i].localidad + " ";
        contenido += empleados[i].posicion + " ";
        contenido += empleados[i].sueldo + "\n";
      }


      File archivo = new File(rutaCompleta);
      if (!archivo.exists()) {
        archivo.createNewFile();
      }
      FileWriter fw = new FileWriter(archivo);
      BufferedWriter bw = new BufferedWriter(fw);
      bw.write(contenido);
      bw.close();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
