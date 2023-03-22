import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class txtWrite implements interface_txt {

  public void generarArchivo(Set<empleado> eSet) {
    try {
      String ruta = "C:\\Users\\leprieto\\Documents\\Curso Java\\CursoJava\\Ejercicio_08\\";


      LocalDate fecha = LocalDate.now();
      DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd_MM_YYYY");
      String fechaFormateada = fecha.format(dateTimeFormatter);
      String rutaCompleta = ruta + "info_salarial_plantilla" + fechaFormateada + ".txt";


      String contenido =
          "NOMBRE APELLIDO DNI EDAD LOCALIDAD_NACIMIENTO POSICION SALARIO ANTIGUEDAD_LABORAL FECHA_INGRESO FECHA_NACIMIENTO\n";

      for (empleado emp : eSet) {
        contenido += emp.nombre + " ";
        contenido += emp.apellido + " ";
        contenido += emp.DNI + " ";
        contenido += emp.edad + " ";
        contenido += emp.locNacimiento + " ";
        contenido += emp.nombrePosicion + " ";
        contenido += emp.salario + " ";
        contenido += emp.antiguedadLaboral + " ";
        contenido += emp.fechaIngreso + " ";
        contenido += emp.fechaNacimiento + "\n";

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
      e.printStackTrace();
    }
  }

}
