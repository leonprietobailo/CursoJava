package Ejercicio_03;

public class empleado extends persona {

  String posicion;
  int sueldo;

  public empleado(String nombreI, String apellidoI, String localidadI, String posicionI,
      int sueldoI) {
    super(nombreI, apellidoI, localidadI);
    posicion = posicionI;
    sueldo = sueldoI;
  }

}
