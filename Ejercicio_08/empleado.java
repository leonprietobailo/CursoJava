import java.time.LocalDate;

public class empleado extends persona {

  LocalDate fechaIngreso;
  int salario;
  String nombrePosicion;
  int antiguedadLaboral;

  public empleado(String nombreI, String apellidoI, String DNII, String locNacimientoI,
      LocalDate fechaNacimientoI, LocalDate fechaIngresoI, int salarioI, String nombrePosicionI) {
    super(nombreI, apellidoI, DNII, locNacimientoI, fechaNacimientoI);
    fechaIngreso = fechaIngresoI;
    salario = salarioI;
    nombrePosicion = nombrePosicionI;
    antiguedadLaboral =
        (int) Math.floor((double) (LocalDate.now().getYear() * 365 + LocalDate.now().getDayOfYear()
            - fechaIngresoI.getYear() * 365 - fechaIngresoI.getDayOfYear()) / 365.0);;

  }
}
