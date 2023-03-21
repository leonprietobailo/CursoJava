import java.time.LocalDate;

public class persona {
  String nombre;
  String apellido;
  String DNI;
  String locNacimiento;
  LocalDate fechaNacimiento;
  int edad;

  public persona(String nombreI, String apellidoI, String DNII, String locNacimientoI,
      LocalDate fechaNacimientoI) {
    nombre = nombreI;
    apellido = apellidoI;
    DNI = DNII;
    locNacimiento = locNacimientoI;
    edad =
        (int) Math.floor((double) (LocalDate.now().getYear() * 365 + LocalDate.now().getDayOfYear()
            - fechaNacimientoI.getYear() * 365 - fechaNacimientoI.getDayOfYear()) / 365.0);
    fechaNacimiento = fechaNacimientoI;
  }
}
